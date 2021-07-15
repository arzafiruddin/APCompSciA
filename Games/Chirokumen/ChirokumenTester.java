import java.util.Scanner;

public class ChirokumenTester
{
   public static void main(String [] args)
   {
      //1. Create a Scanner Object to read from the console.


      //2. Create a Chirokumen with a name of the users choosing.

      
      //3. Print out Your Chirokumen <insert name> has been created!
      
      //Make sure all steps above are functioning correctly before continuing.
      
      //4. Have your Chirokumen take damage. Print out the amount of damage taken as well as the 
      //   amount of health the Chirokumen has after taking damage. Make the name when reporting
      //   the health all upper case. 
      //   OUTPUT FORMAT: <name> took <damage> points of damage   <NAME> HEALTH: <health>
      //   NOTE: All of this should be on the same line.
      //         HINT: System.out.print() vs. System.out.println()
      //   Slow down the simulation by including the statment pause(2); after printing.
      //   Ex: System.out...;
      //       pause(2);
      
      //Make sure all steps above are functioning correctly before continuing.
      
      //5. Have your Chirokumen take damage again. Follow all of the same steps as in number 4.

      //6. Have your Chirokumen heal. Print out the amount it healed as well as the amount of 
      //   health the Chirokumen has after healing. Make the name when reporting
      //   the health all upper case.
      //   OUTPUT FORMAT: <name> healed for <amount healed> points <NAME> HEALTH: <health>
      //   NOTE: All of this should be on the same line.
      //   Slow down the simulation by including the statment pause(2); after printing.
      //   Ex: System.out...;
      //       pause(2);
      
      
      //7. Have your Chirokumen Take damage two more times, then heal, then take damage one
      //   final time. Follow all output steps from steps 5 and 6.
      //   NOTE: The overall pattern is 2 damage, 1 heal, 2 damage, 1 heal, 1 damage.
          
      
      //8. Print out a statement informing the user of the amount of health left after battle.
      //   OUTPUT FORMAT: After battle, your Chirokumen has <health> health left.
      
      
      //9. Check to see if the Chirokumen is dead. If it is dead print out the following statement:
      //   Your Chirokumen has been lost in battle :(
      //   If it is not dead print out the following statment:
      //   Your Chirokumen has lived to fight another day!
            
   }
   
   //LEAVE ALONE  
   /** Pauses the game for the number of seconds provided as a parameter.
   *  @param the number of seconds to pause
   */
   private static void pause(long seconds)
   {
      try{
         Thread.sleep(seconds*1000);
      }catch(InterruptedException e){}
   }
}

/* 
SAMPLE OUTPUT Chirokumen Dies

What would you like to name your Chirokumen?
Dragos
Your Chirokumen Dragos has been created!
Dragos took 33 points of damage.   DRAGOS HEALTH: 67
Dragos took 19 points of damage.   DRAGOS HEALTH: 48
Dragos healed for 2 points.        DRAGOS HEALTH: 50
Dragos took 20 points of damage.   DRAGOS HEALTH: 30
Dragos took 34 points of damage.   DRAGOS HEALTH: 0
Dragos healed for 0 points.        DRAGOS HEALTH: 0
Dragos took 0 points of damage.   DRAGOS HEALTH: 0
After battle, your Chirokumen has 0 health left.
Your Chirokumen has been lost in battle :(

SAMPLE OUTPUT Chirokumen Lives

What would you like to name your Chirokumen?
Dragos
Your Chirokumen Dragos has been created!
Dragos took 25 points of damage.   DRAGOS HEALTH: 75
Dragos took 6 points of damage.   DRAGOS HEALTH: 69
Dragos healed for 6 points.        DRAGOS HEALTH: 75
Dragos took 25 points of damage.   DRAGOS HEALTH: 50
Dragos took 3 points of damage.   DRAGOS HEALTH: 47
Dragos healed for 6 points.        DRAGOS HEALTH: 53
Dragos took 13 points of damage.   DRAGOS HEALTH: 40
After battle, your Chirokumen has 40 health left.
Your Chirokumen has lived to fight another day!

*/