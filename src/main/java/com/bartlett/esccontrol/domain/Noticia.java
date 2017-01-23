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
@Table(name = "noticia")
@NamedQueries({
	@NamedQuery(name="findNoticiaById", query="select n from Noticia n where n.noticiaId=:id"),
	@NamedQuery(name="findAllNoticia", query="select n from Noticia n order by n.noticiaId"),
})
public class Noticia implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "noticia_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int noticiaId;
	private String titulo;
	private String contenido;
	@Column(name="fecha_vigencia_inicio")
	private Timestamp fechaVigenciaInicio;
	@Column(name="fecha_vigencia_fin")
	private Timestamp fechaVigenciaFin;
	private short desactivo;
	@ManyToOne
    @JoinColumn(name="usuario_id_mod", referencedColumnName="usuario_id")
	private Usuario usuarioIdMod;
	@Column(name="fecha_modificacion")
	private Timestamp fechaModificacion;
	private short eliminado;
	
	public int getNoticiaId() {
		return noticiaId;
	}
	public void setNoticiaId(int noticiaId) {
		this.noticiaId = noticiaId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Timestamp getFechaVigenciaInicio() {
		return fechaVigenciaInicio;
	}
	public void setFechaVigenciaInicio(Timestamp fechaVigenciaInicio) {
		this.fechaVigenciaInicio = fechaVigenciaInicio;
	}
	public Timestamp getFechaVigenciaFin() {
		return fechaVigenciaFin;
	}
	public void setFechaVigenciaFin(Timestamp fechaVigenciaFin) {
		this.fechaVigenciaFin = fechaVigenciaFin;
	}
	public short getDesactivo() {
		return desactivo;
	}
	public void setDesactivo(short desactivo) {
		this.desactivo = desactivo;
	}
	public Usuario getUsuarioIdMod() {
		return usuarioIdMod;
	}
	public void setUsuarioIdMod(Usuario usuarioIdMod) {
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
	
	public String getStrFechaFin(){
		if(this.fechaVigenciaFin != null){
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String fecha  = dateFormat.format(new Date(this.fechaVigenciaFin.getTime()));
			return fecha;
		}
		return "";
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("Usuario:{");
		sb.append("Id: ").append(noticiaId).append(",");
		sb.append("titulo: ").append(titulo).append(",");
		sb.append("contenido: ").append(contenido).append(",");
		sb.append("feha vigencia inicio: ").append(fechaVigenciaInicio.toString()).append(",");
		sb.append("fecha vigencia fin: ").append(fechaVigenciaFin.toString()).append(",");
		sb.append("desactivo: ").append(desactivo).append(",");
		sb.append("usuario: ").append(usuarioIdMod.getUsuarioId()).append(",");
		sb.append("fecha modificacion: ").append(fechaModificacion.toString()).append(",");
		sb.append("eliminado: ").append(eliminado).append("}");
		return sb.toString();
	}
	
}
