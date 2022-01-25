   /**
    * Creates a NumberOperations class that
    * hold an integer value and provides methods
    * to perform various operations on that value.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 2/10/20
    */
public class NumberOperations  {
   private int number;
   
      /**
       * Takes an int parameter called numberIn.
       *
       * @param numberIn Any integer
       */
   public NumberOperations(int numberIn)   {
      number = numberIn;
   }
      /**
       * Takes no parameters, returns an int.
       * @return int value
       */
   public int getValue()  {
      return number;
   }
      /**
       * Takes no parameters, returns a String.
       * @return String value
       */
   public String oddsUnder()  {
      String output = "";
      int i = 0;
      while (i < number)   {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
      /**
       * Takes no parameters, returns a String.
       * @return String value
       */
   public String powersTwoUnder()   {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
      /**
       * Takes an int parameter, returns an int.
       * @return int value
       * @param compareNumber for comparing number 
       */
   public int isGreater(int compareNumber)  {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else  {
         return 0;
      }
   }
      /**
       * Takes no parameters, returns a String.
       * @return String value
       */
   public String toString()   {
      return number + "";
   }
}