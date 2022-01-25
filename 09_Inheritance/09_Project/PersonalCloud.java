   /**
    * Creates PersonalCloud class that extends SharedCloud.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 4/1/20
    */
public class PersonalCloud extends SharedCloud {

  /**
   * Constant for cost factor.
   */
   public static final double COST_FACTOR = 3;
      
   /**
    * Constructor for PersonalCloud.
    *
    * @param nameIn for name
    * @param baseCostIn for base storage cost
    * @param dataStoredIn for dataStored
    * @param dataLimitIn for dataLimit
    */
   public PersonalCloud(String nameIn, double baseCostIn, double dataStoredIn,
      double dataLimitIn)  {
      super(nameIn, baseCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
    * Method to get cost factor.
    *
    * @return double value
    */
   public double getCostFactor()   {
      return COST_FACTOR;
   }
   
   /**
    * Method to caclulate the monthly cost.
    *
    * @return double value
    */
   public double monthlyCost()  {
      double monthlyCost = 0.0;
      monthlyCost = (baseCost + dataOverage() * PersonalCloud.COST_FACTOR);
      return monthlyCost;
   }
}
