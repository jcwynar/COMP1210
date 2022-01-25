import java.util.ArrayList;
import java.text.DecimalFormat;
      /**
       * Creates a class that stores the name of the list
       * and an ArrayList of Ellipsoid objects; also includes
       * methods that return various values.
       *
       * @author Jack Cwynar COMP 1210-006
       * @version 2/11/20
       */
       
public class EllipsoidList {
   
   private String list;
   private ArrayList<Ellipsoid> eList;
   
   /**
    * Creates an EllipsoidList object.
    *
    * @param listIn for list.
    * @param eListIn for eList.
    */
   public EllipsoidList(String listIn, ArrayList<Ellipsoid> eListIn)   {
      list = listIn;
      eList = eListIn;
   }
   
   /**
    * @return list.
    */
   public String getName()   {
      return list;
   }
   
   /**
    * @return number of ellipsoid objects in EllipsoidList.
    */
   public int numberOfEllipsoids()   {
      return eList.size();
   }
   
   /**
    * @return total volume
    */
   public double totalVolume()  {
      double totalV = 0;
      
   // code for empty ellipsoid list
   
      int index = 0;
      while (index < eList.size()) {
         totalV += eList.get(index).volume();
         index++;
      }
      
      return totalV;
   }
   
   /**
    * @return total surface area
    */
   public double totalSurfaceArea()   {
      double totalS = 0;
      
   // code for empty ellipsoid list
   
      int index = 0;
      while (index < eList.size())  {
         totalS += eList.get(index).surfaceArea();
         index++;
      }
         
      return totalS;
   }
   
   /**
    * @return average volume
    */
   public double averageVolume()   {
      if (totalVolume() == 0)   {
         return 0;
      }
      else  {
         double avgVolume = 0;
      
      // method for calculating average volume
      
         avgVolume = totalVolume() / eList.size();
         return avgVolume;
      }
   }
   
   /**
    * @return average surface area
    */
   public double averageSurfaceArea() {
      if (totalSurfaceArea() == 0)  {
         return 0;
      }
      else  {
         double avgSurfaceArea = 0;
      
      // method for calculating average surface area
      
         avgSurfaceArea = totalSurfaceArea() / eList.size();
         return avgSurfaceArea;
      }
   }
   
   /**
    * @return String containing name of list followed
    * by each Ellipsoid in ArrayList.
    */
   public String toString()  {
      String result = list + "\n";
      int index = 0;
      while (index < eList.size())  {
         result += "\n" + eList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
   /**
    * @return String containing summary of list, including 
    * name of list and return values for various methods.
    */
   public String summaryInfo()  {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      result += "\nTotal Volume: " + fmt.format(totalVolume()) + " cubic units";
      result += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea()) 
         + " square units";
      result += "\nAverage Volume: " + fmt.format(averageVolume()) 
         + " cubic units";
      result += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea()) 
         + " square units";
      return result;
   }
}