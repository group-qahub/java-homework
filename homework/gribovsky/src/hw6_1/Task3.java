package hw6_1;

public class Task3 {
    /*
     * Задача №3
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести количество элементов в массиве.
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //System.out.println(array.length);
        int count = 0;

        for(int i = 0; i < array.length; i ++) {
            count += array[i].length;
        }
        System.out.println(count);



    }

}
