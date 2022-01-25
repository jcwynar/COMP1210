import java.text.DecimalFormat;
/**
 * Creates SharedCloud class.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/1/20
 */
public class SharedCloud extends CloudStorage   {
   protected double dataStored;
   protected double dataLimit;
   
   /**
    * Constant for cost factor.
    */
   public static final double COST_FACTOR = 1;
   
  /**
   * Constructor for SharedCloud.
   *
   * @param nameIn for name
   * @param baseCostIn for base storage cost
   * @param dataStoredIn for dataStored
   * @param dataLimitIn for dataLimit
   */
   public SharedCloud(String nameIn, double baseCostIn, double dataStoredIn,
      double dataLimitIn)  {
      super(nameIn, baseCostIn);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;
   }
   
  /**
   * Method to retrieve the data stored.
   *
   * @return double value
   */
   public double getDataStored() {
      return dataStored;
   }
   
   /**
    * Method to set the data stored to parameter.
    *
    * @param dataStoredIn for dataStored
    */
   public void setDataStored(double dataStoredIn)  {
      dataStored = dataStoredIn;
   }
   
   /**
    * Method to get the data limit.
    *
    * @return double value
    */
   public double getDataLimit() {
      return dataLimit;
   }
   
   /**
    * Method to set the data limit.
    *
    * @param dataLimitIn for dataLimit
    */
   public void setDataLimit(double dataLimitIn)   {
      dataLimit = dataLimitIn;
   }
   
   /**
    * Method to get the cost factor.
    *
    * @return double value
    */
   public double getCostFactor()   {
      return COST_FACTOR;
   }
   
   /**
    * Method to calculate and return the data overage.
    * Returns 0 if the calculated value is negative.
    *
    * @return double value
    */
   public double dataOverage()  {
      double overage = 0.0;
      overage = dataStored - dataLimit;
      if (overage < 0.0)   {
         return 0;
      }
      return overage;
   }
   
   /**
    * Method to override previous monthly cost method.
    *
    * @return double value
    */
   public double monthlyCost()  {
      double monthlyCost = 0.0;
      monthlyCost = (baseCost + dataOverage() * SharedCloud.COST_FACTOR);
      return monthlyCost;
   }
   
   /** 
    * Method to return a String describing a SharedCloud object.
    *
    * @return String output
    */
   public String toString()  {
      DecimalFormat dataFmt = new DecimalFormat("0.000");
      String result = super.toString();
      result += "\nData Stored: " + dataFmt.format(dataStored) + " GB";
      result += "\nData Limit: " + dataFmt.format(dataLimit) + " GB";
      result += "\nOverage: " + dataFmt.format(dataOverage()) + " GB";
      result += "\nCost Factor: " + getCostFactor();
      return result;
   }
}