package com.techelevator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private String name;
    private int strength;
    private int perception;
    private int endurance;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;
    private List<String> inventory;
    private Map<String, String> equippedItems;

    public Player(String name, int strength, int perception, int endurance, int charisma,
                  int intelligence, int agility, int luck) {
        this.name = name;
        this.strength = strength;
        this.perception = perception;
        this.endurance = endurance;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.agility = agility;
        this.luck = luck;
        this.inventory = new ArrayList<>();
        this.equippedItems = new HashMap<>();
    }

    // Methods for managing inventory
    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void removeFromInventory(String item) {
        inventory.remove(item);
    }

    public void useItem(String item) {
        // Implement logic to use the item here
    }

    // Methods for equipping items
    public void equipWeapon(String weapon) {
        equippedItems.put("Weapon", weapon);
    }

    public void equipArmor(String armor) {
        equippedItems.put("Armor", armor);
    }

    // Method for attacking
    public void attack(Enemy target) {
        // Implement attack logic here
    }

    // Method for running away
    public void runAway() {
        // Implement logic to run away from a battle or situation
    }

    // Method for examining an item or the environment
    public void examine(String itemOrEnvironment) {
        // Implement logic to examine an item or the environment
    }

    // Method for talking to another player or NPC
    public void talkTo(Player target) {
        // Implement logic for initiating a conversation
    }

    // Method for interacting with an item
    public void interactWith(String item) {
        // Implement logic for interacting with an item
    }

    // Getters and Setters for player characteristics
    // ... (You can add getters and setters for characteristics if needed)

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getPerception() {
        return perception;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getLuck() {
        return luck;
    }


}
