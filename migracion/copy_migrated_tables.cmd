REM Workbench Table Data copy script
REM Workbench Version: 8.0.16
REM 
REM Execute this to copy table data from a source RDBMS to MySQL.
REM Edit the options below to customize it. You will need to provide passwords, at least.
REM 
REM Source DB: Mysql@localhost:3306 (MySQL)
REM Target DB: Mysql@209.58.143.97:3306


@ECHO OFF
REM Source and target DB passwords
set arg_source_password=
set arg_target_password=
set arg_source_ssh_password=
set arg_target_ssh_password=


REM Set the location for wbcopytables.exe in this variable
set "wbcopytables_path=C:\Program Files\MySQL\MySQL Workbench 8.0 CE"

if not ["%wbcopytables_path%"] == [] set "wbcopytables_path=%wbcopytables_path%"set "wbcopytables=%wbcopytables_path%wbcopytables.exe"

if not exist "%wbcopytables%" (
	echo "wbcopytables.exe doesn't exist in the supplied path. Please set 'wbcopytables_path' with the proper path(e.g. to Workbench binaries)"
	exit 1
)

IF [%arg_source_password%] == [] (
    IF [%arg_target_password%] == [] (
        IF [%arg_source_ssh_password%] == [] (
            IF [%arg_target_ssh_password%] == [] (
                ECHO WARNING: All source and target passwords are empty. You should edit this file to set them.
            )
        )
    )
)
set arg_worker_count=2
REM Uncomment the following options according to your needs

REM Whether target tables should be truncated before copy
REM set arg_truncate_target=--truncate-target
REM Enable debugging output
REM set arg_debug_output=--log-level=debug3


REM Creation of file with table definitions for copytable

