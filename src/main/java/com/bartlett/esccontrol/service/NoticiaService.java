package com.bartlett.esccontrol.service;

import java.io.Serializable;
import java.util.List;

import com.bartlett.esccontrol.domain.Noticia;

public interface NoticiaService extends Serializable{
	public List<Noticia> buscaTodas();
	public Noticia guarda(Noticia n);
	public void elimina(int n);
	public Noticia buscaPorId(int id);
	public Noticia buscaPorTitulo(String titulo);
	public List<Noticia> buscaNoticiaActPorTitulo(String titulo);
}
