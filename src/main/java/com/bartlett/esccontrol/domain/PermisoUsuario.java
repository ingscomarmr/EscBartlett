package com.bartlett.esccontrol.domain;

import java.io.Serializable;

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

import org.springframework.security.core.GrantedAuthority;

//GrantedAuthority
@Entity
@Table(name="permiso_usuario")
@NamedQueries({
	@NamedQuery(name="PermisoUsuario.findPermisosByUsuario", query="select pu from PermisoUsuario pu where pu.usuario =:usuario")
})
public class PermisoUsuario  implements Serializable, GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "permiso_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	protected int permisoId;	
	@Column(name="role", nullable=false, length=100)
	private String role;
	@ManyToOne 
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	public int getPermisoId() {return permisoId;}
	public void setPermisoId(int permisoId) {this.permisoId = permisoId;}
	
	public String getRole() {return role;}
	public void setRole(String role) {this.role = role;}
	
	public Usuario getUsuario() {return usuario;}
	public void setUsuario(Usuario usr) {usuario = usr;}
	
	public String getAuthority() {
		return role;
	}
	
	@Override
	public String toString() {
		return "PermisoUsuario [permisoId=" + permisoId + ", role=" + role + ", usuario=" + usuario + "]";
	}
	
	
}
