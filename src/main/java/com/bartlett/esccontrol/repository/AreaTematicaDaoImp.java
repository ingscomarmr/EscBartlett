package com.bartlett.esccontrol.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.AreaTematica;
import com.comr.utils.Utils;
import com.bartlett.esccontrol.domain.AreaTematica;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
@Repository(value = "areaTematicaDao")
public class AreaTematicaDaoImp implements AreaTematicaDao {

	protected final Log log = LogFactory.getLog(getClass());
	public static final short AREA_TEMATICA_ACTIVA = 0;

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
    @SuppressWarnings("unchecked")
	@Override
	public List<AreaTematica> getAll() {
		List<AreaTematica> areaTematicaList = new ArrayList<AreaTematica>();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder(); // creador del query
			CriteriaQuery<AreaTematica> q2 = cb.createQuery(AreaTematica.class); 
			Root<AreaTematica> users = q2.from(AreaTematica.class); // tabla de
			q2.select(users);
			areaTematicaList = em.createQuery(q2).getResultList();

		} catch (Exception e) {
			log.error("Error al consultar las AreaTematicas activas", e);
		}
		return areaTematicaList;
	}

	@Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
	@Override
	public AreaTematica save(AreaTematica at) {
		return em.merge(at);
	}

	@Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
	@Override
	public void delete(int id) {
		try {

			AreaTematica at = em.find(AreaTematica.class, id);
			if (at != null) {
				log.info("Eliminar area tematica:" + at.toString());
				em.remove(at);
			}

		} catch (Exception e) {
			log.error(e);
			throw e; // or display error message
		}
	}

	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	@Override
	public List<AreaTematica> findByNombre2(String nombre) {
		long timeStar = System.currentTimeMillis();
		log.info("#### inicia findByNombre2 " + timeStar);
		List<AreaTematica> atList = em.createNamedQuery("AreaTematica.findByNombre", AreaTematica.class)
				.setParameter("nombre_p", Utils.strLikeSql(nombre).toLowerCase())
				.setParameter("eliminado_p", this.AREA_TEMATICA_ACTIVA).getResultList();
		timeStar = System.currentTimeMillis() - timeStar;
		log.info("#### termina findByNombre2 " + timeStar);
		
		return atList;
		
	}
	
	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	@Override
	public List<AreaTematica> findByNombre(String nombre) {
		long timeStar = System.currentTimeMillis();
		log.info("#### inicia findByNombre " + timeStar);
		List<AreaTematica> atList = new ArrayList<AreaTematica>();
		try{
			CriteriaBuilder cb = em.getCriteriaBuilder(); //creador del query
			CriteriaQuery<AreaTematica> q2 = cb.createQuery(AreaTematica.class); //tipo del query
			Root<AreaTematica> areaT = q2.from(AreaTematica.class); //tabla de donde viene
			
			List<Predicate> condiciones = new ArrayList<Predicate>();
			Predicate c = cb.equal(areaT.get("eliminado"),this.AREA_TEMATICA_ACTIVA);
			condiciones.add(c);
			if(!Utils.isNullOrEmpty(nombre)){
				Predicate condition = cb.like(areaT.get("nombre"),nombre);
				condiciones.add(condition);
			}
			q2.select(areaT).where(condiciones.toArray(new Predicate[]{}));
			atList = em.createQuery(q2).getResultList();
		}catch(Exception e){
			log.error("Error al consultar las AreaTematicas activas",e);
		}
		timeStar = System.currentTimeMillis() - timeStar;
		log.info("#### termina findByNombre " + timeStar);
		return atList;
	}

	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	@Override
	public AreaTematica findNoticiaById(int id) {
		AreaTematica at = em.find(AreaTematica.class, id);
		if(at != null && at.getEliminado() == this.AREA_TEMATICA_ACTIVA){
			return at;
		}
		return null;
	}

}
