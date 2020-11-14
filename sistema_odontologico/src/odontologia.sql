-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-01-2017 a las 12:08:15
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `odontologia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE IF NOT EXISTS `citas` (
  `Hora` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `Fecha` date NOT NULL,
  `Motivo` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `IdCliente` int(10) NOT NULL,
  `IdCita` int(5) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdCita`,`IdCliente`),
  UNIQUE KEY `IdCita` (`IdCita`),
  KEY `IdCliente` (`IdCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `Edad` varchar(2) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `FechaNacimiento` date DEFAULT '0001-01-01',
  `Direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Parentesco` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `IdCliente` int(10) NOT NULL,
  PRIMARY KEY (`IdCliente`),
  UNIQUE KEY `IdCliente` (`IdCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Edad`, `FechaNacimiento`, `Direccion`, `Parentesco`, `IdCliente`) VALUES
('18', '0001-01-01', 'jv tablon del niño jesus', '', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `ApellidoPaterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `ApellidoMaterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `DNI` varchar(8) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `Telefono` varchar(9) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `IdDoctor` int(10) NOT NULL,
  `IdCliente` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdCliente`,`IdDoctor`),
  UNIQUE KEY `IdCliente` (`IdCliente`),
  KEY `IdDoctor` (`IdDoctor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`ApellidoPaterno`, `ApellidoMaterno`, `Nombre`, `DNI`, `Telefono`, `IdDoctor`, `IdCliente`) VALUES
('huallpa', 'vargas', 'dani', '12345678', '931896923', 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `crear_historial`
--

CREATE TABLE IF NOT EXISTS `crear_historial` (
  `Fecha` date NOT NULL,
  `Hora` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `NroHistorial` varchar(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Tratamiento` varchar(1000) COLLATE utf8_spanish_ci NOT NULL,
  `IdCliente` int(10) NOT NULL,
  `IdCrearH` int(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdCrearH`,`IdCliente`),
  UNIQUE KEY `IdCrearH` (`IdCrearH`),
  KEY `IdCliente` (`IdCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuota`
--

CREATE TABLE IF NOT EXISTS `cuota` (
  `Fecha` date NOT NULL,
  `NroCuota` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `Importe` int(10) NOT NULL,
  `Hora` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `IdHistorial` int(100) NOT NULL,
  `IdCliente` int(10) NOT NULL,
  `IdCuota` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdCuota`,`IdHistorial`,`IdCliente`),
  KEY `IdHistorial` (`IdHistorial`),
  KEY `IdCliente` (`IdCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
  `ApellidoPaterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `ApellidoMaterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Usuario` varchar(20) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Contrasena` varchar(20) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Cop` varchar(5) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `CelularClaro` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `CelularMovistar` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Correo` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `Departamento` varchar(100) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `IdDoctor` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdDoctor`),
  UNIQUE KEY `Contrasena` (`Contrasena`),
  UNIQUE KEY `Usuario` (`Usuario`),
  UNIQUE KEY `Cop` (`Cop`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `doctor`
--

INSERT INTO `doctor` (`ApellidoPaterno`, `ApellidoMaterno`, `Nombre`, `Usuario`, `Contrasena`, `Cop`, `CelularClaro`, `CelularMovistar`, `Correo`, `Direccion`, `Departamento`, `IdDoctor`) VALUES
('huallpa', 'vargas', 'yuri vladimir', 'vladimir', '124204', '12345', '931896923', '931473471', 'yurihuallpavarags@gmail.com', 'jv tablon del niño jesus', 'san jeronimo-cusco-cusco', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_clinico`
--

CREATE TABLE IF NOT EXISTS `historial_clinico` (
  `Cepillaje` int(5) DEFAULT NULL,
  `CepillajeProfilaxis` int(5) DEFAULT NULL,
  `Fluorizacion` int(5) DEFAULT NULL,
  `BlanqueamientoDental` int(5) DEFAULT NULL,
  `CarieSimple` int(5) DEFAULT NULL,
  `Piezas1` int(5) DEFAULT NULL,
  `CarieCompuesta` int(5) DEFAULT NULL,
  `Piezas2` int(5) DEFAULT NULL,
  `CarieRecompuesta` int(5) DEFAULT NULL,
  `Piezas3` int(5) DEFAULT NULL,
  `EndoMultiRadicular` int(5) DEFAULT NULL,
  `EndoUniRadicular` int(5) DEFAULT NULL,
  `BioPulpectomia` int(5) DEFAULT NULL,
  `NecroPulpectomia` int(5) DEFAULT NULL,
  `OrtodonciaI` int(5) DEFAULT NULL,
  `OrtodonciaII` int(5) DEFAULT NULL,
  `Recementacion` int(5) DEFAULT NULL,
  `Piezas4` int(5) DEFAULT NULL,
  `Sellantes` int(5) DEFAULT NULL,
  `Barniz` int(5) DEFAULT NULL,
  `Cariostatico` int(5) DEFAULT NULL,
  `FibraVidrioColado` int(5) DEFAULT NULL,
  `Raiz` int(5) DEFAULT NULL,
  `PosicionNormal` int(5) DEFAULT NULL,
  `TerceraMolarRecta` int(5) DEFAULT NULL,
  `TerceraMolarQuirurgica` int(5) DEFAULT NULL,
  `PuenteSuperior` int(5) DEFAULT NULL,
  `Piezas5` int(5) DEFAULT NULL,
  `PuenteInferior` int(5) DEFAULT NULL,
  `Piezas6` int(5) DEFAULT NULL,
  `Metal` int(5) DEFAULT NULL,
  `Ivocron` int(5) DEFAULT NULL,
  `Belglas` int(5) DEFAULT NULL,
  `Porcelana` int(5) DEFAULT NULL,
  `CarrilasIvostar` int(5) DEFAULT NULL,
  `BaseMetalica` int(5) DEFAULT NULL,
  `Acrilico` int(5) DEFAULT NULL,
  `ProtesisTotal` int(5) DEFAULT NULL,
  `Dientes` varchar(10000) COLLATE utf8_spanish_ci NOT NULL,
  `MasInformacion` varchar(10000) COLLATE utf8_spanish_ci NOT NULL,
  `PrecioPactado` int(10) NOT NULL DEFAULT '0',
  `IdCrearH` int(20) NOT NULL,
  `IdHistorial` int(100) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdHistorial`,`IdCrearH`),
  UNIQUE KEY `IdCrearH` (`IdCrearH`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagen`
--

CREATE TABLE IF NOT EXISTS `imagen` (
  `Imagen` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `IdHistorial` int(100) NOT NULL,
  `IdCliente` int(10) NOT NULL,
  `IdImagen` int(100) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdImagen`,`IdHistorial`,`IdCliente`),
  KEY `IdCliente` (`IdCliente`),
  KEY `IdHistorial` (`IdHistorial`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=4 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE IF NOT EXISTS `material` (
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Importe` double NOT NULL,
  `Descripcion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `IdMaterial` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdMaterial`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `material`
--

INSERT INTO `material` (`Nombre`, `Importe`, `Descripcion`, `IdMaterial`) VALUES
('ligas dobles', 123, 'ligas 1.2', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material_proveedor`
--

CREATE TABLE IF NOT EXISTS `material_proveedor` (
  `Fecha` date NOT NULL,
  `Hora` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `IdProveedor` int(10) NOT NULL,
  `IdMaterial` int(10) NOT NULL,
  PRIMARY KEY (`IdProveedor`,`IdMaterial`),
  KEY `IdMaterial` (`IdMaterial`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `material_proveedor`
--

INSERT INTO `material_proveedor` (`Fecha`, `Hora`, `IdProveedor`, `IdMaterial`) VALUES
('2017-01-07', '02:42:02 PM', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio`
--

CREATE TABLE IF NOT EXISTS `precio` (
  `Cepillaje` int(5) NOT NULL DEFAULT '1',
  `CepillajeProfilaxis` int(5) NOT NULL DEFAULT '1',
  `Fluorizacion` int(5) NOT NULL DEFAULT '1',
  `BlanqueamientoDental` int(5) NOT NULL DEFAULT '1',
  `CarieSimple` int(5) NOT NULL DEFAULT '1',
  `CarieCompuesta` int(5) NOT NULL DEFAULT '1',
  `CarieRecompuesta` int(5) NOT NULL DEFAULT '1',
  `EndoMultiRadicular` int(5) NOT NULL DEFAULT '1',
  `EndoUniRadicular` int(5) NOT NULL DEFAULT '1',
  `BioPulpectomia` int(5) NOT NULL DEFAULT '1',
  `NecroPulpectomia` int(5) NOT NULL DEFAULT '1',
  `OrtodonciaI` int(5) NOT NULL DEFAULT '1',
  `OrtodonciaII` int(5) NOT NULL DEFAULT '1',
  `Recementacion` int(5) NOT NULL DEFAULT '1',
  `Sellantes` int(5) NOT NULL DEFAULT '1',
  `Barniz` int(5) NOT NULL DEFAULT '1',
  `Cariostatico` int(5) NOT NULL DEFAULT '1',
  `FibraVidrioColado` int(5) NOT NULL DEFAULT '1',
  `Raiz` int(5) NOT NULL DEFAULT '1',
  `PosicionNormal` int(5) NOT NULL DEFAULT '1',
  `TerceraMolarRecta` int(5) NOT NULL DEFAULT '1',
  `TerceraMolarQuirurgica` int(5) NOT NULL DEFAULT '1',
  `PuenteSuperior` int(5) NOT NULL DEFAULT '1',
  `PuenteInferior` int(5) NOT NULL DEFAULT '1',
  `Metal` int(5) NOT NULL DEFAULT '1',
  `Ivocron` int(5) NOT NULL DEFAULT '1',
  `Belgas` int(5) NOT NULL DEFAULT '1',
  `Porcelana` int(5) NOT NULL DEFAULT '1',
  `CarrilasInvostar` int(5) NOT NULL DEFAULT '1',
  `BaseMetalica` int(5) NOT NULL DEFAULT '1',
  `Acrilico` int(5) NOT NULL DEFAULT '1',
  `ProtesisTotal` int(5) NOT NULL DEFAULT '1',
  `IdPrecio` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdPrecio`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `precio`
--

INSERT INTO `precio` (`Cepillaje`, `CepillajeProfilaxis`, `Fluorizacion`, `BlanqueamientoDental`, `CarieSimple`, `CarieCompuesta`, `CarieRecompuesta`, `EndoMultiRadicular`, `EndoUniRadicular`, `BioPulpectomia`, `NecroPulpectomia`, `OrtodonciaI`, `OrtodonciaII`, `Recementacion`, `Sellantes`, `Barniz`, `Cariostatico`, `FibraVidrioColado`, `Raiz`, `PosicionNormal`, `TerceraMolarRecta`, `TerceraMolarQuirurgica`, `PuenteSuperior`, `PuenteInferior`, `Metal`, `Ivocron`, `Belgas`, `Porcelana`, `CarrilasInvostar`, `BaseMetalica`, `Acrilico`, `ProtesisTotal`, `IdPrecio`) VALUES
(30, 30, 20, 250, 35, 40, 45, 250, 150, 80, 100, 300, 300, 15, 20, 15, 15, 70, 20, 25, 35, 120, 200, 200, 80, 120, 200, 250, 300, 550, 400, 700, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio_tratamiento`
--

CREATE TABLE IF NOT EXISTS `precio_tratamiento` (
  `Fecha` date NOT NULL,
  `IdDoctor` int(10) NOT NULL,
  `IdPrecio` int(10) NOT NULL,
  PRIMARY KEY (`IdPrecio`,`IdDoctor`),
  KEY `IdDoctor` (`IdDoctor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `precio_tratamiento`
--

INSERT INTO `precio_tratamiento` (`Fecha`, `IdDoctor`, `IdPrecio`) VALUES
('2017-01-07', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `ApellidoPaterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoMaterno` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` varchar(9) COLLATE utf8_spanish_ci NOT NULL DEFAULT '0',
  `RazonSocial` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `IdDoctor` int(10) NOT NULL,
  `IdProveedor` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`IdProveedor`,`IdDoctor`),
  KEY `IdDoctor` (`IdDoctor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ApellidoPaterno`, `ApellidoMaterno`, `Nombre`, `Telefono`, `RazonSocial`, `IdDoctor`, `IdProveedor`) VALUES
('jalixto', 'paucar', 'sandro', '931123455', 'no especifica', 1, 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `clientes` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `clientes` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`IdDoctor`) REFERENCES `doctor` (`IdDoctor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `crear_historial`
--
ALTER TABLE `crear_historial`
  ADD CONSTRAINT `crear_historial_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `cliente` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cuota`
--
ALTER TABLE `cuota`
  ADD CONSTRAINT `cuota_ibfk_1` FOREIGN KEY (`IdHistorial`) REFERENCES `historial_clinico` (`IdHistorial`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cuota_ibfk_2` FOREIGN KEY (`IdCliente`) REFERENCES `clientes` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `historial_clinico`
--
ALTER TABLE `historial_clinico`
  ADD CONSTRAINT `historial_clinico_ibfk_1` FOREIGN KEY (`IdCrearH`) REFERENCES `crear_historial` (`IdCrearH`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `imagen`
--
ALTER TABLE `imagen`
  ADD CONSTRAINT `imagen_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `clientes` (`IdCliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `imagen_ibfk_2` FOREIGN KEY (`IdHistorial`) REFERENCES `historial_clinico` (`IdHistorial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `material_proveedor`
--
ALTER TABLE `material_proveedor`
  ADD CONSTRAINT `material_proveedor_ibfk_1` FOREIGN KEY (`IdProveedor`) REFERENCES `proveedor` (`IdProveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `material_proveedor_ibfk_2` FOREIGN KEY (`IdMaterial`) REFERENCES `material` (`IdMaterial`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `precio_tratamiento`
--
ALTER TABLE `precio_tratamiento`
  ADD CONSTRAINT `precio_tratamiento_ibfk_1` FOREIGN KEY (`IdDoctor`) REFERENCES `doctor` (`IdDoctor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `precio_tratamiento_ibfk_2` FOREIGN KEY (`IdPrecio`) REFERENCES `precio` (`IdPrecio`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`IdDoctor`) REFERENCES `doctor` (`IdDoctor`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
