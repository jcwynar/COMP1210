import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
         /**
          * Creates an EllipsoidListMenu class that
          * has a main method that gives the user
          * eight options that each do the following.
          *
          * @author Jack Cwynar
          * @version 2/19/20
          */
          
public class EllipsoidListMenuApp {
      
         /**
          * @param args not used
          * @throws FileNotFoundException if no file
          * found or file cannot be opened
          */
   public static void main(String[] args) throws FileNotFoundException  {
      String eListName = "no list name";
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      EllipsoidList myEList = new EllipsoidList(eListName, myList);
      String fileName = "no file name";
            
      String l;
            
      double a, b, c;
            
      String tag = "";
            
      Scanner scan = new Scanner(System.in);
            
      System.out.println("Ellipsoid List System Menu\n"
                              + "R - Read File and Create Ellipsoid List\n"
                              + "P - Print Ellipsoid List\n"
                              + "S - Print Summary\n"
                              + "A - Add Ellipsoid\n"
                              + "D - Delete Ellipsoid\n"
                              + "F - Find Ellipsoid\n"
                              + "E - Edit Ellipsoid\n"
                              + "Q - Quit");
                              
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         tag = scan.nextLine();
         if (tag.length() == 0) {
            continue;
         }
         tag = tag.toUpperCase();
         char tagChar = tag.charAt(0);
         switch (tagChar)  {
            case 'R':  // reads in file
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
                     
               myEList = myEList.readFile(fileName);
                     
               System.out.println("\tFile read in "
                  + "and Ellipsoid List created\n"); 
                     
               break;
                     
            case 'P':  // prints Ellipsoid List
               System.out.println(myEList);
               break;
                     
            case 'S':  // prints Summary of list
               System.out.println("\n" + myEList.summaryInfo() + "\n");
               break;
                     
            case 'A':  // adds Ellipsoid object
               System.out.print("\tlabel: ");
               l = scan.nextLine();
               System.out.print("\ta: ");
               a = Double.parseDouble(scan.nextLine());
               System.out.print("\tb: ");
               b = Double.parseDouble(scan.nextLine());
               System.out.print("\tc: ");
               c = Double.parseDouble(scan.nextLine());
                     
               myEList.addEllipsoid(l, a, b, c);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
                     
            case 'D':  // deletes Ellipsoid object
               System.out.print("\tlabel: ");
               l = scan.nextLine();
               Ellipsoid d = myEList.deleteEllipsoid(l);
               if (d != null)   {
                  System.out.println("\t\"" + d.getLabel() + "\" deleted\n");
               }
               else  {
                  System.out.println("\t\"" + l + "\" not found\n"); 
               }
               break;
                        
            case 'F':  // find ellipsoid
               System.out.print("\tlabel: ");
               l = scan.nextLine();
                     
               if (myEList.findEllipsoid(l) != null) {
                  System.out.println(myEList.findEllipsoid(l) + "\n");
               }
               else  {
                  System.out.println("\t\"" + l + "\" not found\n");
               }
               break;
                     
            case 'E':  // edit ellipsoid
               System.out.print("\tlabel: ");
               l = scan.nextLine();
               System.out.print("\ta: ");
               a = Double.parseDouble(scan.nextLine());
               System.out.print("\tb: ");
               b = Double.parseDouble(scan.nextLine());
               System.out.print("\tc: ");
               c = Double.parseDouble(scan.nextLine());
               Ellipsoid u = myEList.editEllipsoid(l, a, b, c);
                     
               if (u != null) {
                  System.out.println("\t\"" + u.getLabel() + "\" successfully edited\n");
               }
               else  {
                  System.out.println("\t\"" + l + "\" not found\n");
               }
               break;
            case 'Q':  // quit
               break;    
                     
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      } while (!tag.equalsIgnoreCase("Q"));
   }
}