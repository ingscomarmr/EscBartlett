package com.bartlett.esccontrol.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.domain.Usuario;;

@Service
@Transactional
@Repository(value = "usuarioDao")
public class UsuarioDaoImp implements UsuarioDao {

	
	@PersistenceContext
    protected EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	public EntityManager getEntityManager(){
		return em;
	}

	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("findAllUsuario", Usuario.class).getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return (Usuario) em.merge(usuario);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void delete(int id) {
		Usuario u = findUsuarioById(id);
		if(u != null){
			em.remove(u);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Usuario findUsuarioById(int id) {
		// TODO Auto-generated method stub
		return em.find(Usuario.class, id);
	}

}
