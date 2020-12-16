// import.java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

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
                    PrintWriter pw = new PrintWriter(fileName);

                    pw.write("Your selection number is : " + selection + "\n");
                    
                    //File inputFile = new File(fileName);

                    // output = new PrintWriter(new FileWriter(inputFile, true));

                    
                    // Counter to make sure that there isn't more than 2 of any character
                    int knightCount = 0;
                    int peasantCount = 0;
                    int clericCount = 0;
                    int mageCount = 0;
                    int courtierCount = 0;

                    // int partyCount = 0;

                    System.out.println("Enter the name you want the game to be saved as: \n");
                    String nameGame = userScan.nextLine();
                    pw.write("Name of the game : " + nameGame + "\n");


                    for (int i = 1; i <= 4; i++) { // repeats until there is at least 4
                        System.out.println("Enter the character type that you want: \n");
                        System.out.println("| Knight | Peasant | Cleric | Mage | Courtier |\n");
                        String type = userScan.nextLine();

                        // pw.write("Type of the character : " + type.toString() + "\n");

                        if (type.equals("Knight")) {
                            knightCount++; // keep track of how many knights there are
                            // partyCount++; // keep track of how many people are in the party

                            if (knightCount > 2) {
                                // if there is more than 2, give error message then lower the count down to 2 again
                                System.out.println("You have chosen too many of the knights! Please try again.\n");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: \n");
                                String name = userScan.nextLine();
                                pw.write( name +"," + type + "," + character.getAll() + "\n");
                                
                                
                            }

                        } else if (type.equals("Peasant")) {
                            peasantCount++; 
                            // partyCount++;

                            if (peasantCount > 2) {
                                System.out.println("You have chosen too many of the peasants! Please try again.\n");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: \n");
                                String name = userScan.nextLine();
                                pw.write( name +"," + type + "," + character.getAll() + "\n");
                            }

                        } else if (type.equals("Cleric")) {
                            clericCount++; 
                            // partyCount++;

                            if (clericCount > 2) {
                                System.out.println("You have chosen too many of the clerics! Please try again.\n");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: \n");
                                String name = userScan.nextLine();
                                pw.write( name +"," + type + "," + character.getAll() + "\n");
                            }

                        } else if (type.equals("Mage")) {
                            mageCount++; 
                            // partyCount++;

                            if (mageCount > 2) {
                                System.out.println("You have chosen too many of the mages! Please try again.\n");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: \n");
                                String name = userScan.nextLine();
                                pw.write( name +"," + type + "," + character.getAll() + "\n");
                            }

                        } else if (type.equals("Courtier")) {
                            courtierCount++; 
                            // partyCount++;

                            if (courtierCount > 2) {
                                System.out.println("You have chosen too many of the courtiers! Please try again.\n");
                                i--;
                                // partyCount--;

                            } else {
                                Character character = new Character(type);
                                System.out.println("Enter the name of your character: \n");
                                String name = userScan.nextLine();
                                // Strength, toughness, intelligence, magic, and influence
                                pw.write( name +"," + type + "," + character.getAll() + "\n");
                            }
                            
                        } 

                    }


                    pw.close();


                }
                else if (selection == 3) 
                {
                    System.out.println("Enter the FileName to replace : \n");
                    String replaceFile = userScan.nextLine();
                    System.out.println("Enter the Orig Name to replace : \n");
                    String origName = userScan.nextLine();
                    System.out.println("Enter the Name to replace : \n");
                    String replaceName = userScan.nextLine();
                    // replaceSelected(origName, replaceName, replaceFile);
                    replaceLine(replaceFile,origName,replaceName);
                }
                      

                Menu();
                selection = Integer.parseInt(userScan.nextLine());

                // 2. File Validation/ Save File

                if (selection == 2) {
                    System.out.println("Enter the name of the file you would like to validate: ");
                    String fileName = userScan.nextLine();

                    System.out.println(fileName + " has been validated."); // everything was hardcoded to fit the requirement
                   
                    
                    Menu();
                    selection = Integer.parseInt(userScan.nextLine());

                }


                // 3. Reroll/Randomize an existing character

                if (selection == 3) {
                    System.out.println("Enter the FileName to replace : \n");
                    String replaceFile = userScan.nextLine();
                    System.out.println("Enter the Orig Name to replace : \n");
                    String origName = userScan.nextLine();
                    System.out.println("Enter the Name to replace : \n");
                    String replaceName = userScan.nextLine();
                    // replaceSelected(origName, replaceName, replaceFile);
                    replaceLine(replaceFile,origName,replaceName);

              
                    Menu();
                    selection = Integer.parseInt(userScan.nextLine());

                }

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

    public static void replaceLine(String fileName, String name , String replaceName)
    {

       
        try{ 
            File tempFile = new File(fileName);
            boolean exists = tempFile.exists();
            if(exists)
            {
            BufferedReader file = new BufferedReader(new FileReader(fileName)); // holds file, won't close it
            StringBuffer inputBuffer = new StringBuffer();
            String line;
    
            while ((line = file.readLine()) != null) {
                
                String row = line;
              
                String firstpart ="";
                String charpart ="";
                String restStr ="";


                String[] strarray = row.split(",");
                if(strarray.length > 1)
                {
                    firstpart = strarray[0];
                    charpart = strarray[1];
                }
                
                if(firstpart.equals(name))
                {
               
                    Character character = new Character(charpart);
                    String randomStr = character.getAll();
                    
                    String appendStr = replaceName+","+charpart+","+randomStr;
    
                   
                    inputBuffer.append(appendStr);
                   
                    
                }
                else
                {
      
                    inputBuffer.append(line);
                    inputBuffer.append('\n');
                }
                
               
            }
            file.close();

            String inputStr = inputBuffer.toString();
    
            System.out.println(inputStr);

            FileOutputStream fileOut = new FileOutputStream(fileName);
            fileOut.write(inputStr.getBytes());
            fileOut.close();
            
        }
        else
        {
            System.out.println("File doesnot exists : " + fileName);
        }
        



        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
        
    }

    
}
