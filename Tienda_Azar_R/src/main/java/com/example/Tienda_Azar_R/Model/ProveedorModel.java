package com.example.Tienda_Azar_R.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Proveedores")

public class ProveedorModel {
	
	@Id
	private int NIT_Prov;
	private String Nombre_Prov;
	private String Direccion_Prov;
	private int Telefono_Prov;
	private String Ciudad_Prov;
	
	public ProveedorModel()
	{
		
	}

	public ProveedorModel(int nit_prov, String nombre_prov, String direccion_prov, int telefono_prov, String ciudad_prov) {
		super();
		NIT_Prov = nit_prov;
		Nombre_Prov = nombre_prov;
		Direccion_Prov = direccion_prov;
		Telefono_Prov = telefono_prov;
		Ciudad_Prov = ciudad_prov;
	}

	public int getNIT_Prov() {
		return NIT_Prov;
	}

	public void setNIT_Prov(int nit_prov) {
		NIT_Prov = nit_prov;
	}

	public String getNombre_Prov() {
		return Nombre_Prov;
	}

	public void setNombre_Prov(String nombre_prov) {
		Nombre_Prov = nombre_prov;
	}

	public String getDireccion_Prov() {
		return Direccion_Prov;
	}

	public void setDireccion_Prov(String direccion_prov) {
		Direccion_Prov = direccion_prov;
	}

	public int getTelefono_Prov() {
		return Telefono_Prov;
	}

	public void setTelefono_Prov(int telefono_prov) {
		Telefono_Prov = telefono_prov;
	}

	public String getCiudad_Prov() {
		return Ciudad_Prov;
	}

	public void setCiudad_Prov(String ciudad_prov) {
		Ciudad_Prov = ciudad_prov;
	}

}
