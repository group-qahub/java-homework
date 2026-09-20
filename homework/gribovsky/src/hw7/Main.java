package hw7;


public class Main {
    public static int Add(int a, int b) {
        return a + b;

    }

    public static int Subtract(int a, int b) {
        return a - b;

    }

    public static int Multiply(int a, int b) {
        return a * b;

    }

    public static int Divide(int a, int b) {
        return a / b;

    }



    public static void main(String[] args) {

        int a = 123;
        int b = 24;

        System.out.println(Add(a, b));
        System.out.println(Subtract(a, b));
        System.out.println(Multiply(a, b));
        System.out.println(Divide(a, b));

    }








}
