import java.util.Scanner;
   
   /**
    * Program that allows the user to input
    * a value in square inches, then displays the combination
    * of acres, square yards, square feet, and square inches so
    * so that each value is maximized in the order above.
    * Input should not exceed 1,000,000,000 square inches.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 1/22/20
    */
    
public class SquareUnits
{
    
      /**
       * Allows for input of value, returns the combination of
       * acres, square yareds, square feet, and square
       * inches, and maximizes that value in the order above.
       * @param args Comman line arguments (not used).
       */
       
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int acres = 0;
      int squareYards = 0;
      int squareFeet = 0;
      int squareInches = 0;
         
      // prints user input prompt
      System.out.print("Enter the area in square inches: ");
      squareInches = userInput.nextInt();
      
      // makes sure user does not input number over 1 billion
      if (squareInches >= 1000000000)  {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      else  {
         
      // prints number of units
         System.out.println("Number of Units:");
      
      // prints acres
         acres = (squareInches) / (6_272_640);
         System.out.println("\tAcres: " + acres);
      
      // prints square yards
         squareYards = ((squareInches) % (6_272_640)) / (1_296);
         System.out.println("\tSquare Yards: " + squareYards);
      
      // prints square feet
         squareFeet = (((squareInches) % (6_272_640)) % (1_296)) / (144);
         System.out.println("\tSquare Feet: " + squareFeet);
      
      // prints square inches
         squareInches = (((squareInches) % (6_272_640)) % (1_296)) % (144);
         System.out.println("\tSquare Inches: " + squareInches);
      }
   }
}
