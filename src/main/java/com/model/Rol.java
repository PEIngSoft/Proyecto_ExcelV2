package com.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="rol")
public class Rol implements Serializable {

   private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_Rol;
   private String descripicion;
   
  
    public Rol() {
		// TODO Auto-generated constructor stub
	}
    
 public Rol(long id_Rol, String descripicion) {
	super();
	this.id_Rol = id_Rol;
	this.descripicion = descripicion;
}







public long getId_Rol() {
	return id_Rol;
}



public void setId_Rol(long id_Rol) {
	this.id_Rol = id_Rol;
}



public String getDescripicion() {
	return descripicion;
}



public void setDescripicion(String descripicion) {
	this.descripicion = descripicion;
}



public static long getSerialversionuid() {
	return serialVersionUID;
}




}