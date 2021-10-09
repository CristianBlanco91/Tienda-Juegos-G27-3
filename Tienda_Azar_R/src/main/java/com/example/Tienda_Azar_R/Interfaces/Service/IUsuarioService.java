package com.example.Tienda_Azar_R.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.example.Tienda_Azar_R.Model.UsuarioModel;

public interface IUsuarioService {
	
	public List<UsuarioModel> listar();
	public Optional<UsuarioModel>listarId(int id);
	public int save(UsuarioModel p);
	public void delete(int id);

}
