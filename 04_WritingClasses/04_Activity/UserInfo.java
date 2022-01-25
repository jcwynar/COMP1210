   /**
    * Program that uses class UserInfo in class 
    * UserInfoDriver and invokes methods in UserInfoDriver
    * from using UserInfo.
    *
    * @author Jack Cwynar COMP 1210-006
    * @version 2/3/20
    */
    
public class UserInfo  {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   
   private static final int OFFLINE = 0, ONLINE = 1;

    // constructor
    /**
     * Constructor that takes two parameters as input
     * representing the first and last name of user.
     * @param firstNameIn (for user's first name).
     * @param lastNameIn (for user's last name).
     */
   public UserInfo(String firstNameIn, String lastNameIn)  {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
    
    // methods
    /**
     * @return returns String representation of object.
     */
   public String toString()  {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)   {
         output += "Offline";
      }
      else  {
         output += "Online";
      }
      
      return output;
   }
    /**
     * Set method for location.
     * @param locationIn (for user's location).
     */
   public void setLocation(String locationIn)  {
      location = locationIn;
   }
    /**
     * Set method for the value of age.
     * @param ageIn (for user's age).
     * @return returns age.
     */
   public boolean setAge(int ageIn)   {
      boolean isSet = false;
      if (ageIn > 0)  {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
    /**
     * @return returns age of user.
     */
   public int getAge() {
      return age;
   }
    /**
     * @return returns location of user.
     */
   public String getLocation()  {
      return location;
   }
    /**
     * Allows user to log off.
     */
   public void logOff()   {
      status = OFFLINE;
   }
    /**
     * Allows user to log on.
     */
   public void logOn() {
      status = ONLINE;
   }
   
}