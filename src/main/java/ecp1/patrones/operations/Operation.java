package ecp1.patrones.operations;

public class Operation {
    private MathOperations[] operators = new MathOperations[10];

    public void add(MathOperations operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;
                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }

    public int total() {
        int result = 0;
        String separator = "";
        for (MathOperations operando : operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                result += operando.calcularOperacion();
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }

}