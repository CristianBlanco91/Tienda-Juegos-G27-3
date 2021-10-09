package com.example.Tienda_Azar_R.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

import com.example.Tienda_Azar_R.Interfaces.Service.IProveedorService;
import com.example.Tienda_Azar_R.Model.ProveedorModel;

@Controller
@RequestMapping
public class ProveedorController {
	
	@Autowired
	private IProveedorService service;
	
	@GetMapping("/listarProv")
	public String listarProv(Model model)
	{
		List<ProveedorModel> proveedores = service.listar();
		model.addAttribute("proveedores",service.listar());
		return "Proveedores";
	}
	
	@GetMapping("/Menu")
	public String mostrarMenu()
	{
		return "Menu";
	}
	
	@GetMapping("/Login")
	public String mostrarLogin()
	{
		return "Login";
	}
	
	@GetMapping("/newProv")
	public String agregarProv(Model model)
	{
		model.addAttribute("proveedor", new ProveedorModel());
		return "formProv";
	}
	
	@PostMapping("/saveProv")
	public String saveProv(@Validated ProveedorModel p, Model model) 
	{
		service.save(p);
		return "redirect:/listarProv";
	}
	
	@GetMapping("/editarProv/{NIT_Prov}")
	public String editarProv(@PathVariable int NIT_Prov, Model model)
	{
		Optional<ProveedorModel> proveedor = service.listarId(NIT_Prov);
		model.addAttribute("proveedor",proveedor);
		
		return "formProv";
	}
	
	@GetMapping("/eliminarProv/{NIT_Prov}")
	public String deleteProv(@PathVariable int NIT_Prov, Model model)
	{
		service.delete(NIT_Prov);
		return "redirect:/listarProv";
	}

}
