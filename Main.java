import game.shooting.*;
import game.shooting.Character;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck d = new NormalDuck();

        d.fly();
        d.quack();

        d.setFlyBehaviour(new NoFly());

        d.fly();


        Character king = new King();
        king.setWeaponBehaviour(new Knife());
        king.fight();
        king.applyWeapon();

        Character queen = new Queen();
        queen.setWeaponBehaviour(new Axe());
        queen.applyWeapon();
        queen.fight();

        Character troll = new Troll();
        troll.setWeaponBehaviour(new BowAndArrow());
        troll.applyWeapon();
        troll.fight();

        Character knight = new Knight();
        knight.setWeaponBehaviour(new Knife());
        king.applyWeapon();
        king.fight();

    }
}