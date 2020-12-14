# Final Challenge - Medieval Times

## Game Details
Medieval Times is an exciting new turn based, multi-party rpg. Players form a band of 4 medieval themed characters, and journey through the land on a quest to rid the kingdom of evil monsters and men.

## Characters
Each character has abilities that are ranked 0-10. Here are the ability categories:

* Strength (offense)
* Toughness (defense)
* Intelligence
* Magic
* Influence

Characters are assigned a type (and in-game bonuses) according to their main (highest ranked) ability:

* Knight - Strength
* Peasant - Toughness
* Cleric - Intelligence
* Mage - Magic
* Courtier - Influence

## Challenge:

Your role on the dev team is to create a tool used to create and manipulate save game files for Medieval Times.

A Medieval Times save game file might look like this:

`
Kingdom of Glory          # name of the save game / world
Sam,Knight,10,5,3,5,1     # each character gets one line
Leia,Cleric,5,5,9,5,4
Clair,Knight,10,5,1,1,5
Phil,Mage,0,0,0,8,0
`

Your program should show a menu to the user that allows them to choose 4 options:

1. Create a new game
2. Validate a save file
3. Reroll/randomize an existing character
4. Quit

## Creating a New Game
Players should be asked for the name of their game, and which types of characters should be in their party. As the game creates characters, the players are allowed to accept/reject them until they find one they like, at which point they should be prompted to name the character.

Rules:

* Parties need 4 members
* Parties may have no more than 2 of each type of character (Knight, Peasant, etc.)
* Characters are created semi-randomly, but balanced. First, the main ability is chosen from 7-10. Then the rest of the skills are chosen randomly from 0-6, but the total score of a character may not exceed 28 or be lower than 8.

## Validating a Saved Game
The program should ask for the file to validate, and then run through it to see if all of the game rules and file structure have been followed correctly.

## Reroll a character
Players provide a save game file, and the name of a character to reroll. The character's main ability and stats are randomly reassigned, and the file is then overwritten with the changes. This process should not break or invalidate the save file.