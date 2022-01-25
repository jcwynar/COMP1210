import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test file for SharedCloud.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/2/20
 */
public class SharedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests getters. **/
   @Test public void gettersTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
    
      Assert.assertEquals(12.0, c2.getDataStored(), .000001);
    
      Assert.assertEquals(20.0, c2.getDataLimit(), .000001);
    
      Assert.assertEquals(1.0, c2.getCostFactor(), .000001);
   }
   
   /** Tests setDataStored(). **/
   @Test public void setDataStoredTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      c2.setDataStored(15.0);
      Assert.assertEquals(15.0, c2.getDataStored(), .000001);
   }
   
   /** Tests setDataLimit(). **/
   @Test public void setDataLimitTest()  {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      c2.setDataLimit(22.0);
      Assert.assertEquals(22.0, c2.getDataLimit(), .000001);
   }
   
   /** Tests dataOverage(). **/
   @Test public void dataOverageTest()   {
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(5.0, c3.dataOverage(), .000001);
      
      // if overage is negative
      SharedCloud c8 = new SharedCloud("Cloud Eight", 9.00, 20.0, 25.0);
      
      Assert.assertEquals(0, c8.dataOverage(), .000001);
   }
   
   /** Tests new monthlyCost(). **/
   @Test public void monthlyCostTest()   {
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(14.00, c3.monthlyCost(), .000001);
   }
   
   /** Tests toString(). **/
   @Test public void toStringTest()   {
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(true, 
         c3.toString().contains("Cloud Three (class SharedCloud) "
         + "Monthly Cost: $14.00"));
   }

   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
