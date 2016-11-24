package com.bartlett.esccontrol.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	protected final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/home.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.info("Returning home_vw view to begin application");
		
		String hora_servidor = (new Date().toString());
		log.info("Hora del servidor es:" + hora_servidor);
		
		//enviamos un dato al modelo 
		return new ModelAndView("home_vw","hora_servidor",hora_servidor); 
	}
}
