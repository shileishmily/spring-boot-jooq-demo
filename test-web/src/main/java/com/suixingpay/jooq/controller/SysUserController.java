package com.suixingpay.jooq.controller;

import com.suixingpay.jooq.entity.tables.pojos.SysUser;
import com.suixingpay.jooq.entity.tables.records.SysUserRecord;
import com.suixingpay.jooq.protocal.Response;
import com.suixingpay.jooq.service.SysUserService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@ApiModel
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "插入用户")
    @PostMapping("/insert")
    public Response saveUser(@RequestParam String userName,
                             @RequestParam String realName,
                             @RequestParam String email,
                             @RequestParam String phone,
                             @RequestParam String pswd,
                             @RequestParam int userStatus) {
        SysUserRecord record = sysUserService.newRecord();
        record.setUserName(userName);
        record.setRealName(realName);
        record.setEmail(email);
        record.setPhone(phone);
        record.setPswd(pswd);
        record.setUserStatus(userStatus);
        record.setCreateTime(new Timestamp(System.currentTimeMillis()));
        sysUserService.insert(record);
        return Response.ok();
    }

    @ApiOperation(value = "根据登录账户查询")
    @PostMapping("/findByName")
    public Response findByName(@RequestParam String userName) {
        SysUserRecord sysUserRecord = sysUserService.findByName(userName);
        SysUser sysUser = sysUserRecord.into(SysUser.class);
        return Response.ok(sysUser);
    }

    @ApiOperation(value = "根据真实姓名查询")
    @PostMapping("/findByRealName")
    public Response findByRealName(@RequestParam String realName) {
        List<SysUser> resultList = new ArrayList<>();
        List<SysUserRecord> list = sysUserService.findByRealName(realName);

        for (SysUserRecord sysUserRecord : list) {
            SysUser sysUser = sysUserRecord.into(SysUser.class);
            resultList.add(sysUser);
        }
        return Response.ok(resultList);
    }

    @ApiOperation(value = "根据手机号查询")
    @PostMapping("/findByPhone")
    public Response findByPhone(@RequestParam String phone) {
        List<SysUser> list = sysUserService.findByPhone(phone);
        return Response.ok(list);
    }
}
