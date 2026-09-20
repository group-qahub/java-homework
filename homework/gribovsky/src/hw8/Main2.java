package hw8;

public class Main2 {
    public static void main(String[] args) {


        Employee director = new Employee("Robert", 75, "Male", 55000);
        Employee sonOfTheDirector = new Employee("Robert jn.",21,"Male",35000);
        Employee wifeOfTheDirector = new Employee("Anna", 18, "Female", 40000);

        Employee[] family = new Employee[3];
        family[0] = director;
        family[1] = sonOfTheDirector;
        family[2] = wifeOfTheDirector;

        Employee[] employees = {
                new Employee("Anna", 23, "Female", 1500),
                new Employee("Anna", 55, "Female", 5500),
                new Employee("Petr", 21, "Male", 1500),
                new Employee("Ivan", 37, "Male", 2750),
                new Employee("Sara", 33, "Female", 3125),
                new Employee("John", 40, "Male", 4075)};

        Salary totalSalary = new Salary();

        System.out.println(director.getName());
        System.out.println(employees[0].getName());
        System.out.println(employees[0].isSameName(employees[1]));
        System.out.println(employees[0].getSex());
        System.out.println(employees[0].getAge());
        System.out.println(employees[0].getSalary());

        System.out.println(totalSalary.getSum(family));
        System.out.println(totalSalary.getSum(employees));

    }
}
