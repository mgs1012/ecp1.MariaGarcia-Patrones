package ecp1.patrones.AplicacionAlquilerVehiculos;

public enum Categoria {
	A(10.00),
	B(15.00),
	C(20.00);
	
	public double precioBase;
	
	private Categoria(double precioBase){
		this.precioBase = precioBase;
		
	}
}
