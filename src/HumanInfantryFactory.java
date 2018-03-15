

public class HumanInfantryFactory extends InfantryFactory{



    public InfantryUnit createUnit(int techLevel) {
    InfantryUnit character = null;

    switch (techLevel){
        case 1:
            character = new RockHauler(3,5,20,7); //range, armor, hits, damage
            //character.setRace("Human");
            break;
        case 2:
            character = new SpearThrower(10, 10, 20, 20);
            //character.setRace("Human");
            break;
    }
    return character;
    }
}
