package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Vuelo {

	private String id;
	private List<Pasajero> pasajeros;
	private Piloto piloto;
	private Date fechaInicio;
	private Date fechaAterrizar;
	private String lugarAterrizar;
	private String lugarInicio;

	public Vuelo(String id, Date fechaInicio, Date fechaAterrizar, String lugarAterrizar, String lugarInicio) {
		this.id = id;
		this.pasajeros = new ArrayList<>();
		this.fechaInicio = fechaInicio;
		this.fechaAterrizar = fechaAterrizar;
		this.lugarAterrizar = lugarAterrizar;
		this.lugarInicio = lugarInicio;
	}

	public void agregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public boolean validarTodosLosPasaportes() {
		for (Pasajero pasajero : pasajeros) {
			if (!pasajero.getPasaporte().esValido()) {
				return false;
			}
		}
		return true;
	}

	//........................................................................................

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public String getId() {
		return this.id;
	}

	private void setId(String id) {
		this.id = id;
	}

	private void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	//........................................................................................

	public void imprimirInformacionDeUsuarios() {
		for (Pasajero pasajero : pasajeros) {
			System.out.println("Pasajero: " + pasajero.getNombre());
		}
		System.out.println("Piloto: " + (piloto != null ? piloto.getNombre() : "No asignado"));
	}

	public Collection<Object> getPasajeros() {
        return new ArrayList<>(this.pasajeros);
	}

	public Persona getPiloto() {
		return this.piloto;
	}
}
