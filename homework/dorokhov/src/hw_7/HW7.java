public class HW7 {
//    Задача №1
//
//    Необходимо написать 4 метода:
//    сложение 2х чисел
//    вычитание 2х чисел
//    умножение 2х чисел
//    деление 2х чисел

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtrack(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }


    void main() {
        IO.println(add(4, 5));
        IO.println(subtrack(4, 5));
        IO.println(multiply(4, 5));
        IO.println(divide(4, 5));
    }

}
