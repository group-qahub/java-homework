public class HW5_1 {
//    Задача №1
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести все нечетные числа из массива.
//static void main() {
//    int [] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    for (int i = 0; i < array.length; i++) {
//        if(array[i] % 2 != 0){
//            IO.println(array[i]);
//        }
//    }
//}
//    Задача №2
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести все значения массива больше 5.
//        void main(){
//            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//            for(int i = 0; i < array.length; i++){
//                if(array[i] > 5){
//                    IO.println(array[i]);
//                }
//            }
//        }

    //    Задача №3
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо увеличить все значения массива на 15.
    static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
            IO.println(array[i]);
        }
    }
}
