package hilleldz.dz18;

public abstract class Character {
    private WeaponBehavior weapon;
    private final String name;

    public Character(String name) {
        this.name = name;
    }

     void fight() {
        if(weapon == null) System.out.println("Выберете оружие, которым хотите сражаться!");
        else {
            System.out.println(name + " бьет: ");
            weapon.useWeapon();
        }
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
