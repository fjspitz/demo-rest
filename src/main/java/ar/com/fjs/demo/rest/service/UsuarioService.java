package ar.com.fjs.demo.rest.service;

import java.util.List;

import ar.com.fjs.demo.rest.dto.UsuarioDto;
import ar.com.fjs.demo.rest.model.Usuario;

public interface UsuarioService {

	List<Usuario> findAll();

	Usuario save(UsuarioDto dto);
}
