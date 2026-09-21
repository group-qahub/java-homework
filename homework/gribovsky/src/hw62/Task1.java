package hw62;

public class Task1 {

    public static void main(String[] args) {
        //Задача №1
        //
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";

        //System.out.println(s.charAt(8));
        String result = "";
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == 'о'){
                result += (s.charAt(i));
            }
        }
        System.out.println(result);


    }
}
