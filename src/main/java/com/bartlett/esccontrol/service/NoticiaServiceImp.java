package com.bartlett.esccontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.repository.NoticiaDao;

@Component
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class NoticiaServiceImp implements NoticiaService{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public NoticiaDao noticiaDao;
	
	public void setNoticiaDao(NoticiaDao noticiaDao) {
        this.noticiaDao = noticiaDao;
    }
	
	@Override
	public List<Noticia> buscaTodas() {
		return noticiaDao.getAll();
	}

	@Override
	public Noticia guarda(Noticia n) {
		return noticiaDao.save(n);
	}

	@Override
	public void elimina(int id) {
		noticiaDao.delete(id);
	}

	@Override
	public Noticia buscaPorId(int id) {
		return noticiaDao.findNoticiaById(id);
	}

	
	public Noticia buscaPorTitulo(String titulo) {
		return noticiaDao.findByTitulo(titulo);
	}

	@Override
	public List<Noticia> buscaNoticiaActPorTitulo(String titulo) {
		return noticiaDao.findByTituloActivas(titulo);
	}

}
