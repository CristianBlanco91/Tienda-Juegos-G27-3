package com.DAO.tienda;

import java.sql.*;

public class conexion {

	//parametros conex
	String BD = "DB_Tienda_Azar";
	String Login = "root";
	String password = "cx91xmysqL.";
	String URL = "jdbc:mysql://localhost/";
	
	Connection con = null;
	
	//Constructor para Conexion
	public conexion()
	{
		try
		{
			//obtener driver mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Obtener conexion
			con = DriverManager.getConnection(URL,Login,password);
			
			if (con != null)
				System.out.println("Conexion a la base de datos exitosa");
		}
		catch(SQLException e)
		{
			System.out.println("Error conexion: " + e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error conexion: " + e);
		}
		catch(Exception e)
		{
			System.out.println("Error conexion: " + e);
		}
	}
	//metodo para retorna conex
	public Connection getCon()
	{ return con;}
	
	//metodo para desconectar
	public void desconectar()
	{con =  null;}
}
