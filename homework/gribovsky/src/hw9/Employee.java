package hw9;


public abstract class Employee {

    private String name;
    private static int baseSalary = 3000;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    abstract double getSalary();

    @Override
    public String toString() {
        return this.name;
    }
}
