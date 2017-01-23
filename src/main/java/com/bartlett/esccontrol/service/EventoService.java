package com.bartlett.esccontrol.service;

import java.sql.Timestamp;
import java.util.List;

import com.bartlett.esccontrol.BeanModel.EventoHome;
import com.bartlett.esccontrol.domain.Evento;

public interface EventoService {
	public List<Evento> obtenerTodos();

	public Evento guardar(Evento e);
	
	public void eliminar(int id);
	
	public Evento buscarPorId(int id);

	public List<Evento> buscarPorTitulo(String titulo);
	
	public List<Evento> buscarPorFecha(Timestamp fechaEvento);
	
	public List<EventoHome> obtenerEventos();
}
