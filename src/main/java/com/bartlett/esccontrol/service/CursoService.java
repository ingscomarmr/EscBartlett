package com.bartlett.esccontrol.service;

import java.util.List;

import com.bartlett.esccontrol.BeanModel.CursosHome;
import com.bartlett.esccontrol.domain.Curso;


public interface CursoService {
	public List<Curso> buscaTodas();
	public Curso guarda(Curso c);
	public void elimina(int n);
	public Curso buscaPorId(int id);
	public List<Curso>  buscaPorAsignatura(String asignatura);
	public List<Curso> buscaCursoActivoPorAsignatura(String asignatura);
	public List<CursosHome> getCursosHomeCtrl();
}
