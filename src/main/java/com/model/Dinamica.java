package com.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="dinamica")
public class Dinamica implements Serializable {

   private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_Nomina_dinamica;
   private String concepto_Pago;
   private String detalles;
   private String devengo;
   
 public Dinamica() {
	// TODO Auto-generated constructor stub
}
 
public Dinamica(long id_Nomina_dinamica, String concepto_Pago, String detalles, String devengo) {
	super();
	this.id_Nomina_dinamica = id_Nomina_dinamica;
	this.concepto_Pago = concepto_Pago;
	this.detalles = detalles;
	this.devengo = devengo;
}


public long getId_Nomina_dinamica() {
	return id_Nomina_dinamica;
}


public void setId_Nomina_dinamica(long id_Nomina_dinamica) {
	this.id_Nomina_dinamica = id_Nomina_dinamica;
}


public String getConcepto_Pago() {
	return concepto_Pago;
}


public void setConcepto_Pago(String concepto_Pago) {
	this.concepto_Pago = concepto_Pago;
}


public String getDetalles() {
	return detalles;
}


public void setDetalles(String detalles) {
	this.detalles = detalles;
}


public String getDevengo() {
	return devengo;
}


public void setDevengo(String devengo) {
	this.devengo = devengo;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


}
