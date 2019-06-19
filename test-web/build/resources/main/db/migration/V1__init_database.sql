CREATE TABLE `sys_log` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `ip_address` varchar(50) DEFAULT NULL COMMENT 'ip地址',
   `oper_id` int(11) DEFAULT NULL COMMENT '操作人ID',
   `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
   `module_name` varchar(50) DEFAULT NULL COMMENT '模块名称',
   `method_name` varchar(50) DEFAULT NULL COMMENT '方法名',
   `method_desc` varchar(100) DEFAULT NULL COMMENT '方法描述',
   `oper_content` varchar(6000) DEFAULT NULL COMMENT '操作内容',
   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
   `app_id` int(11) DEFAULT NULL COMMENT '应用ID',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;