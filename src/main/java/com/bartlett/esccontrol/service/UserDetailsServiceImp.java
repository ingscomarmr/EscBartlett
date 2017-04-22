package com.bartlett.esccontrol.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.Usuario;
import com.bartlett.esccontrol.repository.UsuarioDao;

@Component
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class UserDetailsServiceImp implements UserDetailsService{

	@Autowired
	public UsuarioDao usuarioDao;
	
	
	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario user = usuarioDao.findByEmail(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new org.springframework.security.core.userdetails.User(user.getUsuarioName(), user.getUsuarioPwd(), grantedAuthorities);		
	}

}
