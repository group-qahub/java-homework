//Необходимо создать две целочисленные переменные (a, b),
//присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//maybe a and b are even - если сумма переменных четная
//some variable is odd - если сумма переменных нечетная
void main () {
    int a = 1;
    int b = 1;

    if ((a + b)%2 == 0 && (a + b != 0)) {
        System.out.println("maybe a and b are even");
    } else {
        System.out.println("some variable is odd");
    }
}