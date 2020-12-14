package util;

import java.util.Scanner;

import model.Persona;

public class ServicioPersona {
	
	public Persona crearPersona() {
		Scanner leer = new Scanner(System.in);
		Persona persona = new Persona();
		System.out.println("Ingrese el nombre de la persona");
		persona.setNombre(leer.next());
		System.out.println("Ingrese fecha de nacimiento de la persona (yyyy/MM/dd)");
		persona.setFechaNacimiento(leer.next());
		return persona;
		
	}

}
