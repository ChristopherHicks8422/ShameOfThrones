package com.techelevator;
import java.util.Scanner;

public class CharacterCreator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for the base stats and total stat points available
        final int FLOOR_STAT = 1;
        final int BASE_STAT = 5;
        final int CEILING_STAT = 10;
        int TOTAL_STAT_POINTS = 12;
        int TOTAL_SKILL_POINTS = 45;
        // Initial attribute values
        double strength = BASE_STAT;
        double strengthModifier = 0;
        if(strength == 1){
            strengthModifier = 0.2;
        }else if(strength == 2) {
            strengthModifier = 0.4;
        }else if(strength == 3) {
            strengthModifier = 0.6;
        }else if(strength == 4) {
            strengthModifier = 0.8;
        }else if(strength == 5) {
            strengthModifier = 1.0;
        }else if(strength == 6) {
            strengthModifier = 1.2;
        }else if(strength == 7) {
            strengthModifier = 1.4;
        }else if(strength == 8) {
            strengthModifier = 1.6;
        }else if(strength == 9) {
            strengthModifier = 1.8;
        }else if(strength == 10) {
            strengthModifier = 2.0;
        }
        double perception = BASE_STAT;
        double perceptionModifier=0;
        if(perception == 1){
            perceptionModifier = 0.2;
        }else if(perception == 2) {
            perceptionModifier = 0.4;
        }else if(perception == 3) {
            perceptionModifier = 0.6;
        }else if(perception == 4) {
            perceptionModifier = 0.8;
        }else if(perception == 5) {
            perceptionModifier = 1.0;
        }else if(perception == 6) {
            perceptionModifier = 1.2;
        }else if(perception == 7) {
            perceptionModifier = 1.4;
        }else if(perception == 8) {
            perceptionModifier = 1.6;
        }else if(perception == 9) {
            perceptionModifier = 1.8;
        }else if(perception == 10) {
            perceptionModifier = 2.0;
        }
        double endurance = BASE_STAT;
        double enduranceModifier=0;
        if(endurance == 1){
            enduranceModifier = 0.2;
        }else if(endurance == 2) {
            enduranceModifier = 0.4;
        }else if(endurance == 3) {
            enduranceModifier = 0.6;
        }else if(endurance == 4) {
            enduranceModifier = 0.8;
        }else if(endurance == 5) {
            enduranceModifier = 1.0;
        }else if(endurance == 6) {
            enduranceModifier = 1.2;
        }else if(endurance == 7) {
            enduranceModifier = 1.4;
        }else if(endurance == 8) {
            enduranceModifier = 1.6;
        }else if(endurance == 9) {
            enduranceModifier = 1.8;
        }else if(endurance == 10) {
            enduranceModifier = 2.0;
        }
        double charisma = BASE_STAT;
        double charismaModifier=0;
        if(charisma == 1){
            charismaModifier = 0.2;
        }else if(charisma == 2) {
            charismaModifier = 0.4;
        }else if(charisma == 3) {
            charismaModifier = 0.6;
        }else if(charisma == 4) {
            charismaModifier = 0.8;
        }else if(charisma == 5) {
            charismaModifier = 1.0;
        }else if(charisma == 6) {
            charismaModifier = 1.2;
        }else if(charisma == 7) {
            charismaModifier = 1.4;
        }else if(charisma == 8) {
            charismaModifier = 1.6;
        }else if(charisma == 9) {
            charismaModifier = 1.8;
        }else if(charisma == 10) {
            charismaModifier = 2.0;
        }
        double intelligence = BASE_STAT;
        double intelligenceModifier=0;
        if(intelligence == 1){
            intelligenceModifier = 0.2;
        }else if(intelligence == 2) {
            intelligenceModifier = 0.4;
        }else if(intelligence == 3) {
            intelligenceModifier = 0.6;
        }else if(intelligence == 4) {
            intelligenceModifier = 0.8;
        }else if(intelligence == 5) {
            intelligenceModifier = 1.0;
        }else if(intelligence == 6) {
            intelligenceModifier = 1.2;
        }else if(intelligence == 7) {
            intelligenceModifier = 1.4;
        }else if(intelligence == 8) {
            intelligenceModifier = 1.6;
        }else if(intelligence == 9) {
            intelligenceModifier = 1.8;
        }else if(intelligence == 10) {
            intelligenceModifier = 2.0;
        }
        double agility = BASE_STAT;
        double agilityModifier = 0;
        if(agility == 1){
            agilityModifier = 0.2;
        }else if(agility == 2) {
            agilityModifier = 0.4;
        }else if(agility == 3) {
            agilityModifier = 0.6;
        }else if(agility == 4) {
            agilityModifier = 0.8;
        }else if(agility == 5) {
            agilityModifier = 1.0;
        }else if(agility == 6) {
            agilityModifier = 1.2;
        }else if(agility == 7) {
            agilityModifier = 1.4;
        }else if(agility == 8) {
            agilityModifier = 1.6;
        }else if(agility == 9) {
            agilityModifier = 1.8;
        }else if(agility == 10) {
            agilityModifier = 2.0;
        }
        double luck = BASE_STAT;
        double luckModifier=0;
        if(luck == 1){
            luckModifier = 0.2;
        }else if(luck == 2) {
            luckModifier = 0.4;
        }else if(luck == 3) {
            luckModifier = 0.6;
        }else if(luck == 4) {
            luckModifier = 0.8;
        }else if(luck == 5) {
            luckModifier = 1.0;
        }else if(luck == 6) {
            luckModifier = 1.2;
        }else if(luck == 7) {
            luckModifier = 1.4;
        }else if(luck == 8) {
            luckModifier = 1.6;
        }else if(luck == 9) {
            luckModifier = 1.8;
        }else if(luck == 10) {
            luckModifier = 2.0;
        }
        // initial skill values
        // COMBAT SKILLS
        final double BASE_UNARMED_ATTACK_STAT = 15*strengthModifier;
        double unarmedAttack = BASE_UNARMED_ATTACK_STAT;
        final double BASE_ONE_HANDED_WEAPONS_STAT = 15*((strengthModifier+agilityModifier)/2);
        double oneHandedWeapons = BASE_ONE_HANDED_WEAPONS_STAT;
        final double BASE_TWO_HANDED_WEAPONS_STAT = 15*((strengthModifier+enduranceModifier)/2);
        double twoHandedWeapons = BASE_TWO_HANDED_WEAPONS_STAT;
        final double BASE_THROWING_STAT = 15*((strengthModifier+perceptionModifier)/2);
        double throwing = BASE_THROWING_STAT;
        // ACTIVE SKILLS
        final double BASE_LOCKPICKING_STAT = 15*((perceptionModifier+agilityModifier)/2);
        double lockPicking = BASE_LOCKPICKING_STAT;
        final double BASE_CRAFTING_STAT = 15*((perceptionModifier+intelligenceModifier)/2);
        double crafting = BASE_CRAFTING_STAT;
        final double BASE_SNEAK_STAT = 15*agilityModifier;
        double sneak = BASE_SNEAK_STAT;
        final double BASE_REPAIR_STAT = 15*intelligenceModifier;
        double repair = BASE_REPAIR_STAT;
        final double BASE_FIRST_AID_STAT = 15*((intelligenceModifier+perceptionModifier)/2);
        double firstAid = BASE_FIRST_AID_STAT;
        final double BASE_STEAL_STAT = 15*agilityModifier;
        double steal = BASE_STEAL_STAT;
        final double BASE_TRAPS_STAT = 15*((perceptionModifier+agilityModifier)/2);
        double traps = BASE_TRAPS_STAT;
        // PASSIVE SKILLS
        final double BASE_SPEECH_STAT = 15*charismaModifier;
        double speech = BASE_SPEECH_STAT;
        final double BASE_BARTER_STAT =15*charismaModifier;
        double barter =BASE_BARTER_STAT;
        final double BASE_GAMBLING_STAT = 15*luckModifier;
        double gambling = BASE_GAMBLING_STAT;
        final double BASE_OUTDOORSMAN_STAT = 15*((enduranceModifier+intelligenceModifier)/2);
        double outdoorsman = BASE_OUTDOORSMAN_STAT;

        // Character details
        String name;
        String gender;
        int age = 18;
        String hairColor;
        String hairType;
        String eyeColor;
        int heightFeet = 5;
        int heightInches = 0;

        // Get character details from the player
        System.out.println("********************************************************");
        System.out.println("Enter the character's name:");
        System.out.println("********************************************************");
        name = scanner.nextLine();
        // Select gender
        System.out.println("********************************************************");
        System.out.println("Select the character's gender:");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Trans Male");
        System.out.println("4. Trans Female");
        System.out.println("********************************************************");
        int genderChoice = scanner.nextInt();
        switch (genderChoice) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Trans Male";
                break;
            case 4:
                gender = "Trans Female";
                break;
            default:
                gender = "Unknown";
                break;
        }

        // Select age
        do {
            System.out.println("********************************************************");
            System.out.println("Enter the character's age (between 18 and 99):");
            System.out.println("********************************************************");
            age = scanner.nextInt();
        } while (age < 18 || age > 99);

        // Select height
        do {
            System.out.println("********************************************************");
            System.out.println("Enter the character's height (5-6 feet):");
            System.out.println("********************************************************");
            heightFeet = scanner.nextInt();
            System.out.println("********************************************************");
            System.out.println("Enter the character's height (0-11 inches):");
            System.out.println("********************************************************");
            heightInches = scanner.nextInt();
        } while (heightFeet < 5 || heightFeet > 6 || heightInches < 0 || heightInches > 11);

        // Select eye color
        String[] eyeColorOptions = {"Black", "Brown", "Blue", "Green", "Hazel Brown", "Hazel Green", "White", "Bloodshot"};
        System.out.println("********************************************************");
        System.out.println("Select the character's eye color:");
        System.out.println("********************************************************");
        for (int i = 0; i < eyeColorOptions.length; i++) {
            System.out.println((i + 1) + ". " + eyeColorOptions[i]);
        }
        int eyeColorChoice = scanner.nextInt();
        if (eyeColorChoice >= 1 && eyeColorChoice <= eyeColorOptions.length) {
            eyeColor = eyeColorOptions[eyeColorChoice - 1];
        } else {
            eyeColor = "Unknown";
        }

        // Select hair type
        String[] hairTypeOptions;
        if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Trans Male")) {
            hairTypeOptions = new String[]{
                    "Short Crew Cut", "Spiky", "Buzz Cut", "Pompadour", "Fade", "Mohawk",
                    "Long Flowing", "Top Knot", "Dreadlocks", "Slicked Back"
            };
        } else if (gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Trans Female")) {
            hairTypeOptions = new String[]{
                    "Long Straight", "Curly", "Braided", "Bob Cut", "Pixie", "Bun",
                    "Ponytail", "Afro", "Messy Bun", "Half Up Half Down"
            };
        } else {
            hairTypeOptions = new String[]{"Unknown"};
        }

        System.out.println("********************************************************");
        System.out.println("Select the character's hair type:");
        System.out.println("********************************************************");
        for (int i = 0; i < hairTypeOptions.length; i++) {
            System.out.println((i + 1) + ". " + hairTypeOptions[i]);
        }
        int hairTypeChoice = scanner.nextInt();
        if (hairTypeChoice >= 1 && hairTypeChoice <= hairTypeOptions.length) {
            hairType = hairTypeOptions[hairTypeChoice - 1];
        } else {
            hairType = "Unknown";
        }

        // Select hair color
        String[] hairColorOptions = {"Black", "Brown", "Blonde", "Red", "White", "Gray", "Blue", "Green", "Purple", "Pink"};
        System.out.println("********************************************************");
        System.out.println("Select the character's hair color:");
        System.out.println("********************************************************");
        for (int i = 0; i < hairColorOptions.length; i++) {
            System.out.println((i + 1) + ". " + hairColorOptions[i]);
        }
        int hairColorChoice = scanner.nextInt();
        if (hairColorChoice >= 1 && hairColorChoice <= hairColorOptions.length) {
            hairColor = hairColorOptions[hairColorChoice - 1];
        } else {
            hairColor = "Unknown";
        }

        // Loop until the player has spent all the points
        while (TOTAL_STAT_POINTS > 0) {
            System.out.println("********************************************************");
            System.out.println("Remaining Points: " + TOTAL_STAT_POINTS);
            System.out.println("********************************************************");
            System.out.println("1. Strength: " + strength);
            System.out.println("2. Perception: " + perception);
            System.out.println("3. Endurance: " + endurance);
            System.out.println("4. Charisma: " + charisma);
            System.out.println("5. Intelligence: " + intelligence);
            System.out.println("6. Agility: " + agility);
            System.out.println("7. Luck: " + luck);
            System.out.println("********************************************************");
            System.out.println("Enter the number of the attribute you want to increase:");
            System.out.println("************************* OR ***************************");
            System.out.println("8. Remove points from an attribute");
            System.out.println("********************************************************");
            int attributeChoice = scanner.nextInt();

            switch (attributeChoice) {
                case 1:
                    if (TOTAL_STAT_POINTS > 0 && strength < CEILING_STAT) {
                        strength++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 2:
                    if (TOTAL_STAT_POINTS > 0 && perception < CEILING_STAT) {
                        perception++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 3:
                    if (TOTAL_STAT_POINTS > 0 && endurance < CEILING_STAT) {
                        endurance++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 4:
                    if (TOTAL_STAT_POINTS > 0 && charisma < CEILING_STAT) {
                        charisma++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 5:
                    if (TOTAL_STAT_POINTS > 0 && intelligence < CEILING_STAT) {
                        intelligence++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 6:
                    if (TOTAL_STAT_POINTS > 0 && agility < CEILING_STAT) {
                        agility++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 7:
                    if (TOTAL_STAT_POINTS > 0 && luck < CEILING_STAT) {
                        luck++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 8:
                    if (TOTAL_STAT_POINTS < 40) {
                        // Allow the user to remove points from an attribute
                        System.out.println("********************************************************");
                        System.out.println("Enter the number of the attribute you want to remove points from:");
                        System.out.println("********************************************************");
                        int removeChoice = scanner.nextInt();
                        switch (removeChoice) {
                            case 1:
                                if (strength > FLOOR_STAT && strength < CEILING_STAT) {
                                    strength--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 2:
                                if (perception > FLOOR_STAT && perception < CEILING_STAT) {
                                    perception--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 3:
                                if (endurance > FLOOR_STAT && endurance < CEILING_STAT) {
                                    endurance--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 4:
                                if (charisma > FLOOR_STAT && charisma < CEILING_STAT) {
                                    charisma--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 5:
                                if (intelligence > FLOOR_STAT && intelligence < CEILING_STAT) {
                                    intelligence--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 6:
                                if (agility > FLOOR_STAT && agility < CEILING_STAT) {
                                    agility--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 7:
                                if (luck > FLOOR_STAT && luck < CEILING_STAT) {
                                    luck--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            default:
                                System.out.println("********************************************************");
                                System.out.println("Invalid choice! Please choose a valid attribute to remove points from.");
                                System.out.println("********************************************************");
                        }
                    } else {
                        System.out.println("********************************************************");
                        System.out.println("No points to remove.");
                        System.out.println("********************************************************");
                    }
                    break;
                default:
                    System.out.println("********************************************************");
                    System.out.println("Invalid choice! Please choose again.");
                    System.out.println("********************************************************");
            }
        }
        //



        //        SKILL LIST
        //        1"Unarmed Attack", 2"One-Handed Weapons", 3"Two-Handed Weapons", 4"Throwing", 5"Lockpicking", 6"Crafting",
        //        7"Sneak", 8"Repair", 9"First Aid", 10"Steal", 11"Traps", 12"Speech", 13"Barter", 14"Gambling", 15"Outdoorsman"

        // Loop until the player has spent all the points
        while (TOTAL_SKILL_POINTS > 0) {
            // Display the skills and skill points
            System.out.println("********************************************************");
            System.out.println("Remaining Skill Points: " + TOTAL_SKILL_POINTS);
            System.out.println("********************************************************");
            System.out.println("\nSkills:");
            System.out.println("********************************************************");
            System.out.println("1. Unarmed Attack: " + unarmedAttack);
            System.out.println("2. One-Handed Weapons: " + oneHandedWeapons);
            System.out.println("3. Two-Handed Weapons: " + twoHandedWeapons);
            System.out.println("4. Throwing: " + throwing);
            System.out.println("5. Lockpicking: " + lockPicking);
            System.out.println("6. Crafting: " + crafting);
            System.out.println("7. Sneak: " + sneak);
            System.out.println("8. Repair: " + repair);
            System.out.println("9. First Aid: " + firstAid);
            System.out.println("10. Steal: " + steal);
            System.out.println("11. Traps: " + traps);
            System.out.println("12. Speech: " + speech);
            System.out.println("13. Barter: " + barter);
            System.out.println("14. Gambling: " + gambling);
            System.out.println("15. Outdoorsman: " + outdoorsman);
            System.out.println("********************************************************");
            System.out.println("16. Remove points from a skill");
            System.out.println("********************************************************");
            System.out.println("Enter the number of the skill you want to increase or remove points from:");
            System.out.println("********************************************************");
            int skillChoice = scanner.nextInt();

            switch (skillChoice) {
                case 1:
                    if (TOTAL_SKILL_POINTS > 0 && unarmedAttack >=BASE_UNARMED_ATTACK_STAT) {
                        unarmedAttack++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 2:
                    if (TOTAL_SKILL_POINTS > 0 && oneHandedWeapons >=BASE_ONE_HANDED_WEAPONS_STAT) {
                        oneHandedWeapons++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 3:
                    if (TOTAL_SKILL_POINTS > 0 && twoHandedWeapons >= BASE_TWO_HANDED_WEAPONS_STAT) {
                        twoHandedWeapons++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 4:
                    if (TOTAL_SKILL_POINTS > 0 && throwing >= BASE_THROWING_STAT) {
                        throwing++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 5:
                    if (TOTAL_SKILL_POINTS > 0 && lockPicking >= BASE_LOCKPICKING_STAT) {
                        lockPicking++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 6:
                    if (TOTAL_SKILL_POINTS > 0 && crafting >=BASE_CRAFTING_STAT) {
                        crafting++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 7:
                    if (TOTAL_SKILL_POINTS > 0 && sneak >= BASE_SNEAK_STAT) {
                        sneak++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 8:
                    if (TOTAL_SKILL_POINTS > 0 && repair >= BASE_REPAIR_STAT) {
                        repair++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 9:
                    if (TOTAL_SKILL_POINTS > 0 && firstAid >= BASE_FIRST_AID_STAT) {
                        firstAid++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 10:
                    if (TOTAL_SKILL_POINTS > 0 && steal >= BASE_STEAL_STAT) {
                        steal++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 11:
                    if (TOTAL_SKILL_POINTS > 0 && traps >= BASE_TRAPS_STAT) {
                        traps++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 12:
                    if (TOTAL_SKILL_POINTS > 0 && speech >= BASE_SPEECH_STAT) {
                        speech++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 13:
                    if (TOTAL_SKILL_POINTS > 0 && barter >= BASE_BARTER_STAT) {
                        barter++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 14:
                    if (TOTAL_SKILL_POINTS > 0 && gambling >= BASE_GAMBLING_STAT) {
                        gambling++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 15:
                    if (TOTAL_SKILL_POINTS > 0 && outdoorsman >= BASE_OUTDOORSMAN_STAT) {
                        outdoorsman++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 16:
                    if (TOTAL_SKILL_POINTS < 40) {
                        // Allow the user to remove points from a skill
                        System.out.println("********************************************************");
                        System.out.println("Enter the number of the skill you want to remove points from:");
                        System.out.println("********************************************************");
                        int removeChoice = scanner.nextInt();
                        switch (removeChoice) {
                            case 1:
                                if (TOTAL_SKILL_POINTS > 0 && unarmedAttack >=BASE_UNARMED_ATTACK_STAT) {
                                    unarmedAttack--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 2:
                                if (TOTAL_SKILL_POINTS > 0 && oneHandedWeapons >=BASE_ONE_HANDED_WEAPONS_STAT) {
                                    oneHandedWeapons--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 3:
                                if (TOTAL_SKILL_POINTS > 0 && twoHandedWeapons >= BASE_TWO_HANDED_WEAPONS_STAT) {
                                    twoHandedWeapons--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 4:
                                if (TOTAL_SKILL_POINTS > 0 && throwing >= BASE_THROWING_STAT) {
                                    throwing--;
                                    TOTAL_SKILL_POINTS++;
                                }
                            case 5:
                                if (TOTAL_SKILL_POINTS > 0 && lockPicking >= BASE_LOCKPICKING_STAT) {
                                    lockPicking--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 6:
                                if (TOTAL_SKILL_POINTS > 0 && crafting >=BASE_CRAFTING_STAT) {
                                    crafting--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 7:
                                if (TOTAL_SKILL_POINTS > 0 && sneak >= BASE_SNEAK_STAT) {
                                    sneak--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 8:
                                if (TOTAL_SKILL_POINTS > 0 && repair >= BASE_REPAIR_STAT) {
                                    repair--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 9:
                                if (TOTAL_SKILL_POINTS > 0 && firstAid >= BASE_FIRST_AID_STAT) {
                                    firstAid--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 10:
                                if (TOTAL_SKILL_POINTS > 0 && steal >= BASE_STEAL_STAT) {
                                    steal--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 11:
                                if (TOTAL_SKILL_POINTS > 0 && traps >= BASE_TRAPS_STAT) {
                                    traps--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 12:
                                if (TOTAL_SKILL_POINTS > 0 && speech >= BASE_SPEECH_STAT) {
                                    speech--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 13:
                                if (TOTAL_SKILL_POINTS > 0 && barter >= BASE_BARTER_STAT) {
                                    barter--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 14:
                                if (TOTAL_SKILL_POINTS > 0 && gambling >= BASE_GAMBLING_STAT) {
                                    gambling--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 15:
                                if (TOTAL_SKILL_POINTS > 0 && outdoorsman >= BASE_OUTDOORSMAN_STAT) {
                                    outdoorsman--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            default:
                                System.out.println("********************************************************");
                                System.out.println("Invalid choice! Please choose a valid skill to remove points from.");
                                System.out.println("********************************************************");
                        }
                    } else {
                        System.out.println("********************************************************");
                        System.out.println("No points to remove.");
                        System.out.println("********************************************************");
                    }
                    break;
                default:
                    System.out.println("********************************************************");
                    System.out.println("Invalid choice! Please choose a valid skill to increase.");
                    System.out.println("********************************************************");
            }
        }


        // Display the final attribute values
        System.out.println("********************************************************");
        System.out.println("********************************************************");
        System.out.println("Character Created!");
        System.out.println("********************************************************");
        System.out.println("********************************************************");
        // Display Identifiers
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender + " || Age: " + age + " || Height: " + heightFeet + "'" + heightInches +
                "\nEye Color: " + eyeColor + " || Hair Type: " + hairType + " || Hair Color: " + hairColor);
        System.out.println("********************************************************");
        // Display S.P.E.C.I.A.L.
        System.out.println("Strength: " + strength);
        System.out.println("Perception: " + perception);
        System.out.println("Endurance: " + endurance);
        System.out.println("Charisma: " + charisma);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Agility: " + agility);
        System.out.println("Luck: " + luck);
        System.out.println("********************************************************");
        // Display the final skill points
        System.out.println("********************************************************");
        System.out.println("Skill Points:");
        System.out.println("********************************************************");
        System.out.println("1. Unarmed Attack: " + unarmedAttack);
        System.out.println("2. One-Handed Weapons: " + oneHandedWeapons);
        System.out.println("3. Two-Handed Weapons: " + twoHandedWeapons);
        System.out.println("4. Throwing: " + throwing);
        System.out.println("5. Lockpicking: " + lockPicking);
        System.out.println("6. Crafting: " + crafting);
        System.out.println("7. Sneak: " + sneak);
        System.out.println("8. Repair: " + repair);
        System.out.println("9. First Aid: " + firstAid);
        System.out.println("10. Steal: " + steal);
        System.out.println("11. Traps: " + traps);
        System.out.println("12. Speech: " + speech);
        System.out.println("13. Barter: " + barter);
        System.out.println("14. Gambling: " + gambling);
        System.out.println("15. Outdoorsman: " + outdoorsman);
        System.out.println("********************************************************");




















        scanner.close();
    }
}

