public class HW9 {
//    Задача №1
//    Необходимо создать класс Employee со следующими методами:
//    getBaseSalary - получить базовую ставку setBaseSalary
//    getName - получить имя
//    setName
//    getSalary - получить зарплату
//    public class Employee {
//        private double baseSalary;
//        private String name;
//
//        public Employee(String name, double baseSalary) {
//            this.name = name;
//            this.baseSalary = baseSalary;
//        }
//
//        public double getBaseSalary() {
//            return baseSalary;
//        }
//
//        public void setBaseSalary(double baseSalary) {
//            this.baseSalary = baseSalary;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public double getSalary() {
//            return baseSalary;
//        }
//    }


//    Задача №2
//    Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
//    Необходимо создать класс Manager в который нужно добавить следующие методы:
//    getNumberOfSubordinates - получить количество подчиненных
//            setNumberOfSubordinates
//    в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
//    Если количество подчиненных 0, то результат как у обычного рабочего.
//    Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
//    public class Worker extends Employee {
//        public Worker(String name, double baseSalary) {
//            super(name, baseSalary);
//        }
//
//        @Override
//        public double getSalary() {
//            return getBaseSalary();
//        }
//    }
//    public class Manager extends Employee {
//        private int numberOfSubordinates;
//
//        public Manager(String name, double baseSalary, int numberOfSubordinates) {
//            super(name, baseSalary);
//            this.numberOfSubordinates = numberOfSubordinates;
//        }
//
//        public int getNumberOfSubordinates() {
//            return numberOfSubordinates;
//        }
//
//        public void setNumberOfSubordinates(int numberOfSubordinates) {
//            this.numberOfSubordinates = numberOfSubordinates;
//        }
//
//        @Override
//        public double getSalary() {
//            if (numberOfSubordinates == 0) {
//                return getBaseSalary();
//            }
//            return getBaseSalary() * (numberOfSubordinates / 100.0 * 3);
//        }
//    }
//    public class Director extends Employee {
//        private int numberOfSubordinates;
//
//        public Director(String name, double baseSalary, int numberOfSubordinates) {
//            super(name, baseSalary);
//            this.numberOfSubordinates = numberOfSubordinates;
//        }
//
//        public int getNumberOfSubordinates() {
//            return numberOfSubordinates;
//        }
//
//        public void setNumberOfSubordinates(int numberOfSubordinates) {
//            this.numberOfSubordinates = numberOfSubordinates;
//        }
//
//        @Override
//        public double getSalary() {
//            if (numberOfSubordinates == 0) {
//                return getBaseSalary();
//            }
//            return getBaseSalary() * (numberOfSubordinates / 100.0 * 9);
//        }
//    }

//    Задача №3
//    Необходимо создать утилитарный класс со следующими методами:
//    поиск сотрудника в массиве по его имени
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
//    подсчет зарплатного бюджета для всех сотрудников в массиве
//    поиск наименьшей зарплаты в массиве
//    поиск наибольшей зарплаты в массиве
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    public class EmployeeUtils {
//
//        public static Employee findByName(Employee[] employees, String name) {
//            for (Employee employee : employees) {
//                if (employee.getName().equals(name)) {
//                    return employee;
//                }
//            }
//            return null;
//        }
//
//        public static Employee findByNameContains(Employee[] employees, String part) {
//            for (Employee employee : employees) {
//                if (employee.getName().contains(part)) {
//                    return employee;
//                }
//            }
//            return null;
//        }
//
//        public static double totalSalaryBudget(Employee[] employees) {
//            double total = 0;
//            for (Employee employee : employees) {
//                total += employee.getSalary();
//            }
//            return total;
//        }
//
//        public static double minSalary(Employee[] employees) {
//            double min = employees[0].getSalary();
//            for (Employee employee : employees) {
//                if (employee.getSalary() < min) {
//                    min = employee.getSalary();
//                }
//            }
//            return min;
//        }
//
//        public static double maxSalary(Employee[] employees) {
//            double max = employees[0].getSalary();
//            for (Employee employee : employees) {
//                if (employee.getSalary() > max) {
//                    max = employee.getSalary();
//                }
//            }
//            return max;
//        }
//
//        public static int minSubordinates(Manager[] managers) {
//            int min = managers[0].getNumberOfSubordinates();
//            for (Manager manager : managers) {
//                if (manager.getNumberOfSubordinates() < min) {
//                    min = manager.getNumberOfSubordinates();
//                }
//            }
//            return min;
//        }
//
//        public static int maxSubordinates(Manager[] managers) {
//            int max = managers[0].getNumberOfSubordinates();
//            for (Manager manager : managers) {
//                if (manager.getNumberOfSubordinates() > max) {
//                    max = manager.getNumberOfSubordinates();
//                }
//            }
//            return max;
//        }
//
//        public static double maxBonus(Manager[] managers) {
//            double max = managers[0].getSalary() - managers[0].getBaseSalary();
//            for (Manager manager : managers) {
//                double bonus = manager.getSalary() - manager.getBaseSalary();
//                if (bonus > max) {
//                    max = bonus;
//                }
//            }
//            return max;
//        }
//
//        public static double minBonus(Manager[] managers) {
//            double min = managers[0].getSalary() - managers[0].getBaseSalary();
//            for (Manager manager : managers) {
//                double bonus = manager.getSalary() - manager.getBaseSalary();
//                if (bonus < min) {
//                    min = bonus;
//                }
//            }
//            return min;
//        }
//    }

}
