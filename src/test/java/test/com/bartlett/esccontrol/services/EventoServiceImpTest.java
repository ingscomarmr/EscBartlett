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

import com.bartlett.esccontrol.beanmodel.EventoHome;
import com.bartlett.esccontrol.domain.Evento;
import com.bartlett.esccontrol.service.EventoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class EventoServiceImpTest {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	EventoService eventoService;
	
	@Ignore
	@Test
	@Rollback(value=false)
	public void guardarTest(){
		Evento e = new Evento();
		e.setTitulo("Examenes semestrales I");
		e.setMensaje("Examenes semestrales para primer semestre de matematicas y español");
		e.setEliminado((short)0);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, -1);
		e.setFechaEvento(new Timestamp(c.getTimeInMillis()));
		e.setFechaMod(new Timestamp(System.currentTimeMillis()));
		e.setUsuarioIdMod(1);
		log.info("#Guardar Evento:" + e.toString());
		e = eventoService.guardar(e);
		log.info("Evento Guardado:" + e.toString());
		assertTrue(e.getEventoId() > 0);
	}
	
	@Ignore
	@Test
	public void buscarPorTitulo(){
		log.info("#Buscar eventos por titulo");
		List<Evento> eList = eventoService.buscarPorTitulo("Reunion");
		for (Evento e : eList) {
			log.info("#" + e.toString());
		}
		log.info("#Eventos por titulo:" + eList.size());
		assertTrue(true);
		
	}
	
	@Ignore
	@Test
	@Rollback(value=false)
	public void eliminarTest(){
		log.info("#Eliminar");
		Evento e = eventoService.buscarPorId(3);
		log.info("#Eliminar evento:" + e.toString());
		if(e != null){
			eventoService.eliminar(e.getEventoId());
		}
		e = eventoService.buscarPorId(3);
		assertTrue(e == null);
	}
	
	@Test
	public void eventoHomeTest(){
		log.info("#Obtener eventos anno actual");
		List<EventoHome> eveList = eventoService.obtenerEventos();
		for (EventoHome e : eveList) {
			log.info("#EventoHome:" + e.toString());
		}
		
		assertTrue(eveList.size() > 0);
	}
}
