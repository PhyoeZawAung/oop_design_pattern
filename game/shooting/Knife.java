package game.shooting;

public class Knife implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Using the knife");
    }
}
