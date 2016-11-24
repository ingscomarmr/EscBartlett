package com.bartlett.esccontrol.service;

import java.io.Serializable;
import java.util.List;

import com.bartlett.esccontrol.domain.Usuario;

public interface IUsuarioService extends Serializable{
	
	public boolean loginUsuario(Usuario u);
	
	public List<Usuario> getUsuarioList();
}
