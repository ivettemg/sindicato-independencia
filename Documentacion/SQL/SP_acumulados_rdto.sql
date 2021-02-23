CREATE PROCEDURE acumulados_rdto (IN fecha Date )
BEGIN
	select sum(mov_deposito) from usuarios u left join baja_empleados b on u.usu_id=b.bae_id_empleado 
  left join movimientos m on u.usu_id=m.mov_usu_id 
  where mov_ar = 1 and mov_tipo in ('APORTACION','DEVOLUCION')
  and (usu_fecha_baja is null or usu_fecha_baja>=fecha)
  and (b.bae_fecha_baja is null or b.bae_fecha_baja>=fecha)
  and year(m.mov_fecha)=year(date_sub(fecha,interval 1 month)) 
  and month(m.mov_fecha)=month(date_sub(fecha,interval 1 month));
  
END;
