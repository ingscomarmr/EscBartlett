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
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.Noticia;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.NoticiaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class NoticiaServiceImpTest {

	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	NoticiaService noticiaService;
	
	@Ignore
	@Test
	public void testGetAll() throws Exception{
		log.info("obtener lista de noticias");
		List<Noticia> noticias = noticiaService.buscaTodas();
		for(Noticia n : noticias){
			log.info(n.toString());
		}
		log.info("noticias obtenidos:" + noticias.size());
		
		assertTrue(noticias.size() > 0);
	}
	
	@Ignore
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
		n = noticiaService.guarda(n);
		log.info("Noticia guardada:" + n.toString());
		
	}
	
	@Ignore
	@Test
	@Rollback(value=false)
	public void eliminarTest() throws Exception{
		try{
			log.info("\n\n-------------Preparar noticia");
			Noticia n = noticiaService.buscaPorId(3);
			if(n != null){
				log.info("+++++++ Eliminar noticia:" + n.toString());
				noticiaService.elimina(n.getNoticiaId());
			}
			
			Noticia n2 = noticiaService.buscaPorId(3);
			
			assertTrue(n2 == null);
			
			log.info("\n\nNoticia eliminada-----------\n\n");
		}catch(Exception e){
			log.error("Eliminar:" + e.getMessage());
		}
	}
	
	@Ignore
	@Test
	public void buscarPorTituloTest(){
		String titulo = "%EXA%";
		log.info("Obtener noticia que inicia con:" + titulo);
		Noticia n = noticiaService.buscaPorTitulo(titulo);
		if(n != null){
			log.info("##### Noticia:" + n.toString());
		}else{
			log.info("###### No se encontro noticia");
		}
		assertTrue(n != null);
	}
	
	@Test
	public void buscarPorTituloActivasTest(){
		String titulo = "";
		log.info("Obtener noticia que inicia con:" + titulo);
		List<Noticia> n = noticiaService.buscaNoticiaActPorTitulo(titulo);
		for (Noticia noticia : n) {
			log.info("###Noticia:" + n.toString());
		}
		assertTrue(n.size() > 0);
	}
}
