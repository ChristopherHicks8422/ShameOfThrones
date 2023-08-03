package com.techelevator;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // System Objects
    Scanner in = new Scanner(System.in);
    Random rand = new Random();

        // Game Variables
    int healthPotionHealAmount = 30;
    int healthPotionDropChance = 25;
    List<Weapon> weapons = new ArrayList<>();
    List<Armor> armors = new ArrayList<>();
    List<Wearable> wearables = new ArrayList<>();
    List<HealthItem> healthItems = new ArrayList<>();
    List<ThrowableItem> throwableItems = new ArrayList<>();
    List<KeyItem> keyItems = new ArrayList<>();

        // Player Variables



    boolean running = true;

        System.out.println("Welcome to the Dungeon!");

        GAME:
        while (running){
            System.out.println("--------------------------------------------");

            int enemyHealth = rand.nextInt(Enemy.getMaxEnemyHealth);

            String[] enemies;
//            String enemy = enemies[rand.nextInt(enemies.length)];
//            System.out.println("\t# " + enemy + " has appeared!!! #\n");

            while (enemyHealth > 0) {
//                System.out.println("\tYour HP: " + health);
//                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack! ");
                System.out.println("\t2. Use Item");
                System.out.println("\t3. Drink Health Potion");
                System.out.println("\t4. Run Away! ");

                String input = in.nextLine();

                if(input.equals("1")){
//                    int damageDealt = rand.nextInt(attackDamage);
//                    int damageTaken = rand.nextInt(enemyAttackDamage);

//                    enemyHealth -= damageDealt;
//                    health -= damageTaken;

//                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
//                    System.out.println("\t> You receive " + damageTaken + " in retaliation!" );

//                    if(health < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }


                }
//                else if(input.equals("2")){
                    System.out.println("\t You rummage through your pants... you don't find anything useful.");
                }
//                else if(input.equals("3")){
                    int healthRecovered =  rand.nextInt(healthPotionHealAmount);
//                    if(numHealthPotions > 0) {
//                        health += healthRecovered;
//                        numHealthPotions --;
//                        System.out.println("\t> You dringk a health potion and recover " + healthRecovered + " health!"
//                                + "\n\t> You now have " + health + " HP."
//                                + "\n\t> You have " + numHealthPotions + " health potions left. \n");
                    }
//                    else {
//                        System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one.");
//                    }
//                }
//                else if(input.equals("4")){
//                    System.out.println("\tYou run away from the " + enemy + "!");
//                    continue GAME;
//                }
//                else {
//                    System.out.println("\tInvalid command");
//                }
//            }
//
//            if( health < 1) {
//                System.out.println("You limp out of the dungeon, weak from battle.");
//                break;
//            }
//
//            System.out.println("--------------------------------------------");
//            System.out.println(" # " + enemy + " was defeated! # ");
//            System.out.println(" # You have " + health + " HP left. # ");
//            if( rand.nextInt(100) < healthPotionDropChance) {
//                numHealthPotions ++;
//                System.out.println(" # The " + enemy + " dropped a health potion! # ");
//                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
//            }
//            System.out.println("--------------------------------------------");
//            System.out.println("What would you like to do now?");
//            System.out.println("1. Continue");
//        }
//
//    }
//
}