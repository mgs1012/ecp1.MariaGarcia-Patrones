package ecp1.patrones;

public class Multiplication extends MathOperations{

	public Multiplication(int operator1, int operator2) {
		super(operator1, operator2);
	}

	@Override
	public int calcularOperacion() {
		return this.operator1*this.operator2;
	}
	 @Override
	    public String toString() {
	        return "[" + operator1 + "x" + operator2 + "]";
	    }

}
