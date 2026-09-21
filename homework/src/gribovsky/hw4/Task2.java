package hw4;

public class Task2 {

    public static void main(String[] args) {
//        Задача №2
//        Необходимо возводить в степень число 5 начиная с показателя 1,
//        пока результат возведения в степень меньше 10000, вывести результат каждого возведения в степень.

        int i = 1;
        while (Math.pow(5, i) < 1000) {
            System.out.println("5 в степени " + i + " равно " + (int)Math.pow(5, i));
            i ++;
        }

    }
}
