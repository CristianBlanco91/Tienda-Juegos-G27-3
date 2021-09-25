package com.Controlador.Tienda_Juegos_Azar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DAO.tienda.conexion;

@SpringBootApplication
public class TiendaJuegosAzarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaJuegosAzarApplication.class, args);
		
		conexion conn = new conexion();
		conn.getCon();
	
	}

}
