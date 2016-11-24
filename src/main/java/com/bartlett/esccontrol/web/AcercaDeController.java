package com.bartlett.esccontrol.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcercaDeController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/acercade.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Entro al controlador acerca de");
        logger.info("Enviando el view");
        return new ModelAndView("acercade"); //no necesita .jsp si ya se configuro en el spring-servlet.xml con el prefijo y sufijo
    }
}
