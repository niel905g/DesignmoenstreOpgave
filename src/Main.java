import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nu starter spillet - May the best man win!");

        Random random = new Random();
        int randomTal;

  Archer archer = new Archer();
  CrossbowMan crossbowMan = new CrossbowMan();
  Musketeer musketeer = new Musketeer();
  RockHauler rockHauler = new RockHauler();
  SpearThrower spearThrower = new SpearThrower();

 //     archer.attack(crossbowMan);
//      crossbowMan.attack(archer);

        InfantryFactory humanFactory = FactoryFactory.createInfantryFactory(1);
        InfantryFactory orcFactory = FactoryFactory.createInfantryFactory(2);

        // The factories are producing units
        InfantryUnit soldierA = humanFactory.createUnit(1); // unit 1 -- rockhauler
        soldierA.setName("Conan");
        InfantryUnit soldierB = orcFactory.createUnit(2); // unit 2 -- spearthrower
        soldierB.setName("Orcgrim");

        // The units are fighting for death
        while (soldierA.alive() && soldierB.alive()) {
            soldierA.attack(soldierB);
            soldierB.attack(soldierA);
        }

        // The battle results are announced
        System.out.println("***************************************");
        if (!soldierA.alive()) {
            if (!soldierB.alive()) {
                System.out.println("It's a draw");
            } else {
                System.out.println(soldierB.getRace() + " " + soldierB.getName() + " " + soldierB.getClass().getSimpleName() + " wins!");
            }
        } else {
            System.out.println(soldierA.getRace() + " " + soldierA.getName() + " " + soldierA.getClass().getSimpleName() + " wins!");
        }
        System.out.println("***************************************");
    }

}

 /*       while (archer.getHits() > 0 || crossbowMan.getHits() > 0 || musketeer.getHits() > 0 || rockHauler.getHits() > 0 || spearThrower.getHits() > 0) {

            randomTal = random.nextInt(4);

            System.out.println("Archer:" + "\n"
                    + "Armor: " + archer.getArmor() + "\n"
                    + "Hits: " + archer.getHits() + "\n"
                    + "Damage: " + archer.getDamage() + "\n"
                    + "Range: " + archer.getRange() + "\n");

            System.out.println("CrossbowMan:" + "\n"
                    + "Armor: " + crossbowMan.getArmor() + "\n"
                    + "Hits: " + crossbowMan.getHits() + "\n"
                    + "Damage: " + crossbowMan.getDamage() + "\n"
                    + "Range: " + crossbowMan.getRange() + "\n");

            System.out.println("musketeer:" + "\n"
                    + "Armor: " + musketeer.getArmor() + "\n"
                    + "Hits: " + musketeer.getHits() + "\n"
                    + "Damage: " + musketeer.getDamage() + "\n"
                    + "Range: " + musketeer.getRange() + "\n");

            System.out.println("RockHauler:" + "\n"
                    + "Armor: " + rockHauler.getArmor() + "\n"
                    + "Hits: " + rockHauler.getHits() + "\n"
                    + "Damage: " + rockHauler.getDamage() + "\n"
                    + "Range: " + rockHauler.getRange() + "\n");

            System.out.println("SpearThrower:" + "\n"
                    + "Armor: " + spearThrower.getArmor() + "\n"
                    + "Hits: " + spearThrower.getHits() + "\n"
                    + "Damage: " + spearThrower.getDamage() + "\n"
                    + "Range: " + spearThrower.getRange() + "\n");

            if (archer.getHits() < 0) {
                System.out.println("Archer døde!");
            } else {
                if (randomTal == 0) {
                    archer.attack(crossbowMan);
                } else if (randomTal == 1) {
                    archer.attack(musketeer);
                } else if (randomTal == 2) {
                    archer.attack(rockHauler);
                } else if (randomTal == 3) {
                    archer.attack(spearThrower);
                }
                if (crossbowMan.getHits() < 0 && musketeer.getHits() < 0 && rockHauler.getHits() < 0 && spearThrower.getHits() < 0) {
                    System.out.println("Archer har vundet!");
                    System.exit(0);
                }
            }

            if (crossbowMan.getHits() < 0) {
                System.out.println("CrossbowMan døde!");
            } else {
                if (randomTal == 0) {
                    crossbowMan.attack(archer);
                } else if (randomTal == 1) {
                    crossbowMan.attack(musketeer);
                } else if (randomTal == 2) {
                    crossbowMan.attack(rockHauler);
                } else if (randomTal == 3) {
                    crossbowMan.attack(spearThrower);
                }
                if (archer.getHits() < 0 && musketeer.getHits() < 0 && rockHauler.getHits() < 0 && spearThrower.getHits() < 0) {
                    System.out.println("CrossbowMan har vundet!");
                    System.exit(0);
                }
            }

            if (musketeer.getHits() < 0) {
                System.out.println("Musketeer døde!");
            } else {
                if (randomTal == 0) {
                    musketeer.attack(archer);
                } else if (randomTal == 1) {
                    musketeer.attack(crossbowMan);
                } else if (randomTal == 2) {
                    musketeer.attack(rockHauler);
                } else if (randomTal == 3) {
                    musketeer.attack(spearThrower);
                }
                if (archer.getHits() < 0 && crossbowMan.getHits() < 0 && rockHauler.getHits() < 0 && spearThrower.getHits() < 0) {
                    System.out.println("Musketeer har vundet!");
                    System.exit(0);
                }
            }

            if (spearThrower.getHits() < 0) {
                System.out.println("SpearThrower døde!");
            } else {
                if (randomTal == 0) {
                    spearThrower.attack(archer);
                } else if (randomTal == 1) {
                    spearThrower.attack(crossbowMan);
                } else if (randomTal == 2) {
                    spearThrower.attack(rockHauler);
                } else if (randomTal == 3) {
                    spearThrower.attack(musketeer);
                }
                if (archer.getHits() < 0 && crossbowMan.getHits() < 0 && rockHauler.getHits() < 0 && musketeer.getHits() < 0) {
                    System.out.println("SpearThrower har vundet!");
                    System.exit(0);
                }
            }

            if (rockHauler.getHits() < 0) {
                System.out.println("RockHauler døde!");
            } else {
                if (randomTal == 0) {
                    rockHauler.attack(archer);
                } else if (randomTal == 1) {
                    rockHauler.attack(crossbowMan);
                } else if (randomTal == 2) {
                    rockHauler.attack(spearThrower);
                } else if (randomTal == 3) {
                    rockHauler.attack(musketeer);
                }
                if (archer.getHits() < 0 && crossbowMan.getHits() < 0 && spearThrower.getHits() < 0 && musketeer.getHits() < 0) {
                    System.out.println("RockHauler har vundet!");
                    System.exit(0);
                }*
            }
        }
    }
}*/

