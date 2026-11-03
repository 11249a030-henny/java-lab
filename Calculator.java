class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int sum = add(15, 25);
        int product = multiply(15, 25);

        System.out.println("Addition = " + sum);
        System.out.println("Multiplication = " + product);
    }
}
