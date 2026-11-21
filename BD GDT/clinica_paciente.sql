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
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `idPaciente` int NOT NULL AUTO_INCREMENT,
  `historiaClinica` varchar(1000) NOT NULL,
  `Persona_idPersona` int NOT NULL,
  `Obra Social_idObra Social` int DEFAULT NULL,
  PRIMARY KEY (`idPaciente`),
  KEY `fk_Paciente_Persona1_idx` (`Persona_idPersona`),
  KEY `fk_Paciente_Obra Social1_idx` (`Obra Social_idObra Social`),
  CONSTRAINT `fk_Paciente_Obra Social1` FOREIGN KEY (`Obra Social_idObra Social`) REFERENCES `obra social` (`idObra Social`),
  CONSTRAINT `fk_Paciente_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,' El paciente fue internado en la Unidad de Cuidados Coronarios (UCO) durante 48 horas. Recibió terapia antiagregante doble (Aspirina + Clopidogrel), anticoagulación con Enoxaparina y control de presión arterial. Evolucionó hemodinámicamente estable, afebril y sin recurrencia del dolor precordial. Pasó a sala general el 30/10/2026.\n',1,1),(2,'La paciente fue ingresada en el servicio de Clínica Médica para el manejo de una neumonía aguda de la comunidad. Inició tratamiento empírico con Ampicilina Sulbactam endovenosa y soporte de oxígeno por cánula nasal a 2 litros por minuto debido a hipoxemia leve. Evolucionó favorablemente al tercer día con franca disminución de la tos, registros febriles negativos y destete exitoso del oxígeno suplementario al alcanzar una saturación del 96% al aire ambiente. Se autorizó su externación hospitalaria con pase a internación domiciliaria el 03/11/2026.',2,NULL),(3,' El paciente ingresó a quirófano de urgencia para realizar una laparoscopía exploradora por sospecha de apendicitis aguda. Se constató plastrón apendicular y se procedió a realizar una apendicectomía e higiene de la cavidad abdominal sin incidentes. Recibió esquema antibiótico endovenoso con Ceftriaxona y Metronidazol durante 36 horas junto con analgesia reglada. Evolucionó afebril, con buena tolerancia a la dieta líquida, adecuada mecánica ventilatoria y dolor controlado. Pasó a sala de internación general el 02/11/2026.',3,1);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-11-21 12:03:16
