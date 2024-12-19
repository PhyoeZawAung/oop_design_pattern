package game.shooting;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public void setWeaponBehaviour(WeaponBehaviour wp){
        weaponBehaviour = wp;
    }

    public void applyWeapon(){
        weaponBehaviour.useWeapon();
    }

    public abstract void fight();
}
