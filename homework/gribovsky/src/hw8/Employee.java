package hw8;

public class Employee extends Person{
    private int salary;

    public Employee(String name, int age, String sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }
}

