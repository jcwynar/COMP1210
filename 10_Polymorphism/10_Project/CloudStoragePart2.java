import java.io.FileNotFoundException;
   /**
    * Creates driver class for CloudStorage.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 4/10/20
    */
public class CloudStoragePart2   {
    
      /**
       * Prints Monthly Cloud Storage reports.
       *
       * @param args Command Line: file name
       * @throws FileNotFoundException if file not found
       */
   public static void main(String[] args) throws FileNotFoundException   {
      if (args.length > 0)  {
         CloudStorageList cList = new CloudStorageList();
         cList.readFile(args[0]);
         System.out.print(cList.generateReport());
         System.out.print(cList.generateReportByName());
         System.out.print(cList.generateReportByMonthlyCost());
      }
      else  {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   }
}