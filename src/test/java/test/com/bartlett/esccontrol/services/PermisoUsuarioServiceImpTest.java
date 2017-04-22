package test.com.bartlett.esccontrol.services;

import static org.junit.Assert.assertTrue;

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

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.PermisoUsuarioService;
import com.bartlett.esccontrol.service.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
public class PermisoUsuarioServiceImpTest {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Autowired(required=true)
	PermisoUsuarioService permisoUsuarioService;
	@Autowired
	UsuarioService usuarioService;
	
	@Ignore
	@Test
	@Rollback(value=false)
	public void guardarPermiso(){
		try{
			log.info("#####INICIANDO TEST DE PERMISOS");
			Usuario admin = usuarioService.getUsuario("admin@sisescolar.com");
			log.info("#####Usuario al que se le guarda el permiso:" + admin.toString());
			PermisoUsuario pu = permisoUsuarioService.guardar("ROLE_ADMIN", admin);
			log.info("####Permiso guardado:" + pu.toString());
			assertTrue(pu != null);
		}catch(Exception e){
			log.error("####Error al tratar de guardar",e);
		}		
	}
	
	@Test	
	public void gerPermisos(){
		try{
			log.info("#####INICIANDO TEST gerPermisos");
			Usuario admin = usuarioService.getUsuario("admin@sisescolar.com");
			log.info("#####Obtener los permisos del usuario:" + admin.toString());
			List<PermisoUsuario> puList = permisoUsuarioService.buscarPermisos(admin);
			for (PermisoUsuario pu : puList) {
				log.info("####Permiso:" + pu.toString());
			}
			
			assertTrue(puList.size() > 0);
		}catch(Exception e){
			log.error("####Error al tratar de guardar",e);
		}		
	}
}
