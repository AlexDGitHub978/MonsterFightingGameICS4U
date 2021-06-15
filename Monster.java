/**
 * Description: This is a class for the monster object
 *
 * @author
 * @version 2021-06-03
 *
 */

//declaring the monster class
public class Monster {

  /*
  * Description: These are get methods for the private
  * instance variables storing the name, health, and
  * damage of the monster.
  *
  * @Alexander Duong
  * @version 2021-06-15
  */
  public String getName()
  {
    return strName;
  }
  
  public int getHealth()
  {
    return intHealth;
  }
  
  public int getDamage()
  {
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
  public void monsterHealth()
  {
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
  public void monsterDamage()
  {
    intDamage = 20 + intMonsterNum * 2;
  }

}
