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
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `Phone_Brand` char(20) DEFAULT NULL,
  `Phone_Model` varchar(50) DEFAULT NULL,
  `RAM` varchar(10) DEFAULT NULL,
  `ROM` varchar(10) DEFAULT NULL,
  `Phone_Price` varchar(20) DEFAULT NULL,
  `Quantity` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES ('Apple','XR','3 GB','256 GB','64,900',4),('Apple','X','3 GB','256 GB','64,789',5),('Apple','XS','3 GB','256 GB','89,899',5),('Apple','XS Max','4 GB','512 GB','1,24,899',5),('Apple','11','4 GB','512 GB','44,999',5),('Apple','11 Pro','4 GB','512 GB','89,099',5),('Apple','11 Pro Max','4 GB','512 GB','1,50,800',5),('Apple','12 Mini','4 GB','256 GB','52,999',15),('Apple','12','4 GB','256 GB','65,999',15),('Apple','12 Pro','4 GB','512 GB','1,06,699',10),('Apple','12 Pro Max','6 GB','512 GB','1,23,299',10),('Apple','13 Mini','4 GB','512 GB','79,990',10),('Apple','13','4 GB','512 GB','83,999',10),('Apple','13 Pro','6 GB','1 TB','1,49,990',10),('Apple','13 Pro Max','6 GB','1 TB','1,59,990',10),('Apple','14','6 GB','512 GB','1,03,990',10),('Apple','14 Plus','6 GB','512 GB','82,999',10),('Apple','14 Pro','6 GB','1 TB','1,79,900',10),('Apple','14 Pro Max','6 GB','1 TB','1,39,990',10),('Samsung','Galaxy A32','8 GB','128 GB','19,989',10),('Samsung','Galaxy A72','8 GB','128 GB','33,890',10),('Samsung','Galaxy A71','8 GB','128 GB','27,949',10),('Samsung','Galaxy A50s','4 GB','128 GB','21,070',10),('Samsung','Galaxy A31','6 GB','128 GB','16,999',10),('Samsung','Galaxy A70','6 GB','128 GB','30,899',10),('Samsung','Galaxy A10s','3 GB','32 GB','8,999',10),('Samsung','Galaxy S5','2 GB','16 GB','6,999',1),('Samsung','Galaxy S6','3 GB','32 GB','24,990',5),('Samsung','Galaxy S7','4 GB','32 GB','19,999',5),('Samsung','Galaxy S8','4 GB','64 GB','50,099',5),('Samsung','Galaxy S9','6 GB','64 GB','62,999',10),('Samsung','Galaxy S10','8 GB','512 GB','71,400',10),('Samsung','Galaxy S20','8 GB','128 GB','41,999',10),('Samsung','Galaxy S21','8 GB','128 GB','61,999',10),('Samsung','Galaxy S21 Ultra','12 GB','256 GB','1,29,999',5),('Samsung','Galaxy S22','8 GB','256 GB','76,999',10),('Samsung','Galaxy Fold','12 GB','256 GB','1,39,900',10),('Samsung','Galaxy Z Flip','8 GB','256 GB','94,999',10),('Samsung','Galaxy Z Fold 2','12 GB','256 GB','1,89,999',10),('Samsung','Galaxy Z Fold 3','12 GB','256 GB','99,999',10),('Samsung','Galaxy Z Flip 3','8 GB','256 GB','56,999',10),('Samsung','Galaxy Z Fold 4','12 GB','1 TB','1,62,800',10),('Oneplus','5','8 GB','128 GB','12,999',10),('Oneplus','5T','6 GB','64 GB','12,500',10),('Oneplus','6','8 GB','128 GB','39,999',10),('Oneplus','6T','10 GB','256 GB','39,999',5),('Oneplus','7','6 GB','128 GB','32,999',5),('Oneplus','7 Pro','12 GB','256 GB','44,999',5),('Oneplus','7T','8 GB','128 GB','34,834',5),('Oneplus','7T Pro','8 GB','256 GB','58,999',5),('Oneplus','8','8 GB','128 GB','44,990',5),('Oneplus','8 Pro','8 GB','256 GB','59,999',5),('Oneplus','8T','12 GB','256 GB','41,990',5),('Oneplus','9','12 GB','256 GB','54,999',5),('Oneplus','9 Pro','8 GB','128 GB','49,999',5),('Oneplus','10 Pro','12 GB','256 GB','66,999',5),('Oneplus','10 T','16 GB','256 GB','53,699',5),('Oneplus','Ace Pro','12 GB','256 GB','47,990',5),('Oneplus','11','12 GB','256 GB','47,990',5),('Oneplus','Nord N10 5G','6 GB','128 GB','21,999',5),('Oneplus','Nord N100','4 GB','64 GB','8,999',5),('Oneplus','Nord CE 5G','8 GB','128 GB','23,999',5),('Oneplus','Nord N200','4 GB','64 GB','11,999',5),('Oneplus','Nord 2 5G','8 GB','256 GB','34,999',5),('Google','Pixel 2','4 GB','64 GB','59,990',5),('Google','Pixel 2 XL','4 GB','64 GB','45,499',8),('Google','Pixel 3','4 GB','128 GB','80,000',8),('Google','Pixel 3 XL','4 GB','128 GB','92,000',8),('Google','Pixel 3a','4 GB','64 GB','39,749',5),('Google','Pixel 3a XL','4 GB','64 GB','44,999',5),('Google','Pixel 4','6 GB','128 GB','43,999',5),('Google','Pixel 4 XL','6 GB','64 GB','16,900',5),('Google','Pixel 4a','6 GB','128 GB','27,499',5),('Google','Pixel 4a 5G','6 GB','128 GB','31,560',5),('Google','Pixel 5','8 GB','128 GB','38,099',5),('Google','Pixel 5a','8 GB','128 GB','34,999',5),('Google','Pixel 6','8 GB','128 GB','40,750',5),('Google','Pixel 6 Pro','12 GB','128 GB','56,640',5),('Google','Pixel 6a','6 GB','128 GB','32,450',5),('Google','Pixel 7','8 GB','128 GB','52,999',5),('Google','Pixel 7 Pro','12 GB','128 GB','74,999',5),('Motorola','Moto E32','4 GB','64 GB','11,999',5),('Motorola','Edge','4 GB','64 GB',' 8,999',5),('Motorola','Edge S30 ','8 GB','128 GB',' 50,990',5),('Motorola','Edge X30','8 GB','128 GB',' 40,990',5),('Motorola','Edge+','8 GB','128 GB',' 48,990',5),('Motorola','Edge 30','8 GB','128 GB',' 48,990',5),('Motorola','Edge 30 Pro','8 GB','256 GB',' 48,990',5),('Motorola','Moto G Power','4 GB','64 GB',' 15,999',5),('Motorola','Moto G 5G','4 GB','256 GB','24,999',5),('Motorola','Moto G Stylus','10 GB','128 GB','35,999',5),('Motorola','Moto G Stylus 5G','6 GB','128 GB','34,999',5),('Motorola','Moto G31','4 GB','128 GB','23,456',5),('Motorola','Moto G41','6 GB','128 GB','25,499',5),('Motorola','Moto G51 5G','16 GB','1 TB','87,000',5),('Motorola','Moto G71 5G','16 GB','1 TB','75,000',5),('Motorola','Moto G200 5G','6 GB','128 GB','34,990',5),('Motorola','Moto G22','6 GB','256 GB','35,990',5),('Motorola','Moto G52','6 GB','256 GB','45,760',5),('Motorola','Moto G82','6 GB','512 GB','36,990',5),('Motorola','Moto G62','6 GB','512 GB','98,000',5),('Motorola','Moto G32','6 GB','512 GB','45,009',5),('Motorola','Moto G72','6 GB','256 GB','34,999',5),('Motorola','One 5G Ace','6 GB','256 GB','64,990',5);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
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
