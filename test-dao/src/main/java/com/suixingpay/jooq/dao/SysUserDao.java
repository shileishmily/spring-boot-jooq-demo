package com.suixingpay.jooq.dao;

import com.suixingpay.jooq.entity.tables.pojos.SysUser;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;

import java.util.List;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/06/15 21:51:21:51
 * @version: V1.0
 * @review:
 */
public interface SysUserDao {

    SysUserRecord findByName(String userName);

    List<SysUserRecord> findByRealName(String realName);

    List<SysUser> findByPhone(String phone);

}
