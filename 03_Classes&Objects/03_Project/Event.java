import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * Program that accepts a user's coded event info
 * as input that includes the date, time, price, row,
 * seat, followed by the description of the event.
 * Then the program prints the event info, along with
 * a random prize number.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 1/27/20
 */
 
public class Event  {
 
   /**
    * Accepts user input and converts this input
    * into clear, easy-to-read data; also prints
    * a random prize number.
    * @param args Command line arguments (not used).
    */
    
   public static void main(String[] args)   {
      Scanner userInput = new Scanner(System.in);
      
      // requests user input
      System.out.print("Enter your event code: ");
      
      // initializes needed variables
      DecimalFormat fmt1 = new DecimalFormat("###.00");
      DecimalFormat fmt2 = new DecimalFormat("#,###.######");
      String z = userInput.nextLine();
      double price;
      double discount;
      String hour;
      String minutes;
      String month;
      String day;
      String year;
      String section;
      String row;
      String seat;
      String event;
      double cost;
      int prizeNumber;
      
      //  trims user input
      if (z.length() > 26) {
         z = z.trim();
         
      // determines event name
         event = z.substring(25);
      
      // determines date
         month = z.substring(0, 2);
         day = z.substring(2, 4);
         year = z.substring(4, 8);
      
      // determines time
         hour = z.substring(8, 10);
         minutes = z.substring(10, 12);
      
      // determines section, row, and seat
         section = z.substring(19, 21);
         row = z.substring(21, 23);
         seat = z.substring(23, 25);
      
      // calculates cost (using the discount) and displays original price 
         price = Double.parseDouble(z.substring(12, 17));
         discount = Double.parseDouble(z.substring(17, 19));
         cost = (price * ((100 - discount) / 100));
         price = (price) / (100);
         cost = (cost) / (100);
         discount = (int) discount;
      
      // provides a prize number
         Random gen = new Random();
         prizeNumber = gen.nextInt(9999) + 1;
      
      // prints the information
         System.out.println("\nEvent: " + event + "   Date: " + month + "/"
            + day + "/" + year + "   Time: " + hour + ":" + minutes);
         System.out.println("Section: " + section + "   Row: " + row
            + "   Seat: " + seat);
         System.out.println("Price: " + "$" + fmt1.format(price) 
            + "   Discount: " + fmt2.format(discount) + "%" 
            + "   Cost: " + "$" + fmt1.format(cost));
         System.out.println("Prize Number: " + prizeNumber);         
      }
      else  {
         System.out.println("");
         System.out.println("Invalid Event Code."
            + "\nEvent code must have at least 26 characters.");
      }
   
   }
}
      
 
