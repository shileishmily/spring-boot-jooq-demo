/*
 * This file is generated by jOOQ.
 */
package com.suixingpay.jooq.entity.tables.records;


import com.suixingpay.jooq.entity.tables.SysLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLogRecord extends UpdatableRecordImpl<SysLogRecord> implements Record10<Integer, String, Integer, String, String, String, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = 1710403718;

    /**
     * Setter for <code>jooq_test.sys_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq_test.sys_log.ip_address</code>.
     */
    public void setIpAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.ip_address</code>.
     */
    public String getIpAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq_test.sys_log.oper_id</code>.
     */
    public void setOperId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.oper_id</code>.
     */
    public Integer getOperId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>jooq_test.sys_log.user_name</code>.
     */
    public void setUserName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.user_name</code>.
     */
    public String getUserName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jooq_test.sys_log.module_name</code>.
     */
    public void setModuleName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.module_name</code>.
     */
    public String getModuleName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jooq_test.sys_log.method_name</code>.
     */
    public void setMethodName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.method_name</code>.
     */
    public String getMethodName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jooq_test.sys_log.method_desc</code>.
     */
    public void setMethodDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.method_desc</code>.
     */
    public String getMethodDesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>jooq_test.sys_log.oper_content</code>.
     */
    public void setOperContent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.oper_content</code>.
     */
    public String getOperContent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>jooq_test.sys_log.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>jooq_test.sys_log.app_id</code>.
     */
    public void setAppId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>jooq_test.sys_log.app_id</code>.
     */
    public Integer getAppId() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, String, String, String, String, String, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, String, String, String, String, String, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SysLog.SYS_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysLog.SYS_LOG.IP_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SysLog.SYS_LOG.OPER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysLog.SYS_LOG.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysLog.SYS_LOG.MODULE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysLog.SYS_LOG.METHOD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysLog.SYS_LOG.METHOD_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SysLog.SYS_LOG.OPER_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return SysLog.SYS_LOG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SysLog.SYS_LOG.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getIpAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getOperId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getModuleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMethodName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMethodDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOperContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIpAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOperId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModuleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMethodName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMethodDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOperContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value2(String value) {
        setIpAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value3(Integer value) {
        setOperId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value4(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value5(String value) {
        setModuleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value6(String value) {
        setMethodName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value7(String value) {
        setMethodDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value8(String value) {
        setOperContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord value10(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysLogRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysLogRecord
     */
    public SysLogRecord() {
        super(SysLog.SYS_LOG);
    }

    /**
     * Create a detached, initialised SysLogRecord
     */
    public SysLogRecord(Integer id, String ipAddress, Integer operId, String userName, String moduleName, String methodName, String methodDesc, String operContent, Timestamp createTime, Integer appId) {
        super(SysLog.SYS_LOG);

        set(0, id);
        set(1, ipAddress);
        set(2, operId);
        set(3, userName);
        set(4, moduleName);
        set(5, methodName);
        set(6, methodDesc);
        set(7, operContent);
        set(8, createTime);
        set(9, appId);
    }
}
