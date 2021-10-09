package com.example.Tienda_Azar_R.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tienda_Azar_R.Interfaces.IProveedor;
import com.example.Tienda_Azar_R.Interfaces.Service.IProveedorService;
import com.example.Tienda_Azar_R.Model.ProveedorModel;

@Service
public class ProveedorService implements IProveedorService{
	
	@Autowired
	private IProveedor data;

	@Override
	public List<ProveedorModel> listar() {
		return (List<ProveedorModel>)data.findAll();
	}

	@Override
	public Optional<ProveedorModel> listarId(int NIT_Prov) {
		// TODO Auto-generated method stub
		return data.findById(NIT_Prov);
	}

	@Override
	public int save(ProveedorModel p) {
		int res = 0;
		ProveedorModel proveedor = data.save(p);
		if(!proveedor.equals(null))
			res=1;
			
		return res;
	}

	@Override
	public void delete(int NIT_Prov) {
		
		data.deleteById(NIT_Prov);
		
	}

}
