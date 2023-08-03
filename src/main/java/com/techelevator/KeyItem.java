package com.techelevator;

import java.util.List;

public class KeyItem extends Item{
    private List<KeyItem> keyItems;
    public KeyItem(String name, int weight, int value) {
        super(name, weight, value);
    }

    public List<KeyItem> getKeyItems() {
        return keyItems;
    }

    public void addKeyItem(KeyItem keyItem) {
        keyItems.add(keyItem);
    }
}
