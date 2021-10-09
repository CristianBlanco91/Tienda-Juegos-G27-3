package com.example.Tienda_Azar_R.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Usuarios")
public class UsuarioModel {
	
	@Id
	private int Cedula_Usu;
	private String Nombre_Usu;
	private String Correo_Usu;
	private String Usuario_Usu;
	private String Clave_Usu;
	
	public UsuarioModel()
	{
		
	}

	public UsuarioModel(int cedula_usu, String nombre_usu, String correo_usu, String usuario_usu, String clave_usu) {
		super();
		Cedula_Usu = cedula_usu;
		Nombre_Usu = nombre_usu;
		Correo_Usu = correo_usu;
		Usuario_Usu = usuario_usu;
		Clave_Usu = clave_usu;
	}

	public int getCedula_Usu() {
		return Cedula_Usu;
	}

	public void setCedula_Usu(int cedula_usu) {
		Cedula_Usu = cedula_usu;
	}

	public String getNombre_Usu() {
		return Nombre_Usu;
	}

	public void setNombre_Usu(String nombre_usu) {
		Nombre_Usu = nombre_usu;
	}

	public String getCorreo_Usu() {
		return Correo_Usu;
	}

	public void setCorreo_Usu(String correo_usu) {
		Correo_Usu = correo_usu;
	}

	public String getUsuario_Usu() {
		return Usuario_Usu;
	}

	public void setUsuario_Usu(String usuario_usu) {
		Usuario_Usu = usuario_usu;
	}

	public String getClave_Usu() {
		return Clave_Usu;
	}

	public void setClave_Usu(String clave_usu) {
		Clave_Usu = clave_usu;
	}

}
