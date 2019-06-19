package com.suixingpay.jooq.service.impl;

import com.suixingpay.jooq.dao.impl.SysUserDaoImpl;
import com.suixingpay.jooq.entity.tables.pojos.SysUser;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;
import com.suixingpay.jooq.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDaoImpl sysUserDao;

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

    @Override
    public SysUserRecord findByName(String userName) {
        return sysUserDao.findByName(userName);
    }

    @Override
    public List<SysUserRecord> findByRealName(String realName) {
        return sysUserDao.findByRealName(realName);
    }

    @Override
    public List<SysUser> findByPhone(String phone) {
        return sysUserDao.findByPhone(phone);
    }
}
