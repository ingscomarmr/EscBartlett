package test.com.bartlett.esccontrol.services;

import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.NoticiaService;
import com.bartlett.esccontrol.service.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class UsuarioServiceImpTest {

	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	UsuarioService usuarioService;
	
	@Test
	public void testGetAll() throws Exception{
		log.info("obtener lista de noticias");
		Usuario u = usuarioService.getUsuarioById(1);
		
		assertTrue( u != null);
		if(u!=null)
			log.info("usuario obtenidos:" + u.toString());
	}
	
		
	@Test
	@Rollback(value=false)
	public void eliminarTest() throws Exception{
		try{
			log.info("\n\n-------------Usuario");
			Usuario u = usuarioService.getUsuarioById(2);
			if(u != null){
				log.info("+++++++ Eliminar noticia:" + u.toString());
				usuarioService.eliminar(u.getUsuarioId());
			}
			
			Usuario u2 = usuarioService.getUsuarioById(2);
			
			assertTrue(u2 == null);
			
			log.info("\n\nUsuario eliminada-----------\n\n");
		}catch(Exception e){
			log.error("Eliminar:" + e.getMessage());
		}
		
		
	}
}
