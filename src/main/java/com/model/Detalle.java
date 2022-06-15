package com.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="detalle")
public class Detalle implements Serializable {

   private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_Nomina_detalle;
   private int sueldo_Basico;
   private String dias_Laborados;
   private String horas_Extras;
   
   public Detalle() {
	// TODO Auto-generated constructor stub
}
   
   public Detalle(long id_Nomina_detalle, int sueldo_Basico, String dias_Laborados, String horas_Extras) {
		this.id_Nomina_detalle = id_Nomina_detalle;
		this.sueldo_Basico = sueldo_Basico;
		this.dias_Laborados = dias_Laborados;
		this.horas_Extras = horas_Extras;
	}

public long getId_Nomina_detalle() {
	return id_Nomina_detalle;
}

public void setId_Nomina_detalle(long id_Nomina_detalle) {
	this.id_Nomina_detalle = id_Nomina_detalle;
}

public int getSueldo_Basico() {
	return sueldo_Basico;
}
public void setSueldo_Basico(int sueldo_Basico) {
	this.sueldo_Basico = sueldo_Basico;
}
public String getDias_Laborados() {
	return dias_Laborados;
}
public void setDias_Laborados(String dias_Laborados) {
	this.dias_Laborados = dias_Laborados;
}
public String getHoras_Extras() {
	return horas_Extras;
}
public void setHoras_Extras(String horas_Extras) {
	this.horas_Extras = horas_Extras;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

   

}
