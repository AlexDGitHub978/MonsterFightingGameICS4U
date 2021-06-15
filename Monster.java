/**
 * Description: This is a class for the monster object
 *
 * @author John and Alexander
 * @version 2021-06-15
 *
 */

//importing library for random number
import java.lang.Math;

//declaring the monster class
public class Monster {


    /**
     * Description: This is a default constructor for the monster class
     *
     * @author John Khalife
     * @version 2021-06-15
     *
     */
    public Monster() {
        monsterHealth();
        monsterDamage();
        monsterName();
        intMonsterNum++;
    }

    /**
     * Description: This is a random name method for the monster class - it sets the name of the monster to a random name
     *
     * @author John Khalife
     * @version 2021-06-15
     *
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
        String[] strAdjectives = { "Vengeful ", " Enraged ", " Adorable ", " Annoying ", " Tired ", " Happy ", " Funny ", " Ridiculous ", " Depressed", "Depraved" };

        strMonsterAdjective = strAdjectives[Math.random()*10];

        //This is the array that holds the name of the monster
        String[] strMonsterNames = {"Ogre", "Serpent", "Troll", "Hydra", "Minotaur", "Zombie", "Skeleton" , "Creeper", "Dragon", "Vampire", "Witch" , "Wizard", "Sorcerer"};

        strMonsterType = strMonsterNames[Math.random()*13];


        this.strName = strMonsterStrength + strMonsterAdjective + strMonsterType;

    }


    /**
     * Description: This is a method meant to reset all of the static variables in the monster class for a new game
     *
     * @author John Khalife
     * @version 2021-06-15
     *
     */
    public void resetMonster() {
        intMonsterNum = 0;
    }








}