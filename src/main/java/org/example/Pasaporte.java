package org.example;

import java.util.Date;

public class Pasaporte {

	private int idPasaporte;
	private String nacionalidad;
	private int numeroDeHojas;
	private Date fechaDeExpiracion;

	public Pasaporte(int idPasaporte, String nacionalidad, int numeroDeHojas, Date fechaDeExpiracion) {
		this.idPasaporte = idPasaporte;
		this.nacionalidad = nacionalidad;
		this.numeroDeHojas = numeroDeHojas;
		this.fechaDeExpiracion = fechaDeExpiracion;
	}

	//........................................................................................

	private int getIdPasaporte() {
		return this.idPasaporte;
	}

	private void setIdPasaporte(int idPasaporte) {
		this.idPasaporte = idPasaporte;
	}

	private String getNacionalidad() {
		return this.nacionalidad;
	}

	private void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	private int getNumeroDeHojas() {
		return this.numeroDeHojas;
	}

	private void setNumeroDeHojas(int numeroDeHojas) {
		this.numeroDeHojas = numeroDeHojas;
	}

	private Date getFechaDeExpiracion() {
		return this.fechaDeExpiracion;
	}

	private void setFechaDeExpiracion(Date fechaDeExpiracion) {
		this.fechaDeExpiracion = fechaDeExpiracion;
	}

	//........................................................................................

	public boolean esValido() {
		Date currentDate = new Date();
		return getFechaDeExpiracion().after(currentDate) && getNumeroDeHojas() > 0;
	}

}
