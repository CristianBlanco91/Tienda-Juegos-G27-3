package com.example.Tienda_Azar_R.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.example.Tienda_Azar_R.Model.ClienteModel;

public interface IClienteService {
	
	public List<ClienteModel> listar();
	public Optional<ClienteModel>listarId(int id);
	public int save(ClienteModel p);
	public void delete(int id);

}
