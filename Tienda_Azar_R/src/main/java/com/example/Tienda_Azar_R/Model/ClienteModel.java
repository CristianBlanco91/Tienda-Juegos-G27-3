package com.example.Tienda_Azar_R.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//aqui especificamos la tabla de la DB @table()
@Entity
@Table(name="T_clientes")
public class ClienteModel {

	@Id
	private int Cedula_Cli;
	private String Nombre_Cli;
	private String Correo_Cli;
	private String Direccion_Cli;
	private String Telefono_Cli;
	
	public ClienteModel()
	{
		
	}

	public ClienteModel(int cedula_Cli, String nombre_Cli, String correo_Cli, String direccion_Cli, String telefono_Cli) {
		super();
		Cedula_Cli = cedula_Cli;
		Nombre_Cli = nombre_Cli;
		Correo_Cli = correo_Cli;
		Direccion_Cli = direccion_Cli;
		Telefono_Cli = telefono_Cli;
	}

	public int getCedula_Cli() {
		return Cedula_Cli;
	}

	public void setCedula_Cli(int cedula_Cli) {
		Cedula_Cli = cedula_Cli;
	}

	public String getNombre_Cli() {
		return Nombre_Cli;
	}

	public void setNombre_Cli(String nombre_Cli) {
		Nombre_Cli = nombre_Cli;
	}

	public String getCorreo_Cli() {
		return Correo_Cli;
	}

	public void setCorreo_Cli(String correo_Cli) {
		Correo_Cli = correo_Cli;
	}

	public String getDireccion_Cli() {
		return Direccion_Cli;
	}

	public void setDireccion_Cli(String direccion_Cli) {
		Direccion_Cli = direccion_Cli;
	}

	public String getTelefono_Cli() {
		return Telefono_Cli;
	}

	public void setTelefono_Cli(String telefono_Cli) {
		Telefono_Cli = telefono_Cli;
	}

}
