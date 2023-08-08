-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: mobile_shop_management
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sales` (
  `bill_id` int NOT NULL AUTO_INCREMENT,
  `bill_date` varchar(255) DEFAULT NULL,
  `brand` char(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `customer_name` char(255) DEFAULT NULL,
  `mobile_number` bigint DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1278 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (1265,'1/15/23','Google','Pixel 7 Pro','Abhishek Goyal',7455962345,'74,999'),(1266,'1/15/23','Samsung','Galaxy A71','Abhishek Goyal',9087564312,'27,949'),(1267,'1/15/23','Motorola','One 5G Ace','Akshat Singhal',9087564343,'64,990'),(1268,'1/15/23','Samsung','Galaxy A70','Kartik Tyagi',9324667890,'30,899'),(1269,'1/15/23','Apple','14 Pro Max','Ayushi',9087564321,'1,39,990'),(1270,'1/16/23','Apple','11 Pro Max','prince saini',8171696874,'1,50,800'),(1271,'1/16/23','Oneplus','7','Abhishek',987654678,'32,999'),(1272,'1/16/23','Samsung','Galaxy A71','Kartik',5678987656,'27,949'),(1273,'24/04/2022','Samsung','S20 Ultra','Abhishek',9876593210,'34,908'),(1274,'1/17/23','Motorola','One 5G Ace','Abhinav Tyagi',9648763217,'64,990'),(1275,'1/17/23','Apple','XS Max','Varun',9087654435,'1,24,899'),(1276,'1/17/23','Apple','XR','Parmod',3445567765,'64,900'),(1277,'1/18/23','Apple','XR','Kanhaiya',9676543234,'64,900');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-19 22:21:11
