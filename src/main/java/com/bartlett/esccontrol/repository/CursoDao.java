package com.bartlett.esccontrol.repository;

import java.util.List;

import com.bartlett.esccontrol.domain.Curso;


public interface CursoDao {
	public List<Curso> getAll();

	public Curso save(Curso c);
	
	public void delete(int id);
	
	public Curso findCursoById(int id);

	public List<Curso> getAllActivos();
	
	public List<Curso> findByAsignatura(String asignatura);
	
	public List<Curso> findByAsignaturaActivas(String asignatura);
}
