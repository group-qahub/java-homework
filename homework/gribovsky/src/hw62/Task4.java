package hw62;

public class Task4 {
    public static void main(String[] args) {

        //Экстра задача
        //
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j ++) {
                //System.out.println(array[i][j]);
                if(!array[i][j].contains("е")){
                    counter += 1;
                }
            }
        }
        System.out.println(counter);
    }
}
