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
 * Movimientos generated by hbm2java
 */
@Entity
@Table(name="movimientos"
)
public class Movimientos  implements java.io.Serializable {


     private Integer movId;
     private Integer movUsuId;
     private Date movFecha;
     private Double movDeposito;
     private Integer movProducto;
     private Integer movClaveEmpleado;
     private Integer movEmpresa;
     private String movTipo;
     private Integer movArhId;
     private String movNombreEmpleado;
     private Integer movIdPadre;
     private Integer movEstatus;
     private Integer movAr;
     private Integer movBandera;
     private Integer movCambioanfaf;

   

    public Movimientos() {
    }

    public Movimientos(Date movFecha, Double movDeposito, Integer movProducto, Integer movClaveEmpleado, Integer movEmpresa, String movTipo, Integer movArhId, String movNombreEmpleado, Integer movIdPadre, Integer movEstatus, Integer movAr, Integer movBandera, Integer movUsuId) {
       this.movFecha = movFecha;
       this.movUsuId = movUsuId;
       this.movDeposito = movDeposito;
       this.movProducto = movProducto;
       this.movClaveEmpleado = movClaveEmpleado;
       this.movEmpresa = movEmpresa;
       this.movTipo = movTipo;
       this.movArhId = movArhId;
       this.movNombreEmpleado = movNombreEmpleado;
       this.movIdPadre = movIdPadre;
       this.movEstatus = movEstatus;
       this.movAr = movAr;
       this.movBandera = movBandera;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mov_id", nullable=false)
    public Integer getMovId() {
        return this.movId;
    }
    
    public void setMovId(Integer movId) {
        this.movId = movId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="mov_fecha", length=10)
    public Date getMovFecha() {
        return this.movFecha;
    }
    
    public void setMovFecha(Date movFecha) {
        this.movFecha = movFecha;
    }

    
    @Column(name="mov_deposito", precision=22, scale=0)
    public Double getMovDeposito() {
        return this.movDeposito;
    }
    
    public void setMovDeposito(Double movDeposito) {
        this.movDeposito = movDeposito;
    }

    
    @Column(name="mov_producto")
    public Integer getMovProducto() {
        return this.movProducto;
    }
    
    public void setMovProducto(Integer movProducto) {
        this.movProducto = movProducto;
    }

    
    @Column(name="mov_clave_empleado")
    public Integer getMovClaveEmpleado() {
        return this.movClaveEmpleado;
    }
    
    public void setMovClaveEmpleado(Integer movClaveEmpleado) {
        this.movClaveEmpleado = movClaveEmpleado;
    }

    
    @Column(name="mov_empresa")
    public Integer getMovEmpresa() {
        return this.movEmpresa;
    }
    
    public void setMovEmpresa(Integer movEmpresa) {
        this.movEmpresa = movEmpresa;
    }

    
    @Column(name="mov_tipo", length=20)
    public String getMovTipo() {
        return this.movTipo;
    }
    
    public void setMovTipo(String movTipo) {
        this.movTipo = movTipo;
    }

    
    @Column(name="mov_arh_id")
    public Integer getMovArhId() {
        return this.movArhId;
    }
    
    public void setMovArhId(Integer movArhId) {
        this.movArhId = movArhId;
    }

    
    @Column(name="mov_nombre_empleado", length=200)
    public String getMovNombreEmpleado() {
        return this.movNombreEmpleado;
    }
    
    public void setMovNombreEmpleado(String movNombreEmpleado) {
        this.movNombreEmpleado = movNombreEmpleado;
    }

    
    @Column(name="mov_id_padre")
    public Integer getMovIdPadre() {
        return this.movIdPadre;
    }
    
    public void setMovIdPadre(Integer movIdPadre) {
        this.movIdPadre = movIdPadre;
    }

    
    @Column(name="mov_estatus")
    public Integer getMovEstatus() {
        return this.movEstatus;
    }
    
    public void setMovEstatus(Integer movEstatus) {
        this.movEstatus = movEstatus;
    }

    
    @Column(name="mov_ar")
    public Integer getMovAr() {
        return this.movAr;
    }
    
    public void setMovAr(Integer movAr) {
        this.movAr = movAr;
    }

    
    @Column(name="mov_bandera")
    public Integer getMovBandera() {
        return this.movBandera;
    }
    
    public void setMovBandera(Integer movBandera) {
        this.movBandera = movBandera;
    }

    /**
     * @return the movUsuId
     */
     @Column(name="mov_usu_id")
    public Integer getMovUsuId() {
        return movUsuId;
    }

    /**
     * @param movUsuId the movUsuId to set
     */
    public void setMovUsuId(Integer movUsuId) {
        this.movUsuId = movUsuId;
    }

     @Column(name="mov_cambioanfaf")
    public Integer getMovCambioanfaf() {
        return movCambioanfaf;
    }

    public void setMovCambioanfaf(Integer movCambioanfaf) {
        this.movCambioanfaf = movCambioanfaf;
    }


}


