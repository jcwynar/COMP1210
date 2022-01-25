import java.util.Scanner;
   /**
    * Creates EllipsoidApp that generates instances
    * of Ellipsoid and invokes methods on these
    * instances.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 2/5/20
    */
    
public class EllipsoidApp  {

   /**
    * Creates instances of Ellipsoid.
    * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      String l = scan.nextLine();
      System.out.print("\ta: ");
      double axisA = Double.parseDouble(scan.nextLine());
      if (axisA <= 0)   {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      System.out.print("\tb: ");
      double axisB = Double.parseDouble(scan.nextLine());
      if (axisB <= 0)   {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      System.out.print("\tc: ");
      double axisC = Double.parseDouble(scan.nextLine());
      if (axisC <= 0)   {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      Ellipsoid ex1 = new Ellipsoid(l, axisA, axisB, axisC);
      System.out.println("\n" + ex1.toString());
   }
}