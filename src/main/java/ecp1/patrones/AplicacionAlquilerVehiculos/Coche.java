package ecp1.patrones.AplicacionAlquilerVehiculos;

public class Coche extends Vehiculo{
	
	private Categoria categoria;
	private static final int DIAFIN_PRIMERINTERVALO = 3;
	private static final int DIAFIN_SEGUNDOINTERVALO = 7;
	private static final double DESCUENTO_1 = 0.8;
	private static final double DESCUENTO2 = 0.5;

	public Coche(int id, String descripcion, Categoria categoria) {
		super(id, descripcion);
		this.categoria = categoria;
	}

	@Override
	public double calcularPrecio(int dias) {
		double total = 0.0;
		if (dias > 0) {
			for (int i = 1; i <= dias; i++) {
				if (i <= DIAFIN_PRIMERINTERVALO) {
					total += this.categoria.precioBase;
				} else if (i > DIAFIN_PRIMERINTERVALO && i <= DIAFIN_SEGUNDOINTERVALO) {
					total += this.categoria.precioBase * DESCUENTO_1;
				} else {
					total += this.categoria.precioBase * DESCUENTO2;
				}
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Coche: [id: " + this.getId() + "], [descripcion: " + this.getDescripcion() + "]";
	}

}
