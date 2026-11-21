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
-- Table structure for table `agendar`
--

DROP TABLE IF EXISTS `agendar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendar` (
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `estado` varchar(45) NOT NULL,
  `fechaCancelacion` date DEFAULT NULL,
  `Turno_idTurno` int NOT NULL,
  `Paciente_idPaciente` int NOT NULL,
  PRIMARY KEY (`Turno_idTurno`,`Paciente_idPaciente`),
  KEY `fk_Agendar_Paciente1_idx` (`Paciente_idPaciente`),
  CONSTRAINT `fk_Agendar_Paciente1` FOREIGN KEY (`Paciente_idPaciente`) REFERENCES `paciente` (`idPaciente`),
  CONSTRAINT `fk_Agendar_Turno1` FOREIGN KEY (`Turno_idTurno`) REFERENCES `turno` (`idTurno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendar`
--

LOCK TABLES `agendar` WRITE;
/*!40000 ALTER TABLE `agendar` DISABLE KEYS */;
INSERT INTO `agendar` VALUES ('2030-10-26','08:00:00','confirmado',NULL,1,3),('2026-11-16','19:50:37','Confirmado',NULL,2,1),('2026-11-16','19:51:52','Confirmado',NULL,3,1);
/*!40000 ALTER TABLE `agendar` ENABLE KEYS */;
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
