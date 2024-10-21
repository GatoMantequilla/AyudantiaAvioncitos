package org.example;

public class Pasajero extends Persona {

	private Vuelo vuelo;

	public Pasajero(String nombre, int edad, Pasaporte pasaporte) {
		super(nombre, edad, pasaporte);
		//Heredamos de la clase de Persona con el "super"
	}

	//........................................................................................

	public String getNombre() {
		return super.getNombre();
	}

	public Pasaporte getPasaporte() {
		return super.getPasaporte();
	}

	public Vuelo getVuelo() {
		return this.vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

}
