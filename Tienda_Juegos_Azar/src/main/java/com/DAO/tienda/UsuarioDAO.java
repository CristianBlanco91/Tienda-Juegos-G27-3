package com.DAO.tienda;

import java.sql.*;
import java.util.ArrayList;
import com.DTO.tienda.*;

// permite el acceso a la base de datos
public class UsuarioDAO {
	
	// para tabla de usuarios
	public ArrayList<UsuarioVO> listaUsuarios()
	{
		ArrayList<UsuarioVO> miLista = new ArrayList<UsuarioVO>();
		conexion con = new conexion();
		try
		{
			PreparedStatement consulta = con.getCon().prepareStatement("SELECT * FROM T_usuarios;");
			ResultSet rs = consulta.executeQuery();
			while (rs.next())
			{
				UsuarioVO persona = new UsuarioVO();
				persona.setCedu(Integer.parseInt(rs.getString("Cedula_us")));
				persona.setName(rs.getString("Nombre_us"));
				persona.setMail(rs.getString("Correo_us"));
				persona.setUser(rs.getString("Usuario"));
				persona.setPass(rs.getString("clave_us"));
				miLista.add(persona);
			}
			rs.close();
			consulta.close();
			con.desconectar();
		}
		catch(Exception e)
		{
			System.out.println("Error: no se pudo consultar " + e);
		}
		return miLista;
	}
}
/*	
	//metodo consulta ususario por cedula/documento
	public ConsultarUs(int documento)
	{
		ArrayList<UsuarioVO> miLista = new ArrayList<UsuarioVO>();
	}
		try
		{
			PreparedStatement consulta = con.getCon().prepareStatement("SELECT * FROM T_usuarios WHERE Cedula_us = ?");
			consulta.setInt(1, documento);
			ResultSet rs = consulta.executeQuery();
		
		if (rs.next())
		{
			usuarioVO persona = new UsuarioVO();
			persona.setCedula(Integer.parseInt(rs.getString("Cedula_us")));
			persona.setNombre(rs.getString("Nombre_us"));
			persona.setCorreo(rs.getString("Correo_us"));
			persona.setUsuario(rs.getString("Usuario"));
			persona.setClave(rs.getString("clave_us"));
			
			miLista.add(persona);
		}
		rs.close();
		consulta.close();
		con.desconectar();
		
		}
		catch (Exception e)
		{
			System.out.println("Error: usuario no encontrado: " + e);
		}
		return miLista;
		}
	
		public void RegistrarUs(UsuarioVO persona)
		{
			conexion con = new conexion();
			try
			{
				Statement stmt = con.getCon().createStatement();
				stmt.executeUpdate("Insert into T_usuarios Values('"+persona.getCedu()+"','"+
				persona.getCedu()+"','"+persona.getCedu()+"','"+persona.getCedu()+"')");
				con.desconectar();
			}
			catch(Exception e)
			{
				System.out.println("Error: Usuario NO Adicionado: " + e);
			}
		}
		
		//Eliminar usuario
		public void ElimiarUs(int documento)
		{
			conexion con = new conexion();
			try
			{
				PreparedStatement consulta = con.getCon().prepareStatement("DELETE FROM T_usuarios WHERE Cedula_us = ?");
				consulta.setInt(1, documento);
				consulta.executeUpdate();
				
				System.out.println("El usuario ha sido eliminado");
				consulta.close();
				con.desconectar();
			}
			catch(Exception e)
			{
				System.out.println("Error: Usuario NO encontrado: " + e);
			}
		}
		
		//actualizar usuario
		public void ActualizarUs(int documento , String nombre , String correo)
		{
			conexion con = new conexion();
			try
			{
				Statement stmt = con.getCon().createStatement();
				stmt.executeUpdate("Insert into T_usuarios Values('"+persona.getCedu()+"','"+
				persona.getCedu()+"','"+persona.getCedu()+"','"+persona.getCedu()+"')");
				con.desconectar();
			}
			catch(Exception e)
			{
				System.out.println("Error: Usuario NO Adicionado: " + e);
			}
		}
		
		}
		}*/
