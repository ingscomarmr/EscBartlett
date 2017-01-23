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
@Table(name = "curso")
@NamedQueries({ @NamedQuery(name = "Curso.finAll", query = "SELECT c FROM Curso c WHERE c.eliminado=0"),
		@NamedQuery(name = "Curso.finAllActivos", query = "SELECT c FROM Curso c WHERE c.eliminado=0 AND c.desactivo=0"),
		@NamedQuery(name = "Curso.findByAsignaturaActivos", query = "SELECT c FROM Curso c WHERE c.eliminado=0 AND c.desactivo=0 AND (:asignatura_p = '' OR LOWER(c.asignatura) LIKE :asignatura_p)"),
		@NamedQuery(name = "Curso.findByAsignatura", query = "SELECT c FROM Curso c WHERE c.eliminado=0 AND (:asignatura_p = '' OR LOWER(c.asignatura) LIKE :asignatura_p)") })

public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "curso_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cursoId;
	private String asignatura;
	private short desactivo;

	@ManyToOne
	@JoinColumn(name = "profesor_id", referencedColumnName = "usuario_id")
	private Usuario profesor;

	@ManyToOne
	@JoinColumn(name = "area_tematica_id")
	private AreaTematica areaTematica;

	@ManyToOne
	@JoinColumn(name = "grado_id")
	private Grado grado;

	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;

	@Column(name = "usuario_id_mod")
	private int usuarioIdMod;
	@Column(name = "fecha_modificacion")
	private Timestamp fechaModificacion;
	private short eliminado;

	public int getCursoId() {
		return cursoId;
	}

	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public short getDesactivo() {
		return desactivo;
	}

	public void setDesactivo(short desactivo) {
		this.desactivo = desactivo;
	}

	public Usuario getProfesor() {
		return profesor;
	}

	public void setProfesor(Usuario profesor) {
		this.profesor = profesor;
	}

	public AreaTematica getAreaTematica() {
		return areaTematica;
	}

	public void setAreaTematica(AreaTematica areaTematica) {
		this.areaTematica = areaTematica;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
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
		StringBuilder sb = new StringBuilder("Curso:{");
		sb.append("Id: ").append(cursoId).append(",");
		sb.append("asignatura: ").append(asignatura).append(",");
		sb.append("grado: ").append((grado != null ? grado.getGradoId() : "")).append(",");
		sb.append("grupo: ").append((grupo != null ? grupo.getGrupoId() : "")).append(",");
		sb.append("profesor: ").append((profesor != null ? profesor.getUsuarioId() : "")).append(",");
		sb.append("desactivo: ").append(desactivo).append(",");
		sb.append("usuarioIdMod: ").append(usuarioIdMod).append(",");
		sb.append("fecha modificacion: ").append(fechaModificacion.toString()).append(",");
		sb.append("eliminado: ").append(eliminado).append("}");
		return sb.toString();
	}
}
