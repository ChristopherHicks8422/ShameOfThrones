package com.techelevator;

import java.util.List;

public class Wearable extends Item{
    private List<Wearable> wearables;
    public Wearable(String name, int weight, int value) {
        super(name, weight, value);
    }
    public void addWearable(Wearable wearable) {
        wearables.add(wearable);
    }
}
