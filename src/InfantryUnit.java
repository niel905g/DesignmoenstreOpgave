/**
 * @author Niels on 15-03-2018.
 */
public abstract class InfantryUnit {

    private static int range;
    private static int armor;
    private static int hits;
    private static int damage;
    private String race;
    private String name;

    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            hits = hits - (damage - reduction);
            System.out.println("Armor took " + reduction + " damage.");
        }
    }
    public static void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackDamage);
        System.out.println("Unit dealt "+attackDamage + " damage.");
    }

    public boolean alive() {
        boolean alive = true;
        if (hits < 0) {
            alive = false;
        }
        return alive;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        }

    public int getRange() {
        return range;
    }

    public int getArmor() {
        return armor;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDamage() {
        return damage;
    }
}
