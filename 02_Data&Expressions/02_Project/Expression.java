import java.util.Scanner;

/**
 * Program to calculate the value of the expression 
 * when ther user inputs values in type double
 * for x and y when xy is not
 * equal to zero in the following expression.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 1/22/20
 */
 
public class Expression
{
 
   /**
    * Allows user to input values for 
    * x and y, then calculates the
    * expressions value, as long as neither
    * x nor y are zero.
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0;
      double y = 0;
      double result = 0;
      
      // displays expression
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
      // prompts user to enter x value
      System.out.print("\tx = ");
      x = userInput.nextDouble();
               
      // prompts user to enter y value
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      // calculates the expression based on user input
      if (x * y == 0) {
         System.out.println("result is \"undefined\"");
      }
      else  {
         result = ((10 * x + 32.6) * (5 * y - 1.567)) / (x * y);
         System.out.print("result = " + result);   
      }
   }
}