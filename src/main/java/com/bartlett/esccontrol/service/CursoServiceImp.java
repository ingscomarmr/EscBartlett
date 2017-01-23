package com.bartlett.esccontrol.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.BeanModel.CursosHome;
import com.bartlett.esccontrol.domain.Curso;
import com.bartlett.esccontrol.repository.CursoDao;

@Component
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class CursoServiceImp implements CursoService {
	private static final long serialVersionUID = 1L;

	@Autowired
	CursoDao cursoDao;

	public void setCursoDao(CursoDao cursoDao) {
		this.cursoDao = cursoDao;
	}

	@Override
	public List<Curso> buscaTodas() {
		return cursoDao.getAll();
	}

	@Override
	public Curso guarda(Curso c) {
		return cursoDao.save(c);
	}

	@Override
	public void elimina(int id) {
		cursoDao.delete(id);
	}

	@Override
	public Curso buscaPorId(int id) {
		return cursoDao.findCursoById(id);
	}

	@Override
	public List<Curso> buscaPorAsignatura(String asignatura) {
		return cursoDao.findByAsignatura(asignatura);
	}

	@Override
	public List<Curso> buscaCursoActivoPorAsignatura(String asignatura) {
		return cursoDao.findByAsignaturaActivas(asignatura);
	}

	@Override
	public List<CursosHome> getCursosHomeCtrl() {
		List<CursosHome> cList = new ArrayList<CursosHome>();
		List<Curso> cursos = cursoDao.getAllActivos();
		for (Curso c : cursos) {
			cList.add(new CursosHome(c));
		}
		return cList;
	}

}
