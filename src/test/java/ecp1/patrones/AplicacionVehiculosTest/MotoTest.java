package ecp1.patrones.AplicacionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp1.patrones.AplicacionAlquilerVehiculos.Moto;
import ecp1.patrones.AplicacionAlquilerVehiculos.Vehiculo;

public class MotoTest extends VehiculoTest {

	private Vehiculo moto;	

	@Before
	public void before() {
		moto = new Moto(4, "220cc");
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(8.0, this.moto.calcularPrecio(1), 10e-3);
		assertEquals(24.0, this.moto.calcularPrecio(3), 10e-3);
		assertEquals(56.0, this.moto.calcularPrecio(7), 10e-3);
		assertEquals(56.0, this.moto.calcularPrecio(8), 10e-3);		
	}

	@Test
	public void testToString() {
		assertEquals("Moto: [id: 4], [descripcion: 220cc]", moto.toString());
	}

}
