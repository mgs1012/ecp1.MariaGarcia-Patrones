package ecp1.patrones.AplicacionAlquilerVehiculos;

public abstract class Vehiculo {
	
	private int id;
	
	private String descripcion;
	
	public Vehiculo(int id, String descripcion){
		
		this.setId(id);
		this.setDescripcion(descripcion);	
	}	
	public abstract String toString();

	public abstract double calcularPrecio(int dias);
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
