# Host: localhost  (Version: 5.6.22-log)
# Date: 2015-08-11 23:58:30
# Generator: MySQL-Front 5.3  (Build 4.196)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '姓名',
  `nick_name` varchar(50) NOT NULL DEFAULT '' COMMENT '昵称（唯一）',
  `email` varchar(50) NOT NULL DEFAULT '' COMMENT '邮箱',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT '密码',
  `gender` tinyint(1) NOT NULL DEFAULT '0' COMMENT '性别[0男|1女|2保密]',
  `birthday` varchar(50) NOT NULL DEFAULT '0000-00-00' COMMENT '出生年月日',
  `is_active` tinyint(1) NOT NULL DEFAULT '0' COMMENT '邮箱是否激活[0未激活|1激活]',
  `sign_up_time` varchar(50) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "user"
#

