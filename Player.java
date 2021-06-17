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
    //declare variables for random numbers
    int randHPBuff;
    int randATKBuff;
    /*
     * Atchya Nandan, I am creating instance variable right here.
     */
    //declare instance variables
    private String strName;
    private int intHealth;
    private int intATK;

    /*
     * Atchya Nandan, I am creating a method for players name
     */

    //Vincent *
    //create a method to buff the player's health by a random value
    public static void PlayerHPBuff(int health, int randHPBuff) {
        //create a random number for buff
        randHPBuff = (int) ((Math.random() * 6) + 1) * 10;

        //add random number to health value
        health += randHPBuff;

        //print message notifiying player incrase of Health stats
        System.out.println("you've got a health potion! your health has increased " + randHPBuff);
    }

    /*
     * Atchya Nandan, I am creating a set method for the name
     */

    //create a method that increases the players strength by a random value with potions
    public static void PlayerATKBuff(int ATK, int randATKBuff) {
        //create a random number for the strength
        randATKBuff = (int) ((Math.random() * 6) + 1) * 2;

        //add random number to the health
        ATK += randATKBuff;

        //print message notifiying player incrase of ATK stats
        System.out.println("you've recieved a strength potion! your health has increased " + randATKBuff);

    }

    /*
     * Atchya Nandan, I am creating a method that uses health and sets the base value to 100
     */

    //get method for players name
    public String getstrName() {
        return this.strName();
    }

    /*
     * Atchya Nandan, I am creating a method that uses ATK and sets the base value to 35
     */

    //set method for players name
    public void setstrName(String s) {
        this.strName = s;
    }

    //create a method that gets the health of the player and reutns the health
    public void health() {
        //sets the base value of the health to 100
        this.intHealth = 100;
    }

    /*
     * Atchya Nandan, I am creating a get method for the health
     */

    //create method that sets ATK to 35
    public void ATK() {
        //sets the base value of ATK to 35
        this.intATK = 35;
    }

    /*
     * Atchya Nandan, I am creating a name method that asks the
     * user for their name and then sets the name in the
     * instance variable
     */

    /**
     * Description: This is a get method that returns the attack value of the player class
     *
     * @author John Khalife
     * @version 2021-06-16
     *
     */
    public int getIntATK() { return this.intATK; }

    //get method for players health
    public int getintHealth() {
        return this.intHealth();
    }

    //create method that asks the user for there name
    public void name() {
        //declare variable for the players name
        String strPlayerName;

        //declare a variable of type Player
        Player name = new Player();

        //ask the user for enter name
        System.out.println("****************");
        System.out.println("Enter your name");
        System.out.println("****************");

        //use the scanner to get name
        strPlayerName = new Scanner(System.in).nextLine();

        //set the users name with set method
        name.setstrName(strPlayerName);

    }
}

//Vincent *
