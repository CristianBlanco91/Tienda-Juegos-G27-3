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

import com.example.Tienda_Azar_R.Interfaces.Service.IClienteService;
import com.example.Tienda_Azar_R.Model.ClienteModel;

@Controller
@RequestMapping
public class ClienteController {
	@Autowired
	private IClienteService service;
	
	@GetMapping("/listarCli")
	public String listarCli(Model model)
	{
		List<ClienteModel> clientes = service.listar();
		model.addAttribute("clientes",service.listar());
		return "Clientes";
	}
		
	@GetMapping("/newCli")
	public String agregarCli(Model model)
	{
		model.addAttribute("cliente", new ClienteModel());
		return "formCli";
	}
	
	@PostMapping("/saveCli")
	public String saveCli(@Validated ClienteModel p, Model model) 
	{
		service.save(p);
		return "redirect:/listarCli";
	}
	
	@GetMapping("/editarCli/{Cedula_Cli}")
	public String editarCli(@PathVariable int Cedula_Cli, Model model)
	{
		Optional<ClienteModel> cliente = service.listarId(Cedula_Cli);
		model.addAttribute("cliente",cliente);
		
		return "formCli";
	}
	
	@GetMapping("/eliminarCli/{Cedula_Cli}")
	public String deleteCli(@PathVariable int Cedula_Cli, Model model)
	{
		service.delete(Cedula_Cli);
		return "redirect:/listarCli";
	}

}
