package hilleldz.dz18;

public class King extends Character{
    @Override
    void fight() {
        System.out.println("Король бьет: ");
        weapon.useWeapon();

    }
}
