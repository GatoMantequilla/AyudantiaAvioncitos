package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AeropuertoTest {

    private Aeropuerto aeropuerto;
    private Avion avion;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private Piloto piloto;

    @BeforeEach
    void setUp() {
        aeropuerto = new Aeropuerto("AeropuertoPrueba", "Freire");
        avion = new Avion(1, 50);
        vuelo = new Vuelo("V123", new Date(), new Date(), "CHilenn", "CUba");
        pasajero = new Pasajero("Juan", 25, new Pasaporte(12345, "Chileno", 10, new Date()));
        piloto = new Piloto("P001", "Carlos", 45, new Pasaporte(54321, "Argentiniamn", 5, new Date()));
    }

    @Test
    void agregarAvion() {
        aeropuerto.agregarAvion(avion);
        assertEquals(1, aeropuerto.getAviones().size(), "El avion no se agrego");
    }

    @Test
    void registrarVuelo() {
        aeropuerto.agregarAvion(avion);
        aeropuerto.registrarVuelo(avion, vuelo);
        assertEquals(1, avion.getVuelos().size(), "No se registro el vuelo del avion");
    }

    @Test
    void registrarPasajeroEnVuelo() {
        aeropuerto.agregarAvion(avion);
        aeropuerto.registrarVuelo(avion, vuelo);
        aeropuerto.registrarPasajeroEnVuelo(vuelo, pasajero);
        assertEquals(1, vuelo.getPasajeros().size(), "No se agrego el pasajero al vuelo del avion");
    }

    @Test
    void registrarPilotoEnVuelo() {
        aeropuerto.agregarAvion(avion);
        aeropuerto.registrarVuelo(avion, vuelo);
        aeropuerto.registrarPilotoEnVuelo(vuelo, piloto);
        assertEquals("Carlos", vuelo.getPiloto().getNombre(), "No se registro el piloto ");
    }

    @Test
    void validarPasaportes() {
        aeropuerto.agregarAvion(avion);
        aeropuerto.registrarVuelo(avion, vuelo);
        aeropuerto.registrarPasajeroEnVuelo(vuelo, pasajero);
        boolean todosValidos = aeropuerto.validarPasaportes(vuelo);
        assertTrue(todosValidos, "AL menos uno de todos los pasaportes fallo");
    }

    @org.junit.Test
    public void buscarUsuariosPorFecha() {
        aeropuerto.agregarAvion(avion);
        aeropuerto.registrarVuelo(avion, vuelo);
        aeropuerto.registrarPasajeroEnVuelo(vuelo, pasajero);
        aeropuerto.buscarUsuariosPorFecha(vuelo.getFechaInicio());
    }

    @Test
    void buscarUsuariosPorVuelo() {
        aeropuerto.agregarAvion(avion);
        aeropuerto.registrarVuelo(avion, vuelo);
        aeropuerto.registrarPasajeroEnVuelo(vuelo, pasajero);
        aeropuerto.buscarUsuariosPorVuelo(vuelo.getId());
    }
}
