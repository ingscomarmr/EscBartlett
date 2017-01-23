package com.bartlett.esccontrol.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.BeanModel.EventoHome;
import com.bartlett.esccontrol.domain.Evento;
import com.bartlett.esccontrol.repository.EventoDao;

@Component
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class EventoServiceImp implements EventoService {
	private static final long serialVersionUID = 1L;

	@Autowired
	private EventoDao eventoDao;

	public void setEventoDao(EventoDao eventoDao) {
		this.eventoDao = eventoDao;
	}

	@Override
	public List<Evento> obtenerTodos() {
		return eventoDao.getAll();
	}

	@Override
	public Evento guardar(Evento e) {
		return eventoDao.save(e);
	}

	@Override
	public void eliminar(int id) {
		eventoDao.delete(id);
	}

	@Override
	public Evento buscarPorId(int id) {
		return eventoDao.findEventoById(id);
	}

	@Override
	public List<Evento> buscarPorTitulo(String titulo) {
		return eventoDao.findByTitulo(titulo);
	}

	@Override
	public List<Evento> buscarPorFecha(Timestamp fechaEvento) {
		if(fechaEvento == null)
			fechaEvento = new Timestamp(System.currentTimeMillis());
		return eventoDao.findByFecha(fechaEvento);
	}

	@Override
	public List<EventoHome> obtenerEventos() {
		List<EventoHome> eList = new ArrayList<EventoHome>();
		Calendar c = Calendar.getInstance();
		int anno = c.get(Calendar.YEAR);
		List<Evento> eventos = eventoDao.findByAnno(anno);
		for (Evento e : eventos) {
			eList.add(new EventoHome(e));
		}
		return eList;
	}

}
