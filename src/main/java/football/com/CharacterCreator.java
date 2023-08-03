package football.com;
import java.util.Scanner;

public class CharacterCreator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for the base stats and total stat points available
    final int overall;
        final int BASE_STAT = 1;
        int TOTAL_STAT_POINTS = 35;
        int TOTAL_SKILL_POINTS = 45;
        // Initial attribute values
        int strength = BASE_STAT;
        int perception = BASE_STAT;
        int endurance = BASE_STAT;
        int charisma = BASE_STAT;
        int intelligence = BASE_STAT;
        int agility = BASE_STAT;
        int luck = BASE_STAT;


        // initial skill values
        int BASE_THROWING_POWER_STAT = 1;
        int throwingPower = BASE_THROWING_POWER_STAT;
        int BASE_SHORT_THROW_ACCURACY_STAT = 1;
        int shortThrowAccuracyStat = BASE_SHORT_THROW_ACCURACY_STAT;
        int BASE_MEDIUM_THROW_ACCURACY_STAT = 1;
        int mediumThrowAccuracyStat = BASE_MEDIUM_THROW_ACCURACY_STAT;
        int BASE_DEEP_THROW_ACCURACY_STAT = 1;
        int deepThrowAccuracy = BASE_DEEP_THROW_ACCURACY_STAT;
        int BASE_POCKET_AWARENESS_STAT = 1;
        int pocketAwareness = BASE_POCKET_AWARENESS_STAT;
        int BASE_MOVE_IN_POCKET_STAT = 1;
        int moveInPocket = BASE_MOVE_IN_POCKET_STAT;
        int BASE_THROW_ON_THE_RUN_STAT = 1;
        int throwOnTheRun = BASE_THROW_ON_THE_RUN_STAT;
        int BASE_ESCAPE_SACK_STAT = 1;
        int escapeSack = BASE_ESCAPE_SACK_STAT;
        int BASE_JUKE_MOVE_STAT = 1;
        int jukeMove = BASE_JUKE_MOVE_STAT;
        int BASE_SPIN_MOVE_STAT = 1;
        int spinMove = BASE_SPIN_MOVE_STAT;
        int BASE_STIFF_ARM_STAT = 1;
        int stiffArm = BASE_STIFF_ARM_STAT;
        int BASE_HURDLE_STAT = 1;
        int hurdle = BASE_HURDLE_STAT;
        int BASE_BALL_SECURITY_STAT =1;
        int ballSecurity =BASE_BALL_SECURITY_STAT;
        int BASE_RUNNING_SPEED_STAT = 1;
        int runningSpeed = BASE_RUNNING_SPEED_STAT;
        int BASE_PLAY_ACTION_STAT = 1;
        int playAction = BASE_PLAY_ACTION_STAT;


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
        System.out.println("Enter the player's first and last name:");
        name = scanner.nextLine();
        // Select gender
        System.out.println("Select the character's gender:");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Trans Male");
        System.out.println("4. Trans Female");
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
            System.out.println("Enter the character's age (between 18 and 72):");
            age = scanner.nextInt();
        } while (age < 18 || age > 72);

        // Select height
        do {
            System.out.println("Enter the character's height (5-6 feet):");
            heightFeet = scanner.nextInt();
            System.out.println("Enter the character's height (0-11 inches):");
            heightInches = scanner.nextInt();
        } while (heightFeet < 5 || heightFeet > 6 || heightInches < 0 || heightInches > 11);

        // Select eye color
        String[] eyeColorOptions = {"Black", "Brown", "Blue", "Green", "Hazel Brown", "Hazel Green", "White", "Bloodshot"};
        System.out.println("Select the character's eye color:");
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

        System.out.println("Select the character's hair type:");
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
        System.out.println("Select the character's hair color:");
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
            System.out.println("Remaining Points: " + TOTAL_STAT_POINTS);
            System.out.println("1. Strength: " + strength);
            System.out.println("2. Perception: " + perception);
            System.out.println("3. Endurance: " + endurance);
            System.out.println("4. Charisma: " + charisma);
            System.out.println("5. Intelligence: " + intelligence);
            System.out.println("6. Agility: " + agility);
            System.out.println("7. Luck: " + luck);
            System.out.println("Enter the number of the attribute you want to increase:");
            System.out.println("Or.....................................................");
            System.out.println("8. Remove points from an attribute");
            int attributeChoice = scanner.nextInt();

            switch (attributeChoice) {
                case 1:
                    if (TOTAL_STAT_POINTS > 0) {
                        strength++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 2:
                    if (TOTAL_STAT_POINTS > 0) {
                        perception++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 3:
                    if (TOTAL_STAT_POINTS > 0) {
                        endurance++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 4:
                    if (TOTAL_STAT_POINTS > 0) {
                        charisma++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 5:
                    if (TOTAL_STAT_POINTS > 0) {
                        intelligence++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 6:
                    if (TOTAL_STAT_POINTS > 0) {
                        agility++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 7:
                    if (TOTAL_STAT_POINTS > 0) {
                        luck++;
                        TOTAL_STAT_POINTS--;
                    }
                    break;
                case 8:
                    if (TOTAL_STAT_POINTS < 40) {
                        // Allow the user to remove points from an attribute
                        System.out.println("Enter the number of the attribute you want to remove points from:");
                        int removeChoice = scanner.nextInt();
                        switch (removeChoice) {
                            case 1:
                                if (strength > BASE_STAT) {
                                    strength--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 2:
                                if (perception > BASE_STAT) {
                                    perception--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 3:
                                if (endurance > BASE_STAT) {
                                    endurance--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 4:
                                if (charisma > BASE_STAT) {
                                    charisma--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 5:
                                if (intelligence > BASE_STAT) {
                                    intelligence--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 6:
                                if (agility > BASE_STAT) {
                                    agility--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            case 7:
                                if (luck > BASE_STAT) {
                                    luck--;
                                    TOTAL_STAT_POINTS++;
                                }
                                break;
                            default:
                                System.out.println("Invalid choice! Please choose a valid attribute to remove points from.");
                        }
                    } else {
                        System.out.println("No points to remove.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
        //



        // Skill list and skill points
        String[] skills = {
                "Throwing Power", "Short Throw Accuracy", "Medium Throw Accuracy", "Deep Throw Accuracy", "Pocket Awareness",
                "Move In Pocket", "Throw On The Run", "Escape Sack", "Juke Move", "Spin Move", "Stiff Arm", "Hurdle",
                "Ball Security", "Running Speed", "Play Action"
        };
        int[] skillPoints = new int[skills.length];

        // Loop until the player has spent all the points
        while (TOTAL_SKILL_POINTS > 0) {
            // Display the skills and skill points
            System.out.println("Remaining Skill Points: " + TOTAL_SKILL_POINTS);
            System.out.println("\nSkills:");
            for (int i = 0; i < skills.length; i++) {
                System.out.println((i + 1) + ". " + skills[i] + ": " + skillPoints[i]);
            }
            System.out.println("16. Remove points from a skill");
            System.out.println("Enter the number of the skill you want to increase or remove points from:");
            int skillChoice = scanner.nextInt();

            switch (skillChoice) {
                case 1:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[0]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 2:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[1]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 3:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[2]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 4:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[3]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 5:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[4]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 6:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[5]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 7:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[6]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 8:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[7]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 9:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[8]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 10:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[9]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 11:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[10]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 12:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[11]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 13:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[12]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 14:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[13]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 15:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[14]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 16:
                    if (TOTAL_SKILL_POINTS > 0) {
                        skillPoints[15]++;
                        TOTAL_SKILL_POINTS--;
                    }
                    break;
                case 17:
                    if (TOTAL_SKILL_POINTS < 40) {
                        // Allow the user to remove points from a skill
                        System.out.println("Enter the number of the skill you want to remove points from:");
                        int removeChoice = scanner.nextInt();
                        switch (removeChoice) {
                            case 1:
                                if (skillPoints[0] > 0) {
                                    skillPoints[0]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 2:
                                if (skillPoints[1] > 0) {
                                    skillPoints[1]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 3:
                                if (skillPoints[2] > 0) {
                                    skillPoints[2]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 4:
                                if (skillPoints[3] > 0) {
                                    skillPoints[3]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 5:
                                if (skillPoints[4] > 0) {
                                    skillPoints[4]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 6:
                                if (skillPoints[5] > 0) {
                                    skillPoints[5]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 7:
                                if (skillPoints[6] > 0) {
                                    skillPoints[6]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 8:
                                if (skillPoints[7] > 0) {
                                    skillPoints[7]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 9:
                                if (skillPoints[8] > 0) {
                                    skillPoints[8]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 10:
                                if (skillPoints[9] > 0) {
                                    skillPoints[9]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 11:
                                if (skillPoints[10] > 0) {
                                    skillPoints[10]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 12:
                                if (skillPoints[11] > 0) {
                                    skillPoints[11]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 13:
                                if (skillPoints[12] > 0) {
                                    skillPoints[12]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 14:
                                if (skillPoints[13] > 0) {
                                    skillPoints[13]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            case 15:
                                if (skillPoints[14] > 0) {
                                    skillPoints[14]--;
                                    TOTAL_SKILL_POINTS++;
                                }
                                break;
                            default:
                                System.out.println("Invalid choice! Please choose a valid skill to remove points from.");
                        }
                    } else {
                        System.out.println("No points to remove.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid skill to increase.");
            }
        }


        // Display the final attribute values
        System.out.println("Character Created!");
        // Display Identifiers
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender + " Age: " + age + " Height: " + heightFeet + "'" + heightInches +
                "\nEye Color: " + eyeColor + " Hair Type: " + hairType + " Hair Color: " + hairColor);
        // Display S.P.E.C.I.A.L.
        System.out.println("Strength: " + strength);
        System.out.println("Perception: " + perception);
        System.out.println("Endurance: " + endurance);
        System.out.println("Charisma: " + charisma);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Agility: " + agility);
        System.out.println("Luck: " + luck);
        // Display the final skill points
        System.out.println("\nFinal Skill Points:");
        for (int i = 0; i < skills.length; i++) {
            System.out.println(skills[i] + ": " + skillPoints[i]);
        }

        scanner.close();
    }
}

