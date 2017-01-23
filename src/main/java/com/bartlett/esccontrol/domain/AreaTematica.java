package com.bartlett.esccontrol.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "area_tematica")
@NamedQueries({
	@NamedQuery(name="AreaTematica.findByNombre", 
				query="SELECT a FROM AreaTematica a WHERE a.eliminado=:eliminado_p AND (:nombre_p = '' OR LOWER(a.nombre) LIKE :nombre_p)"
				)
})
public class AreaTematica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "area_tematica_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int areaTematicaId;
	private String nombre;
	@Column(name = "usuario_id_mod")
	private int usuarioIdMod;
	@Column(name = "fecha_modificacion")
	private Timestamp fechaModificacion;
	private short eliminado;

	public AreaTematica(){}
	
	public AreaTematica(int areaTematicaId) {
		super();
		this.areaTematicaId = areaTematicaId;
	}

	public int getAreaTematicaId() {
		return areaTematicaId;
	}

	public void setAreaTematicaId(int areaTematicaId) {
		this.areaTematicaId = areaTematicaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUsuarioIdMod() {
		return usuarioIdMod;
	}

	public void setUsuarioIdMod(int usuarioIdMod) {
		this.usuarioIdMod = usuarioIdMod;
	}

	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public short getEliminado() {
		return eliminado;
	}

	public void setEliminado(short eliminado) {
		this.eliminado = eliminado;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("AreaTematica:{");
		sb.append("Id: ").append(areaTematicaId).append(",");
		sb.append("nombre: ").append(nombre).append("}");/*
		sb.append("usuario: ").append(usuarioIdMod).append(",");
		sb.append("fecha modificacion: ").append(fechaModificacion.toString()).append(",");
		sb.append("eliminado: ").append(eliminado).append("}");*/
		return sb.toString();
	}

	
}
