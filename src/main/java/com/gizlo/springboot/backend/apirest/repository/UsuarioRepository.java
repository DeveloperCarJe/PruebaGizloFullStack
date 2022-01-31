package com.gizlo.springboot.backend.apirest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gizlo.springboot.backend.apirest.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	public Iterable<Usuario> findAllByOrderByCodigoAsc();
	public Page<Usuario> findAllByOrderByCodigoAsc(Pageable pageable);
}
