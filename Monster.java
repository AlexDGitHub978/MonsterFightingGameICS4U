/**
 * Description: This is a class for the monster object
 *
 * @author John and Alexander
 * @version 2021-06-15
 */

//importing library for random number

import java.lang.Math;

//declaring the monster class
public class Monster {

    //Instance variables

    //static variable that holds the number of monster instances created
    private static intMonsterNum = 0;

    //variables that holds the monsters health and damage
    private int intHealth, intDamage;

    //variable that holds the monsters name
    private String strName;


    /**
     * Description: This is a default constructor for the monster class
     *
     * @author John Khalife
     * @version 2021-06-15
     */
    public Monster() {
        monsterHealth();
        monsterDamage();
        monsterName();
        intMonsterNum++;
    }

    /**
     * Description: This method is meant to set a randomly generated name for the monster class.
     * It does this by using several predetermined words and randomly mising them together
     *
     * @author John Khalife
     * @version 2021-06-15
     */
    public void monsterName() {

        //An integer that will hold a random value
        int intRandNum = 0;

        //A string that will hold the strength of the monster,adjective of the monster, and type of monster
        String strMonsterStrength, strMonsterAdjective, strMonsterType;

        if (this.intHealth < 85) {
            strMonsterStrength = "WeaK ";
        } else if (this.intHealth < 100) {
            strMonsterStrength = "Average ";
        } else if (this.intHealth >= 100) {
            strMonsterStrength = "Strong ";

        }

        //This is the array that holds the adjectives that describe the monster
        String[] strAdjectives = {"Vengeful ", " Enraged ", " Adorable ", " Annoying ", " Tired ", " Happy ", " Funny ", " Ridiculous ", " Depressed", "Depraved"};

        strMonsterAdjective = strAdjectives[Math.random() * 10];

        //This is the array that holds the name of the monster
        String[] strMonsterNames = {"Ogre", "Serpent", "Troll", "Hydra", "Minotaur", "Zombie", "Skeleton", "Creeper", "Dragon", "Vampire", "Witch", "Wizard", "Sorcerer"};

        strMonsterType = strMonsterNames[Math.random() * 13];


        this.strName = strMonsterStrength + strMonsterAdjective + strMonsterType;

    }


    /**
     * Description: This is a method meant to reset all of the static variables in the monster class for a new game
     *
     * @author John Khalife
     * @version 2021-06-15
     */
    public void resetMonster() {
        intMonsterNum = 0;
    }


    /*
     * Description: These are get methods for the private
     * static and instance variables storing the number of
     * monsters created, as well as the name, health, and
     * damage of the current monster.
     *
     * @Alexander Duong
     * @version 2021-06-15
     */
    public int getMonsterNum() {
        return intMonsterNum;
    }

    public String getName() {
        return strName;
    }

    public int getHealth() {
        return intHealth;
    }

    public int getDamage() {
        return intDamage;
    }

    /*
     * Description: This method will make a simple calculation
     * to determine the health of the monster. This will be based
     * on a base value and a calculated value based on the number
     * of monsters already created.
     *
     * @Alexander Duong
     * @version 2021-06-15
     */
    public void monsterHealth() {
        intHealth = 70 + intMonsterNum * 5;
    }

    /*
     * Description: This method will make a simple calculation
     * to determine the damage the monster will inflict upon the player.
     * This will be based on a base value and a calculated value based
     * on the number of monsters already created.
     *
     * @Alexander Duong
     * @version 2021-06-15
     */
    public void monsterDamage() {
        intDamage = 20 + intMonsterNum * 2;
    }


}

