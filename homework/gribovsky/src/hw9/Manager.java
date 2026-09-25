package hw9;

public class Manager extends Employee{

    private int numberOfSubordinates;


    public Manager(String name) {
        super(name);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    double getSalary() {
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }
        else {
            double bonus = getBaseSalary()*(((double) getNumberOfSubordinates() /100)*3);
            return getBaseSalary() + bonus;
        }
    }
}
