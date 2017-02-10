package com.bartlett.esccontrol.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bartlett.esccontrol.domain.Usuario;

@Service
@Transactional
@Repository(value = "usuarioDao")
public class UsuarioDaoImp implements UsuarioDao {

	
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
    @SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("findAllUsuario", Usuario.class).getResultList();
	}

	@Transactional(readOnly = false)
	@Override
	public Usuario save(Usuario usuario) throws Exception{
		if(usuario == null){
			String msg = "Datos de usuario no validos";
			throw new Exception(msg);
		}
		// TODO Auto-generated method stub
		Usuario u = findByEmail(usuario.getUsuarioName());
		if(u != null){
			String msg = "Ya existe un usuario registrado con información similar, por favor verifique su información, si el problema persiste contacte al administrador.";
			throw new Exception(msg);
		}
		return (Usuario) em.merge(usuario);
	}
	
	@Transactional(readOnly=false)
	@Override
	public void delete(int id) {
		Usuario u = findUsuarioById(id);
		if(u != null){
			em.remove(u);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Usuario findUsuarioById(int id) {
		// TODO Auto-generated method stub
		return em.find(Usuario.class, id);
	}

	@Override
	public Usuario findByEmail(String email) {
		// TODO Auto-generated method stub	
		List<Usuario> uLis = em.createNamedQuery("findByEmail", Usuario.class)
				.setParameter("email", email).getResultList();
		if(uLis != null && uLis.size() > 0){
			return uLis.get(0);
		}
			
		return null;
	}

	
}
