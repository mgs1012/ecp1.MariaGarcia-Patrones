package ecp1.patrones.AplicacionVehiculos;

public enum Categoria {
	A(10.00),
	B(15.00),
	C(20.00);
	
	public final double precioBase;
	
	private Categoria(double precioBase){
		this.precioBase = precioBase;
		
	}
}
