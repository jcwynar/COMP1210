import java.text.DecimalFormat;
/**
 * Creates CloudStorage class that describes cloud
 * storage data and provides methods to access that data.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 3/31/20
 */
public abstract class CloudStorage {
   protected String name;
   protected double baseCost;
   protected static int count = 0;
   
  /**
   * Constructor for CloudStorage.
   *
   * @param nameIn for name
   * @param baseCostIn for baseCost
   */
   public CloudStorage(String nameIn, double baseCostIn)   {
      name = nameIn;
      baseCost = baseCostIn;
      count++;
   }
   
   /**
    * Method to get name of customer.
    *
    * @return String value
    */
   public String getName()   {
      return name;
   }
   
   /**
    * Method to set customer's name.
    *
    * @param nameIn for String name
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Method to get the base storage cost.
    *
    * @return double value
    */
   public double getBaseStorageCost()  {
      return baseCost;
   }
   
   /**
    * Method to set the base storage cost.
    *
    * @param baseCostIn for base cost
    */
   public void setBaseStorageCost(double baseCostIn) {
      baseCost = baseCostIn;
   }
   
   /**
    * Method to get the number of objects created.
    *
    * @return int representing count
    */
   public static int getCount()  {
      return count;
   }
   
   /**
    * Method to reset the count.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * Method to return a String description of
    * a CloudStorage object.
    *
    * @return String output
    */
   public String toString()  {
      DecimalFormat costFmt = new DecimalFormat("$#,##0.00");
      DecimalFormat dataFmt = new DecimalFormat(".000");
      String result = name + " (" + this.getClass() + ") "
         + "Monthly Cost: " + costFmt.format(this.monthlyCost());
      result += "\nBase Storage Cost: " + costFmt.format(baseCost);
      return result;
   }
      
   /**
    * Method to determine monthly cost of cloud storage.
    *
    * @return double value
    */
   public abstract double monthlyCost();
}