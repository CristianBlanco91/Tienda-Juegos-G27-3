package com.example.Tienda_Azar_R.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tienda_Azar_R.Interfaces.IUsuario;
import com.example.Tienda_Azar_R.Interfaces.Service.IUsuarioService;
import com.example.Tienda_Azar_R.Model.UsuarioModel;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;

	@Override
	public List<UsuarioModel> listar() {
		return (List<UsuarioModel>)data.findAll();
	}

	@Override
	public Optional<UsuarioModel> listarId(int Cedula) {
		// TODO Auto-generated method stub
		return data.findById(Cedula);
	}

	@Override
	public int save(UsuarioModel p) {
		int res = 0;
		UsuarioModel usuario = data.save(p);
		if(!usuario.equals(null))
			res=1;
			
		return res;
	}

	@Override
	public void delete(int Cedula) {
		
		data.deleteById(Cedula);
		
	}

}
