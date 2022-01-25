   /**
    * Creates class InvcentoryListApp class.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 4/6/20
    */
public class InventoryListApp   {
    
    /**
     * Main method for class.
     *
     * @param args not used
     */
   public static void main(String[] args)  {
      
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      
      ElectronicsItem electronicsItem = new ElectronicsItem("laptop",
         1234.56, 10);
      myItems.addItem(electronicsItem);
      
      InventoryItem inventoryItem = new InventoryItem("motor oil", 9.8);
      myItems.addItem(inventoryItem);
      
      OnlineBook onlineBook = new OnlineBook("All Things Java", 12.3);
      myItems.addItem(onlineBook);
      
      OnlineArticle onlineArticle = new OnlineArticle("Useful Acronyms", 3.4);
      myItems.addItem(onlineArticle);
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}