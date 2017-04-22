package test.com.bartlett.esccontrol.services;

import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class UsuarioServiceImpTest {

	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	UsuarioService usuarioService;
	
	@Ignore
	@Test
	public void saveTest() throws Exception{
		log.info("Guardar usuario");
		Usuario u = new Usuario();
		u.setNombre("MOI");
		u.setApellidoPaterno("CONTLE");
		u.setApellidoMaterno("ISLAS");
		u.setCurp("");
		u.setTipoUsuarioId(2);
		u.setUsuarioName("moi@gmail.com");
		u.setUsuarioPwd("pass");
		u.setFechaMod(new Timestamp(System.currentTimeMillis()));
		u.setEmailAlternativo("moi@gmail2.com");
		u.setUsuarioMod(1);
		
		log.info("# usuario a guardar:" + u.toString());
		u = usuarioService.guardar(u);
		
		assertTrue(u.getUsuarioId() > 0);
	}	
	
	@Ignore
	@Test
	public void testGetAll() throws Exception{
		log.info("obtener lista de noticias");
		Usuario u = usuarioService.getUsuarioById(6);
		
		assertTrue( u != null);
		if(u!=null)
			log.info("#####usuario obtenidos:" + u.toString());
	}
	
	@Ignore	
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
	
	
	@Test
	public void buscarEmail(){
		String email = "admin@sisescolar.com";
		log.debug("# buscar usuario por email:" + email);
		Usuario u = usuarioService.getUsuario(email);
		if(u == null){
			log.debug("# no se encontro al usuario con correo:" + email);
		}else{
			log.debug("# USUARIO ENCONTRADO:" + u.toString());
		}
		
		assertTrue(u != null);
	}
}
