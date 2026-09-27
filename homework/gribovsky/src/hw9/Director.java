package hw9;

public class Director extends Manager {

    public Director(String name) {
        super(name);
    }

    @Override
    double getSalary() {
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }
        else{
            double bonus = getBaseSalary()*(((double) getNumberOfSubordinates() /100)*9);
            return getBaseSalary() + bonus;
        }

    }



}
