/**
 * @author Niels on 15-03-2018.
 */
public class FactoryFactory {
    public static InfantryFactory createInfantryFactory(int race) {
        InfantryFactory factory;
        switch (race){
            case 1:
                factory = new HumanInfantryFactory();
                break;
            case 2:
                factory = new OrcInfantryFactory();
                break;
                default:
                    factory = null;
                    break;
        }
        return factory;
    }
}
