package ecp1.patrones.AplicacionAlquilerVehiculos;

public class Moto extends Vehiculo {

	public static final int DIAS_SEMANA = 7;
	public static final double PRECIO_BASE = 8.0;
	public static final double PRECIO_CON_DESCUENTO = 7.0;

	public Moto(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public double calcularPrecio(int dias) {
		double total = 0.0;
		for (int i = 0; i < dias; i++) {
			if (dias <= DIAS_SEMANA) {
				total += Moto.PRECIO_BASE;
			} else {
				total += Moto.PRECIO_CON_DESCUENTO;
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Moto: [id: " + this.id + "], [descripcion: " + this.descripcion + "]";
	}

}
