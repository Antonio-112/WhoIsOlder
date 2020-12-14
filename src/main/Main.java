package main;

import java.util.Scanner;

import model.Persona;
import util.Fechas;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Fechas util = new Fechas();
		Persona persona1 = new Persona();
		System.out.println("Ingrese el nombre de la persona 1");
		persona1.setNombre(leer.next());
		System.out.println("Ingrese fecha de nacimiento de la persona 1 (yyyy/MM/dd)");
		persona1.setFechaNacimiento(leer.next());
		Persona persona2 = new Persona();
		System.out.println("Ingrese el nombre de la persona 2");
		persona2.setNombre(leer.next());
		System.out.println("Ingrese fecha de nacimiento de la persona 2 (yyyy/MM/dd)");
		persona2.setFechaNacimiento(leer.next());
		
		util.whoIsOlder(persona1, persona2);
		
		
		
	}

}
