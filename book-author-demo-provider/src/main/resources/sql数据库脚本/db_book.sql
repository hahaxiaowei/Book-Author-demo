/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : db_book

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-02-05 14:26:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `nationality`
-- ----------------------------
DROP TABLE IF EXISTS `nationality`;
CREATE TABLE `nationality` (
  `id` varchar(255) NOT NULL COMMENT '国家的id，唯一标识',
  `nationality_name` varchar(255) NOT NULL COMMENT '国家的名字',
  `nationality_life` varchar(255) DEFAULT NULL COMMENT '国家的年龄',
  `nationality_created_time` varchar(255) DEFAULT NULL COMMENT '国家的创建时间',
  `nationality_location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nationality
-- ----------------------------
INSERT INTO `nationality` VALUES ('35707478f51e11e7a28b88d7f63dcda2', '伊拉克', '3000', 'string', '亚洲中东部');
INSERT INTO `nationality` VALUES ('59592a75f51f11e7a28b88d7f63dcda2', '加拿大', '200', '2018-1-9 16:20', '北美洲西海岸');
INSERT INTO `nationality` VALUES ('8d975a5aff5811e7af8988d7f63dcda2', '巴基斯坦', '132年', '1886年3月2号', '亚洲中东部');
INSERT INTO `nationality` VALUES ('a2bcb59cf51b11e7a28b88d7f63dcda2', '美国', '200', 'Tue Jan 09 17:01:06 CST 2018', '北美洲中部');
INSERT INTO `nationality` VALUES ('cde1c2e2ffd911e7af8988d7f63dcda2', '小亚细亚', '1', '2018', '南极洲');
INSERT INTO `nationality` VALUES ('d944a359fa8611e7a28b88d7f63dcda2', '中国（china）', '5000', '公元前2000年', '亚洲东部');

-- ----------------------------
-- Table structure for `tbl_author`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_author`;
CREATE TABLE `tbl_author` (
  `id` varchar(255) NOT NULL COMMENT '作者唯一标识',
  `author_name` varchar(255) DEFAULT NULL COMMENT '作者的名字',
  `phone_number` varchar(255) DEFAULT '' COMMENT '作者手机号',
  `email_number` varchar(255) DEFAULT NULL COMMENT '作者邮箱',
  `user_name` varchar(255) DEFAULT NULL COMMENT '作者的用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '作者的账号密码',
  `age` varchar(255) DEFAULT NULL COMMENT '作者年龄',
  `sex` varchar(255) DEFAULT NULL COMMENT '作者性别',
  `address` varchar(255) DEFAULT NULL COMMENT '作者所在地址',
  `id_code` varchar(255) DEFAULT NULL COMMENT '作者身份证号',
  `personal_remark` varchar(255) DEFAULT NULL COMMENT '作者个人描述',
  `nationality_id` varchar(255) DEFAULT NULL COMMENT '作者国籍id,外键，依赖国家表',
  `nation` varchar(255) DEFAULT NULL COMMENT '作者的所属民族',
  `head_portrait` varchar(255) DEFAULT NULL COMMENT '作者头像保存目录',
  `qq_number` varchar(255) DEFAULT NULL COMMENT '作者的QQ号',
  `wechat_number` varchar(255) DEFAULT NULL COMMENT '作者微信号',
  `sina_microblog_number` varchar(255) DEFAULT NULL COMMENT '作者的新浪微博账号',
  PRIMARY KEY (`id`),
  KEY `nationality` (`nationality_id`),
  CONSTRAINT `nationality` FOREIGN KEY (`nationality_id`) REFERENCES `nationality` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_author
-- ----------------------------
INSERT INTO `tbl_author` VALUES ('100', '小红', '110', null, null, '110', '11', '女', '安徽省合肥市', '120', '我是一个小学生', '35707478f51e11e7a28b88d7f63dcda2', '汉族', null, '110', '110', null);
INSERT INTO `tbl_author` VALUES ('111111', '小刚', '18656315534', '208759455@qq.com', '雨中漫步', '8ddbff3a80f4189b664a4a5a1ab84f67436c5914b20aeb02f404db17', '20', null, '安徽省合肥市蜀山区清潭路716号', null, null, '35707478f51e11e7a28b88d7f63dcda2', '汉族', null, '208759455', '雨中漫步', '飞往天空的雨');
INSERT INTO `tbl_author` VALUES ('222222', '鸣人', '18656315534', '208759455@qq.com', '火影忍者', '8ddbff3a80f4189b664a4a5a1ab84f67436c5914b20aeb02f404db17', '20', null, '安徽省合肥市蜀山区清潭路716号', null, null, '35707478f51e11e7a28b88d7f63dcda2', '汉族', null, '208759455', '雨中漫步', '飞往天空的雨');
INSERT INTO `tbl_author` VALUES ('333333', '小智', '18656315534', '208759455@qq.com', '宠物小精灵', '8ddbff3a80f4189b664a4a5a1ab84f67436c5914b20aeb02f404db17', '20', null, '安徽省合肥市蜀山区清潭路716号', null, null, '35707478f51e11e7a28b88d7f63dcda2', '汉族', null, '208759455', '雨中漫步', '飞往天空的雨');
INSERT INTO `tbl_author` VALUES ('e6d8d921f9ce11e7a28b88d7f63dcda2', '小红', '18656315534', '208759455@qq.com', '雨中漫步', '8ddbff3a80f4189b664a4a5a1ab84f67436c5914b20aeb02f404db17', '20', null, '安徽省合肥市蜀山区清潭路716号', null, null, '35707478f51e11e7a28b88d7f63dcda2', '汉族', null, '208759455', '雨中漫步', '飞往天空的雨');

-- ----------------------------
-- Table structure for `tbl_author_book`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_author_book`;
CREATE TABLE `tbl_author_book` (
  `id` varchar(255) NOT NULL,
  `author_id` varchar(255) NOT NULL COMMENT '作者的id',
  `book_id` varchar(255) NOT NULL COMMENT '图书id',
  `author_name` varchar(255) DEFAULT NULL COMMENT '作者的名字',
  `book_name` varchar(255) DEFAULT NULL COMMENT '图书的名字',
  PRIMARY KEY (`id`),
  KEY `author_id` (`author_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `tbl_author_book_ibfk_1` FOREIGN KEY (`author_id`) REFERENCES `tbl_author` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbl_author_book_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `tbl_book` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_author_book
-- ----------------------------
INSERT INTO `tbl_author_book` VALUES ('222222', '111111', '84292b7cfa8611e7a28b88d7f63dcda2', '小刚', '生肖守护神');
INSERT INTO `tbl_author_book` VALUES ('444444', '222222', '84292b7cfa8611e7a28b88d7f63dcda2', '鸣人', '生肖守护神');
INSERT INTO `tbl_author_book` VALUES ('666666', '333333', '84292b7cfa8611e7a28b88d7f63dcda2', '小智', '生肖守护神');

-- ----------------------------
-- Table structure for `tbl_book`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book` (
  `id` varchar(255) NOT NULL COMMENT '图书的唯一标识',
  `book_name` varchar(255) NOT NULL COMMENT '图书的名字',
  `book_class_id` varchar(255) NOT NULL COMMENT '图书类别，依赖图书类别表',
  `publisher_id` varchar(255) NOT NULL COMMENT '图书的出版商Id，依赖出版商表',
  `book_code` varchar(255) NOT NULL COMMENT '图书的编码',
  `publication_date` varchar(255) DEFAULT NULL COMMENT '图书的出版日期',
  `published_address` varchar(255) DEFAULT NULL COMMENT '出版地',
  PRIMARY KEY (`id`),
  KEY `book_class_id` (`book_class_id`),
  KEY `publisher_id` (`publisher_id`),
  CONSTRAINT `book_class_id` FOREIGN KEY (`book_class_id`) REFERENCES `tbl_bookclass` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `publisher_id` FOREIGN KEY (`publisher_id`) REFERENCES `tbl_publisher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
INSERT INTO `tbl_book` VALUES ('1ffde4dd00de11e8af8988d7f63dcda2', '黑子', 'b67e9257fa7011e7a28b88d7f63dcda2', '14f9eb4dffda11e7af8988d7f63dcda2', '黑子的篮球', '2018-01-24T08:11:00.790Z', '中国厦门');
INSERT INTO `tbl_book` VALUES ('84292b7cfa8611e7a28b88d7f63dcda2', '生肖守护神', 'c3265acbfa7011e7a28b88d7f63dcda2', '790d083efa8611e7a28b88d7f63dcda2', '1010101', '2017-6-3', '中国江苏');
INSERT INTO `tbl_book` VALUES ('9490a84f00d711e8af8988d7f63dcda2', '红楼梦', 'a386c960fa7011e7a28b88d7f63dcda2', '790d083efa8611e7a28b88d7f63dcda2', '红楼梦', '2018-01-24T07:44:19.906Z', '中国北京');

-- ----------------------------
-- Table structure for `tbl_bookclass`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bookclass`;
CREATE TABLE `tbl_bookclass` (
  `id` varchar(255) NOT NULL COMMENT '图书分类ID，唯一标识',
  `class_name` varchar(255) NOT NULL COMMENT '图书分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_bookclass
-- ----------------------------
INSERT INTO `tbl_bookclass` VALUES ('a386c960fa7011e7a28b88d7f63dcda2', '言情');
INSERT INTO `tbl_bookclass` VALUES ('aa7cecb2fa7011e7a28b88d7f63dcda2', '童话');
INSERT INTO `tbl_bookclass` VALUES ('b25b864afa7011e7a28b88d7f63dcda2', '玄幻');
INSERT INTO `tbl_bookclass` VALUES ('b67e9257fa7011e7a28b88d7f63dcda2', '都市');
INSERT INTO `tbl_bookclass` VALUES ('bddb4448fa7011e7a28b88d7f63dcda2', '寓言');
INSERT INTO `tbl_bookclass` VALUES ('c3265acbfa7011e7a28b88d7f63dcda2', '修仙');
INSERT INTO `tbl_bookclass` VALUES ('c6962811fa7011e7a28b88d7f63dcda2', '穿越');
INSERT INTO `tbl_bookclass` VALUES ('cdb43aa7fa7011e7a28b88d7f63dcda2', '古装');
INSERT INTO `tbl_bookclass` VALUES ('d62964d4fa7011e7a28b88d7f63dcda2', '哲学');

-- ----------------------------
-- Table structure for `tbl_book_library`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book_library`;
CREATE TABLE `tbl_book_library` (
  `id` varchar(255) NOT NULL,
  `book_id` varchar(255) NOT NULL COMMENT '图书的id',
  `library_id` varchar(255) NOT NULL COMMENT '图书馆id',
  `book_name` varchar(255) DEFAULT NULL COMMENT '图书的名字',
  `library_name` varchar(255) DEFAULT NULL COMMENT '图书馆的名字',
  PRIMARY KEY (`id`),
  KEY `book_id` (`book_id`),
  KEY `library_id` (`library_id`),
  CONSTRAINT `tbl_book_library_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `tbl_book` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbl_book_library_ibfk_2` FOREIGN KEY (`library_id`) REFERENCES `tbl_library` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_book_library
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_book_nationality`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book_nationality`;
CREATE TABLE `tbl_book_nationality` (
  `id` varchar(255) NOT NULL,
  `nationality_id` varchar(255) NOT NULL COMMENT '国籍id',
  `book_id` varchar(255) NOT NULL COMMENT '图书id',
  `nationality_name` varchar(255) DEFAULT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `nationality_id` (`nationality_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `tbl_book_nationality_ibfk_1` FOREIGN KEY (`nationality_id`) REFERENCES `nationality` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbl_book_nationality_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `tbl_book` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_book_nationality
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_book_shop`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book_shop`;
CREATE TABLE `tbl_book_shop` (
  `id` varchar(255) NOT NULL,
  `book_id` varchar(255) NOT NULL COMMENT '图书的id',
  `shop_id` varchar(255) NOT NULL COMMENT '商店的id',
  `book_name` varchar(255) DEFAULT NULL,
  `shop_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `book_id` (`book_id`),
  KEY `shop_id` (`shop_id`),
  CONSTRAINT `tbl_book_shop_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `tbl_book` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbl_book_shop_ibfk_2` FOREIGN KEY (`shop_id`) REFERENCES `tbl_shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_book_shop
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_library`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_library`;
CREATE TABLE `tbl_library` (
  `id` varchar(255) NOT NULL COMMENT '图书馆的id,图书馆的唯一标识',
  `library_name` varchar(255) NOT NULL COMMENT '图书馆的名字',
  `library_address` varchar(255) DEFAULT NULL COMMENT '图书馆的所在地',
  `library_nationality_id` varchar(255) NOT NULL COMMENT '图书馆的所在国家,依赖国家表',
  `library_bulid_time` varchar(0) DEFAULT NULL COMMENT '图书馆的建造时间',
  `library_life` varchar(255) DEFAULT NULL COMMENT '图书馆的存在时间',
  PRIMARY KEY (`id`),
  KEY `library_nationality_id` (`library_nationality_id`),
  CONSTRAINT `library_nationality_id` FOREIGN KEY (`library_nationality_id`) REFERENCES `nationality` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_library
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_publisher`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_publisher`;
CREATE TABLE `tbl_publisher` (
  `id` varchar(255) NOT NULL COMMENT '出版商id，出版商唯一标识',
  `publisher_name` varchar(255) NOT NULL COMMENT '出版商的名字',
  `publisher_address` varchar(255) DEFAULT NULL COMMENT '出版商所在地',
  `publisher_nationality_id` varchar(255) NOT NULL COMMENT '出版商国籍，依赖国籍表',
  `publisher_creation_time` varchar(255) DEFAULT NULL COMMENT '出版商创建时间',
  `publisher_life` varchar(255) DEFAULT NULL COMMENT '出版商存在年限',
  PRIMARY KEY (`id`),
  KEY `publisher_nationality_id` (`publisher_nationality_id`),
  CONSTRAINT `publisher_nationality_id` FOREIGN KEY (`publisher_nationality_id`) REFERENCES `nationality` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_publisher
-- ----------------------------
INSERT INTO `tbl_publisher` VALUES ('14f9eb4dffda11e7af8988d7f63dcda2', '工业出版社', '西雅图', '59592a75f51f11e7a28b88d7f63dcda2', '1897', '120');
INSERT INTO `tbl_publisher` VALUES ('790d083efa8611e7a28b88d7f63dcda2', '中国工业出版社', '中国北京', 'd944a359fa8611e7a28b88d7f63dcda2', '1998-6-5', '19');

-- ----------------------------
-- Table structure for `tbl_shop`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_shop`;
CREATE TABLE `tbl_shop` (
  `id` varchar(255) NOT NULL COMMENT '商店的id，商店唯一识别',
  `shop_name` varchar(255) NOT NULL COMMENT '商店的名字',
  `shop_address` varchar(255) DEFAULT NULL COMMENT '商店的所在地',
  `shop_creation_time` varchar(255) DEFAULT NULL COMMENT '商店的创建时间',
  `shop_life` varchar(255) DEFAULT NULL COMMENT '商店的存在年限',
  `shop_nationality_id` varchar(255) NOT NULL COMMENT '商店的国家id，依赖国家表',
  PRIMARY KEY (`id`),
  KEY `shop_nationality_id` (`shop_nationality_id`),
  CONSTRAINT `shop_nationality_id` FOREIGN KEY (`shop_nationality_id`) REFERENCES `nationality` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_shop
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_shopowner`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_shopowner`;
CREATE TABLE `tbl_shopowner` (
  `id` varchar(255) NOT NULL COMMENT '商城的唯一标识',
  `shop_owner_name` varchar(255) NOT NULL COMMENT '商店的店主名字',
  `shop_owner_sex` varchar(255) DEFAULT NULL COMMENT '店主的性别',
  `shop_owner_age` varchar(255) DEFAULT NULL COMMENT '店主的年龄',
  `shop_owner_address` varchar(255) DEFAULT NULL COMMENT '店主的家庭住址',
  `shop_owner_nation` varchar(255) DEFAULT NULL COMMENT '店主的民族',
  `shop_owner_nationality_id` varchar(255) NOT NULL COMMENT '商店店主的国籍，依赖国家表',
  `shop_owner_remark` varchar(255) DEFAULT NULL COMMENT '店主个人简介',
  PRIMARY KEY (`id`),
  KEY `shop_owner_nationality_id` (`shop_owner_nationality_id`),
  CONSTRAINT `shop_owner_nationality_id` FOREIGN KEY (`shop_owner_nationality_id`) REFERENCES `nationality` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_shopowner
-- ----------------------------

-- ----------------------------
-- Table structure for `tbl_shop_shopowner`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_shop_shopowner`;
CREATE TABLE `tbl_shop_shopowner` (
  `id` varchar(255) NOT NULL,
  `shop_id` varchar(255) NOT NULL DEFAULT '商店的id',
  `shop_owner_id` varchar(255) NOT NULL COMMENT '店主的id',
  `shop_name` varchar(255) DEFAULT NULL,
  `shop_owner_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `shop_owner_id` (`shop_owner_id`),
  KEY `shop_id` (`shop_id`),
  CONSTRAINT `tbl_shop_shopowner_ibfk_1` FOREIGN KEY (`shop_owner_id`) REFERENCES `tbl_shopowner` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tbl_shop_shopowner_ibfk_2` FOREIGN KEY (`shop_id`) REFERENCES `tbl_shop` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_shop_shopowner
-- ----------------------------
