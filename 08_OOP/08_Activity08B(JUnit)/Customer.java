   /**
    * Program to do various things with 
    * the customer class.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 3/23/20
    */
public class Customer implements Comparable<Customer>  {
   private String custName = "";
   private String custLocation = "";
   private double custBalance;
    
   /**
    * Constructor for Customer class.
    *
    * @param nameIn for name
    */
   public Customer(String nameIn)   {
      custName = nameIn;
      custLocation = "";
      custBalance = 0;
   }
      
   /** 
    * Method to set customer's location.
    *
    * @param locationIn for location
    */
   public void setLocation(String locationIn)  {
      custLocation = locationIn;
   }
         
   /**
    * Method to change a customer's balance.
    *
    * @param amount for adding to balance
    */
   public void changeBalance(double amount) {
      custBalance += amount;
   }
         
   /**
    * Method to get the customer's location.
    *
    * @return locationIn for location
    */
   public String getLocation()  {
      return custLocation;
   }
         
   /**
    * Method to get a customer's balance.
    *
    * @return custBalance for balance
    */
   public double getBalance()   {
      return custBalance;
   }
   
   /**
    * Method to set location to both city and state.
    *
    * @param city for city location
    * @param state for state location
    */
   public void setLocation(String city, String state)   {
      custLocation = city + ", " + state;
   }
   
   /**
    * Method to show customer's name, location, and balance.
    *
    * @return output for String output
    */
   public String toString()  {
      String output = custName + "\n" + custLocation
                        + "\n" + "$" + custBalance;
      return output;
   }
   
   /**
    * Method to compare objects of this class.
    *
    * @param obj for comparing objects
    * @return 0, -1, 1 based on condition condition
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.custBalance - obj.getBalance()) < 0.000001)  {
         return 0;
      }
      else if (this.custBalance < obj.getBalance()) {
         return -1;
      }
      else  {
         return 1;
      }
   }
}
         
       
      
