-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: housing
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `housingunit`
--

DROP TABLE IF EXISTS `housingunit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `housingunit` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UnitNo` int(8) DEFAULT NULL,
  `StreetNo` int(8) DEFAULT NULL,
  `StreetName` varchar(25) DEFAULT NULL,
  `City` varchar(25) DEFAULT NULL,
  `State` varchar(2) DEFAULT NULL,
  `ZipCode` int(5) DEFAULT NULL,
  `NeighborhoodNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `housingunit`
--

LOCK TABLES `housingunit` WRITE;
/*!40000 ALTER TABLE `housingunit` DISABLE KEYS */;
INSERT INTO `housingunit` VALUES (1,727,NULL,'38th','WDM','IA',50265,1);
/*!40000 ALTER TABLE `housingunit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listing_details`
--

DROP TABLE IF EXISTS `listing_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `listing_details` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UnitID` int(11) DEFAULT NULL,
  `Price` double(15,2) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listing_details`
--

LOCK TABLES `listing_details` WRITE;
/*!40000 ALTER TABLE `listing_details` DISABLE KEYS */;
INSERT INTO `listing_details` VALUES (1,1,NULL),(2,1,400000.00);
/*!40000 ALTER TABLE `listing_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `neighborhood`
--

DROP TABLE IF EXISTS `neighborhood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `neighborhood` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NeighborhoodName` varchar(25) DEFAULT NULL,
  `SchoolDistrictID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `neighborhood`
--

LOCK TABLES `neighborhood` WRITE;
/*!40000 ALTER TABLE `neighborhood` DISABLE KEYS */;
INSERT INTO `neighborhood` VALUES (1,'ABC',1);
/*!40000 ALTER TABLE `neighborhood` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `school_district`
--

DROP TABLE IF EXISTS `school_district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `school_district` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DistrictName` varchar(25) DEFAULT NULL,
  `Rating` decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school_district`
--

LOCK TABLES `school_district` WRITE;
/*!40000 ALTER TABLE `school_district` DISABLE KEYS */;
INSERT INTO `school_district` VALUES (1,'Ankeny',99.9);
/*!40000 ALTER TABLE `school_district` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-26 16:20:21
