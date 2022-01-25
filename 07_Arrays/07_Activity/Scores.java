   /**
    * Creates a class called Scores that holds an
    * array of numerical values and provides methods
    * that allow users to interact with the 
    * Scores class.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 02/28/20
    */
public class Scores {
    
   private int[] numbers;
      
      /**
       * Scores constructor.
       * @param numbersIn for numbers
       */
   public Scores(int[] numbersIn)  {
       
      numbers = numbersIn;
   }
         
         /** 
          * Method to find evens in array.
          * @return array of type int (evens)
          */
   public int[] findEvens() {
      
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 0)   {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)  {
         if (numbers[i] % 2 == 0)   {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
          
         /**
          * Method to find odds in array.
          * @return array of type int (odds)
          */
   public int[] findOdds()  {
      
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0)   {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0)   {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
             
         /**
          * Method to calculate the average of all
          * values in array.
          * @return average as double
          */
   public double calculateAverage()   {
      
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++)  {
         sum += numbers[i];
      }
      return (double) sum / numbers.length;
   }
          
         /**
          * Method to convert scores into a String value.
          * @return String conataining all scores
          */
   public String toString()   {
      
      String result = "";
      
      for (int i = 0; i < numbers.length; i++)   {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
            
         /**
          * Method to return all scores in reverse order.
          * @return String containing reversed scores
          */
   public String toStringInReverse()  {
      
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--)   {
         result += numbers[i] + "\t";
      }
         
      return result;
   }
}
            
