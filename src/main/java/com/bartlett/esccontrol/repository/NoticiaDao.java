package com.bartlett.esccontrol.repository;

import java.util.List;

import com.bartlett.esccontrol.domain.Noticia;


public interface NoticiaDao {

	public List<Noticia> getAll();

	public Noticia save(Noticia n);
	
	public void delete(int id);
	
	public Noticia findNoticiaById(int id);

	public Noticia findByTitulo(String titulo);
	
	public List<Noticia> findByTituloActivas(String titulo);
}
