package com.bartlett.esccontrol.repository;

import java.util.List;

import com.bartlett.esccontrol.domain.TipoUsuario;

public interface TipoUsuarioDao {
	public List<TipoUsuario> getAll();

	public void save(TipoUsuario usuario);

	public void delete(TipoUsuario usuario);

	public TipoUsuario findById(int id);
}
