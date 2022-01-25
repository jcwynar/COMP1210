import java.util.Scanner;

/**
 * Program that exchanges letters in a String
 * to encode a message.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 1/27/20
 */
 
public class MessageConverter   
{
 
   /**
    * Allows user to input a character. The program
    * then encodes the message based on the user input.
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      String result = "";
      
      // prints a user input prompt
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      // provides user with encoding choices and asks for choice
      System.out.print("\nOutput types:"
         + "\n\t0: As is"
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
         
      int outputType = Integer.parseInt(userInput.nextLine());
      
      // if statement to print out appropriate message based on user input
      if (outputType == 0) { // as is
         result = message;
      }
      else if (outputType == 1)  { // trimmed
         result = message.trim(); 
      }
      else if (outputType == 2)  { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3)  { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4)  { // replace vowels with underscores
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5)  { // remove first and last characters
         result = message.substring(1, message.length() - 1);
      }
      else  { // invalid input
         result = "Error: Invalid choice input.";
      }
      System.out.println("\n" + result);
   }
}
    
