package com.bartlett.esccontrol.service;

import com.bartlett.esccontrol.domain.Usuario;

public class UsuarioServiceImp implements IUsuarioService{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean loginUsuario(Usuario u) {
		if(u!=null){
			if(u.getUsuarioName().equals(Usuario.uMaster) && u.getUsuarioPwd().equals(Usuario.pwdMaster)){
				return true;
			}
		}
		return false;
	}	

}
