package com.bartlett.esccontrol.web;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bartlett.esccontrol.beanmodel.ResponseModel;
import com.bartlett.esccontrol.domain.TipoUsuario;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.UsuarioService;
import com.comr.utils.Utils;
import com.comr.utils.UtilsEncrypt;
import com.google.gson.Gson;

@Controller
@Transactional
public class RegistroController {
	protected final Log log = LogFactory.getLog(getClass());
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/registro.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.info("# VIEW REGISTRO");		
		return new ModelAndView("registro_tl");
	}
	
	@RequestMapping(value = "/registrarUsuario.htm")
	@ResponseBody
	public String registrarUsuario(
			@RequestParam(value = "nombre") String nombre,
			@RequestParam(value = "apellidoPaterno") String apelliedoPaterno,
			@RequestParam(value = "apellidoMaterno") String apellidoMaterno,
			@RequestParam(value = "usuarioName") String usuarioName,
			@RequestParam(value = "usuarioPwd") String usuarioPwd,
			@RequestParam(value = "tipoUsuario") int tipoUsuario,
			@RequestParam(value = "curp") String curp)
			throws ServletException, IOException {
		ResponseModel r = new ResponseModel();
		log.info("#ENTRO A REGISTRAR USUARIO:" + nombre + "," + apelliedoPaterno);		
		/*log.info("# GUARDAR USUARIO: " + (u != null? u.toString() : "null"));		
		if(u == null){
			r.SetResponse(false, "Sin datos que guardar, por favor introduce datos");
		}*/
		Gson gson = new Gson();
		String res = gson.toJson(r);
		log.info("#Json:" + res);
		return res;
	}
	
	@RequestMapping(value = "/registrarGuardar.htm")
	@ResponseBody
	public String guardar( @RequestBody Usuario u )
			throws ServletException, IOException {
		ResponseModel r = new ResponseModel();
		
		try{
			log.info("# DATOS DE PAG WEB: " + u.toString());	
			u.setTipoUsuario(new TipoUsuario(u.getTipoUsuarioId()));			
			if(Utils.isNullOrEmpty(u.getUsuarioPwd()) || u.getUsuarioPwd().length() < 6){
				String msg = "La contraseña no puede ser menor a 6 dígitos";
				throw new Exception(Utils.strToHtmlCode(msg));
			}
			//u.setUsuarioPwd(UtilsEncrypt.encrypt(u.getUsuarioPwd()));
			u.setUsuarioPwd(UtilsEncrypt.encrypt(u.getUsuarioPwd()));
			u.setUsuarioMod(Usuario.ID_ADMIN);
			u.setFechaMod(new Timestamp(System.currentTimeMillis()));
			log.debug("# GUARDAR USUARIO:" + u.toString());
			u =	usuarioService.guardar(u);
			if(u.getUsuarioId() > 0){
				String mensaje = "El usuario se registró correctamente, folio de registro " + Utils.formatFolio(u.getUsuarioId());
				r.SetResponse(true, Utils.strToHtmlCode(mensaje));
			}
		}catch(Exception e){
			log.debug("Ocurrio un problema al guardar el registro",e);
			r.SetResponse(false, Utils.strToHtmlCode(e.getMessage()));
		}						
		
		Gson gson = new Gson();
		String res = gson.toJson(r);
		log.info("#Json:" + res);
		return res;
	}
}
