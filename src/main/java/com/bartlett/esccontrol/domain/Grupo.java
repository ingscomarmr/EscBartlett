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
@Table(name = "grupo")
@NamedQueries({
		@NamedQuery(name = "Grupo.findByNombre", query = "SELECT g FROM Grupo g WHERE g.eliminado=:eliminado_p AND (:nombre_p = '' OR LOWER(g.nombre) LIKE :nombre_p)") })
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "grupo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int grupoId;
	private String nombre;
	@Column(name = "usuario_id_mod")
	private int usuarioIdMod;
	@Column(name = "fecha_modificacion")
	private Timestamp fechaModificacion;
	private short eliminado;

	public Grupo() {
	}

	public Grupo(int grupoId) {
		super();
		this.grupoId = grupoId;
	}

	public int getGrupoId() {
		return grupoId;
	}

	public void setGrupoId(int grupoId) {
		this.grupoId = grupoId;
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
		StringBuilder sb = new StringBuilder("Grupo:{");
		sb.append("Id: ").append(grupoId).append(",");
		sb.append("nombre: ").append(nombre).append("}");
		/*
		 * sb.append("usuario: ").append(usuarioIdMod).append(","); sb.append(
		 * "fecha modificacion: "
		 * ).append(fechaModificacion.toString()).append(","); sb.append(
		 * "eliminado: ").append(eliminado).append("}");
		 */
		return sb.toString();
	}
}
