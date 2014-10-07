package ecp1.patrones;

public class Substraction extends MathOperations{

    public Substraction(final int operator1, final int operator2) {
        super(operator1, operator2);
    }

    public int calcularOperacion() {
        return this.operator1 - this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "-" + operator2 + "]";
    }
    
}

