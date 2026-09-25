package hw6_1;

public class Task2 {
    /*
     Задача №2
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести максимальное значение массива.
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = array[0][0];

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                };
            }
        }
        System.out.println(max);


    }
}
