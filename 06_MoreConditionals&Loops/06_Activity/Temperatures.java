import java.util.ArrayList;
   /**
    * Creates a class that holds integer values
    * representing daily temperatures.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 2/17/20
    */
public class Temperatures {
   private ArrayList<Integer> temperatures;
      /**
       * Constructor Temperatures takes an ArrayList
       * of integer values.
       * @param temperaturesIn for temps
       */
   public Temperatures(ArrayList<Integer> temperaturesIn)  {
      temperatures = temperaturesIn;
   }
      /**
       * Method to return lowest temp.
       * @return lowest temp
       */
   public int getLowTemp()   {
      if (temperatures.isEmpty())  {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)   {
         if (temperatures.get(i) < low)   {
            low = temperatures.get(i);
         }
      }
      return low;
   }
      /**
       * Method to return highest temp.
       * @return highest temp
       */
   public int getHighTemp()  {
      if (temperatures.isEmpty())   {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures)   {
         if (temp > high)  {
            high = temp;
         }
      }
      return high;
   }
      /**
       * Method to return parameter if lower than
       * low temp or low temp if param is higher.
       * @param lowIn to return above int values
       * @return returns low temp int
       */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
      /**
       * Method to return parameter if higher than
       * high temp or high temp if param is lower.
       * @param highIn to return above int values
       * @return returns high temp int
       */
   public int higherMaximum(int highIn)  {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
      /**
       * Method to turn int values into a String.
       * @return a String of data
       */
   public String toString()  {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}