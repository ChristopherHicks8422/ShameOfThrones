package com.techelevator;

import java.util.List;

public class Weapon extends Item{
    private int damage;
    private List<Weapon> weapons;
    public Weapon(String name, int weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void use() {
        // Implement weapon-specific use logic here
    }
}