package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aeropuerto {

	private String nombre;
	private String ubicacion;
	private List<Avion> aviones;

	public Aeropuerto(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.aviones = new ArrayList<>();
	}

	//........................................................................................

	public String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	private void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Avion> getAviones() {
		return this.aviones;
	}

	private void setAviones(List<Avion> aviones) {
		this.aviones = aviones;
	}

	//........................................................................................

	//Gestion de avioncitos

	public void agregarAvion(Avion avion) {
		this.aviones.add(avion);
	}

	public void registrarVuelo(Avion avion, Vuelo vuelo) {
		avion.agregarVuelo(vuelo);
	}

	public void registrarPasajeroEnVuelo(Vuelo vuelo, Pasajero pasajero) {
		vuelo.agregarPasajero(pasajero);
	}

	public void registrarPilotoEnVuelo(Vuelo vuelo, Piloto piloto) {
		vuelo.setPiloto(piloto);
	}

	public boolean validarPasaportes(Vuelo vuelo) {
		return vuelo.validarTodosLosPasaportes();
	}

	public void buscarUsuariosPorFecha(Date fecha) {
		for (Avion avion : aviones) {
			avion.buscarUsuariosPorFecha(fecha);
		}
	}

	public void buscarUsuariosPorVuelo(String idVuelo) {
		for (Avion avion : aviones) {
			avion.buscarUsuariosPorVuelo(idVuelo);
		}
	}
}
