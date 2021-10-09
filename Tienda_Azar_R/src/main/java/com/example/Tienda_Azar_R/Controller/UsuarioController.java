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

import com.example.Tienda_Azar_R.Interfaces.Service.IUsuarioService;
import com.example.Tienda_Azar_R.Model.UsuarioModel;

@Controller
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listarUsu")
	public String listarUsu(Model model)
	{
		List<UsuarioModel> usuarios=service.listar();
		model.addAttribute("usuarios",service.listar());
		return "Usuarios";
	}
	
	@GetMapping("/newUsu")
	public String agregar(Model model)
	{
		model.addAttribute("usuario", new UsuarioModel());
		return "formUsu";
	}
	
	@PostMapping("/saveUsu")
	public String saveUsu(@Validated UsuarioModel p, Model model) 
	{
		service.save(p);
		return "redirect:/listarUsu";
	}
	
	@GetMapping("/editarUsu/{Cedula_Usu}")
	public String editarUsu(@PathVariable int Cedula_Usu, Model model)
	{
		Optional<UsuarioModel> usuario = service.listarId(Cedula_Usu);
		model.addAttribute("usuario", usuario);
		
		return "formUsu";
	}
	
	@GetMapping("/eliminarUsu/{Cedula_Usu}")
	public String deleteUsu(@PathVariable int Cedula_Usu, Model model)
	{
		service.delete(Cedula_Usu);
		return "redirect:/listarUsu";
	}

}
