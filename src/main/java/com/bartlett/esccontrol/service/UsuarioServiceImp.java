package com.bartlett.esccontrol.service;

import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UsuarioServiceImp implements UsuarioService{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public UsuarioDao usuarioDao;
	

	public void setProductDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
	
	@Override
	public boolean loginUsuario(Usuario u) {
		if(u!=null){
			if(u.getUsuarioName().equals(Usuario.uMaster) && u.getUsuarioPwd().equals(Usuario.pwdMaster)){
				return true;
			}
		}
		return false;
	}


	@Override
	public Usuario getUsuarioById(int id) {
		return this.usuarioDao.findUsuarioById(id);
	}

	@Transactional(readOnly=false)
	@Override
	public void eliminar(int id) {
		usuarioDao.delete(id);
	}

	@Override
	public Usuario guardar(Usuario u) throws Exception {
		return usuarioDao.save(u);
	}

	@Override
	public Usuario getUsuario(String email) {
		return usuarioDao.findByEmail(email);
	}	

	
}
