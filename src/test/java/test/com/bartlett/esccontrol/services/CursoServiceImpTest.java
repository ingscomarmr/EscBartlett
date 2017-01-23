package test.com.bartlett.esccontrol.services;

import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;
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

import com.bartlett.esccontrol.BeanModel.CursosHome;
import com.bartlett.esccontrol.domain.AreaTematica;
import com.bartlett.esccontrol.domain.Curso;
import com.bartlett.esccontrol.domain.Grado;
import com.bartlett.esccontrol.domain.Grupo;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.CursoDaoImp;
import com.bartlett.esccontrol.service.CursoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class CursoServiceImpTest {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	CursoService cursoService;
	
	@Ignore
	@Test
	public void GetAllTest(){
		log.info("#Obtener curso");
		try{
			List<Curso> cList = cursoService.buscaTodas();
			for (Curso c : cList) {
				log.info("##" + c.toString());
				log.info("## Curso:" + c.getCursoId() + " usuarigo img:" + c.getProfesor().getUrlImg());
			}
			assertTrue(cList.size() > 0);
		}catch(Exception e){
			log.debug(e);
		}
	}
	
	
	@Test
	public void GetToHomeAllTest(){
		log.info("#Obtener curso");
		try{
			List<CursosHome> cList = cursoService.getCursosHomeCtrl();
			for (CursosHome c : cList) {
				log.info("##" + c.toString());
			
			}
			assertTrue(cList.size() > 0);
		}catch(Exception e){
			log.debug(e);
		}
	}
	
	@Ignore
	@Test
	@Rollback(value=false)
	public void guardarTest(){
		log.info("#Guardar curso");
		try{
			Curso c = new Curso();
			log.info("#Asignatura");
			c.setAsignatura("Taller de redacción");
			log.info("#area tematica");
			c.setAreaTematica(new AreaTematica(1));
			log.info("#grado");
			c.setGrado(new Grado(1));
			c.setDesactivo(CursoDaoImp.CURSO_ACTIVO);
			log.info("#grupo");
			c.setGrupo(new Grupo(1));
			log.info("#profesor");
			c.setProfesor(new Usuario(4));
			log.info("#fecha de modificacion");
			c.setUsuarioIdMod(1);
			c.setFechaModificacion(new Timestamp(System.currentTimeMillis()));
			c.setEliminado(CursoDaoImp.CURSO_ACTIVO);
			
			log.info("## Guardar curso:" + c.toString());
		 	c = cursoService.guarda(c);
			log.info("## Curso guardado:" + c.toString());
			assertTrue(c.getCursoId() > 0);
		}catch(Exception e){
			log.debug("##Error:" + e.getMessage());
			log.error(e);
			assertTrue(false);
		}
	}
	
	@Ignore
	@Test
	@Rollback(value=false)
	public void deleteTest(){
		Curso c = cursoService.buscaPorId(3);
		if(c != null){
			log.info("##Eliminar curso:"  + c);
			cursoService.elimina(c.getCursoId());
			c = cursoService.buscaPorId(3);
			assertTrue(c == null);
		}else{
			log.info("##No se encontro curso");
			assertTrue(false);
		}
		
	}
}
