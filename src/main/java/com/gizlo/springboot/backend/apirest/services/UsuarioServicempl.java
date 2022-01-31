package com.gizlo.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gizlo.springboot.backend.apirest.model.Usuario;
import com.gizlo.springboot.backend.apirest.repository.UsuarioRepository;

@Service
public class UsuarioServicempl implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
//		return (List<Cliente>) clienteDao.findAll();
		return (List<Usuario>) usuarioRepository.findAllByOrderByCodigoAsc();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Usuario findById(String codigo) {
		return usuarioRepository.findById(codigo).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario cliente) {
		return usuarioRepository.save(cliente);
	}

	@Override
	@Transactional
	public void delete(String codigo) {
		usuarioRepository.deleteById(codigo);
	}


}
