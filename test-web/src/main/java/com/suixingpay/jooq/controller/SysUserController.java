package com.suixingpay.jooq.controller;

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

}
