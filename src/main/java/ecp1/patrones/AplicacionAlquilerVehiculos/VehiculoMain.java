package ecp1.patrones.AplicacionAlquilerVehiculos;

import upm.jbb.IO;

public class VehiculoMain {
	
	//App vehiculos IO --> ejecutar
	
	public static void main(String[] args) {
		VehiculoController controller = new VehiculoController();
		IO.out.addController(controller);
	}
	
}
