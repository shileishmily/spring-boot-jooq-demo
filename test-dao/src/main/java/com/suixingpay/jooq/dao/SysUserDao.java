package com.suixingpay.jooq.dao;

import com.suixingpay.jooq.entity.tables.pojos.SysUser;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;

import java.util.List;

public interface SysUserDao {

    SysUserRecord findByName(String userName);

    List<SysUserRecord> findByRealName(String realName);

    List<SysUser> findByPhone(String phone);

}
