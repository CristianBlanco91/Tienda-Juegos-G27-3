package com.example.Tienda_Azar_R.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Tienda_Azar_R.Model.ProveedorModel;

@Repository
public interface IProveedor extends CrudRepository<ProveedorModel, Integer> {

}
