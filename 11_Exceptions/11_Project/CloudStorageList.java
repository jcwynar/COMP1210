import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 * Creates CloudStorageList class that reads 
 * in provided data files and generates reports.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/15/20
 */
public class CloudStorageList   {
   private CloudStorage[] cList;
   private String[] iList;
   
   /**
    * Constructor for CloudStorageList.
    */
   public CloudStorageList()  {
      cList = new CloudStorage[0];
      iList = new String[0];
   }
   
   /**
    * Method to return the CloudStorage array.
    *
    * @return array
    */
   public CloudStorage[] getCloudStorageArray()  {
      return cList;
   }
   
   /**
    * Method to return the invalid records array.
    *
    * @return array
    */
   public String[] getInvalidRecordsArray() {
      return iList;
   }
   
   /**
    * Method to add a CloudStorage object to the array.
    *
    * @param c1 for a CloudStorage object
    */
   public void addCloudStorage(CloudStorage c1) {
      cList = Arrays.copyOf(cList, cList.length + 1);
      cList[cList.length - 1] = c1;
   }
   
   /**
    * Method to add a String object to the invalid reads array.
    *
    * @param r1 for invalid file
    */
   public void addInvalidRecord(String r1)  {
      iList = Arrays.copyOf(iList, iList.length + 1);
      iList[iList.length - 1] = r1;
   }
   
   /**
    * Method to read in the data file.
    *
    * @param fileIn for file name
    * @throws FileNotFoundException if file not found
    */
   public void readFile(String fileIn) throws FileNotFoundException  {
      Scanner scanFile = new Scanner(new File(fileIn));
      String nameIn;
      double baseCostIn;
      double serverCostIn;
      double dataStoredIn;
      double dataLimitIn;
      String category = "";
      String line;
      
      CloudStorage cs = new DedicatedCloud(" ", 0, 0);
      
      while (scanFile.hasNext()) {
         line = scanFile.nextLine();
         Scanner scanLine = new Scanner(line);
         scanLine.useDelimiter(",");
         
         category = scanLine.next();
         
         nameIn = scanLine.next();
         baseCostIn = Double.parseDouble(scanLine.next());
         
         try   {
            switch (category.charAt(0))   {
            
               case 'D':
                  serverCostIn = Double.parseDouble(scanLine.next());
                  cs = new DedicatedCloud(nameIn, baseCostIn, serverCostIn);
                  break;
               
               case 'S':
                  dataStoredIn = Double.parseDouble(scanLine.next());
                  dataLimitIn = Double.parseDouble(scanLine.next());
                  cs = new SharedCloud(nameIn, baseCostIn,
                     dataStoredIn, dataLimitIn);
                  break;
               
               case 'C':
                  dataStoredIn = Double.parseDouble(scanLine.next());
                  dataLimitIn = Double.parseDouble(scanLine.next());
                  cs = new PublicCloud(nameIn, baseCostIn,
                     dataStoredIn, dataLimitIn);
                  break;
               
               case 'P':
                  dataStoredIn = Double.parseDouble(scanLine.next());
                  dataLimitIn = Double.parseDouble(scanLine.next());
                  cs = new PersonalCloud(nameIn, baseCostIn,
                     dataStoredIn, dataLimitIn);
                  break;
               
               default:
                  throw new InvalidCategoryException(category);  
            }
            addCloudStorage(cs); 
         }
         catch (NumberFormatException n)  {
            String invalid = line + "\n" + n;
            addInvalidRecord(invalid);
         }
         catch (NoSuchElementException e) {
            String inv = line + "\n" + e
               + ": For missing input data";
            addInvalidRecord(inv);
         }
         catch (InvalidCategoryException c)  {
            String inException = line + "\n" + c;
            addInvalidRecord(inException);
         }
      } 
   }
   
   /**
    * Method to generate a report using the original
    * order from the given file.
    *
    * @return Sring report by original order
    */
   public String generateReport()  {
      String result = "-------------------------------\n";
      result += "Monthly Cloud Storage Report\n";
      result += "-------------------------------\n";
      for (CloudStorage o : cList) {
         result += o.toString() + "\n\n";
      }
      return result;
   }
   
   /**
    * Method to generate a report based on name.
    *
    * @return String report by name
    */
   public String generateReportByName()  {
      Arrays.sort(getCloudStorageArray());
      String result = "-----------------------------------------\n";
      result += "Monthly Cloud Storage Report (by Name)\n";
      result += "-----------------------------------------\n";
      for (CloudStorage n : cList)  {
         result += n.toString() + "\n\n";
      }
      return result;
   }
   
   /**
    * Method to generate report based on monthly cost.
    *
    * @return String report by monthly cost
    */
   public String generateReportByMonthlyCost()   {
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
      String result = "-------------------------------------------------\n";
      result += "Monthly Cloud Storage Report (by Monthly Cost)\n";
      result += "-------------------------------------------------\n";
      for (CloudStorage m : cList)  {
         result += m.toString() + "\n\n";
      }
      return result;
   }
   
   /**
    * Method to generate report of invalid records.
    *
    * @return String result
    */
   public String generateInvalidRecordsReport()   {
      String result = "----------------------";
      result += "\nInvalid Records Report";
      result += "\n----------------------\n";
      for (String i : iList)  {
         result += i.toString() + "\n\n";
      }
      return result;
   }
}
