package com.Controlador.Tienda_Juegos_Azar;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.tienda.UsuarioDAO;
import com.DTO.tienda.UsuarioVO;

@RestController
public class us_controller {
	
	@RequestMapping("/listaUsuarios")
	public ArrayList<UsuarioVO> listaUsuarios()
	{
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.listaUsuarios();
	}

	/*
	@RequestMapping("/consultarUs")
	public ArrayList<UsuarioVO> listaUsuarios()
	{
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.consultaUsuarios(documento);
	}
	
	@RequestMapping("/RegistrarUs")
	public void RegistrarUs(UsuarioVO persona)
	{
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.RegistrarUs(persona);
	}
	
	@RequestMapping("/EliminarUs")
	public void ElimiarUs(int documento)
	{
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.ElimiarUs(documento);
	}
	
	*/
	
}
