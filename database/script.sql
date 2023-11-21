CREATE DATABASE IF NOT EXISTS `springbootdb`;
USE `springbootdb`;

DROP TABLE IF EXISTS `tarefa`;

CREATE TABLE `tarefa` (
                          `id` int(11) NOT NULL AUTO_INCREMENT,
                          `descricao` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
                          `feita` TINYINT(1) NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
