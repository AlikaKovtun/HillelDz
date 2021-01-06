package hilleldz.dz18;

public class Troll extends Character {
    @Override
    void fight() {
        System.out.println("Тролль бьет: ");
        weapon.useWeapon();

    }
}
