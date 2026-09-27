package hw9;

import java.util.ArrayList;
import java.util.List;

public class CountUtils {

    private CountUtils() {
    }

    //поиск сотрудника в массиве по его имени
    public static List<Employee> getEmployee(List<? extends Employee> employees, String name) {
        List<Employee> result = new ArrayList<>();
        for(Employee employee : employees){
            if(employee.getName().equalsIgnoreCase(name)){
                result.add(employee);
            }
        }
        return result;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static List<Employee> getEmployeeBySubString(List<? extends Employee> employees, String subString){
        List<Employee> result = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getName().toLowerCase().contains(subString.toLowerCase())){
                result.add(employee);
            }
        }
        return result;
    }

//    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getAllSalary(List<? extends Employee> employees){
        double sum = 0;
        for (Employee employee:employees){
            sum+=employee.getSalary();
        }
        return sum;
    }

//    поиск наименьшей зарплаты в массиве
    public static double getMinSalary(List<? extends Employee> employees) {
        double minSalary = employees.getFirst().getSalary();
        for (Employee employee : employees){
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
//    поиск наибольшей зарплаты в массиве
    public static double getMaxSalary(List<? extends Employee> employees) {
            double maxSalary = employees.getFirst().getSalary();
        for (Employee employee : employees){
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
//    поиск наименьшего количества подчиненных в массиве менеджеров
    public static int getMinSubordinateAmount(List<Manager> managers) {
        int minSubordinatesAmount = managers.getFirst().getNumberOfSubordinates();
        for(Manager manager:managers){
            if(minSubordinatesAmount > manager.getNumberOfSubordinates()){
                minSubordinatesAmount = manager.getNumberOfSubordinates();
            }
        }
        return minSubordinatesAmount;
    }
//    поиск наибольшего количества подчиненных в массиве менеджеров
    public static int getMaxSubordinateAmount(List<Manager> managers) {
        int maxSubordinatesAmount = managers.getFirst().getNumberOfSubordinates();
            for(Manager manager:managers){
                if(maxSubordinatesAmount < manager.getNumberOfSubordinates()){
                    maxSubordinatesAmount = manager.getNumberOfSubordinates();
                }
            }
            return maxSubordinatesAmount;
    }

//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double getMaxBonus(List<? extends Employee> managers){
        double maxBonus = managers.getFirst().getSalary() - managers.getFirst().getBaseSalary();
        for (Employee manager: managers){
            if (maxBonus < (manager.getSalary() - manager.getBaseSalary())){
                maxBonus = manager.getSalary() - manager.getBaseSalary();
            }
        }
        return maxBonus;
    }
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double getMinBonus(List<? extends Employee> managers){
        double minBonus = managers.getFirst().getSalary() - managers.getFirst().getBaseSalary();
        for (Employee manager: managers){
            if (minBonus > (manager.getSalary() - manager.getBaseSalary())){
                minBonus = manager.getSalary() - manager.getBaseSalary();
            }
        }
        return minBonus;
    }

}










