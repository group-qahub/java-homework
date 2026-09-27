package hw6_3;

public class Task2 {
    /*
    Задача №2

0  1  2  3  4  5  6  7  8  9
   0  1  2  3  4  5  6  7  8
      0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
            0  1  2  3  4  5
               0  1  2  3  4
                  0  1  2  3
                     0  1  2
                        0  1
                           0
     */

    public static void main(String[] args) {
        for(int i = 9; i >=0; i --){
            for(int k = 1; k<= 9 -i; k++)
                System.out.print("  ");
            for(int j = 0; j <= i; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
