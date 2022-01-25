import javax.swing.JOptionPane;
/**
 * Class DivisionDriver to run the two division methods from
 * Division and print the result of the calculations.
 *
 * @author Jack Cwynar
 * @version 4/13/20
 */
public class DivisionDriver  {
 
   /**
    * Main method to run Division's methods.
    *
    * @param args Command Line Arguments - not used
    */
   public static void main(String[] args)   {
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      
      try   {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);
      }
         
      catch (NumberFormatException e)   {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e)   {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}