package hilleldz.dz18;

public abstract class Character {
    private WeaponBehavior weapon;
    private final String name;

    public Character(String name) {
        this.name = name;
    }

     void fight() {
        System.out.println(name + " бьет: ");
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
