import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public enum Main {
    ;

    public static void main(final String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        Point startingPointBattleFinalOne = new Point(0, 0);
        Point startingPointFrigateFinalOne = new Point(0, 0);
        Point startingPointCanoeFinalOne = new Point(0, 0);

        Point startingPointBattleFinalTwo = new Point(0, 0);
        Point startingPointFrigateFinalTwo = new Point(0, 0);
        Point startingPointCanoeFinalTwo = new Point(0, 0);

        System.out.print("----------------------------------------------------------");

        System.out.print("\nUsuario 1:");

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n Battleship:");

        System.out.print("\n  Pon la x del punto de inicio: ");
        int startingPointBattleXOne = Integer.parseInt(scanner.nextLine());

        System.out.print("\n  Pon la y del punto de inicio: ");
        int startingPointBattleYOne = Integer.parseInt(scanner.nextLine());

        startingPointBattleFinalOne.setX(startingPointBattleXOne);
        startingPointBattleFinalOne.setY(startingPointBattleYOne);

        System.out.print("\n  Introduce la dirección (NORTH, SOUTH, EAST, WEST): ");
        String directionBattleOne = scanner.nextLine();
        CardinalPoints directionBattleFinalOne = CardinalPoints.valueOf(directionBattleOne);

        Ship battleshipOne = new Battleship(directionBattleFinalOne, startingPointBattleFinalOne);

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n Frigate:");

        System.out.print("\n  Pon la x del punto de inicio: ");
        int startingPointFrigateXOne = Integer.parseInt(scanner.nextLine());

        System.out.print("\n  Pon la y del punto de inicio: ");
        int startingPointFrigateYOne = Integer.parseInt(scanner.nextLine());

        startingPointFrigateFinalOne.setX(startingPointFrigateXOne);
        startingPointFrigateFinalOne.setY(startingPointFrigateYOne);

        System.out.print("\n  Introduce la dirección (NORTH, SOUTH, EAST, WEST): ");
        String directionFrigateOne = scanner.nextLine();
        CardinalPoints directionFrigateFinalOne = CardinalPoints.valueOf(directionFrigateOne);

        Ship frigateOne = new Frigate(directionFrigateFinalOne, startingPointFrigateFinalOne);

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n Canoe:");

        System.out.print("\n  Pon la x del punto de inicio: ");
        int startingPointCanoeXOne = Integer.parseInt(scanner.nextLine());

        System.out.print("\n  Pon la y del punto de inicio: ");
        int startingPointCanoeYOne = Integer.parseInt(scanner.nextLine());

        startingPointCanoeFinalOne.setX(startingPointCanoeXOne);
        startingPointCanoeFinalOne.setY(startingPointCanoeYOne);

        System.out.print("\n  Introduce la dirección (NORTH, SOUTH, EAST, WEST): ");
        String directionCanoeOne = scanner.nextLine();
        CardinalPoints directionCanoeFinalOne = CardinalPoints.valueOf(directionCanoeOne);

        Ship canoeOne = new Canoe(directionCanoeFinalOne, startingPointCanoeFinalOne);

        //--------------------------------------------------------------------------------------------------------------

        ArrayList<Ship> shipsOne = new ArrayList<>();
        shipsOne.add(battleshipOne);
        shipsOne.add(frigateOne);
        shipsOne.add(canoeOne);
        User userOne = new User(shipsOne);

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\nUsuario 2:");

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n Battleship:");

        System.out.print("\n  Pon la x del punto de inicio: ");
        int startingPointBattleXTwo = Integer.parseInt(scanner.nextLine());

        System.out.print("\n  Pon la y del punto de inicio: ");
        int startingPointBattleYTwo = Integer.parseInt(scanner.nextLine());

        startingPointBattleFinalTwo.setX(startingPointBattleXTwo);
        startingPointBattleFinalTwo.setY(startingPointBattleYTwo);

        System.out.print("\n  Introduce la dirección (NORTH, SOUTH, EAST, WEST): ");
        String directionBattleTwo = scanner.nextLine();
        CardinalPoints directionBattleFinalTwo = CardinalPoints.valueOf(directionBattleTwo);

        Ship battleshipTwo = new Battleship(directionBattleFinalTwo, startingPointBattleFinalTwo);

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n Frigate:");

        System.out.print("\n  Pon la x del punto de inicio: ");
        int startingPointFrigateXTwo = Integer.parseInt(scanner.nextLine());

        System.out.print("\n  Pon la y del punto de inicio: ");
        int startingPointFrigateYTwo = Integer.parseInt(scanner.nextLine());

        startingPointFrigateFinalTwo.setX(startingPointFrigateXTwo);
        startingPointFrigateFinalTwo.setY(startingPointFrigateYTwo);

        System.out.print("\n  Introduce la dirección (NORTH, SOUTH, EAST, WEST): ");
        String directionFrigateTwo = scanner.nextLine();
        CardinalPoints directionFrigateFinalTwo = CardinalPoints.valueOf(directionFrigateTwo);

        Ship frigateTwo = new Frigate(directionFrigateFinalTwo, startingPointFrigateFinalTwo);

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n Canoe:");

        System.out.print("\n  Pon la x del punto de inicio: ");
        int startingPointCanoeXTwo = Integer.parseInt(scanner.nextLine());

        System.out.print("\n  Pon la y del punto de inicio: ");
        int startingPointCanoeYTwo = Integer.parseInt(scanner.nextLine());

        startingPointCanoeFinalTwo.setX(startingPointCanoeXTwo);
        startingPointCanoeFinalTwo.setY(startingPointCanoeYTwo);

        System.out.print("\n  Introduce la dirección (NORTH, SOUTH, EAST, WEST): ");
        String directionCanoeTwo = scanner.nextLine();
        CardinalPoints directionCanoeFinalTwo = CardinalPoints.valueOf(directionCanoeTwo);

        Ship canoeTwo = new Canoe(directionCanoeFinalTwo, startingPointCanoeFinalTwo);

        //--------------------------------------------------------------------------------------------------------------

        ArrayList<Ship> shipsTwo = new ArrayList<>();
        shipsTwo.add(battleshipTwo);
        shipsTwo.add(frigateTwo);
        shipsTwo.add(canoeTwo);
        User userTwo = new User(shipsTwo);

        System.out.print("\n----------------------------------------------------------");

        System.out.print("\n¡Empieza el juego!");

        System.out.print("\n Usuario 1 dime la x del disparo: ");
        int shotXOne = Integer.parseInt(scanner.nextLine());

        System.out.print("\n Usuario 1 dime la y del disparo: ");
        int shotYOne = Integer.parseInt(scanner.nextLine());

        Point shotOne = new Point(shotXOne, shotYOne);

        System.out.print("\n Usuario 2 dime la x del disparo: ");
        int shotXTwo = Integer.parseInt(scanner.nextLine());

        System.out.print("\n Usuario 2 dime la y del disparo: ");
        int shotYTwo = Integer.parseInt(scanner.nextLine());

        Point shotTwo = new Point(shotXTwo, shotYTwo);

        System.out.print("\n----------------------------------------------------------");

        while (userOne.isAlive() && userTwo.isAlive()) {
            userOne.attack(shotOne, userTwo);
            userTwo.attack(shotTwo, userOne);
        }

        System.out.println("\n¡El juego ha acabado!");

        if (userOne.isAlive()) {
            System.out.println("\n¡El usuario 1 ha ganado!");
        } else if (userTwo.isAlive()) {
            System.out.println("\n¡El usuario 2 ha ganado!");
        } else {
            System.out.println("\n¡Han empatado!");
        }
    }
}