package com.bartlett.esccontrol.service;

import java.io.Serializable;
import java.util.List;

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;

public interface PermisoUsuarioService extends Serializable {
	public List<PermisoUsuario> buscarPermisos(Usuario usuario);	
	public PermisoUsuario guardar(String role, Usuario usuario);
}
