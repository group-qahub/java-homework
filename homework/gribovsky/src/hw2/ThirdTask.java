package hw2;

import static java.lang.IO.print;

public class ThirdTask {
    public static void main(String[] args) {

        int income = 1000;
        int pirates = 21;

        int owner_part = income/2;
        int captain_part_before = (income - owner_part)/2;
        int pirate_part = (income - owner_part - captain_part_before)/pirates;
        int captain_part_final = captain_part_before + pirate_part;

        System.out.println("Доля владельца = " + owner_part);
        System.out.println("Доля капитана = " + captain_part_final);
        System.out.println("Доля пирата = " + pirate_part);
        System.out.println("Доля Джека Воробья = " + (owner_part + captain_part_final + pirate_part));

        System.out.println("Доля в пенсионный пиратский фонд = " + (income - (owner_part + captain_part_final + pirate_part*pirates)));


    }
}
