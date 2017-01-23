package com.bartlett.esccontrol.repository;

import java.sql.Timestamp;
import java.util.Calendar;
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

import com.bartlett.esccontrol.domain.Evento;
import com.comr.utils.Utils;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
@Repository(value = "eventoDao")
public class EventoDaoImp implements EventoDao{

	protected final Log log = LogFactory.getLog(getClass());
	public static final short EVENTO_ACTIVO = 0;
	
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
	public List<Evento> getAll() {
		return em.createNamedQuery("Evento.finAll", Evento.class).getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public Evento save(Evento e) {
		return em.merge(e);
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(int id) {
		Evento e = em.find(Evento.class, id);
		if(e!=null){
			em.remove(e);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Evento findEventoById(int id) {
		return em.find(Evento.class, id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Evento> findByTitulo(String titulo) {
		return em.createNamedQuery("Evento.findByTitulo", Evento.class)
				.setParameter("titulo_p", Utils.strLikeSql(titulo).toLowerCase()).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Evento> findByFecha(Timestamp fechaEvento) {
		return em.createNamedQuery("Evento.findByFechaEvento", Evento.class)
				.setParameter("fecha_p", fechaEvento).getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Evento> findByAnno(int anno) {
		log.info("#Buscar eventos del año actual:" + anno);
		Calendar c = Calendar.getInstance();
		c.set(anno, 0, 1, 0, 0);
		Timestamp tInicio = new Timestamp(c.getTimeInMillis());
		c = Calendar.getInstance();
		c.add(Calendar.MONTH, 12);
		Timestamp tFin = new Timestamp(c.getTimeInMillis());
		
		log.info("Fecha inicio:" + tInicio.toString() + " Fecha fin:" + tFin.toString());
		
		return em.createNamedQuery("Evento.findByAnnoActual", Evento.class)
				.setParameter("fecha_i", tInicio).setParameter("fecha_f", tFin).getResultList();
	}

}