set table_file=%TMP%\wb_tables_to_migrate.txt
TYPE NUL > %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`pagos_estatus`	`sindicato`	`pagos_estatus`	`pag_est_id`	`pag_est_id`	`pag_est_id`, `pag_est_nombre`, `pag_est_descripcion`, `pag_est_color` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`lstusuariosdevolucionessistema`	`sindicato`	`lstusuariosdevolucionessistema`	-	-	`mov_usu_id`, `mov_fecha` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`solicitud_avales`	`sindicato`	`solicitud_avales`	`id_sol_ava`	`id_sol_ava`	`id_sol_ava`, `sol_ava_solicitud`, `sol_ava_clave_empleado`, `sol_ava_credito`, `sol_ava_id_empleado`, `sol_ava_estatus` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`tblahodev2016`	`sindicato`	`tblahodev2016`	-	-	`ClaveEmpleado`, `Empresa`, `emp`, `Nombre`, `Fecha`, `x1`, `x2`, `Devolucion`, `tipo` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`beneficiarios`	`sindicato`	`beneficiarios`	`ben_id`	`ben_id`	`ben_id`, `ben_nombre`, `ben_paterno`, `ben_materno`, `ben_parentesco`, `ben_pct`, `ben_direccion`, `ben_telefono`, `ben_celular`, `ben_flag`, `ben_usu_id` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`solicitud_estatus`	`sindicato`	`solicitud_estatus`	`sol_est_id`	`sol_est_id`	`sol_est_id`, `sol_est_nmbr_est`, `sol_est_descripcion` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`banco_edocta`	`sindicato`	`banco_edocta`	`bec_id_banco`,`bec_id_edocta`	`bec_id_banco`,`bec_id_edocta`	`bec_id_banco`, `bec_id_edocta`, `bec_fecha_transaccion` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`amortizacion_estatus`	`sindicato`	`amortizacion_estatus`	`amo_est_id`	`amo_est_id`	`amo_est_id`, `amo_est_nombre`, `amo_est_descripcion`, `amo_est_color` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`rendimiento3`	`sindicato`	`rendimiento3`	`ren_id`	`ren_id`	`ren_id`, `ren_fecha`, `ren_interes`, `ren_acumulado`, `ren_factor`, `ren_estatus` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`archivos_historial`	`sindicato`	`archivos_historial`	`arh_id`	`arh_id`	`arh_id`, `arh_nombre_archivo`, `arh_fecha_subida`, `arh_empresa`, `arh_estatus`, `arh_registros`, `arh_tipo_archivo`, `arh_fecha_catorcena` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`bitacora`	`sindicato`	`bitacora`	`bit_id`	`bit_id`	`bit_id`, `bit_tipo`, `bit_nota`, `bit_fecha`, `bit_usuario`, `bit_referencia`, `bit_subreferencia`, `bit_titulo` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`devoluciones`	`sindicato`	`devoluciones`	`dev_id`	`dev_id`	`dev_id`, `dev_acum_id`, `dev_monto` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`productos`	`sindicato`	`productos`	`pro_id`	`pro_id`	`pro_id`, `pro_descripcion`, `pro_siglas` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`imagenes`	`sindicato`	`imagenes`	`ima_id`	`ima_id`	`ima_id`, `ima_solicitud`, `ima_imagen`, `ima_tipoimagen`, `ima_estatus`, `ima_observaciones` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`bitacora_transacciones`	`sindicato`	`bitacora_transacciones`	`bitra_id`	`bitra_id`	`bitra_id`, `bitra_nombre`, `bitra_descripcion` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`movimientos`	`sindicato`	`movimientos`	`mov_id`	`mov_id`	`mov_id`, `mov_fecha`, `mov_deposito`, `mov_producto`, `mov_clave_empleado`, `mov_empresa`, `mov_tipo`, `mov_arh_id`, `mov_nombre_empleado`, `mov_usu_id`, `mov_id_padre`, `mov_estatus`, `mov_ar`, `mov_bandera`, `mov_cambioanfaf`, `flag_abono` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`amortizacion`	`sindicato`	`amortizacion`	`amo_id`	`amo_id`	`amo_id`, `amo_numero_pago`, `amo_capital`, `amo_amortizacion`, `amo_interes`, `amo_iva`, `amo_monto_pago`, `amo_solicitud`, `amo_credito`, `amo_saldo`, `amo_fecha_pago`, `amo_estatus`, `amo_estatus_anterior`, `amo_clave_empleado`, `amo_pago_id`, `amo_usu_id`, `amo_producto`, `amo_estatus2`, `amo_estatus_int` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`credito_estatus`	`sindicato`	`credito_estatus`	`cre_est_id`	`cre_est_id`	`cre_est_id`, `cre_est_nombre`, `cre_est_descripcion` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`bancos_conceptos`	`sindicato`	`bancos_conceptos`	`cban_id`	`cban_id`	`cban_id`, `cban_nombre`, `cban_tipo`, `cban_tabla`, `cban_columnapk` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`parentesco_ben`	`sindicato`	`parentesco_ben`	`par_id`	`par_id`	`par_id`, `par_nombre` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`rendimiento`	`sindicato`	`rendimiento`	`ren_id`	`ren_id`	`ren_id`, `ren_fecha`, `ren_interes`, `ren_acumulado`, `ren_factor`, `ren_estatus`, `ren_intereses_inversion`, `ren_comisiones_bancarias`, `ren_reserva`, `ren_ganancia_neta` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`roles`	`sindicato`	`roles`	`rol_id`	`rol_id`	`rol_id`, `rol_nombre` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`estado_cuenta`	`sindicato`	`estado_cuenta`	`ec_id`	`ec_id`	`ec_id`, `ec_concepto`, `ec_monto`, `ec_empresa`, `ec_fechatransaccion`, `ec_ajustado`, `ec_descripcion`, `ec_padre`, `ec_id_relacion`, `ec_fecha_relacion` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`catorcenas`	`sindicato`	`catorcenas`	`car_id`	`car_id`	`car_id`, `car_fecha`, `car_dia`, `car_mes`, `car_anio`, `car_inversiones` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`bancos`	`sindicato`	`bancos`	`ban_id`	`ban_id`	`ban_id`, `ban_concepto`, `ban_monto`, `ban_empresa`, `ban_fechatransaccion`, `ban_id_concepto_sistema`, `ban_ajustado`, `ban_id_relacion`, `ban_fecha_relacion` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`cargos`	`sindicato`	`cargos`	`id_cargo`	`id_cargo`	`id_cargo`, `car_credito`, `car_numero_pago`, `car_catorcenas`, `car_saldo`, `car_amortizacion`, `car_interes`, `car_pago`, `car_fecha`, `car_saldo_actual` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`altas_cambios_hist`	`sindicato`	`altas_cambios_hist`	`cnh_id`	`cnh_id`	`cnh_id`, `cnh_usu_id`, `cnh_arh_id`, `cnh_tipo`, `cnh_clave_anterior`, `cnh_clave_actual`, `cnh_empresa_anterior`, `cnh_empresa_actual`, `cnh_catorcena_transaccion`, `cnh_mov_id`, `cnh_fecha` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`primeraportacionusuarios`	`sindicato`	`primeraportacionusuarios`	-	-	`mov_usu_id`, `fecha_ingreso` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`usuarios`	`sindicato`	`usuarios`	`usu_id`	`usu_id`	`usu_id`, `usu_clave_empleado`, `usu_nombre`, `usu_paterno`, `usu_materno`, `usu_edo_civil`, `usu_correo`, `usu_estado`, `usu_rfc`, `usu_empresa`, `usu_puesto`, `usu_telefono`, `usu_extension`, `usu_departamento`, `usu_area_trabajo`, `usu_estacion`, `usu_fecha_ingreso`, `usu_fecha_nacimiento`, `usu_sexo`, `usu_identificacion`, `usu_celular`, `usu_municipio`, `usu_cp`, `usu_colonia`, `usu_calle`, `usu_numext`, `usu_salario_neto`, `usu_password`, `usu_primeravez`, `usu_temporal`, `usu_fecha_ingreso_empresa`, `usu_numint`, `usu_fecha_baja`, `usu_ahorro_fijo`, `usu_ahorro_nofijo`, `usu_interes`, `usu_flagunico`, `usu_rol`, `usu_numero_empleado`, `usu_estatus`, `usu_habilitado` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`pagos_respaldo`	`sindicato`	`pagos_respaldo`	`pag_id`	`pag_id`	`pag_id`, `pag_clave_empleado`, `pag_fecha`, `pag_deposito`, `pag_empresa`, `pag_credito`, `pag_usu_id`, `pag_estatus`, `pag_usu_nombre`, `pag_arh_id`, `pag_estatus_amortizacion`, `antes7` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`rel_banco_edocta`	`sindicato`	`rel_banco_edocta`	`rbe_id`,`rbe_id_banco_ec`,`rbe_tipo`	`rbe_id`,`rbe_id_banco_ec`,`rbe_tipo`	`rbe_id`, `rbe_id_banco_ec`, `rbe_tipo`, `rbe_fecha_rel` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`solicitudes`	`sindicato`	`solicitudes`	`sol_id`	`sol_id`	`sol_id`, `sol_clave_empleado`, `sol_sueldo_neto`, `sol_deducciones`, `sol_monto_solicitado`, `sol_catorcenas`, `sol_pago_credito`, `sol_banco`, `sol_numero_cuenta`, `sol_clabe_interbancaria`, `sol_estatus`, `sol_nombre_tarjetahabiente`, `sol_pago_total`, `sol_producto`, `sol_numero`, `sol_aguinaldo`, `sol_fa`, `sol_intereses`, `sol_observacion`, `sol_fecha_ult_catorcena`, `sol_fecha_autorizacion`, `sol_fecha_creacion`, `sol_fecha_cancelacion`, `sol_fecha_fondeo`, `sol_fecha_enviodocumentos`, `sol_facatorcena`, `sol_fecha_deposito`, `sol_motivo_rechazo`, `sol_usu_id`, `sol_estatus_db`, `sol_formato_doc_firmada`, `sol_referencia`, `sol_aseguradora`, `sol_no_poliza` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`pagos`	`sindicato`	`pagos`	`pag_id`	`pag_id`	`pag_id`, `pag_clave_empleado`, `pag_fecha`, `pag_deposito`, `pag_acumulado`, `pag_empresa`, `pag_credito`, `pag_usu_id`, `pag_estatus`, `pag_estatus_anterior`, `pag_usu_nombre`, `pag_arh_id`, `pag_estatus_amortizacion`, `antes7` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`usuarios_resp`	`sindicato`	`usuarios_resp`	`usu_id`	`usu_id`	`usu_id`, `usu_clave_empleado`, `usu_nombre`, `usu_paterno`, `usu_edo_civil`, `usu_correo`, `usu_estado`, `usu_rfc`, `usu_empresa`, `usu_puesto`, `usu_telefono`, `usu_departamento`, `usu_area_trabajo`, `usu_estacion`, `usu_fecha_ingreso`, `usu_fecha_nacimiento`, `usu_sexo`, `usu_identificacion`, `usu_celular`, `usu_municipio`, `usu_cp`, `usu_colonia`, `usu_calle`, `usu_numext`, `usu_salario_neto`, `usu_materno`, `usu_password`, `usu_primeravez`, `usu_temporal`, `usu_fecha_ingreso_empresa` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`baja_empleados`	`sindicato`	`baja_empleados`	`bae_id`	`bae_id`	`bae_id`, `bae_id_empleado`, `bae_estatus`, `bae_fecha_administracion`, `bae_monto_finiquito`, `bae_clabe`, `bae_cuenta`, `bae_banco`, `bae_fecha_creacion`, `bae_fecha_pdf`, `bae_fecha_correo`, `bae_ruta_archivo`, `bae_fecha_baja`, `bae_fecha_deposito`, `bae_deuda_creditos`, `bae_ahorros` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`creditos`	`sindicato`	`creditos`	`cre_id`	`cre_id`	`cre_id`, `cre_clave_credito`, `cre_prestamos`, `cre_pagos`, `cre_fecha_inicio`, `cre_fecha_termino`, `cre_prospecto`, `cre_clave_empleado`, `cre_fondeo`, `cre_fondeador` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`avales`	`sindicato`	`avales`	-	-	`ava_id`, `ava_clave_credito`, `ava_aval1`, `ava_aval2`, `ava_aval3` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`creditos_final`	`sindicato`	`creditos_final`	`cre_id`	`cre_id`	`cre_id`, `cre_fecha_deposito`, `cre_empresa`, `cre_nombre`, `cre_tipo`, `cre_prestamo`, `cre_catorcenas`, `cre_fecha_primer_pago`, `cre_clave_empleado`, `cre_producto`, `cre_solicitud`, `cre_pago_quincenal`, `cre_saldo`, `cre_clave`, `cre_estatus`, `cre_usu_id`, `cre_padre`, `cre_fecha_nuevo_monto`, `cre_fecha_incobrable` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`tabulador`	`sindicato`	`tabulador`	-	-	`tab_id`, `tab_descripcion`, `tab_mensual`, `tab_diario`, `tab_catorcenal` >> %TMP%\wb_tables_to_migrate.txt
ECHO `sindicato`	`empresas`	`sindicato`	`empresas`	`emp_id`	`emp_id`	`emp_id`, `emp_descripcion`, `emp_abreviacion`, `emp_rfc`, `emp_telefono`, `emp_direccion` >> %TMP%\wb_tables_to_migrate.txt


"%wbcopytables%" ^
 --mysql-source="root@localhost:3306" ^
 --source-rdbms-type=Mysql ^
 --target="admin_sindicato@209.58.143.97:3306" ^
 --source-password="%arg_source_password%" ^
 --target-password="%arg_target_password%" ^
 --table-file="%table_file%" ^
 --source-ssh-port="22" ^
 --source-ssh-host="" ^
 --source-ssh-user="" ^
 --target-ssh-port="22" ^
 --target-ssh-host="" ^
 --target-ssh-user="" ^
 --source-ssh-password="%arg_source_ssh_password%" ^
 --target-ssh-password="%arg_target_ssh_password%" --thread-count=%arg_worker_count% ^
 %arg_truncate_target% ^
 %arg_debug_output%

REM Removes the file with the table definitions
DEL %TMP%\wb_tables_to_migrate.txt


