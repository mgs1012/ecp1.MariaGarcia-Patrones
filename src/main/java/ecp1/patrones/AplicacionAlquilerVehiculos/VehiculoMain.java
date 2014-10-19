package ecp1.patrones.AplicacionAlquilerVehiculos;

import upm.jbb.IO;

public class VehiculoMain {
	
	public static void main(String[] args) {
		AlquilerVehiculo controller = new AlquilerVehiculo();
		IO.out.addController(controller);
	}
}
