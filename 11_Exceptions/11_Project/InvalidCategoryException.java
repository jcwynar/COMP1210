   /**
    * Creates the InvalidCategoryException.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 4/15/20
    */
public class InvalidCategoryException extends Exception {
         
         /**
          * Constructor for class.
          *
          * @param categoryIn for invalid category
          */
   public InvalidCategoryException(String categoryIn)  {
      super("For category: " + categoryIn);
   }
}