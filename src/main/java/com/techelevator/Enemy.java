package com.techelevator;

import java.util.Random;

public class Enemy {
    public static int getMaxEnemyHealth;
    Random randomNum = new Random();
    String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
    String[] gangMembers = {};
    int maxEnemyHealth = 75;
    int enemyAttackDamage = 25;

    public Enemy(String[] enemies, int maxEnemyHealth, int enemyAttackDamage) {
        this.enemies = enemies;
        this.maxEnemyHealth = maxEnemyHealth;
        this.enemyAttackDamage = enemyAttackDamage;
    }

    public String[] getEnemies() {
        return enemies;
    }

    public String[] getGangMembers() {
        return gangMembers;
    }

    public int getMaxEnemyHealth() {
        return maxEnemyHealth;
    }

    public int getEnemyAttackDamage() {
        return enemyAttackDamage;
    }
}
