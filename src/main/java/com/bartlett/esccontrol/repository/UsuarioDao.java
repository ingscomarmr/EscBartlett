package com.bartlett.esccontrol.repository;

import java.util.List;
import com.bartlett.esccontrol.domain.Usuario;

public interface UsuarioDao {

	public List<Usuario> getAll();

	public Usuario save(Usuario usuario) throws Exception;
	
	public void delete(int  id);
	
	public Usuario findUsuarioById(int id);
	
	public Usuario findByEmail(String email);
}
