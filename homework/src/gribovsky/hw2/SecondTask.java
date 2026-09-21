package hw2;

public class SecondTask {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        System.out.println("Значение до перемены местами");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Значение после перемены местами");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
