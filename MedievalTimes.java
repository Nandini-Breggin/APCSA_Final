// import.java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class MedievalTimes {
    public static void main(String[] args) throws IOException {
        Scanner userScan;
        File file;
        Scanner fileScan;
        PrintWriter output;

        System.out.println("Welcome to Medival Times! Let's start playing!");

        try {
            userScan = new Scanner(System.in);

            Menu(); // shows menu options

            // user selection from menu options
            int selection = Integer.parseInt(userScan.nextLine()); 

            while (selection < 4 && selection > 0) { // 1-3 on menu does // 4 on menu quits game

                // 1. Create a new game
                if (selection == 1) {
                    System.out.println("What would you like to save the file as? ");
                    String fileName = userScan.nextLine();
                    // file = new File(fileName);
                    
                    File inputFile = new File(fileName);

                    output = new PrintWriter(new FileWriter(file, true));

                    // Counter to make sure that there isn't more than 2 of any character
                    int knightCount = 0;
                    int peasantCount = 0;
                    int clericCount = 0;
                    int mageCount = 0;
                    int courtierCount = 0;

                    // int partyCount = 0;

                    System.out.println("Enter the name you want the game to be saved as: ");
                    String nameGame = userScan.nextLine();
                    output.println(nameGame);


                    for (int i = 1; i <= 4; i++) { // repeats until there is at least 4
                        System.out.println("Enter the character name that you want: ");
                        System.out.println("| Knight | Peasant | Cleric | Mage | Courtier |");
                        String type = userScan.nextLine();

                        if (type.equals("Knight")) {
                            knightCount++; // keep track of how many knights there are
                            // partyCount++; // keep track of how many people are in the party

                            if (knightCount > 2) {
                                // if there is more than 2, give error message then lower the count down to 2 again
                                System.out.println("You have chosen too many of the knights! Please try again.");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: ");
                                String name = userScan.nextLine();
                                output.println(name + "," + character + "\n");
                                // newCharacter = new Character(characterInfo.get(0), characterInfo.get(1), (characterInfo.get(2)).toLowerCase().equals("t"), Integer.parseInt(characterInfo.get(3)));
                                // output.println(newCharacter);
                            }

                        } else if (type.equals("Peasant")) {
                            peasantCount++; 
                            // partyCount++;

                            if (peasantCount > 2) {
                                System.out.println("You have chosen too many of the peasants! Please try again.");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: ");
                                String name = userScan.nextLine();
                                output.println(name + "," + character + "\n");
                            }

                        } else if (type.equals("Cleric")) {
                            clericCount++; 
                            // partyCount++;

                            if (clericCount > 2) {
                                System.out.println("You have chosen too many of the clerics! Please try again.");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: ");
                                String name = userScan.nextLine();
                                output.println(name + "," + character + "\n");    
                            }

                        } else if (type.equals("Mage")) {
                            mageCount++; 
                            // partyCount++;

                            if (mageCount > 2) {
                                System.out.println("You have chosen too many of the mages! Please try again.");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: ");
                                String name = userScan.nextLine();
                                output.println(name + "," + character + "\n");
                            }

                        } else if (type.equals("Courtier")) {
                            courtierCount++; 
                            // partyCount++;

                            if (courtierCount > 2) {
                                System.out.println("You have chosen too many of the courtiers! Please try again.");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: ");
                                String name = userScan.nextLine();
                                // Strength, toughness, intelligence, magic, and influence
                                output.println(name + "," + character + "\n");
                            }
                            
                        } 

                    }

                    // while (partyCount < 4) {
                    //     // character party minumum is 4
                    //     System.out.println("You need at least" + (4 - partyCount) + " more characters until your party is valid.");
                    //     System.out.println("Remember, you can't have more than 2 of any type of character in your party!");
                    // }



                }

                // output.close();
                Menu();
                selection = Integer.parseInt(userScan.nextLine());

                // 2. File Validation/ Save File

                if (selection == 2) {
                    System.out.println("Enter the name of the file you would like to validate: ");
                    String fileName = userScan.nextLine();
                    file = new File(fileName);
                    fileScan = new Scanner(file);

                    int errorCount = 0;

                    System.out.println("\n");
                    fileScan.nextLine();

                    while (fileScan.hasNextLine()) {

                        ArrayList<String> charInfo = new ArrayList<String>();
                        String current = fileScan.nextLine();
                        System.out.println(current);

                        for (String word : current.split(",")){
                            charInfo.add(word);
                        }

                        if (!characterScore(charInfo)) {
                            errorCount++; 
                        }

                        System.out.println("Number of Errors: " + errorCount);
                    }

                    if (errorCount > 0){
                        System.out.println("\nYour file is not valid.");
                    } else {
                        System.out.println("\nYour file is valid!");
                    }

                    fileScan.close();
                    Menu();
                    selection = Integer.parseInt(userScan.nextLine());

                }


                // 3. Reroll/Randomize an existing character

                // if (selection == 3) {
                //     System.out.println("Enter the name of the file saved: ");
                //     String fileName = userScan.nextLine();

                //     file = new File(fileName);
                //     fileScan = new Scanner(file);

                //     // randomizer
                //     Random rand = new Random();

    




                //     Menu();
                //     selection = Integer.parseInt(userScan.nextLine());



                // }

                // 4. Quiting game
                if (selection == 4) {
                    System.out.println("Quiting game.");
                    System.exit(0);
                }


                
            }


            userScan.close(); // user input not allowed anymore

        } catch (FileNotFoundException e) {
            System.out.println("**Error: File not found.**");
            System.exit(0);
        }


    }




    public static void Menu() {
        System.out.println("\n ~~ Menu: ~~ \n (1) Create new game \n (2) Validate saved file \n (3) Reroll an existing character \n (4) Quit game \n");
    }

    public static boolean characterScore(ArrayList <String> characterInfo) {

        int score = 0;

        if (characterInfo.size() < 7) {
            return false;
        } else if (characterInfo.size() == 7) {
            score = Integer.parseInt(characterInfo.get(2)) + Integer.parseInt(characterInfo.get(3)) + Integer.parseInt(characterInfo.get(4)) + Integer.parseInt(characterInfo.get(5)) + Integer.parseInt(characterInfo.get(6));
        }

        // party score has to be: 8 <= x <= 28
        if (score < 8 || score > 28) {
            return false; // not possible, or the game is done

        } else if ((characterInfo.get(1).equals("Knight")) && (Integer.parseInt(characterInfo.get(2))) >= 11 ||  (Integer.parseInt(characterInfo.get(3))) >= 6) {
            return false;

        } else if ((characterInfo.get(1).equals("Peasant")) && (Integer.parseInt(characterInfo.get(2))) >= 11 ||  (Integer.parseInt(characterInfo.get(3))) >= 6) {
            return false;
            
        } else if ((characterInfo.get(1).equals("Cleric")) && (Integer.parseInt(characterInfo.get(2))) >= 11 ||  (Integer.parseInt(characterInfo.get(3))) >= 6) {
            return false;
            
        } else if ((characterInfo.get(1).equals("Mage")) && (Integer.parseInt(characterInfo.get(2))) >= 11 ||  (Integer.parseInt(characterInfo.get(3))) >= 6) {
            return false;
            
        } else if ((characterInfo.get(1).equals("Courtier")) && (Integer.parseInt(characterInfo.get(2))) >= 11 ||  (Integer.parseInt(characterInfo.get(3))) >= 6) {
            return false;
            
        } else if (characterInfo.get(1).equals("Knight") || characterInfo.get(1).equals("Peasant") || characterInfo.get(1).equals("Cleric") || characterInfo.get(1).equals("Mage") || characterInfo.get(1).equals("Courtier")) {
            return true;
            
        }

        return false;

    } 
}
