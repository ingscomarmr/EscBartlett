package com.bartlett.esccontrol.web;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.UsuarioDao;
import com.bartlett.esccontrol.service.UsuarioService;

@Controller
public class LoginController {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired(required=true)
	private UsuarioService uServicio;
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value = "/login.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.info("Returning login view to begin application");
		
		log.info("Numero de usuarios:" + usuarioDao.getAll().size());
		
		String hora_servidor = (new Date().toString());
		log.info("Hora del servidor es:" + hora_servidor);
		Usuario u = new Usuario();
		u.setUsuarioId(1);
		u.setUsuarioName(Usuario.uMaster);
		u.setUsuarioPwd(Usuario.pwdMaster);
		log.info("Login:" + uServicio.loginUsuario(u));
		//enviamos un dato al modelo 
		return new ModelAndView("login_vw","hora_servidor",hora_servidor); 
	}
	
	public void setIUsuarioService(UsuarioService us){
		this.uServicio = us;
	}
	
	public void setIUsuarioDao(UsuarioDao us){
		this.usuarioDao = us;
	}
}