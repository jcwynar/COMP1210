import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
      /**
       * Creates a class that stores the name of the list
       * and an ArrayList of Ellipsoid objects; also includes
       * methods that return various values.
       *
       * @author Jack Cwynar COMP 1210-006
       * @version 2/19/20
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
   
   //************************************************************
   //******************** Begin new methods *********************
   //************************************************************
   
   /**
    * @return ArrayList of Ellipsoid objects
    */
   public ArrayList<Ellipsoid> getList() {
      return eList;
   }
   /**
    * Takes String parameter that represents the file name,
    * reads in the file, stores list name and creates a list 
    * of Ellipsoid objects, and then returns EllipsoidList.
    * @param fileNameIn for file name
    * @return EllipsoidList
    * @throws FileNotFoundException if file cannot be opened
    */
   public EllipsoidList readFile(String fileNameIn)
                                 throws FileNotFoundException  {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      String eListName = "";
      String l = "";
      double a = 0.0, b = 0.0, c = 0.0;
      
      list = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         l = scanFile.nextLine();
         a = Double.parseDouble(scanFile.nextLine());
         b = Double.parseDouble(scanFile.nextLine());
         c = Double.parseDouble(scanFile.nextLine());
         Ellipsoid e = new Ellipsoid(l, a, b, c);
         myList.add(e);
      }
         
      EllipsoidList eL = new EllipsoidList(list, myList);
      return eL;
   }
   /**
    * Takes 4 parameters, creates an ellipsoid object
    * and adds it to EllipsoidList.
    *
    * @param lIn for label
    * @param aIn for axis A
    * @param bIn for axis B
    * @param cIn for axis c
    */
   public void addEllipsoid(String lIn, double aIn, double bIn, double cIn)  {
    
      Ellipsoid e = new Ellipsoid(lIn, aIn, bIn, cIn);
      
      eList.add(e);
   }
   /**
    * Finds an ellipsoid based on user's input
    * of String parameter label.
    *
    * @param lIn for label
    * @return found ellipsoid
    */
   public Ellipsoid findEllipsoid(String lIn)   {
      int index = -1;
      for (Ellipsoid e : eList) {
         if (e.getLabel().equalsIgnoreCase(lIn)) {
            index = eList.indexOf(e);
            break;
         }
      }
      if (index >= 0)   {
         return eList.get(index);
      }
      
      return null;
   }
   /**
    * Deletes an ellipsoid object from the list.
    *
    * @param lIn for label
    * @return Ellipsoid object if deleted, else return null
    */
   public Ellipsoid deleteEllipsoid(String lIn) {
      int index = -1;
      Ellipsoid res = null;
      for (Ellipsoid e : eList) {
         if (e.getLabel().equalsIgnoreCase(lIn))  {
            index = eList.indexOf(e);
            break;
         }
      }
      
      res = eList.get(index);
   
      if (index >= 0)   {
         eList.remove(index);
         return res;
         
      }
      return null;
   }
   /**
    * Edits an ellipsoid, changing only the axes.
    *
    * @param lIn for label
    * @param aIn for axis a
    * @param bIn for axis b
    * @param cIn for axis c
    * @return new Ellipsoid object if found and edited, else null
    */
   public Ellipsoid editEllipsoid(String lIn, double aIn,
                                  double bIn, double cIn)   {
      int index = -1;
      for (Ellipsoid e : eList) {
         if (e.getLabel().equalsIgnoreCase(lIn)) {
            index = eList.indexOf(e);
            break;
         }
      }
      
      if (index >= 0) {
         eList.get(index).setA(aIn);
         eList.get(index).setB(bIn);
         eList.get(index).setC(cIn);
         return eList.get(index);
      }
      else  {
         return null;
      }
   }                              
      
}