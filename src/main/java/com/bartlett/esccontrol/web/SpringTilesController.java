package com.bartlett.esccontrol.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.NoticiaService;
import com.bartlett.esccontrol.service.UsuarioService;

@Transactional
@Controller
public class SpringTilesController {
 
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private NoticiaService usuarioService;
	
    @RequestMapping(value="/tilesIndex.htm")
    public String index() {
    	log.info("Entro a index");
        return "index_tl";
    }
    
    @RequestMapping(value="/viewNoticias.htm")
    public ModelAndView viewPersons(Model model) {
    	log.info("Entro a ver las noticias");
        List<Noticia> noticias = usuarioService.buscaTodas();
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("noticias", noticias);
        return new ModelAndView("noticias_tl",myModel);
    }
    
}
