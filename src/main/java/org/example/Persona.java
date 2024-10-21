package org.example;

public class Persona {

	private String nombre;
	private int edad;
	private Pasaporte pasaporte;

	public Persona(String nombre, int edad, Pasaporte pasaporte) {
		this.nombre = nombre;
		this.edad = edad;
		this.pasaporte = pasaporte;
	}

	//........................................................................................

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	private void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	//........................................................................................
}
