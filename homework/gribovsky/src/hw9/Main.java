package hw9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Ivan Ivanov");
        Worker worker2 = new Worker("Ivan Petrov");
        Worker worker3 = new Worker("Anna Shark");
        Worker worker4 = new Worker("Sofia Bloomberg");

        Manager manager1 = new Manager("Oleg Shark");
        manager1.setNumberOfSubordinates(6);

        Manager manager2 = new Manager("Oleg Ivanov");
        manager2.setNumberOfSubordinates(2);

        Manager manager3 = new Manager("Bred Pit");
        manager3.setNumberOfSubordinates(4);

        Director director = new Director("Donald Trump");
        director.setNumberOfSubordinates(25);

        List<Employee> employees = new ArrayList<>();
        employees.add(director);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);

        List<Manager> managers = new ArrayList<>();
        managers.add(director);
        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);


        // поиск сотрудника в массиве по его имени
        System.out.println(CountUtils.getEmployee(employees, "Ivan"));
        System.out.println(CountUtils.getEmployee(employees, "ivan IVANOV"));
//
//        // поиск сотрудника в массиве по вхождению указанной строки в его имени
        System.out.println(CountUtils.getEmployeeBySubString(employees, "Ivan"));
//
//        // подсчет зарплатного бюджета для всех сотрудников в массиве
        System.out.println(CountUtils.getAllSalary(employees));

//        поиск наименьшей зарплаты в массиве
        System.out.println(CountUtils.getMinSalary(employees));
        System.out.println(CountUtils.getMinSalary(managers));
//        поиск наибольшей зарплаты в массиве
        System.out.println(CountUtils.getMaxSalary(employees));
        System.out.println(CountUtils.getMaxSalary(managers));
//        поиск наименьшего количества подчиненных в массиве менеджеров
        System.out.println(CountUtils.getMinSubordinateAmount(managers));
//        поиск наибольшего количества подчиненных в массиве менеджеров
        System.out.println(CountUtils.getMaxSubordinateAmount(managers));
//        поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
        System.out.println(CountUtils.getMaxBonus(managers));
//        поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
        System.out.println(CountUtils.getMinBonus(managers));













    }

}
