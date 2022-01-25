import java.text.DecimalFormat;
   /**
    * Creates DedicatedCloud class that adds a third
    * parameter to CloudStorage.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 3/31/20
    */
public class DedicatedCloud extends CloudStorage  {
   private double serverCost;
      
   /**
    * Constructer for DedicatedCloud.
    *
    * @param nameIn for customer name
    * @param baseCostIn for baseCost
    * @param serverCostIn for serverCost
    */
   public DedicatedCloud(String nameIn, double baseCostIn,
      double serverCostIn) {
      super(nameIn, baseCostIn);
      serverCost = serverCostIn;
   }
   
   /**
    * Method to get the server cost.
    *
    * @return double value
    */
   public double getServerCost()   {
      return serverCost;
   }
   
   /**
    * Method to set the server cost.
    *
    * @param serverCostIn for serverCost
    */
   public void setServerCost(double serverCostIn)   {
      serverCost = serverCostIn;
   }
   
   /**
    * Method to return the monthly cost of owning storage and a server.
    *
    * @return double value
    */
   public double monthlyCost()  {
      double totalCost = serverCost + baseCost;
      return totalCost;
   }
   
   /**
    * Method to represent String description of a
    * DedicatedCloud object.
    *
    * @return String output
    */
   public String toString()  {
      DecimalFormat costFmt = new DecimalFormat("$#,##0.00");
      String result = super.toString() + "\nServer Cost: "
         + costFmt.format(serverCost);
      return result;
   }
}