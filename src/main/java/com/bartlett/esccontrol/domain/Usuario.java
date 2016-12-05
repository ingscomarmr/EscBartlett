package com.bartlett.esccontrol.domain;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String uMaster="omar_mr";
	public static final String pwdMaster="0mAr_3R";
	
	private int usuarioId;
	private String usuarioName;
	private String usuarioPwd;
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Usuario:{");
		sb.append("Id: ").append(usuarioId).append(",");
		sb.append("usuarioName: ").append(usuarioName).append(",");
		sb.append("usuarioPwd: ").append(usuarioPwd).append("}");
        
        return sb.toString();
    }
}
