public class HW5_2 {
    //    Задача №1
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести сумму всех значений массива.
//    void main() {
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        IO.println("Сумма всех значений массива: " + sum);
//    }

    //    Задача №2
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести максимальное значение массива.
//    void main() {
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int maxValue = Integer.MIN_VALUE;
//
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] > maxValue) {
//                maxValue = array[i];
//            }
//        }
//        IO.println("Максимальное значение массива: " + maxValue);
//    }

    //            Задача №3
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести минимальное значение массива.
//    void main() {
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int minValue = Integer.MAX_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < minValue) {
//                minValue = array[i];
//            }
//        }
//        IO.println("Минимальное значение массива: " + minValue);
//    }

    //            Задача №4
//    Дан массив:
//    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//    необходимо вывести среднее арифметическое всех значений массива.
    void main() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        IO.println("Среднее арифметическое всех значений массива: " + (double) sum / array.length);
    }
}
