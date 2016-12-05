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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bartlett.esccontrol.domain.Menus;

@Controller
public class HomeController {

	protected final Log log = LogFactory.getLog(getClass());

	@RequestMapping(value = "/home.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.info("Returning home_vw view to begin application");

		//parametros del model
		String hora_servidor = (new Date().toString());
		log.info("Hora del servidor es:" + hora_servidor);

		List<Menus> mList = new ArrayList<>();
		mList.add(new Menus(1, "Login", "/login.htm"));
		mList.add(new Menus(1, "Acerca de", "/acercade.htm"));

		//armando mi model
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("hora_servidor", hora_servidor);
		myModel.put("menus", mList);

		// enviamos un dato al modelo
		return new ModelAndView("home_vw", "model", myModel);
	}

}
