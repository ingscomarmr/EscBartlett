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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@NamedQueries({
	@NamedQuery(name="findUsuarioById", query="select u from Usuario u where u.usuarioId=:id"),
	@NamedQuery(name="findAllUsuario", query="select u from Usuario u order by u.usuarioId"),
	@NamedQuery(name="findByEmail", query="select u from Usuario u where u.usuarioName=:email"),
})

@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int ID_ADMIN = 1;
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
	
	//valor solo informativo usado para los RequestBody del controller
	@Transient
	private int tipoUsuarioId;
	
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
		if(this.tipoUsuario == null){
			if(this.tipoUsuarioId > 0)
				this.tipoUsuario = new TipoUsuario(this.tipoUsuarioId);
		}
		return tipoUsuario;
	}
	
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}		

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		System.out.println("# setNombre");
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
		System.out.println("# setApellidoMaterno");
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
		//System.out.println("# getUrlImg");
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

	
	@Transient
	public void setTipoUsuarioId(int tipoUsuarioId){
		this.tipoUsuarioId = tipoUsuarioId;
		this.tipoUsuario = new TipoUsuario(tipoUsuarioId);
	}
	
	@Transient
	public int getTipoUsuarioId(){		
		return tipoUsuarioId;
	}
	
	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", usuarioName=" + usuarioName + ", usuarioPwd=" + usuarioPwd
				+ ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", curp=" + curp + ", emailAlternativo=" + emailAlternativo + ", urlImg=" + urlImg + ", tipoUsuario="
				+ tipoUsuario + ", usuarioMod=" + usuarioMod + ", fechaMod=" + fechaMod + ", eliminado=" + eliminado
				+ ", tipoUsuarioId=" + tipoUsuarioId + "]";
	}

}
