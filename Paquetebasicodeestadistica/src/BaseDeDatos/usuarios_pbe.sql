-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2021 a las 03:30:14
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `usuarios_pbe`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `Correo` varchar(70) NOT NULL,
  `Contraseña` varchar(70) NOT NULL,
  `Nombre` varchar(70) NOT NULL,
  `Edad` varchar(70) NOT NULL,
  `Telefono` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`Correo`, `Contraseña`, `Nombre`, `Edad`, `Telefono`) VALUES
('admin@protonmail.com', 'admin333', 'admin', '18', '321456987');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `Correo` varchar(70) NOT NULL,
  `Contraseña` varchar(70) NOT NULL,
  `Nombre` varchar(70) NOT NULL,
  `Edad` varchar(70) NOT NULL,
  `Telefono` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`Correo`, `Contraseña`, `Nombre`, `Edad`, `Telefono`) VALUES
('admin@protonmail.com', 'admin333', 'admin', '18', '321456987'),
('user2@yahoo.es', '222', 'user2', '12', '3214587'),
('user3@gmail.com', '333', 'user3', '15', '156565'),
('user@gmail.com', '111', 'user', '11', '321456');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Correo`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`Correo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
