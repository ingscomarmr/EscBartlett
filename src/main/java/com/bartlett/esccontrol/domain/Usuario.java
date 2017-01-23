package com.bartlett.esccontrol.domain;

import java.io.Serializable;
import java.sql.Timestamp;

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
import javax.validation.constraints.NotNull;

@Entity
@NamedQueries({
	@NamedQuery(name="findUsuarioById", query="select u from Usuario u where u.usuarioId=:id"),
	@NamedQuery(name="findAllUsuario", query="select u from Usuario u order by u.usuarioId"),
})

@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String uMaster = "ingscomar@gmail.com";
	public static final String pwdMaster = "0marAdmin";

	public Usuario() {}
	
	public Usuario(int usuarioId) {
		super();
		this.usuarioId = usuarioId;
	}
	
	

	@Id
	@Column(name = "usuario_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuarioId;
	@Column(name="email")
	private String usuarioName;
	@Column(name="pwd")
	private String usuarioPwd;
	
	private String nombre;
	@Column(name="apellido_p")
	private String apellidoPaterno;
	@Column(name="apellido_m")
	private String apellidoMaterno;
	private String curp;
	@Column(name="email_alternativo")
	private String emailAlternativo;
	@Column(name="url_img")
	private String urlImg;
	
	@ManyToOne
    @JoinColumn(name="tipo_usuario_id")
	private TipoUsuario tipoUsuario;
	
	@Column(name="usuario_id_mod")
	private Integer usuarioMod;
	
	@NotNull
	@Column(name="fecha_modificacion")
	private Timestamp fechaMod;
	private short eliminado;
	
	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioName() {
		return usuarioName;
	}

	public void setUsuarioName(String usuario_name) {
		this.usuarioName = usuario_name;
	}

	public String getUsuarioPwd() {
		return usuarioPwd;
	}

	public void setUsuarioPwd(String usuario_pwd) {
		this.usuarioPwd = usuario_pwd;
	}
	
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getEmailAlternativo() {
		return emailAlternativo;
	}

	public void setEmailAlternativo(String emailAlternativo) {
		this.emailAlternativo = emailAlternativo;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public int getUsuarioMod() {
		return usuarioMod;
	}

	public void setUsuarioMod(int usuarioMod) {
		this.usuarioMod = usuarioMod;
	}

	public Timestamp getFechaMod() {
		if(fechaMod == null){
			fechaMod = new Timestamp(System.currentTimeMillis());
		}
		return fechaMod;
	}

	public void setFechaMod(Timestamp fechaMod) {
		this.fechaMod = fechaMod;
	}

	public short isEliminado() {
		return eliminado;
	}

	public void setEliminado(short eliminado) {
		this.eliminado = eliminado;
	}

	public String getNombreCompleto(){
		String nombreCompleto = this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno;
		if(nombreCompleto.length() > 22){
			return nombreCompleto.substring(0, 20) + "..";
		}
		return nombreCompleto;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Usuario:{");
		sb.append("Id: ").append(usuarioId).append(",");
		sb.append("usuarioName: ").append(usuarioName).append(",");
		sb.append("usuarioPwd: ").append(this.usuarioPwd).append(",");
		sb.append("tipoUsuario: ").append(tipoUsuario.toString()).append(",");
		sb.append("nombre: ").append(nombre).append(",");
		sb.append("apllido paterno: ").append(apellidoPaterno).append(",");
		sb.append("apellido materno: ").append(apellidoMaterno).append(",");
		sb.append("curp: ").append(curp).append(",");
		sb.append("email alternativo: ").append(emailAlternativo).append(",");
		sb.append("foto perfil: ").append(urlImg).append(",");
		sb.append("usuarioMod: ").append(usuarioMod).append(",");
		sb.append("fechaMod: ").append(fechaMod.toString()).append(",");
		sb.append("eliminado: ").append(eliminado).append("}");
		return sb.toString();
	}
}
