-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `username` varchar(30) NOT NULL COMMENT '用户名',
 `password` varchar(30) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';

-- 角色表
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `name` varchar(30) NOT NULL COMMENT '角色名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';

-- 公司表
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `name` varchar(30) NOT NULL COMMENT '公司名',
 `type` varchar(30) NOT NULL COMMENT '公司类型',
 `ceo` varchar(30) NOT NULL COMMENT '总裁',
 `ceo_phone` varchar(30) NOT NULL COMMENT '总裁电话',
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '公司表';

-- 无限级商品分类表
DROP TABLE IF EXISTS `shop_category`;
CREATE TABLE IF NOT EXISTS `shop_category` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `company_id` BIGINT NOT NULL COMMENT '公司id',
 `title` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '标题',
 `parentid` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '父级id',
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '无限级商品分类表';

-- 商品表
DROP TABLE IF EXISTS `shop_product`;
CREATE TABLE `shop_product` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `company_id` BIGINT NOT NULL COMMENT '公司id',
 `category_id` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '商品分类id',
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
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品表';