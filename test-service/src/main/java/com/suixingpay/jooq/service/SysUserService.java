package com.suixingpay.jooq.service;

import com.suixingpay.jooq.entity.tables.pojos.SysUser;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;

import java.util.List;

public interface SysUserService {
    SysUserRecord newRecord();

    int insert(SysUserRecord sysUserRecord);

    int update(SysUserRecord sysUserRecord);

    int delete(int id);

    SysUserRecord get(int id);

    List<SysUserRecord> findAll();

    SysUserRecord findByName(String userName);

    List<SysUserRecord> findByRealName(String realName);

    List<SysUser> findByPhone(String phone);


}
