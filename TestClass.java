
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
       String playAgain = "";
       boolean bolPlayAgain = true;
       
       //ask the user if they want to play the monster fighting game 
       System.out.println("Would you like to play the Monster fighting game"); 
       strStart = new Scanner(System.in).nextLine(); 
       
       do 
    {
         
        System.out.println("Do you want to play again [Y/N]?");
        playAgain = new Scanner(System.in).nextLine();
        if (playAgain.equalsIgnoreCase("Y"))
            bolPlayAgain=false;
        else if (playAgain.equalsIgnoreCase("N"))
             bolPlayAgain=false;
        else{
            System.out.println("Please enter Y or N");
            bolPlayAgain = true;
        }
    }while(bolPlayAgain);
            
       
   }
}
