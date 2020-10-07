CREATE DATABASE  IF NOT EXISTS `bd_chiplaptos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bd_chiplaptos`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_chiplaptos
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `alumnovulnerable`
--

DROP TABLE IF EXISTS `alumnovulnerable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnovulnerable` (
  `idAlumnoVulnerable` int NOT NULL AUTO_INCREMENT,
  `codalum` varchar(20) NOT NULL,
  `idpersona` int NOT NULL,
  `idescuela` int NOT NULL,
  PRIMARY KEY (`idAlumnoVulnerable`),
  UNIQUE KEY `codalum` (`codalum`),
  KEY `fk_Persona` (`idpersona`),
  KEY `fk_Escuela` (`idescuela`),
  CONSTRAINT `alumnovulnerable_ibfk_1` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`),
  CONSTRAINT `alumnovulnerable_ibfk_2` FOREIGN KEY (`idescuela`) REFERENCES `escuela` (`idEscuela`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnovulnerable`
--

LOCK TABLES `alumnovulnerable` WRITE;
/*!40000 ALTER TABLE `alumnovulnerable` DISABLE KEYS */;
INSERT INTO `alumnovulnerable` VALUES (1,'185.1225.156',1,2),(2,'181.2503.005',3,2),(3,'181.253.458',4,6),(4,'181.2503.055',6,2),(5,'185.1225.125',11,11),(6,'181.2503.045',12,2),(7,'181.2654.6',13,1),(8,'158.25.25',14,2),(11,'181.2503.003',17,2),(12,'181.2503.785',18,13),(14,'171.2503.005',21,15);
/*!40000 ALTER TABLE `alumnovulnerable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datosusuario`
--

DROP TABLE IF EXISTS `datosusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datosusuario` (
  `idDatosusuario` int NOT NULL AUTO_INCREMENT,
  `idUsuario` int NOT NULL,
  `idPersona` int NOT NULL,
  PRIMARY KEY (`idDatosusuario`),
  KEY `Usuario2` (`idUsuario`),
  KEY `Persona1` (`idPersona`),
  CONSTRAINT `Persona1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`),
  CONSTRAINT `Usuario2` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosusuario`
--

LOCK TABLES `datosusuario` WRITE;
/*!40000 ALTER TABLE `datosusuario` DISABLE KEYS */;
INSERT INTO `datosusuario` VALUES (1,2,17);
/*!40000 ALTER TABLE `datosusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalleentrega`
--

DROP TABLE IF EXISTS `detalleentrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalleentrega` (
  `idDetalleentrega` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  `serie` varchar(30) NOT NULL,
  `idEntrega` int NOT NULL,
  PRIMARY KEY (`idDetalleentrega`),
  KEY `fk_entrega` (`idEntrega`),
  CONSTRAINT `detalleentrega_ibfk_1` FOREIGN KEY (`idEntrega`) REFERENCES `entrega` (`idEntrega`),
  CONSTRAINT `detalleentrega_chk_1` CHECK (((`tipo` = _latin1'Laptop') or (`tipo` = _latin1'Chip de Datos')))
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleentrega`
--

LOCK TABLES `detalleentrega` WRITE;
/*!40000 ALTER TABLE `detalleentrega` DISABLE KEYS */;
INSERT INTO `detalleentrega` VALUES (1,'CHIP DE DATOS','ewklkew32',1),(4,'LAPTOP','DSKJ',3),(5,'LAPTOP','tyew',4),(6,'CHIP DE DATOS','ertt',5),(7,'CHIP DE DATOS','rt22r',7),(8,'LAPTOP','desconocido',8),(13,'LAPTOP','deconocido',9),(14,'CHIP DE DATOS','desconocido',9),(15,'LAPTOP','desconocido',10),(16,'CHIP DE DATOS','desconocido',11),(17,'CHIP DE DATOS','desconocido',12),(18,'LAPTOP','desconocido',13),(19,'CHIP DE DATOS','desconocido',14);
/*!40000 ALTER TABLE `detalleentrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrega`
--

DROP TABLE IF EXISTS `entrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrega` (
  `idEntrega` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `idAlumnoVulnerable` int NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idEntrega`),
  KEY `AlumnoVulnerable1` (`idAlumnoVulnerable`),
  KEY `Usuario1` (`idUsuario`),
  CONSTRAINT `AlumnoVulnerable1` FOREIGN KEY (`idAlumnoVulnerable`) REFERENCES `alumnovulnerable` (`idAlumnoVulnerable`),
  CONSTRAINT `Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrega`
--

LOCK TABLES `entrega` WRITE;
/*!40000 ALTER TABLE `entrega` DISABLE KEYS */;
INSERT INTO `entrega` VALUES (1,'2020-10-01','19:10:13',1,1),(3,'2020-10-02','18:10:13',1,1),(4,'2020-10-06','20:10:21',2,2),(5,'2020-10-06','20:10:46',2,2),(7,'2020-10-06','21:31:16',4,2),(8,'2020-10-07','01:18:54',4,2),(9,'2020-10-07','01:28:15',12,2),(10,'2020-10-07','01:42:52',8,2),(11,'2020-10-07','01:45:50',8,2),(12,'2020-10-07','01:58:20',6,2),(13,'2020-10-07','07:51:30',5,3),(14,'2020-10-07','07:52:22',5,2);
/*!40000 ALTER TABLE `entrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escuela`
--

DROP TABLE IF EXISTS `escuela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `escuela` (
  `idEscuela` int NOT NULL AUTO_INCREMENT,
  `nomesc` varchar(45) NOT NULL,
  `idFacultad` int NOT NULL,
  PRIMARY KEY (`idEscuela`),
  UNIQUE KEY `ctkun` (`nomesc`),
  KEY `Facultad1` (`idFacultad`),
  CONSTRAINT `Facultad1` FOREIGN KEY (`idFacultad`) REFERENCES `facultad` (`idFacultad`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escuela`
--

LOCK TABLES `escuela` WRITE;
/*!40000 ALTER TABLE `escuela` DISABLE KEYS */;
INSERT INTO `escuela` VALUES (1,'Matematica',1),(2,'Ingeniería de Sistemas e Informática',1),(3,'Estadistica e Informática',1),(4,'Administración',4),(6,'Derecho',6),(7,'Turismo',4),(9,'Enfermeria',2),(10,'obstetricia',2),(11,'Ingeniería civil',11),(12,'Arquitectura y Urbanismo',11),(13,'Contabilidad',9),(14,'Economía',9),(15,'Ingeniería de Minas',5);
/*!40000 ALTER TABLE `escuela` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facultad` (
  `idFacultad` int NOT NULL AUTO_INCREMENT,
  `nomfac` varchar(45) NOT NULL,
  PRIMARY KEY (`idFacultad`),
  UNIQUE KEY `nomfac_UNIQUE` (`nomfac`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facultad`
--

LOCK TABLES `facultad` WRITE;
/*!40000 ALTER TABLE `facultad` DISABLE KEYS */;
INSERT INTO `facultad` VALUES (4,'Facultad Administración y turismo'),(13,'Facultad Ciencias del ambiente'),(1,'Facultad de Ciencias'),(3,'Facultad de Ciencias Agrarias'),(2,'Facultad de Ciencias Medica'),(6,'Facultad de Derecho y ciencias politicas'),(9,'Facultad de Economía y Contabilidad'),(7,'Facultad de Medicina Humana'),(5,'Facultad de Minas y Metalurgíca'),(11,'facultad Ingeniería Civil'),(8,'fsec');
/*!40000 ALTER TABLE `facultad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `idmenu` int NOT NULL AUTO_INCREMENT,
  `mnu` varchar(100) NOT NULL,
  PRIMARY KEY (`idmenu`),
  UNIQUE KEY `mnu` (`mnu`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (4,'Cambiar password'),(2,'Escuelas'),(1,'Facultades'),(3,'Usuarios');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `idpersona` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(8) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `ape` varchar(45) NOT NULL,
  `gen` varchar(15) NOT NULL,
  `dir` varchar(85) NOT NULL DEFAULT 'Sin Direccion',
  `cel` varchar(45) NOT NULL DEFAULT 'Sin Celular',
  `email` varchar(45) NOT NULL DEFAULT 'Sin Email',
  PRIMARY KEY (`idpersona`),
  UNIQUE KEY `dni` (`dni`),
  CONSTRAINT `persona_chk_1` CHECK ((length(`dni`) = 8)),
  CONSTRAINT `persona_chk_2` CHECK (((`gen` = _latin1'Masculino') or (`gen` = _latin1'Femenino')))
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'03664700','Miguel','Silva Zapata','Masculino','Salitral','Sin Celular','Sin Email'),(3,'14587459','jason ennio','solano pillaca','Masculino','palmito','965265987','jason@gmail.com'),(4,'32100225','rosa','guadalupe jara','Femenino','shancayan av. iniversitaria','987523657','rosa@hotmail.com'),(6,'20236562','jamil quenio','florentino macayo','Masculino','en la puna','912365478','jamil@gmail.com'),(11,'45585202','jorje','de la torre ugarte','Masculino','sin Direccion','985763258','torre@gmail.com'),(12,'74563213','renzo','huerta lloclla','Masculino','sin Direccion','Sin Celular','sin Email'),(13,'86305632','gabriel','flores de la cruz','Masculino','av luzuriaga n°548','95632587','flores@unasam.edu.pe'),(14,'10101010','sesi','secilita','Femenino','en casa de su tia','985367495','sesi@gmail.com'),(17,'74391459','carlos','castillo blas','Masculino','huaraz','913472873','carlos@gmailc.com'),(18,'47455231','elizabet','moreno mori','Femenino','chinchobamba','978543258','eli@hotmail.com'),(21,'54222352','jose','figueroa','Masculino','sin Direccion','Sin Celular','jorje@gmail.com');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipousuario` (
  `idtipousuario` int NOT NULL AUTO_INCREMENT,
  `tipousu` varchar(100) NOT NULL,
  PRIMARY KEY (`idtipousuario`),
  UNIQUE KEY `tipousu` (`tipousu`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
INSERT INTO `tipousuario` VALUES (1,'Administrador'),(2,'Operador');
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL,
  `psw` varchar(250) NOT NULL,
  `idtipousuario` int NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `idtipousuario` (`idtipousuario`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`idtipousuario`) REFERENCES `tipousuario` (`idtipousuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Silva','dcbfb1f28c93fedc5b1628c6759c3cd6ae5f20a8',1),(2,'carlos','e7a58438fa3c342c6fcd5a635c8afd8b',1),(3,'admin','202cb962ac59075b964b07152d234b70',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `v_alumnos`
--

DROP TABLE IF EXISTS `v_alumnos`;
/*!50001 DROP VIEW IF EXISTS `v_alumnos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_alumnos` AS SELECT 
 1 AS `id`,
 1 AS `dni`,
 1 AS `nombre`,
 1 AS `apellido`,
 1 AS `genero`,
 1 AS `direccion`,
 1 AS `celular`,
 1 AS `correo`,
 1 AS `codigo`,
 1 AS `escuela`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_detalle_entrega`
--

DROP TABLE IF EXISTS `v_detalle_entrega`;
/*!50001 DROP VIEW IF EXISTS `v_detalle_entrega`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_detalle_entrega` AS SELECT 
 1 AS `idEntrega`,
 1 AS `fecha`,
 1 AS `hora`,
 1 AS `codigo`,
 1 AS `dni`,
 1 AS `nombre`,
 1 AS `apellido`,
 1 AS `escuela`,
 1 AS `tipo`,
 1 AS `serie`,
 1 AS `usuario`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_escuela_detalle`
--

DROP TABLE IF EXISTS `v_escuela_detalle`;
/*!50001 DROP VIEW IF EXISTS `v_escuela_detalle`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_escuela_detalle` AS SELECT 
 1 AS `id`,
 1 AS `escuela`,
 1 AS `facultad`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vta_escuela`
--

DROP TABLE IF EXISTS `vta_escuela`;
/*!50001 DROP VIEW IF EXISTS `vta_escuela`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vta_escuela` AS SELECT 
 1 AS `ID`,
 1 AS `Escuela`,
 1 AS `Facultad`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'bd_chiplaptos'
--

--
-- Dumping routines for database 'bd_chiplaptos'
--
/*!50003 DROP FUNCTION IF EXISTS `existe_escuela` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `existe_escuela`( esc varchar(255)) RETURNS int
BEGIN
declare res int default 0;
select count(*) into res from escuela where nomesc=esc;

RETURN res;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `existe_facultad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `existe_facultad`( facu varchar(255)) RETURNS int
BEGIN
declare res int default 0;
select count(*) into res from facultad where nomfac=facu;

RETURN res;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizar_alumnos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_alumnos`( alumno_id int,dn varchar(255), p_nombre varchar(255),p_apellido varchar(255), genero varchar(20), 
direccion varchar(255) ,celular varchar(15), correo varchar(255), p_codigo varchar(255), escuela varchar(255))
BEGIN
declare cant int default 0;
declare escuela_id int default 0;
declare persona_id int default 0;

select count(*)into cant from v_alumnos where( codigo=p_codigo or dni=dn or(nombre=p_nombre and apellido=p_apellido)) and id<>alumno_id;
if(!cant) then 
	select  idpersona into persona_id from alumnovulnerable where idAlumnoVulnerable=alumno_id;
	update persona set dni=dn,nom=p_nombre,ape=p_apellido,gen=genero,dir=direccion,cel=celular, email=correo where idpersona=persona_id;
    select idescuela into escuela_id from escuela where nomesc=escuela;
    update alumnovulnerable set codalum=p_codigo , idescuela=escuela_id  where idAlumnoVulnerable=alumno_id;
    
   
else 
    signal SQLSTATE '45000' set message_text= 'el alumno que trató de actualizar se encuentra registrada en la BD';
end if;

select cant ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizar_escuela` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_escuela`(id int,esc varchar(255),facu varchar(255))
BEGIN
declare cant int default 0;
declare idfac int default 0;
select count(*) into cant from  facultad inner join escuela on facultad.idFacultad=escuela.idFacultad where
 escuela.nomesc=esc and escuela.idEscuela<>id;
if(!cant) then 
    select idfacultad into idfac from  facultad where nomfac=facu ;
    update escuela set nomesc=esc, idfacultad=idfac where idescuela=id;
else 
    signal SQLSTATE '45000' set message_text= 'el nombre de la escuela se encuentra en uso en la BD';
end if;

select cant ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizar_facultad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_facultad`(id int ,facu varchar(255))
BEGIN
declare cant int default 0;
set cant=existe_facultad(facu);
if(!cant) then 
	update  facultad set nomfac=facu where idfacultad=id ;
    else 
    signal SQLSTATE '45000' set message_text= 'el nombre de la facultad se encuentra en uso BD';
	
end if;

select cant ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `eliminar_alumnos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_alumnos`( alumno_id int)
BEGIN
declare persona_id int default 0;
    
    select  idpersona into persona_id from alumnovulnerable where idAlumnoVulnerable=alumno_id;
     delete from alumnovulnerable where idAlumnoVulnerable=alumno_id;
    delete from persona where idpersona=persona_id;
   

select 0 ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertar_alumnos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_alumnos`( dn varchar(255), nombre varchar(255),apellido varchar(255), genero varchar(20), 
direccion varchar(255) ,celular varchar(15), correo varchar(255), codigo varchar(255), escuela varchar(255))
BEGIN
declare cant int default 0;
declare cant2 int default 0;
declare persona_id int default 0;
declare escuela_id int default 0;
select count(*) into cant from alumnovulnerable where codalum=codigo;
select count(*) into cant2 from persona where dni=dn or( nom=nombre and ape=apellido);
if(!cant and !cant2) then 
    insert into persona values(null,dn,nombre,apellido,genero,direccion,celular,correo);
    
    select  idpersona into persona_id  from persona where dni=dn and nom=nombre and ape=apellido;
    select idescuela into escuela_id from escuela where nomesc=escuela;
    
    insert into alumnovulnerable values(null,codigo,persona_id,escuela_id);
else 
    signal SQLSTATE '45000' set message_text= 'el alumno ya se encuentra registrada  en la BD';
end if;

select cant ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertar_escuela` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_escuela`(esc varchar(255),facu varchar(255))
BEGIN
declare cant int default 0;
declare idfac int default 0;
set cant=existe_escuela(esc);
if(!cant) then 
	
    select idfacultad into idfac from  facultad where nomfac=facu;
    
    insert into escuela values(null,esc,idfac);
else 
    signal SQLSTATE '45000' set message_text= 'el nombre de la escuela se encuentra en uso en la BD';
	
end if;

select cant ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertar_facultad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_facultad`(facu varchar(255))
BEGIN
declare cant int default 0;
set cant=existe_facultad(facu);
if(!cant) then 
	insert into facultad values(null,facu);
    else 
    signal SQLSTATE '45000' set message_text= 'el dato ya se encuentra en la BD';
	
end if;

select cant ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `login` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `login`( usuario varchar(255),clave varchar(255))
BEGIN
declare res int default -1;
select idusuario into res from usuario where login=usuario and psw=md5(clave);
select res;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `v_alumnos`
--

/*!50001 DROP VIEW IF EXISTS `v_alumnos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_alumnos` AS select `a`.`idAlumnoVulnerable` AS `id`,`p`.`dni` AS `dni`,`p`.`nom` AS `nombre`,`p`.`ape` AS `apellido`,`p`.`gen` AS `genero`,`p`.`dir` AS `direccion`,`p`.`cel` AS `celular`,`p`.`email` AS `correo`,`a`.`codalum` AS `codigo`,`e`.`nomesc` AS `escuela` from ((`persona` `p` join `alumnovulnerable` `a` on((`a`.`idpersona` = `p`.`idpersona`))) join `escuela` `e` on((`e`.`idEscuela` = `a`.`idescuela`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_detalle_entrega`
--

/*!50001 DROP VIEW IF EXISTS `v_detalle_entrega`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_detalle_entrega` AS select `entrega`.`idEntrega` AS `idEntrega`,`entrega`.`fecha` AS `fecha`,`entrega`.`hora` AS `hora`,`alumnovulnerable`.`codalum` AS `codigo`,`persona`.`dni` AS `dni`,`persona`.`nom` AS `nombre`,`persona`.`ape` AS `apellido`,`escuela`.`nomesc` AS `escuela`,`detalleentrega`.`tipo` AS `tipo`,`detalleentrega`.`serie` AS `serie`,`usuario`.`login` AS `usuario` from (((((`entrega` join `alumnovulnerable` on((`entrega`.`idAlumnoVulnerable` = `alumnovulnerable`.`idAlumnoVulnerable`))) join `persona` on((`alumnovulnerable`.`idpersona` = `persona`.`idpersona`))) join `detalleentrega` on((`detalleentrega`.`idEntrega` = `entrega`.`idEntrega`))) join `usuario` on((`usuario`.`idUsuario` = `entrega`.`idUsuario`))) join `escuela` on((`escuela`.`idEscuela` = `alumnovulnerable`.`idescuela`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_escuela_detalle`
--

/*!50001 DROP VIEW IF EXISTS `v_escuela_detalle`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_escuela_detalle` AS select `escuela`.`idEscuela` AS `id`,`escuela`.`nomesc` AS `escuela`,`facultad`.`nomfac` AS `facultad` from (`escuela` join `facultad` on((`escuela`.`idFacultad` = `facultad`.`idFacultad`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vta_escuela`
--

/*!50001 DROP VIEW IF EXISTS `vta_escuela`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vta_escuela` AS select `e`.`idEscuela` AS `ID`,`e`.`nomesc` AS `Escuela`,`f`.`nomfac` AS `Facultad` from (`facultad` `f` join `escuela` `e` on((`e`.`idFacultad` = `f`.`idFacultad`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-07  7:57:40
