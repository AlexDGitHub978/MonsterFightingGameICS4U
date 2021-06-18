/**
 * In the test class we ask the user if they want to play and repeat the game. 
 *
 * @author (Karim Al-Bukhari And Atchya Nandan) 
 * @version Start: June 16th 2021 
 */
//import java Scanner
import java.util.Scanner; 
public class TestClass
{
     /* Description: I am the main and declaring all the variables,
     * variables needed starting, playing again, and all the booleans
     * for the errors catching in the loops. 
     * Name: Atchya Nandan
     * Date: Start: June 16th 2021
             End: June 16th 2021
     */
   public static void main(String[] args)
   {
      //clear the terminal window
      System.out.print('\u000C');
      
      //delclare variables 
      String strStart;
      String strPlayAgain; 
      boolean bolTryAgain = false;
      boolean bolAgain = false;
      boolean bolPlayAgain = false; 
    
        /* Description: ask the user to play the game and either enter start or exit
         * and then it creates a new game for the user. 
         * Name: Atchya Nandan
         * Date: Start: June 16th 2021
                 End: June 16th 2021 
     */
      //a loop that starts or exits the game 
      do
      {
         //ask the user if they want to play the monster fighting game 
         System.out.println("Would you like to play the Monster fighting game? \nPlease enter Start or enter Exit");
       
         //use the scanner to start
         strStart = new Scanner(System.in).nextLine();
          
         //starts the game for the user 
         if(strStart.equalsIgnoreCase("start"))
         {
            do
            {
               //add a new game
               System.out.println("NEW GAME");
             
               //create a new game 
               new MonsterFightingGame();
            
               //loop that asks the user to play again
              
               /**
               * Description: This is asks the user if they would like to play again
               * If the user enters "Y" then it will play again.
               * If the user enters "N" then it exits.
               * If the user does not enter "Y" or "N" the Try and catch method will prompt the user to enter a valid input
               * @author Karim Al-Bukhari
               * @version 2021-06-16
               *
               */
               //Do while loop
               do 
               {
                  //ask the user to play again 
                  System.out.println("Do you want to play again [Y/N]?");
            
                  //use the scanner for play again
                  strPlayAgain = new Scanner(System.in).nextLine();
                  
                  // If statement to determine what happens when the user inputs a letter
                  if (strPlayAgain.equalsIgnoreCase("Y"))
                  {
                     bolPlayAgain=false;
                     bolAgain = true; 
                  }
                  else if (strPlayAgain.equalsIgnoreCase("N"))
                  {
                     System.out.println("Exit");
                     bolPlayAgain=false;
                     bolAgain = false;
                     bolTryAgain = false; 
                  }
                  else
                  {
                     System.out.println("Please enter Y or N. Try Again.");
                     bolPlayAgain = true;
                  }
               }while(bolPlayAgain);
            }while(bolAgain); 
            //Ends the do while loop
             // Karim Al-Bukhari *
          }
          
         /* Description: This is the rest of the while loop
         * It allows the user to exit the game and has a boolean
         * that has the ability to catch erros. 
         * Name: Atchya Nandan
         * Date: Start: June 16th 2021
                 End: June 16th 2021
     */
     
         else if(strStart.equalsIgnoreCase("Exit"))
         {
            System.out.println("Exit"); 
            bolTryAgain = false; 
         }
         else 
         {
            bolTryAgain = true; 
         }
      }while(bolTryAgain); 
   }
}


