/**
 * Class that inherits from InventoryItem
 * and takes into account shipping costs.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 3/30/20
 */
public class ElectronicsItem extends InventoryItem   {
 
   protected double weight;
   
   /**
    * static final SHIPPING_COST for shipping cost.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Constructor for ElectronicsItem.
    *
    * @param nameIn for name
    * @param priceIn for price
    * @param weightIn for weight
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
    /**
     * Method to override the calculateCost method.
     *
     * @return new cost
     */
   public double calculateCost()  {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}