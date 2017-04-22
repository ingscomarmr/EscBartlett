package com.bartlett.esccontrol.filter;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class MyAuthenticationProvider implements AuthenticationProvider {
 
    private UserDetailsService userDetailsService;
 
    public void setUserDetailsService(UserDetailsService userDetailsService) {
 
        this.userDetailsService = userDetailsService;
    }
 
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
 
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(authentication.getName());
        if (userDetails != null ) {
            return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        }
 
        throw new BadCredentialsException("Bad credentials");
    }

	@Override
	public boolean supports(Class<? extends Object> authentication) {
		// TODO Auto-generated method stub
		return false;
	}
}
