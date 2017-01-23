package test.com.bartlett.esccontrol.dao;

import java.util.List;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bartlett.esccontrol.domain.TipoUsuario;
import com.bartlett.esccontrol.repository.TipoUsuarioDao;

public class TipoUsuarioTest {

	private ApplicationContext context;
	private TipoUsuarioDao tipoUsuarioDao;

	protected final Log log = LogFactory.getLog(getClass());
	
	@Before
	public void setUp() throws Exception {
		log.info("iniciando up");
		context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		tipoUsuarioDao = (TipoUsuarioDao) context.getBean("tipoUsuarioDao");
		log.info("terminando up");
	}

	@Test
	public void testGetProductList() {
		log.info("obtener lista de usuarios");
		List<TipoUsuario> tipos = tipoUsuarioDao.getAll();
		for(TipoUsuario t : tipos){
			log.info(t);
		}
		log.info("usuarios obtenidos:" + tipos.size());
		assertTrue(tipos.size() > 0);
	}
}
