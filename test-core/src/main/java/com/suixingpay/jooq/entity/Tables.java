/*
 * This file is generated by jOOQ.
 */
package com.suixingpay.jooq.entity;


import com.suixingpay.jooq.entity.tables.FlywaySchemaHistory;
import com.suixingpay.jooq.entity.tables.SysLog;
import com.suixingpay.jooq.entity.tables.SysUser;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in jooq_test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jooq_test.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = com.suixingpay.jooq.entity.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>jooq_test.sys_log</code>.
     */
    public static final SysLog SYS_LOG = com.suixingpay.jooq.entity.tables.SysLog.SYS_LOG;

    /**
     * The table <code>jooq_test.sys_user</code>.
     */
    public static final SysUser SYS_USER = com.suixingpay.jooq.entity.tables.SysUser.SYS_USER;
}
