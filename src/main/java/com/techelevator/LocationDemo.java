package com.techelevator;
import java.util.*;

public class LocationDemo {
    private static Location currentLocation;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeLocations();
        showLocation();

        while (true) {
            String command = scanner.nextLine().toUpperCase();
            if (command.equals("QUIT")) {
                break;
            }
            processCommand(command);
        }

        System.out.println("Thanks for playing!");
    }



    private static void initializeLocations() {
        Location l1 = new Location("Entrance to hall", "You stand at the entrance of a long hallway. The hallway gets darker\n" +
                "and darker, and you cannot see what lies beyond. To the east\n" +
                "is an old oaken door, unlocked and beckoning");
        Location l2 = new Location("End of hall", "You have reached the end of a long dark hallway. You can\n" +
                "see nowhere to go but back");
        Location l3 = new Location("Small study", "This is a small and cluttered study, containing a desk covered with\n" +
                "papers. Though they no doubt are of some importance,\n" +
                "you cannot read their writing");

        l1.addExit(new Exit(Exit.NORTH, l2));
        l1.addExit(new Exit(Exit.EAST, l3));
        l2.addExit(new Exit(Exit.SOUTH, l1));
        l3.addExit(new Exit(Exit.WEST, l1));

        currentLocation = l1;
    }

    private static void showLocation() {
        System.out.println("\n" + currentLocation.getRoomTitle() + "\n");
        System.out.println(currentLocation.getDescription() + "\n");

        System.out.println("Available exits : ");
        for (Enumeration e = currentLocation.getExits().elements(); e.hasMoreElements();) {
            Exit an_exit = (Exit) e.nextElement();
            System.out.println(an_exit);
        }
    }

    private static void processCommand(String command) {
        for (Enumeration e = currentLocation.getExits().elements(); e.hasMoreElements();) {
            Exit an_exit = (Exit) e.nextElement();

            if (an_exit.getDirectionName().compareTo(command) == 0 || an_exit.getShortDirectionName().compareTo(command) == 0) {
                currentLocation = an_exit.getLeadsTo();
                showLocation();
                return;
            }
        }

        System.out.println("\nHuh? Invalid direction!");
    }
}