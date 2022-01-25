/**
 * Creates class ItemsList that holds an array
 * of IvnevtoryItem objects.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/6/20
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
  /**
   * Constructor for ItemsList that instantiates 
   * the InventoryItem array.
   */
   public ItemsList()  {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    * Method to add an item to the array.
    *
    * @param itemIn for an InventoryItem[] object
    */
   public void addItem(InventoryItem itemIn)   {
      if (count < inventory.length) {
         inventory[count++] = itemIn;
      }
   }
    
    /**
     * Method to calculate the total.
     *
     * @param electronicsSurcharge for the extra charge for electronics
     * @return double value
     */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++)  {
         if (inventory[i] instanceof ElectronicsItem)   {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else  {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    * Method to represent output as a String.
    *
    * @return String value
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++)  {
         output += inventory[i] + "\n";
      }
      return output;
   }
}