package com.suixingpay.jooq;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.suixingpay.jooq.constants.SystemConst;
import org.apache.commons.collections.CollectionUtils;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.jooq.impl.UpdatableRecordImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public abstract class BaseDao<R extends UpdatableRecordImpl> implements SystemConst {


    @Autowired
    protected DSLContext dsl;

    private static final String FIELD_ID = "id";

    private static final String FIELD_CREATE_TIME = "create_time";

    private static final String FIELD_DEL_FLAG = "del_flag";

    private static final Map<String, Byte> DEL_MAPPER = ImmutableMap.of(FIELD_DEL_FLAG, DEL);

    /**
     * Description:table
     *
     * @return table
     */
    public abstract Table<R> table();

    public R newRecord() {
        return dsl.newRecord(table());
    }

    public R newRecord(Object object) {
        return dsl.newRecord(table(), object);
    }

    public R get(long id) {
        return dsl.selectFrom(table()).where(" id=? ", id).fetchAny();
    }

    public List<R> get(Collection<Long> ids) {

        if (CollectionUtils.isEmpty(ids)) {
            return ImmutableList.of();
        }

        StringBuilder sql = new StringBuilder(" id in (");
        String pattern = IntStream.range(0, ids.size()).mapToObj(i -> "?").reduce((s1, s2) -> s1 + "," + s2).orElse("");
        sql.append(pattern).append(")");

        return dsl.selectFrom(table()).where(sql.toString(), ids.toArray()).fetch();
    }

    public List<R> findAllValid() {
        return dsl.selectFrom(table()).where(" del_flag=? ", NOT_DEL).fetch();
    }

    public R update(R record) {
        record.store();
        return record;
    }

    public int insert(R record) {
        record.from(ImmutableMap.of(FIELD_CREATE_TIME, new Timestamp(System.currentTimeMillis())), FIELD_CREATE_TIME);
        return dsl.batchInsert(record).execute()[0];
    }

    public int delete(R record) {
        record.from(DEL_MAPPER, FIELD_DEL_FLAG);
        return record.store();
    }

    /**
     * 自动根据id判断插入或者更新
     *
     * @param record
     * @return
     */
    public int store(R record) {
        Long id = record.getValue(FIELD_ID, Long.class);
        if (id == null || id == 0) {
            return dsl.batchInsert(record).execute()[0];
        } else {
            update(record);
            return 1;
        }
    }

    public void batchUpdate(List<? extends UpdatableRecord<?>> records) {

        dsl.batchUpdate(records).execute();

    }
}
