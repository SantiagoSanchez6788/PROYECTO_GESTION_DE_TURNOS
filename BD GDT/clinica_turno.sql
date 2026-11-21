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
-- Table structure for table `turno`
--

DROP TABLE IF EXISTS `turno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `turno` (
  `idTurno` int NOT NULL AUTO_INCREMENT,
  `horaInicio` time NOT NULL,
  `horaFinal` time NOT NULL,
  `fecha` date NOT NULL,
  `Medico_idMedico` int NOT NULL,
  `Clinica_idClinica` int NOT NULL,
  PRIMARY KEY (`idTurno`),
  KEY `fk_Turno_Medico1_idx` (`Medico_idMedico`),
  KEY `fk_Turno_Clinica1_idx` (`Clinica_idClinica`),
  CONSTRAINT `fk_Turno_Clinica1` FOREIGN KEY (`Clinica_idClinica`) REFERENCES `clinica` (`idClinica`),
  CONSTRAINT `fk_Turno_Medico1` FOREIGN KEY (`Medico_idMedico`) REFERENCES `medico` (`idMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turno`
--

LOCK TABLES `turno` WRITE;
/*!40000 ALTER TABLE `turno` DISABLE KEYS */;
INSERT INTO `turno` VALUES (1,'14:15:00','14:30:00','2026-11-01',1,1),(2,'14:30:00','14:45:00','2026-11-01',1,1),(3,'14:45:00','15:00:00','2026-11-01',1,1),(4,'16:00:00','16:15:00','2026-11-02',2,1),(5,'16:15:00','16:30:00','2026-11-02',2,1),(6,'16:30:00','16:45:00','2026-11-02',2,1);
/*!40000 ALTER TABLE `turno` ENABLE KEYS */;
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
