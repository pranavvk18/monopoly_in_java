# Monopoly Game

A simplified Monopoly game implemented in Java. This project provides a basic gameplay experience where 2 to 4 players can roll dice, move around the board, buy properties, and compete to be the last player with money.

## Features

* Supports 2 to 4 players
* Players roll dice to move around the board
* Players can buy properties if they have enough money
* Rent is charged if another player lands on an owned property
* A player is eliminated if they go bankrupt
* The last player remaining wins the game

## Technologies Used

* **Java**: The entire game logic is written in Java
* **Scanner Class**: Used for player input
* **Random Class**: Used for simulating dice rolls
* **ArrayList**: Used to manage players and properties

## Installation & Running the Game

### Prerequisites

* Java Development Kit (JDK) installed on your system

### Steps to Run

1. Clone the repository or download the `Monopolygame.java` file
2. Open a terminal and navigate to the project directory
3. Compile the Java file:
   ```
   javac Monopolygame.java
   ```
4. Run the game:
   ```
   java Monopolygame
   ```
5. Follow the on-screen instructions to play the game

## How to Play

1. Enter player names (minimum 2, maximum 4 players)
2. Players take turns rolling a dice to move around the board
3. If a player lands on an unowned property, they can buy it if they have enough money
4. If a player lands on an owned property, they pay rent to the owner
5. If a player's money reaches zero, they are eliminated
6. The last remaining player wins the game

## Game Rules & Mechanics

* Each player starts with **1500 rupees**
* The board consists of **50 properties and a Jail**
* If a player chooses to buy a property, the cost is deducted from their balance, and they become the owner
* If a player lands on another player's property, they must pay **500 rupees** as rent
* The game continues until only **one player remains**

## Running in VS Code

### Setting Up VS Code

1. Install VS Code from [code.visualstudio.com](https://code.visualstudio.com/)
2. Install the Java Extension Pack from the VS Code marketplace
3. Open your project folder in VS Code

### Compiling and Running

1. Open the integrated terminal in VS Code (View > Terminal)
2. Compile your Java file:
   ```
   javac Monopolygame.java
   ```
3. Run your program:
   ```
   java Monopolygame
   ```

### Debugging

1. Set breakpoints by clicking in the gutter (margin) to the left of your code
2. Press F5 or select "Run and Debug" from the sidebar
3. Choose "Java" as the environment if prompted

## Future Enhancements

* Add special properties like utilities and railroads
* Implement special squares like Chance and Community Chest
* Add support for property upgrades (houses and hotels)
* Create a graphical user interface (GUI)
* Implement saving and loading game states

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

* Inspired by the classic Monopoly board game by Hasbro
* Created as a programming exercise for Java beginners
