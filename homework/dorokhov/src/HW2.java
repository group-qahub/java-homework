public class HW2 {
//    Задача №1
//
//    Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.
//
//    void main() {
//        int a = 1;
//        int b = 3;
//
//        IO.println("Сложение: " + (a + b));
//        IO.println("Вычитание: " + (a - b));
//        IO.println("Умножение: " + (a * b));
//        IO.println("Деление: " + (a / b));
//        IO.println("Остаток от деления: " + (a % b));
//        IO.println("Проверка на четность a: " + (a % 2 == 0));
//        IO.println("Проверка на четность b: " + (b % 2 == 0));
//    }
//    Задача №2
//
//    Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения, а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).
//
//    void main() {
//        int a = 0;
//        int b = 1;
//
//        int accumulator = a;
//
//        a = b;
//        b = accumulator;
//
//        IO.println("a = " + a);
//        IO.println("b = " + b);
//    }

    //    Задача №3
//
//    Создать программу дележа добычи на пиратском корабле.
//    По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану, остальное делится поровну между
//    всеми членами команды, включая капитана.
//
//    Размер добычи (например, в дублонах) и количество пиратов на корабле задать переменными.
//
//    Вывести на экран кому сколько дублонов полагается
//    Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
    void main() {
        int money = 100;
        int pirates = 10;

        int ownerMoney = money % 2 == 0 ? money / 2 : money / 2 + 1;
        int captainMoney = (money - ownerMoney) % 2 == 0 ? (money - ownerMoney) / 2 : (money - ownerMoney) / 2 + 1;
        int piratesMoney = (money - ownerMoney - captainMoney) / pirates;
        int sum = ownerMoney + captainMoney + piratesMoney * pirates;
        if (sum != money) {
            captainMoney += money - sum;
        }

        int jackMoney = ownerMoney + captainMoney;

        IO.println("Owner: " + ownerMoney);
        IO.println("Captain: " + captainMoney);
        IO.println("Pirates: " + piratesMoney);
        IO.println("sum: " + (ownerMoney + captainMoney + piratesMoney * pirates));
        IO.println("Jack Sparrow: " + jackMoney);
    }
}
