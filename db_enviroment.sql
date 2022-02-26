/*
Navicat MySQL Data Transfer

Source Server         : wzy
Source Server Version : 50533
Source Host           : localhost:3306
Source Database       : db_enviroment

Target Server Type    : MYSQL
Target Server Version : 50533
File Encoding         : 65001

Date: 2021-08-23 22:26:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `data`
-- ----------------------------
DROP TABLE IF EXISTS `data`;
CREATE TABLE `data` (
  `data_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `data_city_id` int(255) unsigned NOT NULL,
  `data_city` varchar(255) NOT NULL,
  `data_o324` double(255,0) NOT NULL,
  `data_pm2_5` double(255,0) NOT NULL,
  `data_pm2_524` double(255,0) NOT NULL,
  `data_quality` varchar(255) NOT NULL,
  `data_time` datetime NOT NULL,
  `data_color` varchar(255) NOT NULL,
  `db_source` varchar(255) NOT NULL DEFAULT 'db_environment',
  PRIMARY KEY (`data_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of data
-- ----------------------------
INSERT INTO `data` VALUES ('1', '1', '北京', '179', '26', '29', '轻度污染', '2021-06-27 22:00:00', '#FF7E00', 'db_enviroment');
INSERT INTO `data` VALUES ('2', '24', '上海', '67', '15', '20', '优', '2021-06-27 22:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('3', '75', '广州', '96', '18', '18', '优', '2021-06-27 22:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('4', '219', '南京', '100', '33', '38', '良', '2021-06-27 22:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('5', '310', '西安', '194', '25', '30', '轻度污染', '2021-06-27 22:00:00', '#FF7E00', 'db_enviroment');
INSERT INTO `data` VALUES ('6', '1', '北京', '123', '27', '31', '优', '2021-06-28 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('7', '24', '上海', '51', '17', '13', '优', '2021-06-28 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('8', '75', '广州', '20', '18', '14', '优', '2021-06-28 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('9', '219', '南京', '35', '37', '38', '良', '2021-06-28 07:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('10', '310', '西安', '48', '25', '22', '优', '2021-06-28 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('11', '1', '北京', '124', '28', '36', '良', '2021-06-28 11:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('12', '24', '上海', '53', '16', '10', '优', '2021-06-28 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('13', '75', '广州', '29', '17', '15', '优', '2021-06-28 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('14', '219', '南京', '57', '37', '25', '优', '2021-06-28 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('15', '310', '西安', '54', '26', '30', '良', '2021-06-28 11:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('16', '1', '北京', '137', '30', '30', '良', '2021-06-28 16:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('17', '24', '上海', '73', '14', '11', '优', '2021-06-28 16:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('18', '75', '广州', '53', '15', '13', '优', '2021-06-28 16:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('19', '219', '南京', '121', '32', '19', '良', '2021-06-28 16:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('20', '310', '西安', '158', '27', '29', '轻度污染', '2021-06-28 16:00:00', '#FF7E00', 'db_enviroment');
INSERT INTO `data` VALUES ('21', '1', '北京', '102', '32', '31', '优', '2021-06-29 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('22', '24', '上海', '60', '13', '20', '优', '2021-06-29 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('23', '75', '广州', '17', '16', '12', '优', '2021-06-29 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('24', '219', '南京', '51', '21', '23', '优', '2021-06-29 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('25', '310', '西安', '45', '27', '25', '良', '2021-06-29 07:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('26', '1', '北京', '103', '31', '28', '优', '2021-06-29 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('27', '24', '上海', '60', '14', '12', '优', '2021-06-29 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('28', '75', '广州', '23', '16', '17', '优', '2021-06-29 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('29', '219', '南京', '55', '21', '22', '优', '2021-06-29 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('30', '310', '西安', '52', '26', '29', '良', '2021-06-29 11:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('31', '1', '北京', '111', '31', '30', '良', '2021-06-29 16:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('32', '24', '上海', '79', '14', '12', '优', '2021-06-29 16:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('33', '75', '广州', '65', '16', '14', '优', '2021-06-29 16:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('34', '219', '南京', '133', '20', '24', '良', '2021-06-29 16:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('35', '310', '西安', '129', '26', '32', '轻度污染', '2021-06-29 16:00:00', '#FF7E00', 'db_enviroment');
INSERT INTO `data` VALUES ('36', '1', '北京', '98', '20', '10', '优', '2021-06-30 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('37', '24', '上海', '59', '14', '16', '优', '2021-06-30 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('38', '75', '广州', '23', '17', '16', '优', '2021-06-30 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('39', '219', '南京', '109', '22', '17', '优', '2021-06-30 07:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('40', '310', '西安', '49', '30', '29', '良', '2021-06-30 07:00:00', '#FFFF00', 'db_enviroment');
INSERT INTO `data` VALUES ('41', '1', '北京', '99', '17', '16', '优', '2021-06-30 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('42', '24', '上海', '60', '14', '14', '优', '2021-06-30 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('43', '75', '广州', '36', '17', '16', '优', '2021-06-30 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('44', '219', '南京', '109', '22', '21', '优', '2021-06-30 11:00:00', '#00e400', 'db_enviroment');
INSERT INTO `data` VALUES ('45', '310', '西安', '64', '31', '34', '良', '2021-06-30 11:00:00', '#FFFF00', 'db_enviroment');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户的id（唯一标识符）',
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `authority` int(1) NOT NULL DEFAULT '0' COMMENT '判断是否是管理员或者用户（以便区分页面）1表示管理员，0表示用户',
  `publish` date DEFAULT NULL COMMENT '登出时间',
  `register` date NOT NULL COMMENT '用户注册时间',
  `db_source` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'test', '123', '18552936871', '0', '2020-12-04', '2020-12-04', 'db_enviroment');
INSERT INTO `user` VALUES ('2', 'test', '123', '13301545849', '0', '2021-05-25', '2021-05-25', 'db_enviroment');
INSERT INTO `user` VALUES ('3', 'test', '123', '13301545849', '0', '2021-05-25', '2021-05-25', 'db_enviroment');
INSERT INTO `user` VALUES ('4', 'test1', '123', '13301545849', '0', '2021-05-25', '2021-05-25', 'db_enviroment');
INSERT INTO `user` VALUES ('5', 'test1', '1234', '13301545849', '0', '2021-05-25', '2021-05-25', 'db_enviroment');
INSERT INTO `user` VALUES ('6', 'test4', '1234', '13301545849', '0', '2021-05-25', '2021-05-25', 'db_enviroment');
INSERT INTO `user` VALUES ('7', 'qweertt', '123', '15963248693', '0', '2021-06-30', '2021-06-30', 'db_enviroment');
