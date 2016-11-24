package com.bartlett.esccontrol;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bartlett.esccontrol.domain.Usuario;

public class UsuarioTest {
	private Usuario usuario;
	
	
	@Before
    public void setUp() throws Exception {
        usuario = new Usuario();
    }

    @Test
    public void testSetAndGetUserName() {
        String testUsuario = "user";
        assertNull(usuario.getUsuarioName());
        usuario.setUsuarioName(testUsuario);
        assertEquals(testUsuario, usuario.getUsuarioName());
    }
    
    @Test
    public void testSetAndGetUserPwd() {
        String testUsuario = "pwd";
        assertNull(usuario.getUsuarioPwd());
        usuario.setUsuarioPwd(testUsuario);
        assertEquals(testUsuario, usuario.getUsuarioPwd());
    }

    @Test
    public void testSetAndGetUserId() {
        int testPrice = 1;
        assertEquals(0, 0, 0);    
        usuario.setUsuarioId(testPrice);
        assertEquals(testPrice, usuario.getUsuarioId(), 0);
    }
    
}
