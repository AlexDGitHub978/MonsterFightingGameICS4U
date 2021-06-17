/**
 * Description: This class plays the monster fight game.
 * It provides a tutorial, allows the user to choose how many
 * monsters they want to fight, and does the battles. It will
 * output the results to a file at the end of each game.
 *
 * @author John Khalife, Alexander Duong, and Vincent Zhu
 * @version 2021-06-16
 *
 */
//import Scanner class
import java.util.Scanner;

//declaring the monster class
public class Game
{


//static variable that counts the number of game instances created
private static int intGameNum = 0;




  /**
   * Description: This method asks the user once whether they would
   * like a tutorial. If they do, it will output the instructions.
   *
   * @author Alexander Duong
   * @version 2021-06-16
   *
   */
  public void gameTutorial()
  {
    //check if the user has already
    //seen the tutorial
    if(bolTutorial == true)
    {
      //ask the user if they would like to see
      //the tutorial
      System.out.println("Would you like a tutorial?");

      //add a do while loop to check for valid user input
      do
      {
        //populate strUserInput
        this.strUserInput = new Scanner(System.in).nextLine();

        //check if the user input is valid
        if(this.strUserInput.equalsIgnoreCase("yes"))
        {
          //output the instructions
          System.out.println("This is a single player game.");
          System.out.println("Enter your name and choose how many monsters you want to fight!");
          System.out.println("You and each monster will be able to choose from 3 different abilities.");
          System.out.println("Quick slice is blocked by Shield bash, dodges Mighty Slam, and deals normal damage to Quick slice.");
          System.out.println("Mighty slam is dodged by Quick slice, deals high damage against Mighty slam, and breaks through Shield bash.");
          System.out.println("Shield bash blocks Quick slice, deals no damage against Shield bash, and is unable to block Mighty slam.");
          System.out.println("You will fight each monster one by one, until one of you is defeated.");
          System.out.println("After each fight, the monsters become stronger and stronger.");
          System.out.println("After each fight, there is a random chance you will become stronger.");
          System.out.println("You can play more than one game.");
          System.out.println("The results will be written to a file after each game.");
          System.out.println("Good luck!");

          //reset bolUserInput to false to break out of the loop
          this.bolUserInput = false;
        }
        else if(this.strUserInput.equalsIgnoreCase("no"))
        {
          //reset bolUserInput to false to break out of the loop
          this.bolUserInput = false;
        }
        else
        {
          //output error message
          System.out.println("Error. Please enter yes or no.");

          //set bolUserInput to true to loop again
          this.bolUserInput = true;
        }
      }while(this.bolUserInput);

      //set bolTutorial to false to not ask the user
      //more than once
      bolTutorial = false;
    }
  }


  /**
   * Description: This method is meant to run the game itself
   *
   * @author John Khalife
   * @version 2021-06-16
   *
   */
  public void runGame() {

  //boolean that checks if the player is dead
  boolean boolPlayerDead = false;

  //boolean for thw hile loop that controls individual battles
  boolean boolMonsterBattle = true;

  //integer that checks for how many monsters were defeated if the player loses
  int intMonstersDefeated = 0;

  //integer that counts the number of rounds boolPlayerDead
  int intRoundsPlayed = 0;

  //For loop that iterates through the array of monsters
  for(int i = 0 ; i < monsters.length ; i++) {

      //this is the while loop that will control individual monster battles
      boolMonsterBattle = true;
      while(boolMonsterBattle) {

      //calling the battle function and passing in the current monster that the player is fighting
        battle(monsters[i]);
        System.out.println( player.getstrName + ", your health is " + player.getintHealth());
        System.out.println( player.getstrName + ", your attack is " + player.getintATK());
        intRoundsPlayed++;

      //checking when the monster's or player's health is equal to zero
      if (player.getintHealth <= 0) {
        //informing the user of thei passing and eding the game
        boolMonsterBattle = false;
        boolPlayerDead = true;
        System.out.println( player.getstrName + ", you have been defeated!");

      } else if (monsters[i].getintHealth <= 0) {
        //moving on to the next monster and informing the user
        boolMonsterBattle = false;
        System.out.println( "The " + monster.getName + " has been defeated!");
      }


      }

      //adding one to the number of monsters defeated
      intMonstersDefeated ++;

     //checking if the player has been defeated
     if(boolPlayerDead) {
        System.out.println( "Better luck next time!");
        i = monsters.length;
     } else {
        //deciding if the player deserves a health or shield buff

     }

  }

  printResults(boolPlayerDead, intMonstersDefeated, intRoundsPlayed);

  }

