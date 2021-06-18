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

public class Player {
      /* Description: declare variables for the player class
       * and adding a default constructor the player class 
       * Name: Atchya Nandan
       * Date: Start: June 15th 2021
               End: June 16th 2021 
     */
    //declare instance variables
    private String strName;
    private int intHealth = 100;
    private int intATK = 35;

    //default constructor
    Player() {
        name();
    }

    /* Description: A get method for the users name  
     * Name: Atchya Nandan
     * Date: Start: June 15th 2021
             End: June 15th 2021
     */

    //get method for players name
    public String getstrName() {
        return this.strName;
    }

    /* Description: A method that returns the users health 
     * Name: Atchya Nandan
     * Date: Start: June 15th 2021
             End: June 15th 2021
     */

    //get method for players health
    public int getintHealth() {
        return this.intHealth;
    }

    /**
     * Description: This is a get method that returns the attack value of the player class
     *
     * @author John Khalife
     * @version 2021-06-16
     */
    public int getintATK() {
        return this.intATK;
    }

    /**
     * Description: This is a method that subtracts a damage value from the health of the player
     *
     * @author John Khalife
     * @version 2021-06-16
     */
    public void takeDamage(int intMonsterDamage) {
        this.intHealth -= intMonsterDamage;
    }

      /* Description: Asks the user to enter therre name or leave
      * the space blank to use it as a guest 
      * Name: Atchya Nandan
      * Date: Start: June 15th 2021
             End: June 17th 2021 
     */
    public void name() {
        //ask the user for enter name
        System.out.println("************************************");
        System.out.println("Enter your name.");
        System.out.println("Leave this blank to play as a guest.");
        System.out.println("************************************");

        //use the scanner to get name
        this.strName = new Scanner(System.in).nextLine();

        if (this.strName.isEmpty()) {
            System.out.println("You are guest.");
            this.strName = "GUEST";
        } else if (this.strName.trim().isEmpty()) {
            System.out.println("You are guest.");
            this.strName = "GUEST";
        }
    }


      /* @Description: create a method to buff the player's health by a random value
      * @Name: Vincent Zhu
      *@ Version:2021/6/18
     */
    public void PlayerHPBuff() {


        //create a random number for buff
        int randHPBuff = (int) ((Math.random() * 6) + 1) * 10;

        int intBuffChance = (int) Math.random() * 4 + 1;


        if (intBuffChance == 1) {
            //add random number to health value
            this.intHealth += randHPBuff;

            //print message notifiying player incrase of Health stats
            System.out.println("You've got a health potion! Your health has increased by " + randHPBuff);
        }

    }
     
      /* @Description: create a method to buff the player's strength by a random value
      * @Name: Vincent Zhu
      *@ Version:2021/6/18
     */
    public void PlayerATKBuff() {

        int intBuffChance = (int) Math.random() * 4 + 1;

        //create a random number for the strength
        int randATKBuff = (int) ((Math.random() * 6) + 1) * 2;

        if (intBuffChance == 1) {

            //add random number to the health
            this.intATK += randATKBuff;

            //print message notifiying player incrase of ATK stats
            System.out.println("You've received a strength potion! Your strength has increased by " + randATKBuff);
        }
    }
}


//Vincent *
