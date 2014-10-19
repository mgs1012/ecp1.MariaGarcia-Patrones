package ecp1.patrones.AplicacionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp1.patrones.AplicacionAlquilerVehiculos.AlquilerVehiculo;
import ecp1.patrones.AplicacionAlquilerVehiculos.Categoria;
import ecp1.patrones.AplicacionAlquilerVehiculos.Coche;
import ecp1.patrones.AplicacionAlquilerVehiculos.Vehiculo;

public class AlquilerVehiculoTest {

	private AlquilerVehiculo alqvehiculo;

	@Before
	public void before() {
		this.alqvehiculo = new AlquilerVehiculo();
	}
/*
	@Test
	public void testAltaVehiculo() {
		this.alqvehiculo.altaVehiculo(null);
	}

	@Test
	public void testBuscarVehiculos() {
		this.alqvehiculo.obtenerVehiculos();
	}
*/
	@Test
	public void testAltaYBuscarVehiculo() {
		alqvehiculo.altaVehiculo(new Coche(1, "Automático",Categoria.A));
		Vehiculo vehiculo = alqvehiculo.buscarVehiculo(1);
		assertEquals(1, vehiculo.id);
		assertEquals("Automático", vehiculo.descripcion);
	}

}
