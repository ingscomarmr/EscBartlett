package com.bartlett.esccontrol.repository;

import java.util.List;

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;


public interface PermisoUsuarioDao {
	public List<PermisoUsuario> getPermisoUsuario(Usuario usuario);	
	public PermisoUsuario addRole(String role, Usuario usuario);	
}
