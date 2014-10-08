package ecp1.patrones.AplicacionVehiculos;

public abstract class Vehiculo {
	
	protected int id;
	protected String descripcion;

	public abstract double calcularPrecio();
	
	public abstract String toString();

}
