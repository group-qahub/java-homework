package hw9;

public class Worker extends Employee{

    public Worker(String name) {
        super(name);
    }

    @Override
    double getSalary() {
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
