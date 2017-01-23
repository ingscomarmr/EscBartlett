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

import com.bartlett.esccontrol.domain.AreaTematica;
import com.bartlett.esccontrol.repository.AreaTematicaDao;
import com.bartlett.esccontrol.repository.NoticiaDao;


public class AreaTematicaTest {

	
	private ApplicationContext context;
	private AreaTematicaDao areaTematicaDao;
	protected final Log log = LogFactory.getLog(getClass());

	@Before
	public void setUp() throws Exception {
		log.info("iniciando up");
		context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		areaTematicaDao = (AreaTematicaDao) context.getBean("areaTematicaDao");
		log.info("terminando up");
	}
	
	@Ignore
	@Test
	public void findByNombre(){
		log.info("##Buscar area tematica findByNombre");
		String nombre = "Espa%";
		try{
			List<AreaTematica> at = areaTematicaDao.findByNombre(nombre);
			for (AreaTematica a : at) {
				log.info("##" + a.toString());
			}
			assertTrue(true);
		}catch(Exception e){
			log.debug(e);
			assertTrue(false);
		}
		log.info("##Tematica findByNombre");
	}
	
	@Ignore
	@Test
	public void findByNombre2(){
		log.info("##Buscar area tematica findByNombre2");
		String nombre = "";
		try{
			List<AreaTematica> at = areaTematicaDao.findByNombre2(nombre);
			for (AreaTematica a : at) {
				log.info("##" + a.toString());
			}
			assertTrue(true);
		}catch(Exception e){
			log.debug(e);
			assertTrue(false);
		}
		log.info("##Termina findByNombre2");
	}
	
	
	
}
