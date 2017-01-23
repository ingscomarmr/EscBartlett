package com.bartlett.esccontrol.service;

import java.io.Serializable;

import com.bartlett.esccontrol.domain.Usuario;

public interface UsuarioService extends Serializable{
	
	public boolean loginUsuario(Usuario u);	
	
	public Usuario getUsuarioById(int id);
	
	public void eliminar(int id);
	
	public Usuario guardar(Usuario u);

}
