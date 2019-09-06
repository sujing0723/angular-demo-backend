-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: task_management
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tasks`
--

DROP TABLE IF EXISTS `tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tasks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `taskName` varchar(45) DEFAULT NULL,
  `taskState` varchar(45) DEFAULT NULL,
  `taskStaff` varchar(45) DEFAULT NULL,
  `taskDescription` varchar(50) DEFAULT NULL,
  `operation` varchar(45) DEFAULT NULL,
  `question` varchar(45) DEFAULT NULL,
  `checked` int(11) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tasks`
--

LOCK TABLES `tasks` WRITE;
/*!40000 ALTER TABLE `tasks` DISABLE KEYS */;
INSERT INTO `tasks` VALUES (20,'task4','有问题','10','demo',NULL,'不会 不会啊',0,'2019-09-06'),(21,'task3',NULL,'19',NULL,NULL,NULL,0,'2019-09-03'),(22,'task5','开始工作','10','学习angular 第三章',NULL,'已经学会了彻底删除',0,'2019-09-04'),(32,'task1','完成','10','完成',NULL,'完成',0,'2019-09-05'),(33,'task2','开始工作','10','sdcwevcvefwscdsv',NULL,'tyrgjbn',0,'2019-09-05'),(34,'task6','新建','10','sdcwevcvefwscdsvdfvewv',NULL,NULL,0,'2019-09-05'),(35,'task7','新建','10','sv f fg ',NULL,NULL,0,'2019-09-06'),(36,'task8','新建','10','sdcwe',NULL,NULL,0,'2019-09-05'),(37,'wesrdft','新建','10','wfdewfc',NULL,NULL,0,'2019-09-05'),(38,'wesrdftsss','新建','10','wfdewfc',NULL,NULL,0,'2019-09-05'),(39,'sssss','有疑问','10','有疑问',NULL,'有疑问',0,'2019-09-05'),(40,'ssssswert','有疑问','10','有疑问',NULL,'有疑问',0,'2019-09-05'),(41,'scx',NULL,'19',NULL,NULL,NULL,0,'2019-09-05'),(42,'efwc',NULL,'19',NULL,NULL,NULL,0,'2019-09-05'),(43,'task5','新建','10','完成demo',NULL,NULL,0,'2019-09-05'),(44,'task9','新建','10','你好呀',NULL,NULL,0,'2019-09-06'),(45,'task11','完成','10','demo demo',NULL,'完成',0,'2019-09-06');
/*!40000 ALTER TABLE `tasks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'sujing','sujing','操作员','18742037901@139.com','sujing',1),(3,'admin','admin','管理员','178899@qq.com','ADMIN',1),(10,'xiaoming','xiaoming','操作员','asfdsf','xiaoming',0),(19,'zwy','zhangwenyue','操作员','zhangwenyue@qq.com','zhangwenyue',1),(20,'xianhong','12345678','操作员','xiaohong@qq.com','xiaohongfghj',0),(21,'hudsugdads','qwertyuiop','操作员','wertyuio@qq.com','2345678',1),(22,'a','adsgdggggggggggg','操作员','158411@qq.com','codsf',1),(23,'wangyun','wangyun','操作员','qrew@qq.com','sxc',1),(24,'xiaohuang','xiaohuang','操作员','qrew@qq.com','fef',1),(25,'renxudong','renxudong','操作员','renxudong@qq.com','renxudong',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-06 17:30:06
