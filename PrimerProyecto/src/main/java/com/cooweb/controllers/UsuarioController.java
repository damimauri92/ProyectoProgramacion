package com.cooweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.models.Usuario;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
	/*
	@RequestMapping(value="mensaje")
	public String mensaje() {
		
		return "Hola";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Damian", "Juan", "Diego");
	}
	*/
	/*
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {
		
		Usuario usuario=new Usuario();		
		usuario.setNombre("Damian");
		usuario.setApellido("Mora");
		usuario.setEmail("damim@gmail.com");
		usuario.setTelefono("2945684470");
		
		
		return usuario;
		
	}
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuarios(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Damian");
		usuario.setApellido("Mora");
		usuario.setEmail("damim@gmail.com");
		usuario.setTelefono("2945684470");
		
		
		return usuario;
		
	}
	*/
	
	@RequestMapping(value="listar/usuarios")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Damian");
		usuario1.setApellido("Mora");
		usuario1.setEmail("damim@gmail.com");
		usuario1.setTelefono("2945684470");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Damian");
		usuario2.setApellido("Mora");
		usuario2.setEmail("damim@gmail.com");
		usuario2.setTelefono("2945684470");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Damian");
		usuario3.setApellido("Mora");
		usuario3.setEmail("damim@gmail.com");
		usuario3.setTelefono("2945684470");
		
		usuarios.add(usuario1); 
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		
		return usuarios;
		
	}
	
	@RequestMapping(value="api/usuarios")
	
	public List<Usuario> getUsuario(){
	List<Usuario> user=usuarioDao.obtenerUsuarios();
	
	return user;
	}



}
