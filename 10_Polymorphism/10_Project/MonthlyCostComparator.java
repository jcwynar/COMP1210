import java.util.Comparator;
/**
 * Creates MonthlyCostComparator class
 * that implements the comparator interface.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/9/20
 */
public class MonthlyCostComparator implements Comparator<CloudStorage> {
 
   /**
    * Method to compare the monthly costs.
    *
    * @param c1 for first object
    * @param c2 for second object
    * @return int value representing result of comparison
    */
   public int compare(CloudStorage c1, CloudStorage c2)  {
      if (c1.monthlyCost() > c2.monthlyCost())   {
         return -1;
      }
      else if (c1.monthlyCost() < c2.monthlyCost())   {
         return 1;
      }
      else {
         return 0;
      }
   }
}
      
