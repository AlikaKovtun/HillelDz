package hilleldz.dz18;

public abstract class Character {
    WeaponBehavior weapon;

    abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
