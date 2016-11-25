package com.bartlett.esccontrol;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;

import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.service.UsuarioServiceImp;

public class UsuarioServiceImpTest {
	protected final Log log = LogFactory.getLog(getClass());
	private UsuarioServiceImp uServiceImp;

	private Usuario u1;
	private static int id1 = 1;
	private static String user1 = Usuario.uMaster;
	private static String pwd1 = Usuario.pwdMaster;

	@Before
	public void setUp() throws Exception {
		uServiceImp = new UsuarioServiceImp();

		u1 = new Usuario();
		u1.setUsuarioId(id1);
		u1.setUsuarioName(user1);
		u1.setUsuarioPwd(pwd1);
	}

	@Test
	public void testLogin() {	
		log.info("Login de usuario:" + u1.toString());
		assertTrue(uServiceImp.loginUsuario(u1));
	}

}
