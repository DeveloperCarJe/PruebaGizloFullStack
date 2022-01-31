package com.gizlo.springboot.backend.apirest.services;

import java.util.List;


import com.gizlo.springboot.backend.apirest.model.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	public Usuario findById(String codigo);
	public Usuario save(Usuario cliente);
	public void delete(String codigo);
}
