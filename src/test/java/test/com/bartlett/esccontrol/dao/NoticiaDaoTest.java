package test.com.bartlett.esccontrol.dao;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.NoticiaDao;


public class NoticiaDaoTest {
	private ApplicationContext context;
	private NoticiaDao noticiaDao;
	protected final Log log = LogFactory.getLog(getClass());

	@Before
	public void setUp() throws Exception {
		log.info("iniciando up");
		context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		noticiaDao = (NoticiaDao) context.getBean("noticiaDao");
		log.info("terminando up");
	}
	
	@Test
	public void testGetAll() throws Exception{
		log.info("obtener lista de noticias");
		List<Noticia> noticias = noticiaDao.getAll();
		for(Noticia n : noticias){
			log.info(n.toString());
		}
		log.info("usuarios obtenidos:" + noticias.size());
		
		assertTrue(noticias.size() > 0);
	}
	
	@Test
	public void guardarTest() throws Exception{
		log.info("Preparar noticia");
		Noticia n = new Noticia();
		n.setTitulo("Examenes finales");
		n.setContenido("Examenes finales para todos los grupos");
		n.setUsuarioIdMod(new Usuario(1));
		Calendar calendar = Calendar.getInstance();
		
		n.setFechaVigenciaInicio(new Timestamp(calendar.getTimeInMillis()));
		calendar.add(Calendar.DAY_OF_MONTH, 12);
		n.setFechaVigenciaFin(new Timestamp(calendar.getTimeInMillis()));
		
		n.setFechaModificacion(new Timestamp(System.currentTimeMillis()));
		
		log.info("Agregar noticia:" + n.toString());
		n = noticiaDao.save(n);
		log.info("Noticia guardada:" + n.toString());
		
	}
}
