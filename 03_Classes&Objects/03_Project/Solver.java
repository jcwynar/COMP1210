import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Program that accepts user input from
 * the keyboard and inputs the input
 * into an expression. The program then
 * solves the expression.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 1/27/20
 */

public class Solver {

   /**
    * Accepts user input and plugs this input into
    * the given expression; then the expression
    * is solved.
    * @param args Command line arguments (not used).
    */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0.0;
      double result = 0.0;

      // prompts user to input a value for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();

      // calculates result
      double numerator = (Math.abs((11 * (Math.pow(x, 4)))
         + (9 * (Math.pow(x, 3))) + (7 * (Math.pow(x, 2))) + (5 * x) + 4));
      double denominator = (2 * x) + 4;
      result = (Math.sqrt(numerator)) / (denominator);
      System.out.println("Result: " + result);

      // convert result to string
      String result1 = Double.toString(result);

      // finds position of decimal
      int pos = result1.indexOf(".");

      // determines how many characters are to
      // the right and left of decimal place
      int leftCharacterCount = pos;
      int rightCharacterCount = result1.length() - pos - 1;
      System.out.println("# of characters to left of decimal point: "
         + leftCharacterCount);
      System.out.println("# of characters to right of decimal point: "
         + rightCharacterCount);

      // creates format pattern
      String pattern = "#,##0.0####";
      DecimalFormat fmt1 = new DecimalFormat(pattern);

      // applies format to result and stores result in string variable
      String formatResult = fmt1.format(result);

      // displays result in formatted form
      System.out.println("Formatted Result: " + formatResult);
   }
}
