package ecp1.patrones.AplicacionAlquilerVehiculos;

import upm.jbb.IO;

public class VehiculoMain {
	
	public static void main(String[] args) {
		AlquilerVehiculo controlador = new AlquilerVehiculo();
		IO.out.addController(controlador);
	}
}