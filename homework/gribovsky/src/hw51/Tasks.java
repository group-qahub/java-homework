package hw51;

import java.sql.Array;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {


        //task1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int el: array){
            if (el%2 == 0) {
                System.out.print(el + " ");
            }
        }
        System.out.println();

        //task2
        //необходимо вывести все значения массива больше 5.
        for (int el: array){
            if (el > 5) {
                System.out.print(el + " ");
            }
        }
        System.out.println();

        //task3
        //необходимо увеличить все значения массива на 15.
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            array2[i] = array[i] + 15;
        }
        System.out.println(Arrays.toString(array2));

    }
}