    /**
     * Description: This method outputs the result of the match into a file
     *
     * @author John Khalife
     * @version 2021-06-16
     *
     */
     public void printResults(boolean boolPlayerDead, int intMonstersDefeated, int intRoundsPlayed) {


     //outputting a small amount of info about the game to the user
     System.out.println("Well played, " + player.getstrName() + "!");


     System.out.println("This was game #" + intGameNum);
     if (boolPlayerDead) {
       System.out.println("You fought " + intMonstersDefeated + " monsters out of " + monsters.length + "!");
     } else {
       System.out.println("You defeated " + intMonstersDefeated + " monsters!");
     }

     System.out.println("You played " + intRoundsPlayed + " rounds!");
     System.out.println("Your attack value at the end of the game was " + player.getintATK);
     System.out.println("Your health value at the end of the game was " + player.getintHealth();

     System.out.println("Check the text file corresponding to this game to see more statistics relating to your game!");


    //creating a file for the information to be outputted to
    //try catch for creating file
            try {

                //Creating file object
                File myObj = new File("MonsterFightingGame_#" + intGameNum + ".txt");

                //Checking if file has been created
                if (myObj.createNewFile()) {
                    System.out.println("Created file " + myObj.getName());
                }

                //If error is caught - trace the source
            } catch (IOException e) {
                System.out.println("An error occured in the creation of this file.");
                e.printStackTrace();
            }

            //try catch for writing to file
            try {

                //creating filewriter object
                FileWriter myWriter = new FileWriter("MonsterFightingGame_#" + intGameNum + ".txt");

                //displaying winner
                if (boolPlayerDead) {
                    myWriter.write("Winner: " + monsters[intMonstersDefeated - 1].getName() + "\n\n");
                } else {
                    myWriter.write("Winner: " + player.getstrName() +"\n\n");
                }

                myWriter.write("Game #" + intGameNum + "\n");

                     if (boolPlayerDead) {
                        myWriter.write("Fought " + intMonstersDefeated + " monsters out of " + monsters.length + "\n");

                     } else {
                       myWriter.write("Defeated " + intMonstersDefeated + " monsters \n");
                     }




                myWriter.write(intRoundsPlayed + " rounds played \n");
                myWriter.write("Player attack value at end of game:" +  player.getintATK() + "\n");
                myWriter.write("Player health value at end of game:" +  getintHealth() + "\n\n");




                //displaying all monsters
                myWriter.write("All monsters:\n\n");

                //loop to print all monsters stats
                for (int i = 0; i < monsters.length ; i++) {

                    myWriter.write("Monster #" + (i+1) + "\n");
                    myWriter.write("Name: " + monsters[i].getName() + "\n");
                    myWriter.write("Attack: " + monsters[i].getAttack() + "\n");
                }

                //close the writer
                myWriter.close();
                //error catching
            } catch (IOException e) {
                System.out.println("An error occured in writing the file.");
                e.printStackTrace();
            }




     }


  /**
   * Description: This method asks the user how many monsters they would
   * like to fight. It then creates that many monster instances in an array.
   *
   * @author Alexander Duong
   * @version 2021-06-16
   *
   */
  public void userMonsters()
  {
    //ask the user how many monsters they would like to fight
    System.out.println("How many monsters would you like to fight?");

    //add a do while loop to loop the try and catch block
    do
    {
      //add the try and catch block
      try
      {
        //populate bytUserInput and parse to byte
        this.bytUserInput = new Scanner(System.in).nextByte();

        //check if the input is at least 1
        if(this.bytUserInput > 0)
        {
          //reset bolUserInput to false to break out of the loop
          this.bolUserInput = false;
        }
        else
        {
          //output error message
          System.out.println("Error. Please enter a number more than 0.");

          //set bolUserInput to true to loop again
          this.bolUserInput = true;
        }
      }
      catch(Exception e)
      {
        //output error message
        System.out.println("Error. Please enter a non-decimal number.");

        //set bolUserInput to true to loop again
        this.bolUserInput = true;
      }
    }while(this.bolUserInput);

    //initialize the monsters array
    monsters = new Monster[this.bytUserInput];

    //use a for loop to create the monster instances and put them in the array
    for(int i = 0; i < monsters.length; i ++)
    {
      //create the monster instances by calling the default constructor
      monsters[i] = new Monster();
    }
  }

  //Battle system
  public static void battle(Player player, Monster monster)
  {
      //variables to store player/moster move
      String playerMove;
      int monsterMove;

      //randomize monster move
      monsterMove=(int)(Math.random()*2);
      /* monsterMove 0 = Quick Slice
       * monsterMove 1 = Shield Bash
       * monsterMove 3 = Mighty Slam
       */

      //prompt the user to enter their move
      System.out.println("Your next move will be:\n Quick Slice  /  Shield Bash  /  Mighty Slam");
      playerMove= new Scanner(System.in).nextLine();

      //possible reactions when player used quick slice
      if (playerMove.equalsIgnoreCase("Quick Slice"))
      {
          //monster used Quick Slice
          if(monsterMove == 0 )
          {
              //player damaged
              player.intHealth -= monster.intDamage;
              //monster damaged
              monster.intHealth -= player.intATK;

              //output damage message
              System.out.println("You used Quick Slice! Dealt " + player.intATK + "damage to the monster!");
              System.out.println("The Monster uses Quick Slice! Dealt " + monster.intDamage + "damage to you!");
          }
          //monster used Shield Bash
          else if(monsterMove == 1)
          {
              //player damaged
              player.intHealth -= monster.intDamage;

              //output damage message
              System.out.println("The Monster uses Shield Bash! Blocking you Quick Slice and Dealt " + monster.intDamage + "damage to you!");
          }
          //monster used Mighty Slam
          else if(monsterMove == 2)
          {
              //monster damaged
              monster.intHealth -= player.intATK;

              //output damage message
              System.out.println("You used Quick Slice! Dodging the monster's Mighty Slam and Dealt " + player.intATK + "damage to the monster!");
          }
      }
      //possiable reactions when player used Shield Bash
      else if (playerMove.equalsIgnoreCase("Shield Bash"))
      {
          //monster used Quick Slice
          if(monsterMove == 0 )
          {
              //monster damaged
              monster.intHealth -= player.intATK;

              //output damage message
              System.out.println("You used Shield Bash! Blocking the monster's Quick Slice and Dealt " + player.intATK + "damage to the monster!");
          }
          //monster used Shield Bash
          else if(monsterMove == 1)
          {
              //output damage message
              System.out.println("You used Shield Bash! Coliding with the monster's Shield Bash, no damage taken!");
          }
          //monster used Mighty Slam
          else if(monsterMove == 2)
          {
              //player damaged
              player.intHealth -= monster.intDamage;

              //output damage message
              System.out.println("The monster used Mighty Slam penetrating your shield bash and Dealt " + monster.intDamgage + "damage to the monster!");
          }
      }

      //possible reactions when player used Mighty Slam
      else if (playerMove.equalsIgnoreCase("Mighty Slam"))
      {
          //monster used Quick Slice
          if(monsterMove == 0)
          {
              //player damaged
              player.intHealth -= monster.intDamage;

              //output damage message
              System.out.println("The monster used Quick Slice to dodge your Mighty Slam! Dealing" + player.intATK + "damage to you!");
          }
          //monster used Shield Bash
          else if(monsterMove == 1)
          {
              //monster damaged
              monster.intHealth -= player.intATK;

              //output damage message
              System.out.println("You used Mighty Slam to penetrate through the monster's Shield Bash! Dealing" + player.intATK + "damage to the monster!");
          }
          //monster used Mighty Slam
          else if(monsterMove == 2)
          {
              //player damaged
              player.intHealth -= monster.intDamgage;
              //monster damaged
              monster.intHealth -= player.intATK;

              //output damage message
              System.out.println("You used Mighty Slam! Dealing" + player.intATK + "damage to the monster!");
              System.out.println("The monster used Mighty Slam! Dealing" + monster.intDamgage + "damage to you!");
          }
      }
      //restart method if player entered wrong input
      else
      {
            System.out.println("What is this absurd move? Please enter \n Quick Slice  /  Shield Bash  /  Mighty Slam");
            battle(player,monster);
      }
   }
}
