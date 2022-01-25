   /**
    * Creates PublicCloud class.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 4/1/20
    */
public class PublicCloud extends SharedCloud  {

  /**
   * Constant for cost factor.
   */
   public static final double COST_FACTOR = 2;
      
   /**
    * Constructor for PublicCloud.
    *
    * @param nameIn for name
    * @param baseCostIn for base storage cost
    * @param dataStoredIn for dataStored
    * @param dataLimitIn for dataLimit
    */
   public PublicCloud(String nameIn, double baseCostIn, double dataStoredIn,
      double dataLimitIn)  {
      super(nameIn, baseCostIn, dataStoredIn, dataLimitIn);
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
    * Method to calculate the monthly cost.
    *
    * @return double value
    */
   public double monthlyCost()  {
      double monthlyCost = 0.0;
      monthlyCost = (baseCost + dataOverage() * PublicCloud.COST_FACTOR);
      return monthlyCost;
   }
}
