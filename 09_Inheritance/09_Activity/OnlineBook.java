   /**
    * Class which inherits from OnlineTextItem.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 3/30/20
    */
public class OnlineBook extends OnlineTextItem {
   protected String author;
      
   /**
    * Constructor for OnlineBook.
    *
    * @param nameIn for name
    * @param priceIn for price
    */
   public OnlineBook(String nameIn, double priceIn)  {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
         
   /**
    * Overrides toString method.
    *
    * @return String output
    */
   public String toString()  {
      return name + " - " + author + ": $" + price;
   }
   
   /**
    * Method to set author's name.
    *
    * @param authorIn for author
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}