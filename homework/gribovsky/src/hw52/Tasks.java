package hw52;

public class Tasks {
    public static void main(String[] args) {

        //tasks 1
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int el: array) {
            sum += el;
        }

        System.out.println(sum);


        //task2
        //необходимо вывести максимальное значение массива.

        int max = array[0];
        for (int el: array) {
            if(max < el){
                max = el;
            }
        }
        System.out.println(max);

        //task3
        //необходимо вывести минимальное значение массива.
        int min = array[0];
        for (int el: array) {
            if (min>el){
                min = el;
            }
        }
        System.out.println(min);

        //task4
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum2 = 0;
        for (int el: array2){
            sum += el;
        }
        System.out.printf("%.2f",(double) sum/array2.length);




    }
}
