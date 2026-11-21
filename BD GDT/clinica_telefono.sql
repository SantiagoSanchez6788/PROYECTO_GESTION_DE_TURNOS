CREATE DATABASE  IF NOT EXISTS `clinica` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `clinica`;
-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: clinica
-- ------------------------------------------------------
-- Server version	8.0.43

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
-- Table structure for table `telefono`
--

DROP TABLE IF EXISTS `telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefono` (
  `idTelefono` int NOT NULL AUTO_INCREMENT,
  `numeroTelefono` varchar(45) NOT NULL,
  `Clinica_idClinica` int DEFAULT NULL,
  `Obra Social_idObra Social` int DEFAULT NULL,
  `Persona_idPersona` int DEFAULT NULL,
  PRIMARY KEY (`idTelefono`),
  KEY `fk_Telefono_Clinica1_idx` (`Clinica_idClinica`),
  KEY `fk_Telefono_Obra Social1_idx` (`Obra Social_idObra Social`),
  KEY `fk_Telefono_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Telefono_Clinica1` FOREIGN KEY (`Clinica_idClinica`) REFERENCES `clinica` (`idClinica`),
  CONSTRAINT `fk_Telefono_Obra Social1` FOREIGN KEY (`Obra Social_idObra Social`) REFERENCES `obra social` (`idObra Social`),
  CONSTRAINT `fk_Telefono_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
INSERT INTO `telefono` VALUES (1,'2974554133',1,NULL,NULL),(2,'2945545678',NULL,1,NULL),(3,'2945542653',NULL,NULL,1),(4,'2945543275',NULL,NULL,2),(5,'2945542895',NULL,NULL,3),(6,'1126676787',NULL,NULL,4),(7,'2945549872',NULL,NULL,5);
/*!40000 ALTER TABLE `telefono` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-11-21 12:03:13
