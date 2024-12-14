CREATE DATABASE  IF NOT EXISTS `zumbadb` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `zumbadb`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: zumbadb
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `idCompra` int NOT NULL AUTO_INCREMENT,
  `FechaCompra` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `TotalCompra` float DEFAULT NULL,
  `idUsuario` varchar(20) NOT NULL,
  PRIMARY KEY (`idCompra`),
  KEY `fk_Compra_Usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_Compra_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,'2024-11-13 18:28:46',774,'Dark'),(2,'2024-11-13 18:41:55',920,'Dark'),(3,'2024-11-13 18:46:37',NULL,'Dark'),(4,'2024-11-13 19:18:32',730,'Dark'),(5,'2024-11-13 19:23:21',287,'Dark'),(6,'2024-11-13 19:24:37',276,'Dark');
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallescompra`
--

DROP TABLE IF EXISTS `detallescompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallescompra` (
  `idProducto` varchar(20) NOT NULL,
  `idCompra` int NOT NULL,
  `CantidadDetallesCompra` int DEFAULT NULL,
  `CostoUnitarioDetallesCompra` float DEFAULT NULL,
  `SubtotalDetallesCompra` float DEFAULT NULL,
  PRIMARY KEY (`idProducto`,`idCompra`),
  KEY `fk_Producto_has_Compra_Compra1_idx` (`idCompra`),
  KEY `fk_Producto_has_Compra_Producto1_idx` (`idProducto`),
  CONSTRAINT `fk_Producto_has_Compra_Compra1` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  CONSTRAINT `fk_Producto_has_Compra_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallescompra`
--

LOCK TABLES `detallescompra` WRITE;
/*!40000 ALTER TABLE `detallescompra` DISABLE KEYS */;
INSERT INTO `detallescompra` VALUES ('BARC-CHEE-300',1,8,7,56),('BARC-CHUR-200',1,10,10,100),('BARC-FRIT-250',1,8,11,88),('BARC-PAPA-250',1,10,12.5,125),('BARC-RUFL-230',1,10,15,150),('BARC-TAKI-280',1,10,12.5,125),('BARC-TOST-200',1,10,13,130),('BIMB-PANB-500',2,8,15,120),('BIMB-PANH-6PC',2,8,12.5,100),('BIMB-PANHD-10',2,8,14,112),('BIMB-PANI-500',2,8,16,128),('BIMB-PANM-400',2,10,10,100),('BIMB-PANQ-350',2,11,20,220),('BIMB-PANT-300',2,8,17.5,140),('GAMS-ARCO-250',4,5,17.5,87.5),('GAMS-CANE-300',4,8,14,112),('GAMS-CHOK-200',4,8,16,128),('GAMS-EMPC-200',4,8,15,120),('GAMS-MAMU-180',4,10,10,100),('GAMS-MARI-500',4,8,12.5,100),('GAMS-PRIN-220',4,5,16.5,82.5),('OTRO-ACEI-CAP',6,8,20,160),('OTRO-ARRO-MOR',5,8,7.5,60),('OTRO-ATUN-DOL',6,8,6,48),('OTRO-AZU-EST',6,8,8.5,68),('OTRO-FRIJ-SIE',5,8,10,80),('OTRO-HUEV-SJU',5,5,15,75),('OTRO-LECH-LALA',5,8,9,72);
/*!40000 ALTER TABLE `detallescompra` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Compra_ActualizarTotal_AgregarDetalle` AFTER INSERT ON `detallescompra` FOR EACH ROW BEGIN
  UPDATE Compra
  SET TotalCompra = (SELECT SUM(SubtotalDetallesCompra) FROM DetallesCompra WHERE idCompra = NEW.idCompra)
  WHERE idCompra = NEW.idCompra;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Compra_ActualizarTotal_ModificarDetalle` AFTER UPDATE ON `detallescompra` FOR EACH ROW BEGIN
  UPDATE Compra
  SET TotalCompra = (SELECT SUM(SubtotalDetallesCompra) FROM DetallesCompra WHERE idCompra = NEW.idCompra)
  WHERE idCompra = NEW.idCompra;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Compra_ActualizarTotal_EliminarDetalle` AFTER DELETE ON `detallescompra` FOR EACH ROW BEGIN
  UPDATE Compra
  SET TotalCompra = (SELECT SUM(SubtotalDetallesCompra) FROM DetallesCompra WHERE idCompra = OLD.idCompra)
  WHERE idCompra = OLD.idCompra;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `detallesventa`
--

DROP TABLE IF EXISTS `detallesventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallesventa` (
  `idProducto` varchar(20) NOT NULL,
  `Venta_idVenta` int NOT NULL,
  `CantidadDetallesVenta` int DEFAULT NULL,
  `PrecioUnitarioDetallesVenta` float DEFAULT NULL,
  `SuptotalDetallesVenta` float DEFAULT NULL,
  PRIMARY KEY (`idProducto`,`Venta_idVenta`),
  KEY `fk_Producto_has_Venta_Venta1_idx` (`Venta_idVenta`),
  KEY `fk_Producto_has_Venta_Producto1_idx` (`idProducto`),
  CONSTRAINT `fk_Producto_has_Venta_Producto1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  CONSTRAINT `fk_Producto_has_Venta_Venta1` FOREIGN KEY (`Venta_idVenta`) REFERENCES `venta` (`idVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallesventa`
--

LOCK TABLES `detallesventa` WRITE;
/*!40000 ALTER TABLE `detallesventa` DISABLE KEYS */;
INSERT INTO `detallesventa` VALUES ('BARC-CHEE-300',1,1,28,28),('BARC-CHUR-200',2,2,20,40),('BARC-TOST-200',2,1,26,26),('BIMB-PANQ-350',1,2,40,80);
/*!40000 ALTER TABLE `detallesventa` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Venta_ActualizarTotal_AgregarDetalle` AFTER INSERT ON `detallesventa` FOR EACH ROW BEGIN
  UPDATE Venta
  SET TotalVenta = (SELECT SUM(SuptotalDetallesVenta) FROM DetallesVenta WHERE Venta_idVenta = NEW.Venta_idVenta)
  WHERE idVenta = NEW.Venta_idVenta;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Venta_ActualizarTotal_ModificarDetalle` AFTER UPDATE ON `detallesventa` FOR EACH ROW BEGIN
  UPDATE Venta
  SET TotalVenta = (SELECT SUM(SuptotalDetallesVenta) FROM DetallesVenta WHERE Venta_idVenta = NEW.Venta_idVenta)
  WHERE idVenta = NEW.Venta_idVenta;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `Venta_ActualizarTotal_EliminarDetalle` AFTER DELETE ON `detallesventa` FOR EACH ROW BEGIN
  UPDATE Venta
  SET TotalVenta = (SELECT SUM(SuptotalDetallesVenta) FROM DetallesVenta WHERE Venta_idVenta = OLD.Venta_idVenta)
  WHERE idVenta = OLD.Venta_idVenta;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` varchar(20) NOT NULL,
  `NombreProducto` varchar(45) NOT NULL,
  `DescripcionProducto` varchar(200) NOT NULL,
  `StockProducto` int NOT NULL,
  `PrecioProducto` float DEFAULT NULL,
  `idProveedor` varchar(20) NOT NULL,
  PRIMARY KEY (`idProducto`,`idProveedor`),
  KEY `fk_Producto_Proveedor1_idx` (`idProveedor`),
  CONSTRAINT `fk_Producto_Proveedor1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('BARC-CHEE-300','Cheetos Barcel','Cheetos colmillos 300g',7,28,'BARCEL-MX'),('BARC-CHUR-200','Churrumais Barcel','Churrumais Barcel 200g',8,20,'BARCEL-MX'),('BARC-FRIT-250','Fritos Barcel','Fritos original 250g',8,22,'BARCEL-MX'),('BARC-PAPA-250','Papitas Barcel','Papas fritas Barcel 250g',10,25,'BARCEL-MX'),('BARC-RUFL-230','Rufles Barcel','Rufles sabor queso 230g',10,30,'BARCEL-MX'),('BARC-TAKI-280','Takis Fuego Barcel','Takis Fuego 280g',10,35,'BARCEL-MX'),('BARC-TOST-200','Tostitos Barcel','Tostitos salsa verde 200g',9,26,'BARCEL-MX'),('BIMB-PANB-500','Pan Blanco Bimbo','Pan de caja blanco Bimbo 500g',8,30,'BIMBO-MX'),('BIMB-PANH-6PC','Pan Hamburguesa Bimbo','Pan para hamburguesa Bimbo 6 piezas',8,25,'BIMBO-MX'),('BIMB-PANHD-10','Pan Hot Dog Bimbo','Pan para hot dog Bimbo 10 piezas',8,28,'BIMBO-MX'),('BIMB-PANI-500','Pan Integral Bimbo','Pan de caja integral Bimbo 500g',8,32,'BIMBO-MX'),('BIMB-PANM-400','Pan Molido Bimbo','Pan molido Bimbo 400g',10,20,'BIMBO-MX'),('BIMB-PANQ-350','Panque Bimbo','Panque Bimbo 350g',9,40,'BIMBO-MX'),('BIMB-PANT-300','Pan Tostado Bimbo','Pan tostado Bimbo 300g',8,35,'BIMBO-MX'),('GAMS-ARCO-250','Arcoíris Gamesa','Galletas Arcoíris 250g',5,35,'GAMESA-MX'),('GAMS-CANE-300','Canelitas Gamesa','Galletas Canelitas 300g',8,28,'GAMESA-MX'),('GAMS-CHOK-200','Chokis Gamesa','Galletas Chokis 200g',8,32,'GAMESA-MX'),('GAMS-EMPC-200','Emperador Chocolate Gamesa','Galletas Emperador Chocolate 200g',8,30,'GAMESA-MX'),('GAMS-MAMU-180','Mamut Gamesa','Galletas Mamut 180g',10,20,'GAMESA-MX'),('GAMS-MARI-500','Galletas Marías Gamesa','Galletas Marías 500g',8,25,'GAMESA-MX'),('GAMS-PRIN-220','Principe Gamesa','Galletas Principe 220g',5,33,'GAMESA-MX'),('OTRO-ACEI-CAP','Aceite Capullo','Aceite vegetal Capullo 1L',8,40,'CAPULLO-MX'),('OTRO-ARRO-MOR','Arroz Morelos','Arroz blanco Morelos 1kg',8,15,'MORELOS-MX'),('OTRO-ATUN-DOL','Atún Dolores','Atún en agua Dolores 140g',8,12,'DOLORES-MX'),('OTRO-AZU-EST','Azúcar Estándar','Azúcar estándar 1kg',8,17,'ESTANDAR-MX'),('OTRO-FRIJ-SIE','Frijoles La Sierra','Frijoles negros La Sierra 1kg',8,20,'SIERRA-MX'),('OTRO-HUEV-SJU','Huevos San Juan','Huevo blanco San Juan 12 piezas',5,30,'SJU-MX'),('OTRO-LECH-LALA','Leche Lala','Leche entera Lala 1L',8,18,'LALA-MX');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idProveedor` varchar(20) NOT NULL,
  `NombreProveedor` varchar(45) NOT NULL,
  `TelefonoProveedor` varchar(10) NOT NULL,
  `DescripcionProveedor` varchar(200) NOT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES ('BARCEL-MX','Barcel','5558765432','Proveedor de botanas y frituras'),('BIMBO-MX','Grupo Bimbo','5557654321','Proveedor de productos de panadería y pastelería'),('CAPULLO-MX','Capullo','5554567890','Proveedor de aceite y productos derivados'),('DOLORES-MX','Dolores','5556789012','Proveedor de atún y productos enlatados'),('ESTANDAR-MX','Azúcar Estándar','5557890123','Proveedor de azúcar y productos de endulzantes'),('GAMESA-MX','Gamesa','5552345678','Proveedor de galletas y productos horneados'),('LALA-MX','Lala','5553456789','Proveedor de productos lácteos'),('MORELOS-MX','Arroz Morelos','5559876543','Proveedor de arroz y productos agrícolas'),('SIERRA-MX','La Sierra','5555678901','Proveedor de frijoles y legumbres'),('SJU-MX','San Juan','5556543210','Proveedor de huevos y productos avícolas');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` varchar(20) NOT NULL,
  `NombreUsuario` varchar(45) DEFAULT NULL,
  `PasswordUsuario` varchar(45) DEFAULT NULL,
  `RolUsuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('1','1','1','Vendedor'),('Dark','Paulino Josue','12345','Administrador');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `idVenta` int NOT NULL AUTO_INCREMENT,
  `FechaVenta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TotalVenta` float DEFAULT NULL,
  `idUsuario` varchar(20) NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_Venta_Usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_Venta_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,'2024-11-13 18:51:53',108,'Dark'),(2,'2024-12-03 18:25:29',66,'Dark');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'zumbadb'
--

--
-- Dumping routines for database 'zumbadb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-03 12:45:13
