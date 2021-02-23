package mx.com.evoti.hibernate.pojos;
// Generated 21/10/2016 12:57:00 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Devoluciones generated by hbm2java
 */
@Entity
@Table(name="devoluciones"
)
public class Devoluciones  implements java.io.Serializable {


     private Integer devId;
     private Integer devAcumId;
     private Double devMonto;

    public Devoluciones() {
    }

    public Devoluciones(Integer devAcumId, Double devMonto) {
       this.devAcumId = devAcumId;
       this.devMonto = devMonto;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="dev_id", nullable=false)
    public Integer getDevId() {
        return this.devId;
    }
    
    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    
    @Column(name="dev_acum_id")
    public Integer getDevAcumId() {
        return this.devAcumId;
    }
    
    public void setDevAcumId(Integer devAcumId) {
        this.devAcumId = devAcumId;
    }

    
    @Column(name="dev_monto", precision=22, scale=0)
    public Double getDevMonto() {
        return this.devMonto;
    }
    
    public void setDevMonto(Double devMonto) {
        this.devMonto = devMonto;
    }




}


