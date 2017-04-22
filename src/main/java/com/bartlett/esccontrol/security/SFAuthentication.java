package com.bartlett.esccontrol.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;

public class SFAuthentication implements Authentication {

	private final Usuario usuario;
	private boolean autenticado;
	public SFAuthentication(Usuario usuario, List<PermisoUsuario> permissoes) {
		this.usuario = usuario;
		this.permissoes = permissoes;
	}
	
	public String getName() {
		return usuario != null ? usuario.getUsuarioName() : null;
	}
	private List<PermisoUsuario> permissoes;
	public Collection<? extends GrantedAuthority> getAuthorities() {		
		return permissoes;
	}

	public Object getCredentials() {
		return usuario != null ? usuario.getUsuarioPwd() : null;
	}

	public Object getDetails() {
		return usuario;
	}

	public Object getPrincipal() {
		return usuario != null ? usuario.getUsuarioName() : null;
	}

	public boolean isAuthenticated() {
		return this.autenticado;
	}

	public void setAuthenticated(boolean isAuthenticated)
			throws IllegalArgumentException {
		this.autenticado = isAuthenticated;
		
	}

}
