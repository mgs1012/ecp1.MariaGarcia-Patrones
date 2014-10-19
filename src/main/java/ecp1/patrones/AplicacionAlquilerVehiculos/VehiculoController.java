package ecp1.patrones.AplicacionAlquilerVehiculos;

import upm.jbb.IO;

public class VehiculoController {
	
    private AlquilerVehiculo gestorVehiculo = new AlquilerVehiculo();
	
	public void mostrarVehiculos(){
    	IO.out.println(gestorVehiculo.toString());
    }
	
    public void mostrarAltaBicicleta(){
    	this.gestorVehiculo.altaVehiculo((Vehiculo) IO.in.read(Bicicleta.class, "Introduzca un id para la bicicleta y su descripción."));
    }
    
    public void mostrarAltaCoche(){
    	this.gestorVehiculo.altaVehiculo((Vehiculo) IO.in.read(Coche.class, "Introduzca un id para el coche y su descripción."));
    }
    
    public void mostrarAltaMoto(){
    	this.gestorVehiculo.altaVehiculo((Vehiculo) IO.in.read(Moto.class, "Introduzca un id para la moto y su descripción."));
    }
    
    public void verPrecio(){
        IO.out.println(this.gestorVehiculo.buscarVehiculo(IO.in.readString("Introduzca el id del vehículo para calcular su precio.")).calcularPrecio(IO.in.readInt("Introduzca el número de días a alquilar.")) + "€");
    }
	
	

}
