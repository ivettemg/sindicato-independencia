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
 * AltasCambiosHist generated by hbm2java
 */
@Entity
@Table(name="altas_cambios_hist"
)
public class AltasCambiosHist  implements java.io.Serializable {


     private Integer cnhId;
     private Integer cnhUsuId;
     private Integer cnhArhId;
     private Integer cnhTipo;
     private Integer cnhClaveAnterior;
     private Integer cnhClaveActual;
     private Integer cnhEmpresaAnterior;
     private Integer cnhEmpresaActual;
     private Date cnhCatorcenaTransaccion;
     private Integer cnhMovId;
     private Date cnhFecha;

    public AltasCambiosHist() {
    }

    public AltasCambiosHist(Integer cnhUsuId, Integer cnhArhId, Integer cnhTipo, Integer cnhClaveAnterior, Integer cnhClaveActual, Integer cnhEmpresaAnterior, Integer cnhEmpresaActual, Date cnhCatorcenaTransaccion, Integer cnhMovId, Date cnhFecha) {
       this.cnhUsuId = cnhUsuId;
       this.cnhArhId = cnhArhId;
       this.cnhTipo = cnhTipo;
       this.cnhClaveAnterior = cnhClaveAnterior;
       this.cnhClaveActual = cnhClaveActual;
       this.cnhEmpresaAnterior = cnhEmpresaAnterior;
       this.cnhEmpresaActual = cnhEmpresaActual;
       this.cnhCatorcenaTransaccion = cnhCatorcenaTransaccion;
       this.cnhMovId = cnhMovId;
       this.cnhFecha = cnhFecha;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="cnh_id", nullable=false)
    public Integer getCnhId() {
        return this.cnhId;
    }
    
    public void setCnhId(Integer cnhId) {
        this.cnhId = cnhId;
    }

    
    @Column(name="cnh_usu_id")
    public Integer getCnhUsuId() {
        return this.cnhUsuId;
    }
    
    public void setCnhUsuId(Integer cnhUsuId) {
        this.cnhUsuId = cnhUsuId;
    }

    
    @Column(name="cnh_arh_id")
    public Integer getCnhArhId() {
        return this.cnhArhId;
    }
    
    public void setCnhArhId(Integer cnhArhId) {
        this.cnhArhId = cnhArhId;
    }

    
    @Column(name="cnh_tipo")
    public Integer getCnhTipo() {
        return this.cnhTipo;
    }
    
    public void setCnhTipo(Integer cnhTipo) {
        this.cnhTipo = cnhTipo;
    }

    
    @Column(name="cnh_clave_anterior")
    public Integer getCnhClaveAnterior() {
        return this.cnhClaveAnterior;
    }
    
    public void setCnhClaveAnterior(Integer cnhClaveAnterior) {
        this.cnhClaveAnterior = cnhClaveAnterior;
    }

    
    @Column(name="cnh_clave_actual")
    public Integer getCnhClaveActual() {
        return this.cnhClaveActual;
    }
    
    public void setCnhClaveActual(Integer cnhClaveActual) {
        this.cnhClaveActual = cnhClaveActual;
    }

    
    @Column(name="cnh_empresa_anterior")
    public Integer getCnhEmpresaAnterior() {
        return this.cnhEmpresaAnterior;
    }
    
    public void setCnhEmpresaAnterior(Integer cnhEmpresaAnterior) {
        this.cnhEmpresaAnterior = cnhEmpresaAnterior;
    }

    
    @Column(name="cnh_empresa_actual")
    public Integer getCnhEmpresaActual() {
        return this.cnhEmpresaActual;
    }
    
    public void setCnhEmpresaActual(Integer cnhEmpresaActual) {
        this.cnhEmpresaActual = cnhEmpresaActual;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="cnh_catorcena_transaccion", length=10)
    public Date getCnhCatorcenaTransaccion() {
        return this.cnhCatorcenaTransaccion;
    }
    
    public void setCnhCatorcenaTransaccion(Date cnhCatorcenaTransaccion) {
        this.cnhCatorcenaTransaccion = cnhCatorcenaTransaccion;
    }

    
    @Column(name="cnh_mov_id")
    public Integer getCnhMovId() {
        return this.cnhMovId;
    }
    
    public void setCnhMovId(Integer cnhMovId) {
        this.cnhMovId = cnhMovId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="cnh_fecha", length=10)
    public Date getCnhFecha() {
        return this.cnhFecha;
    }
    
    public void setCnhFecha(Date cnhFecha) {
        this.cnhFecha = cnhFecha;
    }




}

