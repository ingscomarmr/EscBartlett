package com.bartlett.esccontrol.repository;

import java.sql.Timestamp;
import java.util.List;

import com.bartlett.esccontrol.domain.Evento;;

public interface EventoDao {
	public List<Evento> getAll();

	public Evento save(Evento e);
	
	public void delete(int id);
	
	public Evento findEventoById(int id);

	public List<Evento> findByTitulo(String titulo);
	
	public List<Evento> findByFecha(Timestamp fechaEvento);
	
	public List<Evento> findByAnno(int anno);
}
