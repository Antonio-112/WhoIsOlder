package model;

public class Persona {
	
	private String nombre;
	private String fechaNacimiento;
	
	
	public Persona() {
		super();
	}


	public Persona(String nombre, String fecha) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fecha;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fecha) {
		this.fechaNacimiento = fecha;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fecha=" + fechaNacimiento + "]";
	}
	
	
	
	

}
