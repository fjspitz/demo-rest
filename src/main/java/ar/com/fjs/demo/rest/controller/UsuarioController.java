package ar.com.fjs.demo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.fjs.demo.rest.dto.UsuarioDto;
import ar.com.fjs.demo.rest.model.Usuario;
import ar.com.fjs.demo.rest.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> getUsuarios() {
		return usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario createUser(@RequestBody UsuarioDto dto) {
		
		log.info("Dto: {}", dto);
		
		return usuarioService.save(dto);
	}
}
