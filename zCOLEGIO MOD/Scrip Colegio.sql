-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Colegio
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Colegio
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Colegio` DEFAULT CHARACTER SET utf8 ;
USE `Colegio` ;

-- -----------------------------------------------------
-- Table `Colegio`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Colegio`.`Usuario` (
  `Id_Usuario` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(30) NOT NULL,
  `Contraseña` VARCHAR(15) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Estado` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`Id_Usuario`),
  UNIQUE INDEX `Usuario_UNIQUE` (`Usuario` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Colegio`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Colegio`.`Alumno` (
  `Id_Alumno` INT NOT NULL AUTO_INCREMENT,
  `Dni` CHAR(8) NOT NULL,
  `Nomb_Alum` VARCHAR(30) NOT NULL,
  `Apell_Pat` VARCHAR(40) NOT NULL,
  `Apell_Mat` VARCHAR(40) NOT NULL,
  `Sexo` CHAR(1) NULL,
  `Fecha_Nac` DATE NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Estado` VARCHAR(10) NOT NULL,
  `Religion` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Id_Alumno`, `Dni`),
  UNIQUE INDEX `Dni_UNIQUE` (`Dni` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Colegio`.`Apoderado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Colegio`.`Apoderado` (
  `IdApoderado` INT NOT NULL AUTO_INCREMENT,
  `Alumno_Id_Alumno` INT NOT NULL,
  `Tipo_Parentesco` VARCHAR(15) NOT NULL,
  `A_Nombres_Apellidos` VARCHAR(60) NOT NULL,
  `A_Dni` CHAR(8) NOT NULL,
  `A_Estado_Civil` VARCHAR(20) NOT NULL,
  `A_Domicilio` VARCHAR(50) NOT NULL,
  `A_Celular` CHAR(9) NOT NULL,
  `A_Centro_Trabajo` VARCHAR(45) NOT NULL,
  `A_Ocupación` VARCHAR(30) NOT NULL,
  `A_Telf_Trabajo` CHAR(9) NOT NULL,
  PRIMARY KEY (`IdApoderado`),
  UNIQUE INDEX `A_Dni_UNIQUE` (`A_Dni` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Colegio`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Colegio`.`Pago` (
  `IdPago` INT NOT NULL AUTO_INCREMENT,
  `Nro_Boleta` CHAR(8) NULL,
  `Dni` CHAR(8) NOT NULL,
  `Fecha` DATE NOT NULL,
  `Importe` FLOAT NOT NULL,
  `Tipo_pago` VARCHAR(20) NOT NULL,
  `Alumno_Id_Alumno` INT NOT NULL,
  PRIMARY KEY (`IdPago`),
  UNIQUE INDEX `Dni_UNIQUE` (`Dni` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Colegio`.`Matricula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Colegio`.`Matricula` (
  `Id_Matricula` INT NOT NULL AUTO_INCREMENT,
  `Dni` CHAR(8) NOT NULL,
  `Grado` VARCHAR(10) NOT NULL,
  `Nivel` VARCHAR(15) NOT NULL,
  `Turno` VARCHAR(15) NOT NULL,
  `Alumno_Id_Alumno` INT NOT NULL,
  PRIMARY KEY (`Id_Matricula`),
  UNIQUE INDEX `Dni_UNIQUE` (`Dni` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
