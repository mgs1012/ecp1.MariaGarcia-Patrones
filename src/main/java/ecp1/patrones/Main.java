package ecp1.patrones;

public class Main {

    public static void main(String[] args) {
        Operation operations = new Operation();
        operations.add(new Addition(3, 4));

        System.out.println("Total1:" + operations.total());

        operations.add(new Substraction(1, 1));
        operations.add(new Addition(3, 5));
        operations.add(new Substraction(4, 1));
        operations.add(new Addition(3, 6));
        operations.add(new Substraction(3, 2));

        System.out.println("Total2:" + operations.total());
    }
}
