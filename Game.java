/**
 * Description: This is a class for the monster object
 *
 * @author
 * @version 2021-06-16
 *
 */
//import Scanner class
import java.util.Scanner;

//declaring the monster class
public class Game {

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
          System.out.println("The results will be written to a file once you are done.");
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

}
