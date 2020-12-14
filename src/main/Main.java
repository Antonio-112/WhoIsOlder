package main;


import model.Persona;
import util.Fechas;
import util.ServicioPersona;

public class Main {

	public static void main(String[] args) {
		Fechas util = new Fechas();
		ServicioPersona servicioPersona = new ServicioPersona();
		Persona persona1 = servicioPersona.crearPersona();
		Persona persona2 = servicioPersona.crearPersona();
		util.whoIsOlder(persona1, persona2);	
	}

}
