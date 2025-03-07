import java.util.ArrayList;
import java.util.Scanner;

class Property {
    String name;
    int price;
    String owner;

    public Property(String name, int price) {
        this.name = name;
        this.price = price;
        this.owner = "Bank"; // Initially owned by the bank
    }
}

class Player {
    String name;
    int money;
    int currentPosition;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        this.currentPosition = 0; 
    }
}

public class Monopolygame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Taking player names
        System.out.println("Enter player names (2 to 4 players): ");
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter name for player " + (i + 1) + " (or enter 'q' to stop): ");
            String name = scanner.nextLine();
            if (name.equals("q")) break;
            players.add(new Player(name, 1500)); // Each player starts with 1500 rupees
        }

        // 2) Creating properties
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(new Property("Property 1", 200));
        properties.add(new Property("Property 1", 200));
        properties.add(new Property("Property 2", 250));
        properties.add(new Property("Property 3", 300));
        properties.add(new Property("Property 4", 350));
        properties.add(new Property("Property 5", 400));
        properties.add(new Property("Property 6", 450));
        properties.add(new Property("Property 7", 500));
        properties.add(new Property("Property 8", 550));
        properties.add(new Property("Property 9", 600));
        properties.add(new Property("Property 10", 650));
        properties.add(new Property("Property 11", 700));
        properties.add(new Property("Property 12", 750));
        properties.add(new Property("Property 13", 800));
        properties.add(new Property("Property 14", 850));
        properties.add(new Property("Property 15", 900));
        properties.add(new Property("Property 16", 950));
        properties.add(new Property("Property 17", 1000));
        properties.add(new Property("Property 18", 1050));
        properties.add(new Property("Property 19", 1100));
        properties.add(new Property("Property 20", 1150));
        properties.add(new Property("Property 21", 1200));
        properties.add(new Property("Property 22", 1250));
        properties.add(new Property("Property 23", 1300));
        properties.add(new Property("Property 24", 1350));
        properties.add(new Property("Property 25", 1400));
        properties.add(new Property("Property 26", 1450));
        properties.add(new Property("Property 27", 1500));
        properties.add(new Property("Property 28", 1550));
        properties.add(new Property("Property 29", 1600));
        properties.add(new Property("Property 30", 1650));
        properties.add(new Property("Property 31", 1700));
        properties.add(new Property("Property 32", 1750));
        properties.add(new Property("Property 33", 1800));
        properties.add(new Property("Property 34", 1850));
        properties.add(new Property("Property 35", 1900));
        properties.add(new Property("Property 36", 1950));
        properties.add(new Property("Property 37", 2000));
        properties.add(new Property("Property 38", 2050));
        properties.add(new Property("Property 39", 2100));
        properties.add(new Property("Property 40", 2150));
        properties.add(new Property("Property 41", 2200));
        properties.add(new Property("Property 42", 2250));
        properties.add(new Property("Property 43", 2300));
        properties.add(new Property("Property 44", 2350));
        properties.add(new Property("Property 45", 2400));
        properties.add(new Property("Property 46", 2450));
        properties.add(new Property("Property 47", 2500));
        properties.add(new Property("Property 48", 2550));
        properties.add(new Property("Property 49", 2600));
        properties.add(new Property("Property 50", 2650));
        properties.add(new Property("Jail", 0));

        // 3) Main game loop
        int currentPlayerIndex = 0;
        int round = 1;
        while (true) {
            System.out.println("\nRound " + round);
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println("It's " + currentPlayer.name + "'s turn.");

            // Rolling dice
            System.out.println("Press enter to roll the dice...");
            scanner.nextLine();
            int diceValue = (int) (Math.random() * 6) + 1;
            System.out.println("You rolled a " + diceValue);

            // Moving the player
            currentPlayer.currentPosition = (currentPlayer.currentPosition + diceValue) % properties.size();
            Property currentProperty = properties.get(currentPlayer.currentPosition);
            System.out.println("You landed on: " + currentProperty.name);

            // Handling property ownership
            if (!currentProperty.owner.equals(currentPlayer.name)) {
                System.out.println("Do you want to buy this property? (Price: " + currentProperty.price + ") (y/n)");
                String buyChoice = scanner.nextLine();
                if (buyChoice.equalsIgnoreCase("y")) {
                    if (currentPlayer.money >= currentProperty.price) {
                        currentPlayer.money -= currentProperty.price;
                        currentProperty.owner = currentPlayer.name;
                        System.out.println("Congratulations! You bought " + currentProperty.name);
                    } else {
                        System.out.println("Sorry, you don't have enough money to buy this property.");
                    }
                }
            } else {
                System.out.println("You already own this property.");
            }

            // Handling rent payment
            for (Player player : players) {
                if (!player.name.equals(currentPlayer.name) && player.currentPosition == currentPlayer.currentPosition) {
                    player.money -= 500;
                    currentPlayer.money += 500;
                    System.out.println(player.name + " landed on your property. You received 500 rupees from them.");
                    break; // Only one player can land on a property at a time
                }
            }

            // Check if a player has won
            if (currentPlayer.money <= 0) {
                System.out.println(currentPlayer.name + " has gone bankrupt. They are out of the game.");
                players.remove(currentPlayer);
            }

            if (players.size() == 1) {
                System.out.println(players.get(0).name + " has won the game!");
                break;
            }

            // Switch to the next player
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
            round++;
        }
    }
}
