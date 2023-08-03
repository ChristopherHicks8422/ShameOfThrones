package com.techelevator;

import java.awt.*;
import java.util.List;

public class Armor extends Item{
    private int defense;
    private List<Armor> armors;
    public Armor(String name, int weight, int value, int defense) {
        super(name, weight, value);
        this.defense = defense;
    }

    public void addArmor(Armor armor) {
        armors.add(armor);
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public void use() {
        // Implement armor-specific use logic here
    }
}

