import java.util.Scanner;

/**
 * Program that allows the user to
 * input their name, age, and
 * gender; the program then calculates
 * the user's age in minutes and centuries;
 * finally, the program calculates the user's
 * max heart rate based on the user's input.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 1/16/20
 */

public class AgeStatistics
{

   /**
    * Allows user to input their name,
    * age, and gender, then calculates age in minutes
    * and centuries, then calculates max heart rate.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   
      // prompts user to input name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
      // prompts user to enter age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   
      // prompts user to enter gender
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   
      // convert age
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
   
      // display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else  {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
}