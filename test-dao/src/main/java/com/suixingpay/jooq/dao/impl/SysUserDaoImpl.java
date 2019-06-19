package com.suixingpay.jooq.dao.impl;

import com.suixingpay.jooq.BaseDao;
import com.suixingpay.jooq.dao.SysUserDao;
import com.suixingpay.jooq.entity.tables.pojos.SysUser;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;
import org.jooq.Table;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.suixingpay.jooq.entity.tables.SysUser.SYS_USER;

@Repository("sysUserDao")
public class SysUserDaoImpl extends BaseDao<SysUserRecord> implements SysUserDao {
    @Override
    public Table<SysUserRecord> table() {
        return SYS_USER;
    }

    @Override
    public SysUserRecord findByName(String userName) {
        return this.dsl.selectFrom(table()).where("user_name=?", userName).fetchOne();
    }

    @Override
    public List<SysUserRecord> findByRealName(String realName) {
        return this.dsl.selectFrom(table()).where("real_name=?", realName).fetch();
    }

    @Override
    public List<SysUser> findByPhone(String phone) {
        return this.dsl.selectFrom(table()).where("phone = ?", phone).fetch().map(record -> {
            return record.into(SysUser.class);
        });

    }
}
