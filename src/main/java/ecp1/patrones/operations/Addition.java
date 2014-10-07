package ecp1.patrones.operations;

public class Addition extends MathOperations{


    public Addition(final int operator1, final int operator2) {
    	super(operator1, operator2);
    }

    public int calcularOperacion() {
        return this.operator1 + this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "+" + operator2 + "]";
    }

}

