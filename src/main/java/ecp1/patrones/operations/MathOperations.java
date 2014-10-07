package ecp1.patrones.operations;

public abstract class MathOperations {

	protected final int operator1;
	protected final int operator2;
	
	public MathOperations(int operator1, int operator2) {
		this.operator1=operator1;
		this.operator2=operator2;
	}

	public abstract int calcularOperacion();
	
	 public int getOperator1() {
	        return operator1;
	    }

	    public int getOperator2() {
	        return operator2;
	    }
}
