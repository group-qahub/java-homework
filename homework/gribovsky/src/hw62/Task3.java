package hw62;

public class Task3 {
    public static void main(String[] args) {

        //Задача №3
        //
        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        //

        String s = "Посмотрите как Рите нравится ритм";

        int index = 0;
        String searchWord = "рит";
        while(index != -1){
            index = s.toLowerCase().indexOf(searchWord, index);

            if(index != -1){
                System.out.println(index);
                index += searchWord.length();

            }

        }
    }
}
