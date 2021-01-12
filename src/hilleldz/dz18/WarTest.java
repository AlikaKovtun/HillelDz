package hilleldz.dz18;


public class WarTest {

    public static void main(String[] args) {
        King king = new King();
        king.fight();
        Knight knight = new Knight();
        Queen queen = new Queen();
        Troll troll = new Troll();

        king.setWeapon(new SwordBehavior());
        king.fight();
        troll.setWeapon(new AxeBehavior());
        troll.fight();
        knight.setWeapon(new BowAndArrowBehavior());
        knight.fight();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();

    }
}
