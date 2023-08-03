package com.techelevator;   // Save State
import java.util.*;
import java.io.*;

public class GameWorld implements Serializable {
    private Vector<Location> locations; // List of Location objects
    private Vector<Exit> exits; // List of Exit objects
    private Location currentLocation; // The current location of the player

    // Default constructor
    public GameWorld() {
        locations = new Vector<>();
        exits = new Vector<>();
        currentLocation = null; // The default location of a player isn't known
    }

    // Constructor with characterWidth parameter
    public GameWorld(int characterWidth) {
        this(); // Call the default constructor
    }

    // Returns the current location of the player
    public Location getCurrentLocation() {
        return currentLocation;
    }

    // Assigns a new location to the current location of the player
    public void setCurrentLocation(Location newLocation) {
        currentLocation = newLocation;
    }

    // Adds a new exit to the gaming system
    public void addExit(Exit exit) {
        if (!exits.contains(exit)) // Check if exit vector already contains exit
            exits.addElement(exit); // Exit doesn't exist, and must be added
    }

    // Adds a new location to the gaming system
    public void addLocation(Location location) {
        if (!locations.contains(location)) // Check if location vector already contains location
            locations.addElement(location); // Location doesn't exist, and must be added
    }

    // Shows the current game location
    public void showLocation() {
        // Show title and description of the current location
        System.out.println(currentLocation.getRoomTitle());
        System.out.println(currentLocation.getDescription());
        System.out.println();

        // Show available exits
        System.out.println("Available exits:");

        // Traverse elements of the vector containing exits
        for (Enumeration<Exit> e = currentLocation.getExits().elements(); e.hasMoreElements();) {
            // Get the next exit
            Exit an_exit = e.nextElement();
            // Print exit to our output stream
            System.out.println(an_exit.toString());
        }
    }
}