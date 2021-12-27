package ar.com.fjs.demo.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.demo.rest.dto.UsuarioDto;
import ar.com.fjs.demo.rest.model.Usuario;
import ar.com.fjs.demo.rest.repository.UsuarioRepository;
import ar.com.fjs.demo.rest.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(UsuarioDto dto) {
		
		Usuario usuario = new Usuario();
		usuario.setApellido(dto.getApellido());
		usuario.setNombre(dto.getNombre());
		
		return usuarioRepository.save(usuario);
	}

}
