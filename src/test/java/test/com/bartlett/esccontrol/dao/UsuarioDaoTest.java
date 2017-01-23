package test.com.bartlett.esccontrol.dao;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bartlett.esccontrol.domain.TipoUsuario;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.UsuarioDao;
import com.comr.utils.UtilsEncrypt;

public class UsuarioDaoTest {
	
	private ApplicationContext context;
	private UsuarioDao usuarioDao;

	protected final Log log = LogFactory.getLog(getClass());

	@Before
	public void setUp() throws Exception {
		log.info("iniciando up");
		context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		usuarioDao = (UsuarioDao) context.getBean("usuarioDao");
		log.info("terminando up");
	}
	
	@Test
	public void testGetProductList() throws Exception{
		log.info("obtener lista de usuarios");
		List<Usuario> usuarios = usuarioDao.getAll();
		for(Usuario u : usuarios){
			u.setUsuarioPwd(UtilsEncrypt.encrypt(Usuario.pwdMaster));
			usuarioDao.save(u);
		}
		log.info("usuarios obtenidos:" + usuarios.size());
		for(Usuario u : usuarios){
			log.info(u);
		}
		assertTrue(usuarios.size() > 0);
	}
	
	@Ignore
	@Test
	public void testSaveProduct() {
		log.info("guardar usuario");
		Usuario u = new Usuario();
		u.setUsuarioName("aletse@gmail.com");
		u.setUsuarioPwd("omarmr");
		TipoUsuario t = new TipoUsuario();
		t.setId(1);
		u.setTipoUsuario(t);
		u.setUsuarioMod(1);
		u.setFechaMod(new Timestamp(System.currentTimeMillis()));
		Usuario us = usuarioDao.save(u);
		log.info(us);
		assertTrue(u.getUsuarioName().equals(us.getUsuarioName()));
	}
	
	@Ignore
	@Test
	public void testUpdateUsuario(){
		log.info("Actualizar informacion");
		Usuario u = usuarioDao.findUsuarioById(7);
		log.info("usuario encontrado:" + u.toString());
		u.setUsuarioName("aletse@app.com");
		Usuario up = usuarioDao.save(u);
		log.info("Usuario guardado:" + up.toString());
		assertTrue(up.getUsuarioName().equals(u.getUsuarioName()));
	}
}
