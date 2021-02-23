-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: cajainde_sindicato
-- Source Schemata: cajainde_sindicato
-- Created: Sun May 21 13:58:45 2017
-- Workbench Version: 6.3.6
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema cajainde_sindicato
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `cajainde_sindicato` ;
CREATE SCHEMA IF NOT EXISTS `cajainde_sindicato` ;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.acumulado
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`acumulado` (
  `acu_id` INT(11) NOT NULL AUTO_INCREMENT,
  `acu_usu_id` INT(11) NULL DEFAULT NULL,
  `acu_monto` DOUBLE NULL DEFAULT NULL,
  `acu_montocorregido` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`acu_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5344
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.acumuladoinicialahorrofijo
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`acumuladoinicialahorrofijo` (
  `mov_clave_empleado` INT(11) NULL DEFAULT NULL,
  `mov_empresa` INT(11) NULL DEFAULT NULL,
  `acumulado` DOUBLE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.acumuladoinicialahorronofijo
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`acumuladoinicialahorronofijo` (
  `mov_clave_empleado` INT(11) NULL DEFAULT NULL,
  `mov_empresa` INT(11) NULL DEFAULT NULL,
  `acumulado` DOUBLE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.ahorrofijotemporal1
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`ahorrofijotemporal1` (
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL,
  `monto` DECIMAL(28,10) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.ahorronofijotemporal1
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`ahorronofijotemporal1` (
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL,
  `monto` DECIMAL(28,10) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.altas_cambios_hist
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`altas_cambios_hist` (
  `cnh_id` INT(11) NOT NULL AUTO_INCREMENT,
  `cnh_usu_id` INT(11) NULL DEFAULT NULL,
  `cnh_arh_id` INT(11) NULL DEFAULT NULL,
  `cnh_tipo` INT(11) NULL DEFAULT NULL,
  `cnh_clave_anterior` INT(11) NULL DEFAULT NULL,
  `cnh_clave_actual` INT(11) NULL DEFAULT NULL,
  `cnh_empresa_anterior` INT(11) NULL DEFAULT NULL,
  `cnh_empresa_actual` INT(11) NULL DEFAULT NULL,
  `cnh_catorcena_transaccion` DATE NULL DEFAULT NULL,
  `cnh_mov_id` INT(11) NULL DEFAULT NULL,
  `cnh_fecha` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`cnh_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2588
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.amortizacion
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`amortizacion` (
  `amo_id` INT(11) NOT NULL AUTO_INCREMENT,
  `amo_numero_pago` INT(11) NULL DEFAULT NULL,
  `amo_capital` DOUBLE NULL DEFAULT NULL,
  `amo_amortizacion` DOUBLE NULL DEFAULT NULL,
  `amo_interes` DOUBLE NULL DEFAULT NULL,
  `amo_iva` DOUBLE NULL DEFAULT NULL,
  `amo_monto_pago` DOUBLE NULL DEFAULT NULL,
  `amo_solicitud` BIGINT(20) NULL DEFAULT NULL,
  `amo_credito` INT(11) NULL DEFAULT NULL,
  `amo_saldo` DOUBLE NULL DEFAULT NULL,
  `amo_fecha_pago` DATE NULL DEFAULT NULL,
  `amo_estatus` VARCHAR(20) NULL DEFAULT NULL,
  `amo_estatus_anterior` INT(11) NULL DEFAULT NULL,
  `amo_clave_empleado` INT(11) NULL DEFAULT NULL,
  `amo_pago_id` INT(11) NULL DEFAULT NULL,
  `amo_usu_id` INT(11) NULL DEFAULT NULL,
  `amo_producto` INT(11) NULL DEFAULT NULL,
  `amo_estatus2` VARCHAR(20) NULL DEFAULT NULL,
  `amo_estatus_int` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`amo_id`),
  INDEX `idx_amo1` (`amo_monto_pago` ASC, `amo_credito` ASC, `amo_fecha_pago` ASC, `amo_estatus` ASC, `amo_usu_id` ASC, `amo_estatus_int` ASC),
  INDEX `idx_amo2` (`amo_pago_id` ASC, `amo_usu_id` ASC, `amo_estatus` ASC, `amo_fecha_pago` ASC, `amo_monto_pago` ASC),
  INDEX `idx_amo3` (`amo_credito` ASC),
  INDEX `idx_amo4` (`amo_pago_id` ASC),
  INDEX `idx_amo_moroso` (`amo_id` ASC, `amo_fecha_pago` ASC, `amo_credito` ASC, `amo_monto_pago` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 285049
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.amortizacion_estatus
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`amortizacion_estatus` (
  `amo_est_id` INT(11) NOT NULL AUTO_INCREMENT,
  `amo_est_nombre` VARCHAR(40) NOT NULL,
  `amo_est_descripcion` VARCHAR(200) NOT NULL,
  `amo_est_color` VARCHAR(40) NULL DEFAULT NULL,
  PRIMARY KEY (`amo_est_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.archivos_historial
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`archivos_historial` (
  `arh_id` INT(11) NOT NULL AUTO_INCREMENT,
  `arh_nombre_archivo` VARCHAR(500) NULL DEFAULT NULL,
  `arh_fecha_subida` DATE NULL DEFAULT NULL,
  `arh_empresa` INT(11) NULL DEFAULT NULL,
  `arh_estatus` INT(11) NULL DEFAULT NULL,
  `arh_registros` INT(11) NULL DEFAULT NULL,
  `arh_tipo_archivo` INT(11) NULL DEFAULT NULL,
  `arh_fecha_catorcena` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`arh_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 526
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.avales
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`avales` (
  `ava_id` INT(11) NULL DEFAULT NULL,
  `ava_clave_credito` VARCHAR(50) NULL DEFAULT NULL,
  `ava_aval1` VARCHAR(200) NULL DEFAULT NULL,
  `ava_aval2` VARCHAR(200) NULL DEFAULT NULL,
  `ava_aval3` VARCHAR(200) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.baja_empleados
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`baja_empleados` (
  `bae_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bae_id_empleado` INT(11) NOT NULL,
  `bae_estatus` INT(11) NULL DEFAULT NULL,
  `bae_fecha_administracion` DATE NULL DEFAULT NULL,
  `bae_monto_finiquito` DOUBLE NULL DEFAULT NULL,
  `bae_clabe` VARCHAR(50) NULL DEFAULT NULL,
  `bae_cuenta` VARCHAR(50) NULL DEFAULT NULL,
  `bae_banco` VARCHAR(50) NULL DEFAULT NULL,
  `bae_fecha_creacion` DATE NULL DEFAULT NULL,
  `bae_fecha_pdf` DATE NULL DEFAULT NULL,
  `bae_fecha_correo` DATE NULL DEFAULT NULL,
  `bae_ruta_archivo` VARCHAR(500) NULL DEFAULT NULL,
  `bae_fecha_baja` DATE NULL DEFAULT NULL,
  `bae_fecha_deposito` DATE NULL DEFAULT NULL,
  `bae_deuda_creditos` DOUBLE NULL DEFAULT NULL,
  `bae_ahorros` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`bae_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2192
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.banco_ajustes
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`banco_ajustes` (
  `baj_id` INT(11) NOT NULL AUTO_INCREMENT,
  `baj_idconceptosistema` INT(11) NULL DEFAULT NULL,
  `baj_banco` INT(11) NULL DEFAULT NULL,
  `baj_diferencia` DOUBLE NULL DEFAULT NULL,
  `baj_estatus` VARCHAR(20) NULL DEFAULT NULL,
  `baj_concepto` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`baj_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.banco_edocta
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`banco_edocta` (
  `bec_id_banco` INT(11) NOT NULL,
  `bec_id_edocta` INT(11) NOT NULL,
  `bec_fecha_transaccion` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`bec_id_banco`, `bec_id_edocta`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.bancos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`bancos` (
  `ban_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ban_concepto` INT(50) NOT NULL,
  `ban_monto` DOUBLE NOT NULL,
  `ban_empresa` INT(11) NULL DEFAULT NULL,
  `ban_fechatransaccion` DATE NULL DEFAULT NULL,
  `ban_id_concepto_sistema` INT(11) NULL DEFAULT NULL,
  `ban_ajustado` INT(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ban_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 198
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.bancos_conceptos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`bancos_conceptos` (
  `cban_id` INT(11) NOT NULL DEFAULT '0',
  `cban_nombre` VARCHAR(40) NULL DEFAULT NULL,
  `cban_tipo` VARCHAR(20) NULL DEFAULT NULL COMMENT 'Es descuento o adicion a bancos',
  `cban_tabla` VARCHAR(20) NULL DEFAULT NULL,
  `cban_columnapk` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`cban_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.beneficiarios
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`beneficiarios` (
  `ben_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ben_nombre` VARCHAR(50) NULL DEFAULT NULL,
  `ben_paterno` VARCHAR(50) NULL DEFAULT NULL,
  `ben_materno` VARCHAR(50) NULL DEFAULT NULL,
  `ben_parentesco` INT(50) NULL DEFAULT NULL,
  `ben_pct` DOUBLE NULL DEFAULT NULL,
  `ben_direccion` VARCHAR(100) NULL DEFAULT NULL,
  `ben_telefono` VARCHAR(20) NULL DEFAULT NULL,
  `ben_celular` VARCHAR(20) NULL DEFAULT NULL,
  `ben_flag` INT(11) NULL DEFAULT NULL,
  `ben_usu_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ben_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 14464
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.bitacora
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`bitacora` (
  `bit_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bit_tipo` INT(11) NOT NULL,
  `bit_nota` VARCHAR(500) NULL DEFAULT NULL,
  `bit_fecha` DATE NULL DEFAULT NULL,
  `bit_usuario` INT(11) NOT NULL,
  `bit_referencia` BIGINT(11) NOT NULL,
  `bit_subreferencia` BIGINT(11) NULL DEFAULT NULL,
  `bit_titulo` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`bit_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 49
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.bitacora_transacciones
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`bitacora_transacciones` (
  `bitra_id` INT(11) NOT NULL,
  `bitra_nombre` VARCHAR(45) NOT NULL,
  `bitra_descripcion` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`bitra_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.cargos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`cargos` (
  `id_cargo` INT(11) NOT NULL AUTO_INCREMENT,
  `car_credito` INT(11) NULL DEFAULT NULL,
  `car_numero_pago` INT(11) NULL DEFAULT NULL,
  `car_catorcenas` INT(11) NULL DEFAULT NULL,
  `car_saldo` DOUBLE NULL DEFAULT NULL,
  `car_amortizacion` DOUBLE NULL DEFAULT NULL,
  `car_interes` DOUBLE NULL DEFAULT NULL,
  `car_pago` DOUBLE NULL DEFAULT NULL,
  `car_fecha` DATE NULL DEFAULT NULL,
  `car_saldo_actual` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`id_cargo`))
ENGINE = InnoDB
AUTO_INCREMENT = 52
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.catorcenas
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`catorcenas` (
  `car_id` INT(11) NOT NULL,
  `car_fecha` DATE NULL DEFAULT NULL,
  `car_dia` INT(11) NULL DEFAULT NULL,
  `car_mes` INT(11) NULL DEFAULT NULL,
  `car_anio` INT(11) NULL DEFAULT NULL,
  `car_inversiones` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`car_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.checardevoluciones
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`checardevoluciones` (
  `mov_empresa` INT(11) NULL DEFAULT NULL,
  `mov_clave_empleado` INT(11) NULL DEFAULT NULL,
  `mov_fecha` DATE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.credito_estatus
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`credito_estatus` (
  `cre_est_id` INT(11) NOT NULL,
  `cre_est_nombre` VARCHAR(20) NULL DEFAULT NULL,
  `cre_est_descripcion` VARCHAR(200) NULL DEFAULT NULL,
  PRIMARY KEY (`cre_est_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.creditos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`creditos` (
  `cre_id` INT(11) NOT NULL DEFAULT '0',
  `cre_clave_credito` VARCHAR(30) NULL DEFAULT NULL,
  `cre_prestamos` DOUBLE NULL DEFAULT NULL,
  `cre_pagos` INT(11) NULL DEFAULT NULL,
  `cre_fecha_inicio` DATE NULL DEFAULT NULL,
  `cre_fecha_termino` DATE NULL DEFAULT NULL,
  `cre_prospecto` INT(11) NULL DEFAULT NULL,
  `cre_clave_empleado` INT(11) NULL DEFAULT NULL,
  `cre_fondeo` VARCHAR(20) NULL DEFAULT NULL,
  `cre_fondeador` VARCHAR(40) NULL DEFAULT NULL,
  PRIMARY KEY (`cre_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.creditos_final
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`creditos_final` (
  `cre_id` INT(11) NOT NULL AUTO_INCREMENT,
  `cre_fecha_deposito` DATE NULL DEFAULT NULL,
  `cre_empresa` VARCHAR(50) NULL DEFAULT NULL,
  `cre_nombre` VARCHAR(50) NULL DEFAULT NULL,
  `cre_tipo` VARCHAR(20) NULL DEFAULT NULL,
  `cre_prestamo` DOUBLE NULL DEFAULT NULL,
  `cre_catorcenas` INT(11) NULL DEFAULT NULL,
  `cre_fecha_primer_pago` DATE NULL DEFAULT NULL,
  `cre_clave_empleado` INT(11) NULL DEFAULT NULL,
  `cre_producto` INT(11) NULL DEFAULT NULL,
  `cre_solicitud` BIGINT(20) NULL DEFAULT NULL,
  `cre_pago_quincenal` DOUBLE NULL DEFAULT NULL,
  `cre_saldo` DOUBLE NULL DEFAULT NULL,
  `cre_clave` VARCHAR(50) NULL DEFAULT NULL,
  `cre_estatus` INT(11) NULL DEFAULT NULL,
  `cre_usu_id` INT(11) NULL DEFAULT NULL,
  `cre_padre` INT(11) NULL DEFAULT NULL,
  `cre_fecha_nuevo_monto` DATE NULL DEFAULT NULL,
  `cre_fecha_incobrable` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`cre_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2928
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.devoluciones
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`devoluciones` (
  `dev_id` INT(11) NOT NULL AUTO_INCREMENT,
  `dev_acum_id` INT(11) NULL DEFAULT NULL,
  `dev_monto` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`dev_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.devolucionesarturo
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`devolucionesarturo` (
  `nombre` VARCHAR(100) NULL DEFAULT NULL,
  `fechabaja` DATE NULL DEFAULT NULL,
  `ultimaaportacion` DATE NULL DEFAULT NULL,
  `fechadevolucion` DATE NULL DEFAULT NULL,
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `ahorronofijo` DOUBLE NULL DEFAULT NULL,
  `ahorrofijo` DOUBLE NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.devolucionnofijatemporal
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`devolucionnofijatemporal` (
  `nombre` VARCHAR(200) NULL DEFAULT NULL,
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `monto` DOUBLE NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL,
  `id` INT(11) NULL DEFAULT NULL,
  `bandera` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.empleadosingresocaja
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`empleadosingresocaja` (
  `emp_ing_clave_empleado` INT(11) NULL DEFAULT NULL,
  `emp_ing_fecha` DATE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.empresas
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`empresas` (
  `emp_id` INT(11) NOT NULL DEFAULT '0',
  `emp_descripcion` VARCHAR(50) NULL DEFAULT NULL,
  `emp_abreviacion` VARCHAR(20) NULL DEFAULT NULL,
  `emp_rfc` VARCHAR(20) NULL DEFAULT NULL,
  `emp_telefono` VARCHAR(20) NULL DEFAULT NULL,
  `emp_direccion` VARCHAR(200) NULL DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  INDEX `emp_abreviacion` (`emp_abreviacion` ASC, `emp_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.estado_cuenta
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`estado_cuenta` (
  `ec_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ec_concepto` INT(50) NOT NULL,
  `ec_monto` DOUBLE NOT NULL,
  `ec_empresa` INT(11) NULL DEFAULT NULL,
  `ec_fechatransaccion` DATE NULL DEFAULT NULL,
  `ec_ajustado` INT(11) NOT NULL DEFAULT '0',
  `ec_descripcion` VARCHAR(100) NULL DEFAULT NULL,
  `ec_padre` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ec_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 31
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.idamortizacioninterescero
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`idamortizacioninterescero` (
  `id` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.imagenes
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`imagenes` (
  `ima_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ima_solicitud` BIGINT(20) NULL DEFAULT NULL,
  `ima_imagen` VARCHAR(500) NULL DEFAULT NULL,
  `ima_tipoimagen` INT(11) NULL DEFAULT NULL,
  `ima_estatus` INT(11) NULL DEFAULT NULL,
  `ima_observaciones` LONGTEXT NULL DEFAULT NULL,
  PRIMARY KEY (`ima_id`),
  INDEX `FK_solicitud_imagenes_idx` (`ima_solicitud` ASC),
  CONSTRAINT `FK_solicitud_imagenes`
    FOREIGN KEY (`ima_solicitud`)
    REFERENCES `cajainde_sindicato`.`solicitudes` (`sol_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 22512
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.movimientos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`movimientos` (
  `mov_id` INT(11) NOT NULL AUTO_INCREMENT,
  `mov_fecha` DATE NULL DEFAULT NULL,
  `mov_deposito` DOUBLE NULL DEFAULT NULL,
  `mov_producto` INT(11) NULL DEFAULT NULL,
  `mov_clave_empleado` INT(11) NULL DEFAULT NULL,
  `mov_empresa` INT(11) NULL DEFAULT NULL,
  `mov_tipo` VARCHAR(20) NULL DEFAULT NULL,
  `mov_arh_id` INT(11) NULL DEFAULT NULL,
  `mov_nombre_empleado` VARCHAR(200) NULL DEFAULT NULL,
  `mov_usu_id` INT(11) NULL DEFAULT NULL,
  `mov_id_padre` INT(11) NULL DEFAULT NULL,
  `mov_estatus` INT(11) NULL DEFAULT '0',
  `mov_ar` INT(11) NULL DEFAULT '1',
  `mov_bandera` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`mov_id`),
  INDEX `idx_mov_usuario` (`mov_clave_empleado` ASC, `mov_arh_id` ASC),
  INDEX `idx_mov_empresa` (`mov_empresa` ASC, `mov_usu_id` ASC, `mov_arh_id` ASC),
  INDEX `idx_ahorros_vol1` (`mov_id` ASC, `mov_usu_id` ASC, `mov_producto` ASC, `mov_ar` ASC, `mov_deposito` ASC, `mov_clave_empleado` ASC, `mov_empresa` ASC),
  INDEX `idx_ahorros_vol2` (`mov_usu_id` ASC, `mov_producto` ASC, `mov_tipo` ASC, `mov_id_padre` ASC, `mov_id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 1304488
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.pagos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`pagos` (
  `pag_id` INT(11) NOT NULL AUTO_INCREMENT,
  `pag_clave_empleado` INT(11) NULL DEFAULT NULL,
  `pag_fecha` DATE NULL DEFAULT NULL,
  `pag_deposito` DOUBLE NULL DEFAULT NULL,
  `pag_acumulado` DOUBLE NULL DEFAULT NULL,
  `pag_empresa` INT(11) NULL DEFAULT NULL,
  `pag_credito` INT(11) NULL DEFAULT NULL,
  `pag_usu_id` INT(11) NULL DEFAULT NULL,
  `pag_estatus` INT(11) NULL DEFAULT NULL,
  `pag_estatus_anterior` INT(11) NULL DEFAULT NULL,
  `pag_usu_nombre` VARCHAR(200) NULL DEFAULT NULL,
  `pag_arh_id` INT(11) NULL DEFAULT NULL,
  `pag_estatus_amortizacion` INT(11) NULL DEFAULT NULL,
  `antes7` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`pag_id`),
  INDEX `idx_pag_usu` (`pag_clave_empleado` ASC, `pag_arh_id` ASC),
  INDEX `idx_pag_emp` (`pag_fecha` ASC, `pag_empresa` ASC, `pag_usu_id` ASC),
  INDEX `idx_pag_arh` (`pag_arh_id` ASC, `pag_empresa` ASC, `pag_usu_id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 89732
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.pagos_estatus
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`pagos_estatus` (
  `pag_est_id` INT(11) NOT NULL AUTO_INCREMENT,
  `pag_est_nombre` VARCHAR(30) NOT NULL,
  `pag_est_descripcion` VARCHAR(200) NOT NULL,
  `pag_est_color` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`pag_est_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.pagos_respaldo
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`pagos_respaldo` (
  `pag_id` INT(11) NOT NULL AUTO_INCREMENT,
  `pag_clave_empleado` INT(11) NULL DEFAULT NULL,
  `pag_fecha` DATE NULL DEFAULT NULL,
  `pag_deposito` DOUBLE NULL DEFAULT NULL,
  `pag_empresa` INT(11) NULL DEFAULT NULL,
  `pag_credito` INT(11) NULL DEFAULT NULL,
  `pag_usu_id` INT(11) NULL DEFAULT NULL,
  `pag_estatus` INT(11) NULL DEFAULT NULL,
  `pag_usu_nombre` VARCHAR(200) NULL DEFAULT NULL,
  `pag_arh_id` INT(11) NULL DEFAULT NULL,
  `pag_estatus_amortizacion` INT(11) NULL DEFAULT NULL,
  `antes7` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`pag_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.pagosfebrero
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`pagosfebrero` (
  `id` INT(11) NOT NULL,
  `clave` INT(11) NULL DEFAULT NULL,
  `catorcena` DATETIME NULL DEFAULT NULL,
  `pago` DECIMAL(28,10) NULL DEFAULT NULL,
  `ll` INT(11) NULL DEFAULT NULL,
  `nombre` VARCHAR(73) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.pagostemporal
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`pagostemporal` (
  `nombre` VARCHAR(200) NULL DEFAULT NULL,
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `monto` DOUBLE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.parentesco_ben
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`parentesco_ben` (
  `par_id` INT(11) NOT NULL AUTO_INCREMENT,
  `par_nombre` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`par_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.productos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`productos` (
  `pro_id` INT(11) NOT NULL,
  `pro_descripcion` VARCHAR(30) NULL DEFAULT NULL,
  `pro_siglas` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`pro_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.rendimiento
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`rendimiento` (
  `ren_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ren_fecha` DATE NULL DEFAULT NULL,
  `ren_interes` DOUBLE NULL DEFAULT NULL,
  `ren_acumulado` DOUBLE NULL DEFAULT NULL,
  `ren_factor` DOUBLE NULL DEFAULT NULL,
  `ren_estatus` INT(11) NULL DEFAULT NULL,
  `ren_intereses_inversion` DOUBLE NULL DEFAULT NULL,
  `ren_comisiones_bancarias` DOUBLE NULL DEFAULT NULL,
  `ren_reserva` DOUBLE NULL DEFAULT NULL,
  `ren_ganancia_neta` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`ren_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 55
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.rendimiento3
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`rendimiento3` (
  `ren_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ren_fecha` DATE NULL DEFAULT NULL,
  `ren_interes` DOUBLE NULL DEFAULT NULL,
  `ren_acumulado` DOUBLE NULL DEFAULT NULL,
  `ren_factor` DOUBLE NULL DEFAULT NULL,
  `ren_estatus` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ren_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 47
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.roles
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`roles` (
  `rol_id` INT(11) NOT NULL,
  `rol_nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`rol_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.solicitud_avales
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`solicitud_avales` (
  `id_sol_ava` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `sol_ava_solicitud` BIGINT(20) NOT NULL,
  `sol_ava_clave_empleado` INT(11) NULL DEFAULT NULL,
  `sol_ava_credito` INT(11) NULL DEFAULT NULL,
  `sol_ava_id_empleado` INT(11) NULL DEFAULT NULL,
  `sol_ava_estatus` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_sol_ava`),
  INDEX `FK_sol_avales_idx` (`sol_ava_solicitud` ASC),
  CONSTRAINT `FK_sol_avales`
    FOREIGN KEY (`sol_ava_solicitud`)
    REFERENCES `cajainde_sindicato`.`solicitudes` (`sol_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 6597
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.solicitud_estatus
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`solicitud_estatus` (
  `sol_est_id` INT(11) NOT NULL,
  `sol_est_nmbr_est` VARCHAR(20) NOT NULL,
  `sol_est_descripcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`sol_est_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.solicitudes
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`solicitudes` (
  `sol_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `sol_clave_empleado` INT(11) NULL DEFAULT NULL,
  `sol_sueldo_neto` DOUBLE NULL DEFAULT NULL,
  `sol_deducciones` DOUBLE NULL DEFAULT NULL,
  `sol_monto_solicitado` DOUBLE NULL DEFAULT NULL,
  `sol_catorcenas` INT(11) NULL DEFAULT NULL,
  `sol_pago_credito` DOUBLE NULL DEFAULT NULL,
  `sol_banco` VARCHAR(50) NULL DEFAULT NULL,
  `sol_numero_cuenta` VARCHAR(50) NULL DEFAULT NULL,
  `sol_clabe_interbancaria` VARCHAR(50) NULL DEFAULT NULL,
  `sol_estatus` INT(11) NULL DEFAULT NULL,
  `sol_nombre_tarjetahabiente` VARCHAR(50) NULL DEFAULT NULL,
  `sol_pago_total` DOUBLE NULL DEFAULT NULL,
  `sol_producto` INT(11) NOT NULL,
  `sol_numero` INT(11) NULL DEFAULT NULL,
  `sol_aguinaldo` DOUBLE NULL DEFAULT NULL,
  `sol_fa` DOUBLE NULL DEFAULT NULL,
  `sol_intereses` DOUBLE NULL DEFAULT NULL,
  `sol_observacion` VARCHAR(200) NULL DEFAULT NULL,
  `sol_fecha_ult_catorcena` DATE NULL DEFAULT NULL,
  `sol_fecha_autorizacion` DATE NULL DEFAULT NULL,
  `sol_fecha_creacion` DATE NULL DEFAULT NULL,
  `sol_fecha_cancelacion` DATE NULL DEFAULT NULL,
  `sol_fecha_fondeo` DATE NULL DEFAULT NULL,
  `sol_fecha_enviodocumentos` DATE NULL DEFAULT NULL,
  `sol_facatorcena` INT(11) NULL DEFAULT NULL,
  `sol_fecha_deposito` DATE NULL DEFAULT NULL,
  `sol_motivo_rechazo` VARCHAR(150) NULL DEFAULT NULL,
  `sol_usu_id` INT(11) NOT NULL,
  `sol_estatus_db` INT(11) NULL DEFAULT NULL,
  `sol_formato_doc_firmada` INT(11) NULL DEFAULT NULL,
  `sol_referencia` VARCHAR(50) NULL DEFAULT NULL,
  `sol_aseguradora` VARCHAR(50) NULL DEFAULT NULL,
  `sol_no_poliza` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`sol_id`),
  INDEX `fk_sol_producto` (`sol_producto` ASC),
  INDEX `FK_avales_solicitud_idx` (`sol_id` ASC),
  INDEX `FK_bxjqj8onygrod5lnyeydwrud0` (`sol_estatus` ASC),
  INDEX `FK_vpbxmi6b72ogn9orag0x9399` (`sol_usu_id` ASC),
  CONSTRAINT `FK_bxjqj8onygrod5lnyeydwrud0`
    FOREIGN KEY (`sol_estatus`)
    REFERENCES `cajainde_sindicato`.`solicitud_estatus` (`sol_est_id`),
  CONSTRAINT `FK_sol_producto`
    FOREIGN KEY (`sol_producto`)
    REFERENCES `cajainde_sindicato`.`productos` (`pro_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_vpbxmi6b72ogn9orag0x9399`
    FOREIGN KEY (`sol_usu_id`)
    REFERENCES `cajainde_sindicato`.`usuarios` (`usu_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4279
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.tabulador
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`tabulador` (
  `tab_id` INT(11) NOT NULL DEFAULT '0',
  `tab_descripcion` VARCHAR(75) NULL DEFAULT NULL,
  `tab_mensual` DOUBLE NULL DEFAULT NULL,
  `tab_diario` DOUBLE NULL DEFAULT NULL,
  `tab_catorcenal` DOUBLE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.temporal
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`temporal` (
  `nombre` VARCHAR(50) NULL DEFAULT NULL,
  `clave_empleado` INT(11) NULL DEFAULT NULL,
  `tramite` VARCHAR(50) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `monto` DOUBLE NULL DEFAULT NULL,
  `banco` VARCHAR(50) NULL DEFAULT NULL,
  `cuenta` VARCHAR(50) NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL,
  `id` INT(11) NULL DEFAULT NULL,
  `bandera` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.temporalacuene
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`temporalacuene` (
  `mov_clave_empleado` INT(11) NULL DEFAULT NULL,
  `mov_empresa` INT(11) NULL DEFAULT NULL,
  `deposito` DOUBLE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.temporalacumulado
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`temporalacumulado` (
  `empresa` INT(11) NULL DEFAULT NULL,
  `clave` INT(11) NULL DEFAULT NULL,
  `monto` DOUBLE NULL DEFAULT NULL,
  `id` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.temporalacumulado2
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`temporalacumulado2` (
  `empresa` INT(11) NULL DEFAULT NULL,
  `clave` INT(11) NULL DEFAULT NULL,
  `monto` DOUBLE NULL DEFAULT NULL,
  `id` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.temporalmovidaportaciones
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`temporalmovidaportaciones` (
  `id` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.tmpmovimientos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`tmpmovimientos` (
  `t_mov_fecha` DATE NULL DEFAULT NULL,
  `t_mov_deposito` DOUBLE NULL DEFAULT NULL,
  `t_mov_producto` INT(11) NULL DEFAULT NULL,
  `t_mov_clave_empleado` INT(11) NULL DEFAULT NULL,
  `t_mov_empresa` INT(11) NULL DEFAULT NULL,
  `t_mov_nombre` VARCHAR(100) NULL DEFAULT NULL,
  `t_mov_existe` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.ultimaaportacionsocios
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`ultimaaportacionsocios` (
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `nombre` VARCHAR(100) NULL DEFAULT NULL,
  `fechabaja` DATE NULL DEFAULT NULL,
  `ultimafechaaportacion` DATE NULL DEFAULT NULL,
  `diferencia` INT(11) NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.ultimaaportaciontemp
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`ultimaaportaciontemp` (
  `claveempleado` INT(11) NULL DEFAULT NULL,
  `empresa` INT(11) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `nombre` VARCHAR(150) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.usuarios
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`usuarios` (
  `usu_id` INT(11) NOT NULL AUTO_INCREMENT,
  `usu_clave_empleado` INT(11) NOT NULL,
  `usu_nombre` VARCHAR(50) NULL DEFAULT NULL,
  `usu_paterno` VARCHAR(50) NULL DEFAULT NULL,
  `usu_materno` VARCHAR(50) NULL DEFAULT NULL,
  `usu_edo_civil` VARCHAR(20) NULL DEFAULT NULL,
  `usu_correo` VARCHAR(50) NULL DEFAULT NULL,
  `usu_estado` VARCHAR(2) NULL DEFAULT NULL,
  `usu_rfc` VARCHAR(15) NULL DEFAULT NULL,
  `usu_empresa` INT(11) NOT NULL,
  `usu_puesto` VARCHAR(50) NULL DEFAULT NULL,
  `usu_telefono` VARCHAR(20) NULL DEFAULT NULL,
  `usu_extension` VARCHAR(5) NULL DEFAULT NULL,
  `usu_departamento` VARCHAR(50) NULL DEFAULT NULL,
  `usu_area_trabajo` VARCHAR(50) NULL DEFAULT NULL,
  `usu_estacion` VARCHAR(50) NULL DEFAULT NULL,
  `usu_fecha_ingreso` DATE NULL DEFAULT NULL,
  `usu_fecha_nacimiento` DATE NULL DEFAULT NULL,
  `usu_sexo` VARCHAR(1) NULL DEFAULT NULL,
  `usu_identificacion` VARCHAR(30) NULL DEFAULT NULL,
  `usu_celular` VARCHAR(20) NULL DEFAULT NULL,
  `usu_municipio` VARCHAR(50) NULL DEFAULT NULL,
  `usu_cp` VARCHAR(5) NULL DEFAULT NULL,
  `usu_colonia` VARCHAR(50) NULL DEFAULT NULL,
  `usu_calle` VARCHAR(50) NULL DEFAULT NULL,
  `usu_numext` VARCHAR(10) NULL DEFAULT NULL,
  `usu_salario_neto` DOUBLE NULL DEFAULT NULL,
  `usu_password` VARCHAR(200) NULL DEFAULT NULL,
  `usu_primeravez` INT(11) NULL DEFAULT NULL,
  `usu_temporal` VARCHAR(50) NULL DEFAULT NULL,
  `usu_fecha_ingreso_empresa` DATE NULL DEFAULT NULL,
  `usu_numint` VARCHAR(50) NULL DEFAULT NULL,
  `usu_fecha_baja` DATE NULL DEFAULT NULL,
  `usu_ahorro_fijo` DOUBLE NULL DEFAULT '0',
  `usu_ahorro_nofijo` DOUBLE NULL DEFAULT '0',
  `usu_interes` DOUBLE NULL DEFAULT NULL,
  `usu_flagunico` INT(11) NULL DEFAULT NULL,
  `usu_rol` INT(11) NULL DEFAULT NULL,
  `usu_numero_empleado` VARCHAR(30) NULL DEFAULT NULL,
  `usu_estatus` INT(1) NULL DEFAULT '1',
  PRIMARY KEY (`usu_id`),
  INDEX `fk_empresa_usuario_idx` (`usu_empresa` ASC),
  CONSTRAINT `fk_empresas`
    FOREIGN KEY (`usu_empresa`)
    REFERENCES `cajainde_sindicato`.`empresas` (`emp_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 6944
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.usuarios_resp
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`usuarios_resp` (
  `usu_id` INT(11) NOT NULL AUTO_INCREMENT,
  `usu_clave_empleado` INT(11) NULL DEFAULT NULL,
  `usu_nombre` VARCHAR(50) NULL DEFAULT NULL,
  `usu_paterno` VARCHAR(50) NULL DEFAULT NULL,
  `usu_edo_civil` VARCHAR(20) NULL DEFAULT NULL,
  `usu_correo` VARCHAR(50) NULL DEFAULT NULL,
  `usu_estado` VARCHAR(2) NULL DEFAULT NULL,
  `usu_rfc` VARCHAR(15) NULL DEFAULT NULL,
  `usu_empresa` VARCHAR(1) NULL DEFAULT NULL,
  `usu_puesto` VARCHAR(50) NULL DEFAULT NULL,
  `usu_telefono` VARCHAR(20) NULL DEFAULT NULL,
  `usu_departamento` VARCHAR(50) NULL DEFAULT NULL,
  `usu_area_trabajo` VARCHAR(50) NULL DEFAULT NULL,
  `usu_estacion` VARCHAR(50) NULL DEFAULT NULL,
  `usu_fecha_ingreso` DATE NULL DEFAULT NULL,
  `usu_fecha_nacimiento` DATE NULL DEFAULT NULL,
  `usu_sexo` VARCHAR(1) NULL DEFAULT NULL,
  `usu_identificacion` VARCHAR(30) NULL DEFAULT NULL,
  `usu_celular` VARCHAR(20) NULL DEFAULT NULL,
  `usu_municipio` VARCHAR(50) NULL DEFAULT NULL,
  `usu_cp` VARCHAR(5) NULL DEFAULT NULL,
  `usu_colonia` VARCHAR(50) NULL DEFAULT NULL,
  `usu_calle` VARCHAR(50) NULL DEFAULT NULL,
  `usu_numext` VARCHAR(10) NULL DEFAULT NULL,
  `usu_salario_neto` DOUBLE NULL DEFAULT NULL,
  `usu_materno` VARCHAR(50) NULL DEFAULT NULL,
  `usu_password` VARCHAR(200) NULL DEFAULT NULL,
  `usu_primeravez` INT(11) NULL DEFAULT NULL,
  `usu_temporal` VARCHAR(50) NULL DEFAULT NULL,
  `usu_fecha_ingreso_empresa` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`usu_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4856
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.usuariostemporal
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`usuariostemporal` (
  `usu_clave_empleado` INT(11) NULL DEFAULT NULL,
  `usu_empresa` INT(11) NULL DEFAULT NULL,
  `ahorro` DOUBLE NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table cajainde_sindicato.usuariosunicos
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `cajainde_sindicato`.`usuariosunicos` (
  `usu_clave_empleado` INT(11) NULL DEFAULT NULL,
  `total` BIGINT(20) NOT NULL DEFAULT '0')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
SET FOREIGN_KEY_CHECKS = 1;
