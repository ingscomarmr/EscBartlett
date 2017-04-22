package com.bartlett.esccontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.PermisoUsuarioDao;

@Component
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class PermisoUsuarioServiceImp implements PermisoUsuarioService{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	public PermisoUsuarioDao permisoUsuarioDao;
	
	public void setPermisoUsuarioDao(PermisoUsuarioDao permisoUsuarioDao){
		this.permisoUsuarioDao = permisoUsuarioDao;
	}
	
	@Override
	public List<PermisoUsuario> buscarPermisos(Usuario usuario) {		
		return permisoUsuarioDao.getPermisoUsuario(usuario);
	}

	@Override
	public PermisoUsuario guardar(String role, Usuario usuario) {
		return permisoUsuarioDao.addRole(role, usuario);
	}

}
