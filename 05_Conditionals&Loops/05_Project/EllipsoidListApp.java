import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Creates an Ellipsoid List App that uses Ellipsoid and EllipsoidList.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 2/12/20
 */
public class EllipsoidListApp   {
 
   /**
    * Reads file with ellipsoid data, creates EllipsoidList, and
    * and prints summary of the EllipsoidList.
    *
    * @param args - not used
    * @throws FileNotFoundException required by Scanner for File
    */
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      String ellipsoidListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         
         String l = scanFile.nextLine();
         double a = Double.parseDouble(scanFile.nextLine());
         double b = Double.parseDouble(scanFile.nextLine());
         double c = Double.parseDouble(scanFile.nextLine());
         
         Ellipsoid e = new Ellipsoid(l, a, b, c);
         myList.add(e);
      }
      scanFile.close();
      
      EllipsoidList myEllipList = new EllipsoidList(ellipsoidListName, myList);
      
      System.out.println("");
      
      System.out.println(myEllipList);
      
      System.out.println("");
      
      System.out.println(myEllipList.summaryInfo());
   }
}