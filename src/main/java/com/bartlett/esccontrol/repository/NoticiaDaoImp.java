package com.bartlett.esccontrol.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.tree.AbstractEntity;
import org.hibernate.loader.criteria.CriteriaLoader;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Predicate;
import com.bartlett.esccontrol.domain.Noticia;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
@Repository(value = "noticiaDao")
public class NoticiaDaoImp implements NoticiaDao{

	protected final Log log = LogFactory.getLog(getClass());
	public static final int NOTICIAS_ACTIVAS = 0;
	
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
	public List<Noticia> getAll() {
		return em.createNamedQuery("findAllNoticia", Noticia.class).getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public Noticia save(Noticia n) {
		// TODO Auto-generated method stub
		return (Noticia) em.merge(n);
	}

	@Transactional(readOnly=false)
	@Override
	public void delete(int id) {
		
		try {
			
		    Noticia n = em.find(Noticia.class, id);
		    if(n!=null){
		    	log.info("Eliminar noticia:" + n.toString());
		    	 em.remove(n);
		    }
		   
		    /*log.info("Eliminar noticia:" + n.toString());
			if(n != null){
				CriteriaBuilder cb = this.em.getCriteriaBuilder();
				  
				  // create delete
				  CriteriaDelete<Noticia> delete = cb.
				     createCriteriaDelete(Noticia.class);
				  
				  // set the root class
				  Root e = delete.from(Noticia.class);
				  
				  // set where clause
				  delete.where(cb.lessThanOrEqualTo(e.get("noticiaId"), id));
				  
				  // perform update
				  this.em.createQuery(delete).executeUpdate();
			}*/
			
		}
		catch (Exception e) {
		    log.error(e);
		    throw e; // or display error message
		}
		
	}

	@Transactional(readOnly = true)
	@Override
	public Noticia findNoticiaById(int id) {
		return em.find(Noticia.class, id);
	}

	@Transactional(readOnly = true)
	@Override
	public Noticia findByTitulo(String titulo){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Noticia> q2 = cb.createQuery(Noticia.class);
		Root<Noticia> users = q2.from(Noticia.class);
		Predicate condition = cb.like(users.get("titulo"),titulo);
		q2.select(users).where(condition);
		List<Noticia> l = em.createQuery(q2).getResultList();
		if(l != null && l.size() > 0)
			return l.get(0);
		
		return null;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Noticia> findByTituloActivas(String titulo) {
		List<Noticia> noticias = new ArrayList<Noticia>();
		try{
			CriteriaBuilder cb = em.getCriteriaBuilder(); //creador del query
			CriteriaQuery<Noticia> q2 = cb.createQuery(Noticia.class); //tipo del query
			Root<Noticia> users = q2.from(Noticia.class); //tabla de donde viene
			
			List<Predicate> condiciones = new ArrayList<Predicate>();
			Predicate c = cb.equal(users.get("desactivo"),this.NOTICIAS_ACTIVAS);
			Predicate c2 = cb.equal(users.get("eliminado"),this.NOTICIAS_ACTIVAS);
			condiciones.add(c);
			condiciones.add(c2);
			if(titulo != null && !titulo.isEmpty()){
				Predicate condition = cb.like(users.get("titulo"),titulo);
				condiciones.add(condition);
			}
			q2.select(users).where(condiciones.toArray(new Predicate[]{}));
			noticias = em.createQuery(q2).getResultList();
			
		}catch(Exception e){
			log.error("Error al consultar las noticias activas",e);
		}
		return noticias;
	}
	
	
}
