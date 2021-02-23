package mx.com.evoti.hibernate.pojos;
// Generated 21/10/2016 12:57:00 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BajaEmpleados generated by hbm2java
 */
@Entity
@Table(name="baja_empleados"
)
public class BajaEmpleados  implements java.io.Serializable {


     private Integer baeId;
     private int baeIdEmpleado;
     private Integer baeEstatus;
     private Date baeFechaAdministracion;
     private Double baeMontoFiniquito;
     private String baeClabe;
     private String baeCuenta;
     private String baeBanco;
     private Date baeFechaCreacion;
     private Date baeFechaPdf;
     private Date baeFechaCorreo;
     private String baeRutaArchivo;
     private Date baeFechaBaja;
     private Date baeFechaDeposito;
     private Double baeDeudaCreditos;
     private Double baeAhorros;
     

    public BajaEmpleados() {
    }

	
    public BajaEmpleados(int baeIdEmpleado) {
        this.baeIdEmpleado = baeIdEmpleado;
    }
    public BajaEmpleados(int baeIdEmpleado, Integer baeEstatus, Date baeFechaAdministracion, Double baeMontoFiniquito, String baeClabe, String baeCuenta, String baeBanco, Date baeFechaCreacion, Date baeFechaPdf, Date baeFechaCorreo, String baeRutaArchivo, Date baeFechaBaja, Date baeFechaDeposito) {
       this.baeIdEmpleado = baeIdEmpleado;
       this.baeEstatus = baeEstatus;
       this.baeFechaAdministracion = baeFechaAdministracion;
       this.baeMontoFiniquito = baeMontoFiniquito;
       this.baeClabe = baeClabe;
       this.baeCuenta = baeCuenta;
       this.baeBanco = baeBanco;
       this.baeFechaCreacion = baeFechaCreacion;
       this.baeFechaPdf = baeFechaPdf;
       this.baeFechaCorreo = baeFechaCorreo;
       this.baeRutaArchivo = baeRutaArchivo;
       this.baeFechaBaja = baeFechaBaja;
       this.baeFechaDeposito = baeFechaDeposito;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="bae_id", nullable=false)
    public Integer getBaeId() {
        return this.baeId;
    }
    
    public void setBaeId(Integer baeId) {
        this.baeId = baeId;
    }

    
    @Column(name="bae_id_empleado", nullable=false)
    public int getBaeIdEmpleado() {
        return this.baeIdEmpleado;
    }
    
    public void setBaeIdEmpleado(int baeIdEmpleado) {
        this.baeIdEmpleado = baeIdEmpleado;
    }

    
    @Column(name="bae_estatus")
    public Integer getBaeEstatus() {
        return this.baeEstatus;
    }
    
    public void setBaeEstatus(Integer baeEstatus) {
        this.baeEstatus = baeEstatus;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bae_fecha_administracion", length=10)
    public Date getBaeFechaAdministracion() {
        return this.baeFechaAdministracion;
    }
    
    public void setBaeFechaAdministracion(Date baeFechaAdministracion) {
        this.baeFechaAdministracion = baeFechaAdministracion;
    }

    
    @Column(name="bae_monto_finiquito", precision=22, scale=0)
    public Double getBaeMontoFiniquito() {
        return this.baeMontoFiniquito;
    }
    
    public void setBaeMontoFiniquito(Double baeMontoFiniquito) {
        this.baeMontoFiniquito = baeMontoFiniquito;
    }

    
    @Column(name="bae_clabe", length=50)
    public String getBaeClabe() {
        return this.baeClabe;
    }
    
    public void setBaeClabe(String baeClabe) {
        this.baeClabe = baeClabe;
    }

    
    @Column(name="bae_cuenta", length=50)
    public String getBaeCuenta() {
        return this.baeCuenta;
    }
    
    public void setBaeCuenta(String baeCuenta) {
        this.baeCuenta = baeCuenta;
    }

    
    @Column(name="bae_banco", length=50)
    public String getBaeBanco() {
        return this.baeBanco;
    }
    
    public void setBaeBanco(String baeBanco) {
        this.baeBanco = baeBanco;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bae_fecha_creacion", length=10)
    public Date getBaeFechaCreacion() {
        return this.baeFechaCreacion;
    }
    
    public void setBaeFechaCreacion(Date baeFechaCreacion) {
        this.baeFechaCreacion = baeFechaCreacion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bae_fecha_pdf", length=10)
    public Date getBaeFechaPdf() {
        return this.baeFechaPdf;
    }
    
    public void setBaeFechaPdf(Date baeFechaPdf) {
        this.baeFechaPdf = baeFechaPdf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bae_fecha_correo", length=10)
    public Date getBaeFechaCorreo() {
        return this.baeFechaCorreo;
    }
    
    public void setBaeFechaCorreo(Date baeFechaCorreo) {
        this.baeFechaCorreo = baeFechaCorreo;
    }

    
    @Column(name="bae_ruta_archivo", length=500)
    public String getBaeRutaArchivo() {
        return this.baeRutaArchivo;
    }
    
    public void setBaeRutaArchivo(String baeRutaArchivo) {
        this.baeRutaArchivo = baeRutaArchivo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bae_fecha_baja", length=10)
    public Date getBaeFechaBaja() {
        return this.baeFechaBaja;
    }
    
    public void setBaeFechaBaja(Date baeFechaBaja) {
        this.baeFechaBaja = baeFechaBaja;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bae_fecha_deposito", length=10)
    public Date getBaeFechaDeposito() {
        return this.baeFechaDeposito;
    }
    
    public void setBaeFechaDeposito(Date baeFechaDeposito) {
        this.baeFechaDeposito = baeFechaDeposito;
    }

    /**
     * @return the baeDeudaCreditos
     */
      @Column(name="bae_deuda_creditos", precision=22, scale=0)
    public Double getBaeDeudaCreditos() {
        return baeDeudaCreditos;
    }

    /**
     * @param baeDeudaCreditos the baeDeudaCreditos to set
     */
    public void setBaeDeudaCreditos(Double baeDeudaCreditos) {
        this.baeDeudaCreditos = baeDeudaCreditos;
    }

    /**
     * @return the baeAhorros
     */
      @Column(name="bae_ahorros", precision=22, scale=0)
    public Double getBaeAhorros() {
        return baeAhorros;
    }

    /**
     * @param baeAhorros the baeAhorros to set
     */
    public void setBaeAhorros(Double baeAhorros) {
        this.baeAhorros = baeAhorros;
    }




}

