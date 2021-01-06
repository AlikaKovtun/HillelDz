package hilleldz.dz18;

public class Knight extends Character{
    @Override
    void fight() {
        System.out.println("Рыцарь бьет: ");
        weapon.useWeapon();

    }
}
