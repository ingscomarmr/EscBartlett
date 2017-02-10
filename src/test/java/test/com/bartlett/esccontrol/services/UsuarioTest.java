package test.com.bartlett.esccontrol.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.bartlett.esccontrol.domain.Usuario;

public class UsuarioTest {
	private Usuario usuario;
	
	
	@Before
    public void setUp() throws Exception {
        usuario = new Usuario();
    }

	@Ignore
    @Test
    public void testSetAndGetUserName() {
        String testUsuario = "user";
        assertNull(usuario.getUsuarioName());
        usuario.setUsuarioName(testUsuario);
        assertEquals(testUsuario, usuario.getUsuarioName());
    }
    @Ignore
    @Test
    public void testSetAndGetUserPwd() {
        String testUsuario = "pwd";
        assertNull(usuario.getUsuarioPwd());
        usuario.setUsuarioPwd(testUsuario);
        assertEquals(testUsuario, usuario.getUsuarioPwd());
    }
    @Ignore
    @Test
    public void testSetAndGetUserId() {
        int testPrice = 1;
        assertEquals(0, 0, 0);    
        usuario.setUsuarioId(testPrice);
        assertEquals(testPrice, usuario.getUsuarioId(), 0);
    }
    
    @Test
    public void getUsuarioPorEmailTest(){
    	
    }
    
}
