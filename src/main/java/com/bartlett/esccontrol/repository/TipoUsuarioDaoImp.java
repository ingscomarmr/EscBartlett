package com.bartlett.esccontrol.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.TipoUsuario;

@Repository(value = "tipoUsuarioDao")
public class TipoUsuarioDaoImp implements TipoUsuarioDao{

	private EntityManager em = null;

	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	@Override
	public List<TipoUsuario> getAll() {
		// TODO Auto-generated method stub
		return em.createQuery("select t from TipoUsuario t order by t.id ",TipoUsuario.class).getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public void save(TipoUsuario usuario) {
		// TODO Auto-generated method stub
		em.merge(usuario);
	}

	@Override
	public void delete(TipoUsuario usuario) {
		// TODO Auto-generated method stub
		em.remove(usuario);
	}

	@Override
	public TipoUsuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
