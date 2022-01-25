   /**
    * Class that inherits from OnlineTextItem.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 3/30/20
    */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
      
      /**
       * Constructor for OnlineArticle.
       *
       * @param nameIn for name
       * @param priceIn for price
       */
   public OnlineArticle(String nameIn, double priceIn)  {
      super(nameIn, priceIn);
   }
       
       /**
        * Method to set wordCount.
        *
        * @param wordCountIn for wordCount
        */
   public static void setWordCount(int wordCountIn) {
      int wordCount = wordCountIn;
   }
}