/*
Navicat MySQL Data Transfer

Source Server         : locl
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : im

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-22 09:05:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `redds`
-- ----------------------------
DROP TABLE IF EXISTS `redds`;
CREATE TABLE `redds` (
  `create_time` datetime DEFAULT NULL,
  `id` varchar(32) NOT NULL,
  `statue` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of redds
-- ----------------------------
INSERT INTO `redds` VALUES ('2018-02-03 09:35:16', '15', '1', '123', 'a');
INSERT INTO `redds` VALUES ('2018-02-03 09:49:37', '3a4fd5db71d84a2dbeb7fc542998e8da', '0', '123', 'b');
INSERT INTO `redds` VALUES ('2018-02-03 10:02:18', '3f996c6980834481bbb5ee2a16edab1e', '0', 'c', 'c');
INSERT INTO `redds` VALUES ('2017-12-25 18:03:57', '6566', '3', null, null);
INSERT INTO `redds` VALUES ('2018-02-03 09:38:32', '7d5d6c9878e94959962911c2c94605ba', '1', null, null);
INSERT INTO `redds` VALUES ('2018-02-03 09:40:03', 'af73cef0fd514d46a3a6ba6cd87a93b5', '0', null, null);
INSERT INTO `redds` VALUES ('2017-12-25 18:04:59', 'asd', '1', null, null);
INSERT INTO `redds` VALUES ('2017-12-25 18:05:11', 'asddw', '2', null, null);
INSERT INTO `redds` VALUES ('2018-02-03 10:01:28', 'c31949985f554897b74c0fd1f6f581d1', '0', null, null);
INSERT INTO `redds` VALUES ('2018-02-03 09:47:40', 'df594478d36548dea111f1b310ac2930', '0', null, null);
