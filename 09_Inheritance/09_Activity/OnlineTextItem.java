   /**
    * Class that represents an online text item that
    * users can buy.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 3/30/20
    */
public abstract class OnlineTextItem extends InventoryItem {
    
    /**
     * Constructor for OnlineTextItem.
     *
     * @param nameIn for name
     * @param priceIn for price
     */
   public OnlineTextItem(String nameIn, double priceIn)   {
      super(nameIn, priceIn);
   }
   
    /**
     * Method to override calculateCost.
     *
     * @return price
     */
   public double calculateCost()  {
      return price;
   }
}