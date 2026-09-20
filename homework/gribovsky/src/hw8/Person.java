package hw8;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        if (sex.equals("Female")) {
            return "Mrs " + name;
        } else {
            return "Mr " + name;
        }
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
