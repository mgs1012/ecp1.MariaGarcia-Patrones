package ecp1.patrones.AplicacionVehiculosTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import ecp1.patrones.AplicacionAlquilerVehiculos.Bicicleta;
import ecp1.patrones.AplicacionAlquilerVehiculos.Vehiculo;


	public class BicicletaTest extends VehiculoTest {

		private Vehiculo bicicleta;	

		@Before
		public void before() {
			bicicleta = new Bicicleta(2, "Eléctrica");
		}

		@Test
		public void testCalcularPrecio() {
			assertEquals(3.0, this.bicicleta.calcularPrecio(1), 10e-3);
			assertEquals(6.0, this.bicicleta.calcularPrecio(2), 10e-3);
			assertEquals(8.0, this.bicicleta.calcularPrecio(3), 10e-3);
			assertEquals(12.0, this.bicicleta.calcularPrecio(5), 10e-3);		
		}

		@Test
		public void testToString() {
			assertEquals("Bicicleta: [id: 2], [descripcion: Eléctrica]", bicicleta.toString());
		}

}
