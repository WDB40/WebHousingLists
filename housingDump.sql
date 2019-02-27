-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: housing
-- ------------------------------------------------------
-- Server version	8.0.12

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
-- Table structure for table `housing_unit`
--

DROP TABLE IF EXISTS `housing_unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `housing_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `street_number` int(8) NOT NULL,
  `street_name` varchar(25) NOT NULL,
  `unit_number` int(8) DEFAULT NULL,
  `city` varchar(25) NOT NULL,
  `zipcode` int(5) NOT NULL,
  `state` varchar(2) NOT NULL,
  `neighborhood` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `housingunit_neighborhood_fk` (`neighborhood`),
  CONSTRAINT `housingunit_neighborhood_fk` FOREIGN KEY (`neighborhood`) REFERENCES `neighborhood` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `housing_unit`
--

LOCK TABLES `housing_unit` WRITE;
/*!40000 ALTER TABLE `housing_unit` DISABLE KEYS */;
INSERT INTO `housing_unit` VALUES (1,123,'4th Avenue',304,'Des Moines',50312,'IA',1);
/*!40000 ALTER TABLE `housing_unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listing_details`
--

DROP TABLE IF EXISTS `listing_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `listing_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unit_id` int(11) NOT NULL,
  `price` double(15,2) NOT NULL,
  `list_date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `listingdetails_unitid_fk` (`unit_id`),
  CONSTRAINT `listingdetails_unitid_fk` FOREIGN KEY (`unit_id`) REFERENCES `housing_unit` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listing_details`
--

LOCK TABLES `listing_details` WRITE;
/*!40000 ALTER TABLE `listing_details` DISABLE KEYS */;
INSERT INTO `listing_details` VALUES (1,1,150000.00,'2019-02-27');
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
  `NeighborhoodName` varchar(25) NOT NULL,
  `SchoolDistrictID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `neighborhood_schooldistrict_fk` (`SchoolDistrictID`),
  CONSTRAINT `neighborhood_schooldistrict_fk` FOREIGN KEY (`SchoolDistrictID`) REFERENCES `school_district` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `neighborhood`
--

LOCK TABLES `neighborhood` WRITE;
/*!40000 ALTER TABLE `neighborhood` DISABLE KEYS */;
INSERT INTO `neighborhood` VALUES (1,'Downtown',1);
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
  `DistrictName` varchar(25) NOT NULL,
  `Rating` decimal(3,1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school_district`
--

LOCK TABLES `school_district` WRITE;
/*!40000 ALTER TABLE `school_district` DISABLE KEYS */;
INSERT INTO `school_district` VALUES (1,'Des Moines Central',3.4);
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

-- Dump completed on 2019-02-27 17:42:52
