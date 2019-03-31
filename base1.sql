/*
 Navicat Premium Data Transfer

 Source Server         : Test
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : base1

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 31/03/2019 01:29:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ELF
-- ----------------------------
DROP TABLE IF EXISTS `ELF`;
CREATE TABLE `ELF` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `race` varchar(255) NOT NULL,
  `desc` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of ELF
-- ----------------------------
BEGIN;
INSERT INTO `ELF` VALUES (68, 'Gggg', 'elfe', 'Gggg');
INSERT INTO `ELF` VALUES (69, 'rrr', 'elfe', 'Tt');
INSERT INTO `ELF` VALUES (70, 'Vfefg', 'elfe', 'Arty');
INSERT INTO `ELF` VALUES (71, 'Gterg', 'elfe', 'Dog');
COMMIT;

-- ----------------------------
-- Table structure for Hobbit
-- ----------------------------
DROP TABLE IF EXISTS `Hobbit`;
CREATE TABLE `Hobbit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `race` varchar(255) NOT NULL,
  `desc` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of Hobbit
-- ----------------------------
BEGIN;
INSERT INTO `Hobbit` VALUES (42, 'Toutqqq', 'hobbit', 'Gangqqq');
INSERT INTO `Hobbit` VALUES (43, 'Fogqqq', 'hobbit', 'Gfhjtdqqq');
INSERT INTO `Hobbit` VALUES (44, 'Yyy', 'hobbit', 'Uuu');
INSERT INTO `Hobbit` VALUES (45, 'Gfjf', 'hobbit', 'Dose');
COMMIT;

-- ----------------------------
-- Table structure for Nain
-- ----------------------------
DROP TABLE IF EXISTS `Nain`;
CREATE TABLE `Nain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `race` varchar(255) NOT NULL,
  `desc` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of Nain
-- ----------------------------
BEGIN;
INSERT INTO `Nain` VALUES (33, 'Grgqqq', 'nain', 'Sfgsdfqqq');
INSERT INTO `Nain` VALUES (34, 'Sagasqqq', 'nain', 'Dfyjhqqq');
INSERT INTO `Nain` VALUES (35, 'Vv', 'nain', 'Ttt');
INSERT INTO `Nain` VALUES (36, 'Rrr', 'nain', 'Eee');
INSERT INTO `Nain` VALUES (37, 'Li', 'nain', 'Bad');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
