package com.techelevator;

import java.util.List;

public class ThrowableItem extends Item{
    private List<Throwable> throwableItems;
    public ThrowableItem(String name, int weight, int value) {
        super(name, weight, value);
    }
    public void addThrowableItem(Throwable throwableItem) {
        throwableItems.add(throwableItem);
    }
}
