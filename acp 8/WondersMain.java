class SevenWonders {
    public void displayInfo() {
        System.out.println("This is one of the Seven Wonders of the World.");
    }
}
class TajMahal extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Taj Mahal - Located in Agra, India. A symbol of love built by Emperor Shah Jahan.");
    }
}
class GreatWallOfChina extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Great Wall of China - A magnificent series of walls and fortifications in China.");
    }
}
class Petra extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Petra - An archaeological city in Jordan, famous for its rock-cut architecture.");
    }
}
class ChristTheRedeemer extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Christ the Redeemer - A colossal statue of Jesus in Rio de Janeiro, Brazil.");
    }
}
class MachuPicchu extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Machu Picchu - A 15th-century Inca citadel in Peru, known for its breathtaking views.");
    }
}
class ChichenItza extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Chichen Itza - A large pre-Columbian archaeological site in Mexico.");
    }
}
class Colosseum extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Colosseum - An ancient amphitheater in Rome, Italy, known for gladiatorial contests.");
    }
}
public class WondersMain {
    public static void main(String[] args) {
        SevenWonders[] wonders = {
            new TajMahal(),
            new GreatWallOfChina(),
            new Petra(),
            new ChristTheRedeemer(),
            new MachuPicchu(),
            new ChichenItza(),
            new Colosseum()
        };
        for (SevenWonders wonder : wonders) {
            wonder.displayInfo();
        }
    }
}
