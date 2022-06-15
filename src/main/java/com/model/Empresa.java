package com.model;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="empresa")
public class Empresa implements Serializable {

   private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long nit_Empresa;
   private String nombre_Empresa;
   private String direccion_Empresa;
   private String telefono_Empresa;
   private long id_Nomina_nomina;
   

public Empresa() {
	// TODO Auto-generated constructor stub
}


public Empresa(Long nit_Empresa, String nombre_Empresa, String direccion_Empresa, String telefono_Empresa,
		Long id_Nomina_nomina) {
	super();
	this.nit_Empresa = nit_Empresa;
	this.nombre_Empresa = nombre_Empresa;
	this.direccion_Empresa = direccion_Empresa;
	this.telefono_Empresa = telefono_Empresa;
	this.id_Nomina_nomina = id_Nomina_nomina;
}


public Long getNit_Empresa() {
	return nit_Empresa;
}


public void setNit_Empresa(Long nit_Empresa) {
	this.nit_Empresa = nit_Empresa;
}


public String getNombre_Empresa() {
	return nombre_Empresa;
}


public void setNombre_Empresa(String nombre_Empresa) {
	this.nombre_Empresa = nombre_Empresa;
}


public String getDireccion_Empresa() {
	return direccion_Empresa;
}


public void setDireccion_Empresa(String direccion_Empresa) {
	this.direccion_Empresa = direccion_Empresa;
}


public String getTelefono_Empresa() {
	return telefono_Empresa;
}


public void setTelefono_Empresa(String telefono_Empresa) {
	this.telefono_Empresa = telefono_Empresa;
}


public Long getId_Nomina_nomina() {
	return id_Nomina_nomina;
}


public void setId_Nomina_nomina(Long id_Nomina_nomina) {
	this.id_Nomina_nomina = id_Nomina_nomina;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}

}