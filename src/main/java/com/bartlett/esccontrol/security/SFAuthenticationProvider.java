package com.bartlett.esccontrol.security;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.PermisoUsuarioDao;
import com.bartlett.esccontrol.repository.UsuarioDao;
import com.comr.utils.UtilsEncrypt;

/**
 * Exemplo de authentication provider
 * @author kicolobo
 */
public class SFAuthenticationProvider implements AuthenticationProvider {
	protected final Log log = LogFactory.getLog(getClass());
	@Autowired
	private UsuarioDao usuarioDao;
	
	public UsuarioDao getDaoUsuario() {return usuarioDao;}
	public void setDaoUsuario(UsuarioDao dao) {usuarioDao = dao;}
	
	@Autowired
	private PermisoUsuarioDao permisoUsuarioDao;
	
	public PermisoUsuarioDao getDaoPermissao() {return permisoUsuarioDao;}
	public void setPermisoUsuarioDao(PermisoUsuarioDao dao) {permisoUsuarioDao = dao;}
	
	public Authentication authenticate(Authentication auth)	throws AuthenticationException {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) auth;
		String username = token.getName();
		String pwd    = token.getCredentials() != null ? token.getCredentials().toString() : null;
		//buscar el usuario
		Usuario usuario = usuarioDao.findByEmail(username);
		
		try{
			pwd = UtilsEncrypt.encrypt(pwd);
		}catch(Exception e){
			log.debug(e);
		}
				
		if (usuario != null && usuario.getUsuarioPwd().equals(pwd)) {
			List<PermisoUsuario> permissoes = getDaoPermissao().getPermisoUsuario(usuario);
			SFAuthentication resultado = new SFAuthentication(usuario, permissoes);
			resultado.setAuthenticated(usuario != null);
			return resultado;
		}else{
			return null;
		}
		
	}

	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
