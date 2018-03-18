/**
 * @author Niels on 15-03-2018.
 */
public class OrcInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character = null;

        switch (techLevel){
            case 1:
                character = new RockHauler(3,5,10,10); //range, armor, hits, damage
                character.setRace("Orc");
                break;
            case 2:
                character = new SpearThrower(10, 10, 20, 20);
                character.setRace("Orc");
                break;
            case 3:
                character = new Musketeer(10, 10, 15, 15);
                character.setRace("Orc");
                break;
            case 4:
                character = new CrossbowMan(15, 10, 10, 15);
                character.setRace("Orc");
                break;
            case 5:
                character = new Archer(20, 10, 20, 20);
                character.setRace("Orc");
        }
        return character;
    }
}
