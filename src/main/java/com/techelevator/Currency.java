package com.techelevator;

public class Currency {
    // Exchange rates in copper coins for each currency type
    private static final int COPPER_TO_COPPER = 1;
    private static final int COPPER_TO_SILVER = 10;
    private static final int COPPER_TO_GOLD = 100;
    private static final int COPPER_TO_PLATINUM = 1000;

    private int copperCoins;

    public Currency(int copperCoins) {
        this.copperCoins = copperCoins;
    }

    // Methods for exchanging between different currency types
    public int getCopperCoins() {
        return copperCoins;
    }

    public int getSilverCoins() {
        return copperCoins / COPPER_TO_SILVER;
    }

    public int getGoldCoins() {
        return copperCoins / COPPER_TO_GOLD;
    }

    public int getPlatinumCoins() {
        return copperCoins / COPPER_TO_PLATINUM;
    }

    // Utility methods to add and subtract currency
    public void addCoins(int copperCoins) {
        this.copperCoins += copperCoins;
    }

    public void subtractCoins(int copperCoins) {
        if (this.copperCoins >= copperCoins) {
            this.copperCoins -= copperCoins;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public String toString() {
        int platinum = getPlatinumCoins();
        int gold = getGoldCoins() % 10;
        int silver = getSilverCoins() % 10;
        int copper = getCopperCoins() % 10;

        return String.format("%d Platinum, %d Gold, %d Silver, %d Copper", platinum, gold, silver, copper);
    }

    public static void main(String[] args) {
        Currency currency = new Currency(0);
        System.out.println("Initial currency: " + currency);

        currency.addCoins(1000); // Adding 1000 copper coins
        System.out.println("After adding 1000 copper coins: " + currency);

        currency.subtractCoins(25000); // Attempting to subtract 25000 copper coins (insufficient funds)
        System.out.println("After attempting to subtract 25000 copper coins: " + currency);

        currency.subtractCoins(2000); // Subtracting 2000 copper coins
        System.out.println("After subtracting 2000 copper coins: " + currency);
    }
}




