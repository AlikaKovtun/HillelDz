package hilleldz.dz18;

public class Queen extends Character {
    @Override
    void fight() {
        System.out.println("Королева бьет: ");
        weapon.useWeapon();
    }
}
