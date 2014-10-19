package ecp1.patrones.AplicacionAlquilerVehiculos;

import upm.jbb.IO;

public class VehiculoController {
	
    private AlquilerVehiculo alqVehiculo = new AlquilerVehiculo();
	
	public void mostrarVehiculos(){
    	IO.out.println(alqVehiculo.toString());
    }
	
    public void mostrarAltaBicicleta(){
    	this.alqVehiculo.altaVehiculo((Vehiculo) IO.in.read(Bicicleta.class, "Introduzca un id para la bicicleta y su descripción."));
    }
    
    public void mostrarAltaCoche(){
    	this.alqVehiculo.altaVehiculo((Vehiculo) IO.in.read(Coche.class, "Introduzca un id para el coche y su descripción."));
    }
    
    public void mostrarAltaMoto(){
    	this.alqVehiculo.altaVehiculo((Vehiculo) IO.in.read(Moto.class, "Introduzca un id para la moto y su descripción."));
    }
    
    public void verPrecio(){
        IO.out.println(this.alqVehiculo.buscarVehiculo(IO.in.readInt("Introduzca el id del vehículo para calcular su precio.")).calcularPrecio(IO.in.readInt("Introduzca el número de días a alquilar.")) + "€");
    }
	
}
