package ecp1.patrones.AplicacionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp1.patrones.AplicacionVehiculos.AlquilerVehiculo;

public class AlquilerVehiculoTest {
	
	private AlquilerVehiculo alqvehiculo;

	@Before
	public void before(){
		this.alqvehiculo = new AlquilerVehiculo(); 
	}
	
	@Test
	public void testAltaVehiculo() {
		this.alqvehiculo.altaVehiculo();
	}

	@Test
	public void testBuscarVehiculos() {
		this.alqvehiculo.buscarVehiculos();
	}

	@Test
	public void testPrecioVehiculo() {		
		this.alqvehiculo.precioVehiculo(1, 2);
	}

}
