/**
 * In the test class we ask the user if they want to play and repeat the game. 
 *
 * @author (Atchya Nandan) 
 * @version Start: June 16th 2021 
 */
//import java Scanner
import java.util.Scanner; 
public class TestClass
{
   public static void main(String[] args)
   {
       //delclare variables 
       String strStart;
       String strplayAgain; 
       boolean bolTryAgain = false;
       boolean bolAgain = false;
       boolean bolPlayAgain = false; 
    
       do
       {
          //ask the user if they want to play the monster fighting game 
          System.out.println("Would you like to play the Monster fighting game\nEnter Start or enter Exit");
       
          //use the scanner to start
          strStart = new Scanner(System.in).nextLine();
          
          if(strStart.equalsIgnoreCase("start"))
          {
              
          do
          {
             //add a new game
             System.out.println("NEW GAME");
             
             //create a new game 
             new game(); 
            
            do 
            {  
            System.out.println("Do you want to play again [Y/N]?");
            strplayAgain = new Scanner(System.in).nextLine();
            if (strplayAgain.equalsIgnoreCase("Y"))
            {
                bolPlayAgain=false;
                bolAgain = true; 
            }
            else if (strplayAgain.equalsIgnoreCase("N"))
            {
             bolPlayAgain=false;
             bolAgain = false;
             bolTryAgain = false; 
            }
            else
            {
              System.out.println("Please enter Y or N, Try Again");
              bolPlayAgain = true;
            }
        }while(bolPlayAgain);
        }while(bolAgain); 
          }
          else if(strStart.equalsIgnoreCase("Exit"))
          {
              bolTryAgain = false; 
          }
          else 
          {
            bolTryAgain = true; 
          }
       }while(bolTryAgain); 
       
       
   }
}
