package com.example.Tienda_Azar_R.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.example.Tienda_Azar_R.Model.ProveedorModel;

public interface IProveedorService {
	
	public List<ProveedorModel> listar();
	public Optional<ProveedorModel>listarId(int id);
	public int save(ProveedorModel p);
	public void delete(int id);

}
