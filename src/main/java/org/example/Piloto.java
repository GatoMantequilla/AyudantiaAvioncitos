package org.example;

public class Piloto extends Persona {

	private String id;

	public Piloto(String id, String nombre, int edad, Pasaporte pasaporte) {
		super(nombre, edad, pasaporte);
		this.id = id;
	}

	//----------------------------------------------------------------------------------

	public String getId() {
		return this.id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return super.getNombre();
	}

	//----------------------------------------------------------------------------------

}
