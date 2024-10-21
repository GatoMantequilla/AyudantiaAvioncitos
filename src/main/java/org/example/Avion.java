package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Avion {

	private int id;
	private int capacidad;
	private List<Vuelo> vuelos;

	public Avion(int id, int capacidad) {
		this.id = id;
		this.capacidad = capacidad;
		this.vuelos = new ArrayList<>();
	}

	//........................................................................................

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	//........................................................................................

	public void agregarVuelo(Vuelo vuelo) {
		this.vuelos.add(vuelo);
	}

	public void buscarUsuariosPorFecha(Date fecha) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getFechaInicio().equals(fecha)) {
				vuelo.imprimirInformacionDeUsuarios();
			}
		}
	}

	public void buscarUsuariosPorVuelo(String idVuelo) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getId().equals(idVuelo)) {
				vuelo.imprimirInformacionDeUsuarios();
			}
		}
	}
}
