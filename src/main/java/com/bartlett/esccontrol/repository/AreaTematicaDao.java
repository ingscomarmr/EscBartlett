package com.bartlett.esccontrol.repository;

import java.util.List;

import com.bartlett.esccontrol.domain.AreaTematica;

public interface AreaTematicaDao {
	public List<AreaTematica> getAll();

	public AreaTematica save(AreaTematica at);
	
	public void delete(int id);
	
	public AreaTematica findNoticiaById(int id);
	
	public List<AreaTematica> findByNombre(String nombre);
	
	public List<AreaTematica> findByNombre2(String nombre);
}
