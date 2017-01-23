package com.bartlett.esccontrol.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
@NamedQueries({ @NamedQuery(name = "Evento.finAll", query = "SELECT e FROM Evento e WHERE e.eliminado=0"),
		@NamedQuery(name = "Evento.findByTitulo", query = "SELECT e FROM Evento e WHERE e.eliminado=0 AND (:titulo_p = '' OR LOWER(e.titulo) LIKE :titulo_p) "),
		@NamedQuery(name = "Evento.findByFechaEvento", query = "SELECT e FROM Evento e WHERE e.eliminado=0 AND e.fechaEvento=:fecha_p"),
		@NamedQuery(name = "Evento.findByAnnoActual", query = "SELECT e FROM Evento e WHERE e.eliminado=0 AND e.fechaEvento BETWEEN :fecha_i AND :fecha_f")})

public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "evento_id")
	private int eventoId;
	private String titulo;
	private String mensaje;
	@Column(name = "fecha_evento")
	private Timestamp fechaEvento;
	@Column(name = "usuario_id_mod")
	private int usuarioIdMod;
	@Column(name = "fecha_modificacion")
	private Timestamp fechaMod;
	private short eliminado;

	public int getEventoId() {
		return eventoId;
	}

	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Timestamp getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Timestamp fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public int getUsuarioIdMod() {
		return usuarioIdMod;
	}

	public void setUsuarioIdMod(int usuarioIdMod) {
		this.usuarioIdMod = usuarioIdMod;
	}

	public Timestamp getFechaMod() {
		return fechaMod;
	}

	public void setFechaMod(Timestamp fechaMod) {
		this.fechaMod = fechaMod;
	}

	public short getEliminado() {
		return eliminado;
	}

	public void setEliminado(short eliminado) {
		this.eliminado = eliminado;
	}

	@Override
	public String toString() {
		return "Evento [eventoId=" + eventoId + ", titulo=" + titulo + ", mensaje=" + mensaje + ", fechaEvento="
				+ fechaEvento + ", usuarioIdMod=" + usuarioIdMod + ", fechaMod=" + fechaMod + ", eliminado=" + eliminado
				+ "]";
	}

}
