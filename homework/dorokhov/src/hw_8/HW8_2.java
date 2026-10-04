public class HW8_2 {
//    Задача №1
//    Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает
//    имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
//    public class Person {
//        private String name;
//        private int age;
//        private String gender;
//
//        public Person(String name, int age, String gender) {
//            this.name = name;
//            this.age = age;
//            this.gender = gender;
//        }
//
//        public String getName() {
//            if (gender.equals("male")) {
//                return "Mr. " + name;
//            } else {
//                return "Mrs. " + name;
//            }
//        }
//    }


//    Задача №2
//    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата. Класс должен иметь
//    метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод и сотрудника
//    который был передан как параметр, одинаковое имя.
//    public class Employee {
//        private String name;
//        private int age;
//        private String gender;
//        private double salary;
//
//        public Employee(String name, int age, String gender, double salary) {
//            this.name = name;
//            this.age = age;
//            this.gender = gender;
//            this.salary = salary;
//        }
//
//        public boolean isSameName(Employee employee) {
//            return this.name.equals(employee.name);
//        }
//    }


//    Задача №3
//    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать
//    сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
//    public class Salary {
//        public double getSum(Employee[] employeeArray) {
//            double sum = 0;
//            for (Employee employee : employeeArray) {
//                sum += employee.salary;
//            }
//            return sum;
//        }
//    }

}
