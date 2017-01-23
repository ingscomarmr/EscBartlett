package com.bartlett.esccontrol.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.Curso;
import com.comr.utils.Utils;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
@Repository(value = "cursoDao")
public class CursoDaoImp implements CursoDao {

	protected final Log log = LogFactory.getLog(getClass());
	public static final short CURSO_ACTIVO = 0;

	@PersistenceContext
	protected EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEntityManager() {
		return em;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Curso> getAll() {
		return em.createNamedQuery("Curso.finAll", Curso.class).getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public Curso save(Curso c) {
		return em.merge(c);
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(int id) {
		try {

			Curso c = em.find(Curso.class, id);
			if (c != null) {
				log.info("Eliminar curso:" + c.toString());
				em.remove(c);
			}
		} catch (Exception e) {
			log.error(e);
			throw e; // or display error message
		}

	}

	@Transactional(readOnly = true)
	@Override
	public Curso findCursoById(int id) {
		return em.find(Curso.class, id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Curso> findByAsignatura(String asignatura) {
		return em.createNamedQuery("Curso.findByAsignatura", Curso.class)
				.setParameter("asignatura_p", Utils.strLikeSql(asignatura).toLowerCase()).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Curso> findByAsignaturaActivas(String asignatura) {
		// TODO Auto-generated method stub 
		return em.createNamedQuery("Curso.findByAsignaturaActivos", Curso.class)
				.setParameter("asignatura_p", Utils.strLikeSql(asignatura).toLowerCase()).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Curso> getAllActivos() {
		// TODO Auto-generated method stub 
		return em.createNamedQuery("Curso.finAllActivos", Curso.class).getResultList();
	}
}
