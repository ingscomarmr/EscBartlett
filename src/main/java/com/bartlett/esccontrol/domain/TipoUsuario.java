package com.bartlett.esccontrol.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_usuario")
public class TipoUsuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="tipo_usuario_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("TipoUsuario:{");
		sb.append("id: ").append(id).append(",");
		sb.append("nombre: ").append(nombre).append("}");
		return sb.toString();
	}
}
