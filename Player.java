
/**
 * Player is where the players name and health is tracked and kept. 
 * It has a method that gets the health of the player.
 * It has a method that buffs the players health with a random number.
 * The strength is going to increase with random values with potions. 
 *
 * @author (Atchya Nandan And Vincent Zhu) 
 * @version Start: June 15th, 2021 
 */

//import java Scanner
import java.util.Scanner; 
//import java math
import java.lang.Math;
 
public class Player
{
  //declare instane variables
  String strName;
  int intHealth;
  int intATK; 
  int randHPBuff;
  int randATKBuff;
  
  //get method for players name 
  public String getstrName()
  {
      return this.getstrName(); 
  }
  
  //set method for players name
  public void setstrName(String s)
  {
      this.strName = s; 
  }
  
  //get method for players health 
  public int getintHealth()
  {
      return this.getintHealth(); 
  }
  
  //create method that asks the user for there name
  public void name()
  {
      //declare variable for the players name 
      String strPlayerName;
      
      //declare a variable of type person
      Player name = new Player(); 
      
      //ask the user for enter name 
      System.out.println("Enter your name");
      
      //use the scanner to get name 
      strPlayerName = new Scanner(System.in).nextLine(); 
      
      //set the users name with set method 
      name.setstrName(strPlayerName); 
      
  }
  
  //create a method that gets the health of the player and reutns the health
  public void health()
  {
      //sets the base value of the health to 70
      this.intHealth = 70; 
  }
  
  

  //create a method to buff the player's health by a random value
  
      public static void PlayerHPBuff(int health,int randHPBuff)
    {
        randHPBuff = (int) ((Math.random()*6) +1) *10;
        health += randHPBuff;
    }
  
  //create a method that increases the players strength by a random value with potions 
  
      public static void PlayerATKBuff(int ATK, int randATKBuff)
    {
        randATKBuff = (int) ((Math.random()*6)+1) *2;
        ATK += randATKBuff;
    }
}
