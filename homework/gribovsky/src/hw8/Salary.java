package hw8;

public class Salary {
    public int getSum(Employee[] employees){
        int sum = 0;
        for(Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
