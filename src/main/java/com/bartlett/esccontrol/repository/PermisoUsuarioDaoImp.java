package com.bartlett.esccontrol.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.PermisoUsuario;
import com.bartlett.esccontrol.domain.Usuario;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
@Repository(value = "permisoUsuarioDao")
public class PermisoUsuarioDaoImp implements PermisoUsuarioDao{//PermisoUsuario.findPermisosByUsuario
	protected final Log log = LogFactory.getLog(getClass());
	
	@PersistenceContext
    protected EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	public EntityManager getEntityManager(){
		return em;
	}

	@Transactional(readOnly = true)
	@Override
	public List<PermisoUsuario> getPermisoUsuario(Usuario usuario) {
		if (usuario == null) {
			return new ArrayList<PermisoUsuario>();
		}
		
		List<PermisoUsuario> permisosList = em.createNamedQuery("PermisoUsuario.findPermisosByUsuario", PermisoUsuario.class)
				.setParameter("usuario", usuario).getResultList();
		return permisosList;					
	}

	@Transactional(readOnly = false)
	@Override
	public PermisoUsuario addRole(String role, Usuario usuario) {
		if (role != null && usuario != null) {
			log.info("#Guardar rol:" + role + " al usuario:" + usuario.toString());
			PermisoUsuario permissao = new PermisoUsuario();
			permissao.setRole(role);
			permissao.setUsuario(usuario);
			log.info("#Guardar permiso:" + permissao.toString());
			return (PermisoUsuario)em.merge(permissao);
		}
		return null;
	}
}
