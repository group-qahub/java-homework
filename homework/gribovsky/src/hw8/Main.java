package hw8;

public class Main {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        String winner = "";
        Fighter first;
        Fighter second;
        if (fighter1.name.equals(firstAttacker)) {
            first = fighter1;
            second = fighter2;
        } else {
            first = fighter2;
            second = fighter1;
        }

        while(!(first.health <=0) || !(second.health <=0)){
            second.health = second.health - first.damagePerAttack;
            if(second.health <= 0 ){
                winner = first.name;
                break;
            }
            first.health = first.health - second.damagePerAttack;
            if(first.health <= 0) {
                winner = second.name;
                break;
            }
        }

        return winner;
    };

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Lew", 10 , 2);
        Fighter fighter2 = new Fighter("Harry", 5 , 4);

        System.out.println(declareWinner(fighter1, fighter2, "Lew"));




    }
}
