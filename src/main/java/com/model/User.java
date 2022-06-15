package com.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario")
public class User implements Serializable {

   private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_Usuario;
   private String nombre;
   private String documento;
   private String telefono;
   private String direccion;
   private String correo;
   private String contrasena;
   private long id_Rolf;
    
 public User() {
	// TODO Auto-generated constructor stub
}


public User(long id_Usuario, String nombre, String documento, String telefono, String direccion, String correo,
		String contrasena, Long id_Rolf) {
	this.id_Usuario = id_Usuario;
	this.nombre = nombre;
	this.documento = documento;
	this.telefono = telefono;
	this.direccion = direccion;
	this.correo = correo;
	this.contrasena = contrasena;
	this.id_Rolf = id_Rolf;
}


public long getId_Usuario() {
	return id_Usuario;
}


public void setId_Usuario(long id_Usuario) {
	this.id_Usuario = id_Usuario;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDocumento() {
	return documento;
}


public void setDocumento(String documento) {
	this.documento = documento;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public String getContrasena() {
	return contrasena;
}


public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}


public long getId_Rolf() {
	return id_Rolf;
}


public void setId_Rolf(long id_Rolf) {
	this.id_Rolf = id_Rolf;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


}
