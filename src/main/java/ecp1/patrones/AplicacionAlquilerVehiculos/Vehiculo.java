package ecp1.patrones.AplicacionAlquilerVehiculos;

public abstract class Vehiculo {
	
	protected int id;
	
	protected String descripcion;
	
	public Vehiculo(int id, String descripcion){
		
		this.id = id;
		this.descripcion = descripcion;	
	}	
	public abstract String toString();

	public abstract double calcularPrecio(int dias);
	

}
