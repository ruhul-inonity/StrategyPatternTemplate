/**
 * Created by ruhul on 11/6/16.
 */
public class Character {
    /*
    * This class helps to dynamically switch weapons
    * */

    private IWeapon weapon;

    public void setWeapon(IWeapon newWeapon){
        weapon = newWeapon;
    }

    public void attack(){
        weapon.use();
    }
}
