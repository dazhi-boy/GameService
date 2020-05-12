DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `active` bit(1) NOT NULL,
 `company_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL,
 `flag` bit(1) NOT NULL,
 `username` varchar(30) NOT NULL,
 `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;