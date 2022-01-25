import java.text.DecimalFormat;
      /**
       * Creates Ellipsoid class that stores the label
       * and three axes a, b, and c. This class also
       * includes methods to calculate the volume
       * and surface area of the Ellipsoid object.
       * Finally, it provides a String value of an
       * Ellipsoid object.
       *
       * @author Jack Cwynar COMP 1210-006
       * @version 2/5/20
       */
       
public class Ellipsoid  {
  // instance variables
   private String label = "";
   private double axisA = 0;
   private double axisB = 0;
   private double axisC = 0;
  // class variable
   private static int count = 0;
   
      // constructor
      /**
      * This constructor accepts four parameters (of types listed above)
      * and calls the respective set method for each field.
      * 
      * @param l for label
      * @param a for axis a
      * @param b for axis b
      * @param c for axis c
      */
   public Ellipsoid(String l, double a, double b, double c)   {
      setLabel(l);
      setA(a);
      setB(b);
      setC(c);
      count++;
   }
      // methods
      /**
       * Gets and returns label.
       * @return label
       */
   public String getLabel()   {
      return label;
   }
      /**
       * Takes String parameter and returns boolean
       * based on conditions.
       * @param l for label
       * @return true or false depending on conditions
       */
   public boolean setLabel(String l) {
      if (l == null) {
         return false;
      }
      else  {
         label = l.trim();
         return true;
      }
   }
      /**
       * Gets and returns axis a.
       * @return a
       */
   public double getA() {
      return axisA;
   }
      /**
       * Accepts double parameter and returns boolean
       * based on conditions.
       * @param a for axis a
       * @return true or false depending on conditions
       */
   public boolean setA(double a)  {
      if (a > 0.0)   {
         axisA = a;
         return true;
      }
      else  {
         return false;
      }
   }
      /**
       * Gets and returns axis b.
       * @return b
       */
   public double getB() {
      return axisB;
   }
      /**
       * Accepts double parameter and returns boolean
       * based on conditions.
       * @param b for axis b
       * @return true or false depending on conditions
       */
   public boolean setB(double b)  {
      if (b > 0.0)   {
         axisB = b;
         return true;
      }
      else  {
         return false;
      }
   }
         /**
       * Gets and returns axis c.
       * @return c
       */
   public double getC() {
      return axisC;
   }
      /**
       * Accepts double parameter and returns boolean
       * based on conditions.
       * @param c for axis c
       * @return true or false depending on conditions
       */
   public boolean setC(double c)  {
      if (c > 0.0)   {
         axisC = c;
         return true;
      }
      else  {
         return false;
      }
   }
      /**
       * Method that calculates volume.
       * @return volume
       */
   public double volume() {
      double numeratorV = 4 * Math.PI * (axisA) * (axisB) * (axisC);
      double volume = (numeratorV) / (3);
      return volume;
   }
      /**
       * Method that calculates surface area.
       * @return surface area
       */
   public double surfaceArea() {
      double numeratorS = (Math.pow((axisA * axisB), 1.6)) 
         + (Math.pow((axisA * axisC), 1.6))
         + (Math.pow((axisB * axisC), 1.6));
      double parentheses = (Math.pow((numeratorS / 3), (1 / 1.6)));
      double surfaceArea = 4 * Math.PI * parentheses;
      return surfaceArea;
   }
      /**
       * Method to convert results to String
       * and output these results; this method also
       * formats results based on given decimal format.
       * @return String 
       */
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0###");
      String output = "Ellipsoid " + "\"" + label + "\""
         + " with axes a = " + axisA + ", b = " + axisB 
         + ", c = " + axisC + " units has:" + "\n\tvolume = "
         + fmt1.format(volume()) + " cubic units"
         + "\n\tsurface area = " + fmt1.format(surfaceArea())
         + " square units";
      return output;
   }
   
   //************************************************************
   //******************** Begin new methods *********************
   //************************************************************
       
   /**
    * Method to get static count field.
    *
    * @return int value representing the count
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Method to set static count field to zero.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * Method that accepts a parameter of type Object 
    * and returns false if the Object is a not an 
    * Ellipsoid. Otherwise, when cast to an Ellipsoid, 
    * if it has the same field values as the Ellipsoid 
    * upon which the method was called, it returns true; 
    * otherwise, it returns false.
    *
    * @param obj for determining if object is Ellipsoid or not
    * @return true or false depending on conditions
    */
   public boolean equals(Object obj)  {
      if (!(obj instanceof Ellipsoid)) {
         return false;
      }
      else  {
         Ellipsoid e = (Ellipsoid) obj;
         return (label.equalsIgnoreCase(e.getLabel())
            && Math.abs(axisA - e.getA()) < .000001
            && Math.abs(axisB - e.getB()) < .000001
            && Math.abs(axisC - e.getC()) < .000001);
      }
   }
   /**
    * Method to allow equals() to be implemented.
    *
    * @return int
    */
   public int hashCode()   {
      return (int) 0;
   }
}