package com.suixingpay.jooq.service.impl;

import com.suixingpay.jooq.dao.SysUserDao;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;
import com.suixingpay.jooq.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/06/15 21:54:21:54
 * @version: V1.0
 * @review:
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    @Override
    public SysUserRecord newRecord() {
        return sysUserDao.newRecord();
    }

    @Override
    public int insert(SysUserRecord sysUserRecord) {
        return sysUserDao.insert(sysUserRecord);
    }

    @Override
    public int update(SysUserRecord sysUserRecord) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public SysUserRecord get(int id) {
        return null;
    }

    @Override
    public List<SysUserRecord> findAll() {
        return null;
    }
}
