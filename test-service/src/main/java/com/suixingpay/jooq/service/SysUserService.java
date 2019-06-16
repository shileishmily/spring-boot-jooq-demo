package com.suixingpay.jooq.service;

import com.suixingpay.jooq.entity.tables.records.SysUserRecord;

import java.util.List;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/06/15 21:54:21:54
 * @version: V1.0
 * @review:
 */
public interface SysUserService {
    SysUserRecord newRecord();

    int insert(SysUserRecord sysUserRecord);

    int update(SysUserRecord sysUserRecord);

    int delete(int id);

    SysUserRecord get(int id);

    List<SysUserRecord> findAll();
}
