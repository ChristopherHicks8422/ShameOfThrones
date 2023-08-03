package com.techelevator;

import java.util.List;

public class HealthItem extends Item{
    private int healingAmount;
    private List<HealthItem> healthItems;
    public HealthItem(String name, int weight, int value, int healingAmount) {
        super(name, weight, value);
        this.healingAmount = healingAmount;
    }
    public void addHealthItem(HealthItem healthItem) {
        healthItems.add(healthItem);
    }
    public int getHealingAmount() {
        return healingAmount;
    }

    @Override
    public void use() {
        // Implement health-specific use logic here
    }
}
