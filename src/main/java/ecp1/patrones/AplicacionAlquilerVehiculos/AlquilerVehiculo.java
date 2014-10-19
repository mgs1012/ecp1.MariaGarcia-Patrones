package ecp1.patrones.AplicacionAlquilerVehiculos;

import java.util.HashMap;
import java.util.Map;

public class AlquilerVehiculo {
		
	public Map<Integer,Vehiculo> vehiculos = new HashMap<Integer,Vehiculo>();
	
	public void altaVehiculo(Vehiculo vehiculo){
		vehiculos.put(vehiculo.id, vehiculo);
		
	}	
	//vista void
	public Vehiculo buscarVehiculo(int id){
		assert vehiculos.get(id)!=null : "El vehículo no ha podido ser añadido.";
		return vehiculos.get(id);	
	}
	
	public Map<Integer, Vehiculo> obtenerVehiculos() {
		return this.vehiculos;
	}

	public String toString(){
		return vehiculos.toString();
		
	}


}
