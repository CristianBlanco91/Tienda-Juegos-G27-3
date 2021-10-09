package com.example.Tienda_Azar_R.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Tienda_Azar_R.Interfaces.ICliente;
import com.example.Tienda_Azar_R.Interfaces.Service.IClienteService;
import com.example.Tienda_Azar_R.Model.ClienteModel;


@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private ICliente data;

	@Override
	public List<ClienteModel> listar() {
		return (List<ClienteModel>)data.findAll();
	}

	@Override
	public Optional<ClienteModel> listarId(int Cedula_Cli) {
		// TODO Auto-generated method stub
		return data.findById(Cedula_Cli);
	}

	@Override
	public int save(ClienteModel p) {
		int res = 0;
		ClienteModel cliente = data.save(p);
		if(!cliente.equals(null))
			res=1;
			
		return res;
	}

	@Override
	public void delete(int Cedula_Cli) {
		
		data.deleteById(Cedula_Cli);
		
	}

}
