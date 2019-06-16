package com.suixingpay.jooq.dao;

import com.suixingpay.jooq.BaseDao;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;
import org.jooq.Table;
import org.springframework.stereotype.Repository;

import static com.suixingpay.jooq.entity.tables.SysUser.SYS_USER;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/06/15 21:51:21:51
 * @version: V1.0
 * @review:
 */
@Repository
public class SysUserDao extends BaseDao<SysUserRecord> {
    @Override
    public Table<SysUserRecord> table() {
        return SYS_USER;
    }
}
