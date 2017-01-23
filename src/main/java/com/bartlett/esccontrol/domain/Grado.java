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
@Table(name = "grado")
@NamedQueries({
		@NamedQuery(name = "Grado.findByNombre", query = "SELECT g FROM Grado g WHERE g.eliminado=:eliminado_p AND (:nombre_p = '' OR LOWER(g.nombre) LIKE :nombre_p)") })
public class Grado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "grado_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gradoId;
	private String nombre;
	@Column(name = "usuario_id_mod")
	private int usuarioIdMod;
	@Column(name = "fecha_modificacion")
	private Timestamp fechaModificacion;
	private short eliminado;

	public Grado(){}
	
	public Grado(int gradoId) {
		super();
		this.gradoId = gradoId;
	}

	public int getGradoId() {
		return gradoId;
	}

	public void setGradoId(int gradoId) {
		this.gradoId = gradoId;
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
		StringBuilder sb = new StringBuilder("Grado:{");
		sb.append("Id: ").append(gradoId).append(",");
		sb.append("nombre: ").append(nombre).append("}");
		/*
		 * sb.append("usuario: ").append(usuarioIdMod).append(","); sb.append(
		 * "fecha modificacion: "
		 * ).append(fechaModificacion.toString()).append(","); sb.append(
		 * "eliminado: ").append(eliminado).append("");
		 */
		return sb.toString();
	}
}
