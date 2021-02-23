package mx.com.evoti.hibernate.pojos;
// Generated 21/10/2016 12:57:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Productos generated by hbm2java
 */
@Entity
@Table(name="productos"
)
public class Productos  implements java.io.Serializable {


     private int proId;
     private String proDescripcion;
     private String proSiglas;
     private Set<Solicitudes> solicitudeses = new HashSet<Solicitudes>(0);

    public Productos() {
    }

	
    public Productos(int proId) {
        this.proId = proId;
    }
    public Productos(int proId, String proDescripcion, String proSiglas, Set<Solicitudes> solicitudeses) {
       this.proId = proId;
       this.proDescripcion = proDescripcion;
       this.proSiglas = proSiglas;
       this.solicitudeses = solicitudeses;
    }
   
     @Id 

    
    @Column(name="pro_id", nullable=false)
    public int getProId() {
        return this.proId;
    }
    
    public void setProId(int proId) {
        this.proId = proId;
    }

    
    @Column(name="pro_descripcion", length=30)
    public String getProDescripcion() {
        return this.proDescripcion;
    }
    
    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }

    
    @Column(name="pro_siglas", length=20)
    public String getProSiglas() {
        return this.proSiglas;
    }
    
    public void setProSiglas(String proSiglas) {
        this.proSiglas = proSiglas;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="productos")
    public Set<Solicitudes> getSolicitudeses() {
        return this.solicitudeses;
    }
    
    public void setSolicitudeses(Set<Solicitudes> solicitudeses) {
        this.solicitudeses = solicitudeses;
    }




}


