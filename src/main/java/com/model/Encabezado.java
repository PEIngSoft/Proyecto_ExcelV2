package com.model;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="encabezado")
public class Encabezado implements Serializable {

   private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_Nomina;
   private long id_Usuariof;
   private long id_Tipo;
   private long liquidacion;
   private Date fecha_Sancion;
   private long tipo_Acto;
   private long id_Detallef;
   private long id_Dinamicaf;
   

public Encabezado() {
	// TODO Auto-generated constructor stub
}

public Encabezado(Long id_Nomina, Long id_Usuariof, Long id_Tipo, Long liquidacion, Date fecha_Sancion, Long tipo_Acto,
		Long id_Detallef, Long id_Dinamicaf) {
	this.id_Nomina = id_Nomina;
	this.id_Usuariof = id_Usuariof;
	this.id_Tipo = id_Tipo;
	this.liquidacion = liquidacion;
	this.fecha_Sancion = fecha_Sancion;
	this.tipo_Acto = tipo_Acto;
	this.id_Detallef = id_Detallef;
	this.id_Dinamicaf = id_Dinamicaf;
}

public Long getId_Nomina() {
	return id_Nomina;
}

public void setId_Nomina(Long id_Nomina) {
	this.id_Nomina = id_Nomina;
}

public Long getId_Usuariof() {
	return id_Usuariof;
}

public void setId_Usuariof(Long id_Usuariof) {
	this.id_Usuariof = id_Usuariof;
}

public Long getId_Tipo() {
	return id_Tipo;
}

public void setId_Tipo(Long id_Tipo) {
	this.id_Tipo = id_Tipo;
}

public Long getLiquidacion() {
	return liquidacion;
}

public void setLiquidacion(Long liquidacion) {
	this.liquidacion = liquidacion;
}

public Date getFecha_Sancion() {
	return fecha_Sancion;
}

public void setFecha_Sancion(Date fecha_Sancion) {
	this.fecha_Sancion = fecha_Sancion;
}

public Long getTipo_Acto() {
	return tipo_Acto;
}

public void setTipo_Acto(Long tipo_Acto) {
	this.tipo_Acto = tipo_Acto;
}

public Long getId_Detallef() {
	return id_Detallef;
}

public void setId_Detallef(Long id_Detallef) {
	this.id_Detallef = id_Detallef;
}

public Long getId_Dinamicaf() {
	return id_Dinamicaf;
}

public void setId_Dinamicaf(Long id_Dinamicaf) {
	this.id_Dinamicaf = id_Dinamicaf;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
}
