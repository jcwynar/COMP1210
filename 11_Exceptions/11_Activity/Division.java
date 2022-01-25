   /**
    * Class Division to perform various
    * division operations.
    *
    * @author Jack Cwynar
    * @version 4/13/20
    */
public class Division  {
      
   /**
    * Method to divide integers.
    *
    * @param num for numerator
    * @param denom for denominator
    * @return int value
    */
   public static int intDivide(int num, int denom)  {
      try   {
         int result = 0;
         result = (num) / (denom);
         return result;
      }
      catch (ArithmeticException e)   {
         return 0;
      }
   }
   
   /**
    * Method to divide decimals.
    *
    * @param num for numerator
    * @param denom for denominator
    * @return double value
    */
   public static double decimalDivide(int num, int denom)  {
      if (denom == 0)   {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      double result;
      result = ((double) num) / ((double) denom);
      return result;
   }
}
