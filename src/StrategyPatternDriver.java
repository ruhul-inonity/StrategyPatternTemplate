import java.util.Scanner;

/**
 * Created by ruhul on 11/6/16.
 */

/*
* User for changing algorithm at runtime.
* --> defines a family of algorithms,
  --> encapsulates each algorithm, and
  --> makes the algorithms interchangeable within that family.
*
* */
public class StrategyPatternDriver {
    public static void main (String args[]){
        IWeapon weapon = null;
        Character ruhul = new Character();

        while (true){
            System.out.println("Choose Weapon For Ruhul ! ( 1 for sword  2 for arrow  3 for sniper)");
            Scanner scanner = new Scanner(System. in);
            String input = scanner. nextLine();

            switch (input){
                case "1":
                    weapon = new Sword();
                    break;
                case "2":
                    weapon = new Arrow();
                    break;
                case "3":
                    weapon = new Sniper();
                    break;
            }
            ruhul.setWeapon(weapon);
            ruhul.attack();
        }
    }
}
