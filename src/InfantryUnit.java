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

    public InfantryUnit(String race, String name) {
        this.race = race;
        this.name = name;
    }


    public void takeDamage(int damage) {
        int reduction = (int) (Math.random() * armor);
        if (damage > reduction) {
            hits = hits - (damage - reduction);
            System.out.println("Armor took " + reduction + " damage.");
        } else {System.out.println("Armor is taking all damage!"); }
    }

    public void attack(InfantryUnit unit) {
        System.out.println(name + " attached " + unit.getName());
        int attackDamage = (int) (Math.random() * damage) + 1;
        unit.takeDamage(attackDamage);
        System.out.println(unit.name + " dealt "+ attackDamage +
                " damage (hits). Remaining: " + unit.hits);
    }
    @Override
    public String toString() {
        String strAlive = "(ALIVE)";
        if (!this.alive()) {
            strAlive = "(DEAD)";
        }
        return "Hero " + name + " " + strAlive + " armor: " + armor + " damage: " + damage + " hits: " + hits;
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
}
