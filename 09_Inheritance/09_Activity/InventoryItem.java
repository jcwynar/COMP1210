   /**
    * Represents inventory in a certain store.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 3/30/20
    */
public class InventoryItem   {
    
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Constructor for InventoryItem.
    *
    * @param nameIn for name
    * @param priceIn for price
    */
   public InventoryItem(String nameIn, double priceIn)  {
       
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Method to return customer's name.
    *
    * @return name
    */
   public String getName()   {
      return name;
   }
   
   /**
    * Method to calculate cost of item, including tax.
    *
    * @return price
    */
   public double calculateCost()   {
      return price * (1 + taxRate);
      
   }
   
   /**
    * Method to set the tax rate.
    *
    * @param taxRateIn for tax rate
    */
   public static void setTaxRate(double taxRateIn)   {
      taxRate = taxRateIn;
   }
   
   /**
    * Method to return String representation of
    * name and price w/ tax.
    *
    * @return String output
    */
   public String toString()  {
      return name + ": $" + calculateCost();
   }
}