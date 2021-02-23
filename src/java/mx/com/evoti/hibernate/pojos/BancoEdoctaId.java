package mx.com.evoti.hibernate.pojos;
// Generated 27/03/2017 05:12:46 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BancoEdoctaId generated by hbm2java
 */
@Embeddable
public class BancoEdoctaId  implements java.io.Serializable {


     private int becIdBanco;
     private int becIdEdocta;

    public BancoEdoctaId() {
    }

    public BancoEdoctaId(int becIdBanco, int becIdEdocta) {
       this.becIdBanco = becIdBanco;
       this.becIdEdocta = becIdEdocta;
    }
   


    @Column(name="bec_id_banco", nullable=false)
    public int getBecIdBanco() {
        return this.becIdBanco;
    }
    
    public void setBecIdBanco(int becIdBanco) {
        this.becIdBanco = becIdBanco;
    }


    @Column(name="bec_id_edocta", nullable=false)
    public int getBecIdEdocta() {
        return this.becIdEdocta;
    }
    
    public void setBecIdEdocta(int becIdEdocta) {
        this.becIdEdocta = becIdEdocta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BancoEdoctaId) ) return false;
		 BancoEdoctaId castOther = ( BancoEdoctaId ) other; 
         
		 return (this.getBecIdBanco()==castOther.getBecIdBanco())
 && (this.getBecIdEdocta()==castOther.getBecIdEdocta());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getBecIdBanco();
         result = 37 * result + this.getBecIdEdocta();
         return result;
   }   


}


