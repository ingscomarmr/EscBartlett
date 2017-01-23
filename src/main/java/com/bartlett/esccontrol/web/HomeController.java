package com.bartlett.esccontrol.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bartlett.esccontrol.BeanModel.CursosHome;
import com.bartlett.esccontrol.BeanModel.EventoHome;
import com.bartlett.esccontrol.domain.Curso;
import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.UsuarioService;
import com.comr.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.bartlett.esccontrol.service.CursoService;
import com.bartlett.esccontrol.service.EventoService;
import com.bartlett.esccontrol.service.NoticiaService;


@Controller
@Transactional
public class HomeController {

	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private NoticiaService noticiaService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private EventoService eventoService;
	
	public void setCursoService(CursoService c){
		this.cursoService = c;
	}
	
	public void setNoticiaService(NoticiaService n){
		this.noticiaService = n;
	}
	
	public void setUsuarioService(UsuarioService u){
		this.usuarioService = u;
	}
	
	public void setEventoService(EventoService ev){
		this.eventoService = ev;
	}
	@RequestMapping(value = "/home.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			
		log.info("Returning home_vw view to begin application");
				
		List<Noticia> nList = noticiaService.buscaNoticiaActPorTitulo("");
		for(Noticia n : nList){
			String contenido = n.getContenido();
			if(Utils.isNullOrEmpty(contenido)){
				contenido = "";
			}
			if(contenido.length() > 50){
				n.setContenido(n.getContenido().substring(0, 47) + "...");
			}
			
		}
		
		List<Curso> cursoList = cursoService.buscaTodas();
		
		List<EventoHome> evList = eventoService.obtenerEventos();
		Gson gson = new GsonBuilder().create();
		JsonArray ja = gson.toJsonTree(evList).getAsJsonArray();
		log.info("#" + ja.toString());
		
		
		//armando mi model
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("noticias", nList);
		myModel.put("cursos", cursoList);
		myModel.put("eventoJsonArray", ja.toString());
		
		// enviamos un dato al modelo
		return new ModelAndView("home_vw", "model", myModel);
	}

}
