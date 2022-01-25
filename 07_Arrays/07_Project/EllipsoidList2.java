// import java.util.ArrayList;
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
       
public class EllipsoidList2 {
   
   private String list;
   private Ellipsoid[] eList;
   private int numberEllipsoids;
   
   /**
    * Creates an EllipsoidList object.
    *
    * @param listIn for list.
    * @param eListIn for eList.
    * @param numberEllipsoidsIn for how many Ellipsoids are in array
    */
   public EllipsoidList2(String listIn, Ellipsoid[] eListIn,
                         int numberEllipsoidsIn)   {
      list = listIn;
      eList = eListIn;
      numberEllipsoids = numberEllipsoidsIn;
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
      return numberEllipsoids;
   }
   
   /**
    * @return total volume
    */
   public double totalVolume()  {
      double totalV = 0;
      
   // code for empty ellipsoid list
   
      int index = 0;
      while (index < numberEllipsoids) {
         totalV += eList[index].volume();
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
      while (index < numberEllipsoids)  {
         totalS += eList[index].surfaceArea();
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
      
         avgVolume = totalVolume() / numberEllipsoids;
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
      
         avgSurfaceArea = totalSurfaceArea() / numberEllipsoids;
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
      while (index < numberEllipsoids)  {
         result += "\n" + eList[index] + "\n";
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
   public Ellipsoid[] getList() {
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
   public EllipsoidList2 readFile(String fileNameIn)
                                 throws FileNotFoundException  {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Ellipsoid[] myList = new Ellipsoid[100];
      String eListName = "";
      int numEllipsoids = 0;
      String l = "";
      double a = 0.0, b = 0.0, c = 0.0;
      
      list = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         l = scanFile.nextLine();
         a = Double.parseDouble(scanFile.nextLine());
         b = Double.parseDouble(scanFile.nextLine());
         c = Double.parseDouble(scanFile.nextLine());
         Ellipsoid e = new Ellipsoid(l, a, b, c);
         myList[numEllipsoids] = e;
         numEllipsoids++;
         // myList.add(e);
      }
         
      EllipsoidList2 eL = new EllipsoidList2(list, myList, numEllipsoids);
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
      eList[numberEllipsoids] = e;
      numberEllipsoids++;
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
      for (int i = 0; i < eList.length; i++) {
         if (eList[i] != null) {
         
            if (eList[i].getLabel().equalsIgnoreCase(lIn)) {
               index = i;
               break;
            }
         }
      }
      if (index >= 0)   {
         return eList[index];
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
      for (int i = 0; i < eList.length; i++) {
         if (eList[i] != null)   {
            if (eList[i].getLabel().equalsIgnoreCase(lIn))  {
               index = i;
               res = eList[i];
               break;
            }
         }
      }
      if (res != null) {
         for (int j = index; j < eList.length - 1; j++)  {
            eList[j] = eList[j + 1];
         }
         eList[numberEllipsoids - 1] = null;
         numberEllipsoids--;
         //res = eList[index];
      }
      return res;
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
      Ellipsoid res = null;
      res = findEllipsoid(lIn);
      if (res != null) {
         res.setA(aIn);
         res.setB(bIn);
         res.setC(cIn);
         return res;
      }
      else  {
         return null;
      }
   }                            
      
}