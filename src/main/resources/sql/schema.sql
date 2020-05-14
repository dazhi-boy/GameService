-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `username` varchar(30) NOT NULL COMMENT '用户名',
 `password` varchar(30) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';

-- 商品表
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `cateid` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '商品分类id',
 `title` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '商品标题',
 `description` TEXT COMMENT '商品描述',
 `num` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '库存',
 `price` DECIMAL(10, 2) NOT NULL DEFAULT '0.00' COMMENT '价格',
 `cover` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '封面图',
 `pics` TEXT COMMENT '图片集合',
 `issale` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否促销',
 `saleprice` DECIMAL(10, 2) NOT NULL DEFAULT '0.00' COMMENT '促销价格',
 `ishot` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否热卖',
 `ison` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否上架',
 `istui` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否推荐',
 `createtime` INT UNSIGNED NOT NULL DEFAULT '0' COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品表';