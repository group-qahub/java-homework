package hw63;

public class Task3 {
    /*
    Задача №3

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0
     */

    public static void main(String[] args) {

        for (int i = 9; i >=0; i --){
            for(int l = 1; l <= 9 - i; l ++){
                System.out.print("* ");
            }
            for(int k = i; k>=0; k--){
                System.out.print(k + " ");
            }
            for(int j = 1; j <= i; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
