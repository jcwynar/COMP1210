import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests class for CloudStorage and DedicatedCloud.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/1/20
 */
public class DedicatedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests setName(). **/
   @Test public void setNameTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      c1.setName("Cloud 1");
      Assert.assertEquals("Cloud 1", c1.getName());
   }
   
   /** Tests getName() method. **/
   @Test public void getNameTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("Cloud One", c1.getName());
   }
   
   /** Tests getBaseStorageCost(). **/
   @Test public void getBaseStorageCostTest()  {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals(40.00, c1.getBaseStorageCost(), .000001);
   }
   
   /** Tests setBaseStorageCost(). **/
   @Test public void setBaseStorageCostTest()  {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      c1.setBaseStorageCost(50.00);
      Assert.assertEquals(50.00, c1.getBaseStorageCost(), .000001);
   }
   
   /** Tests getCount() and resetCount. **/
   @Test public void getCountTest()   {
      DedicatedCloud.resetCount();
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals(1, c1.getCount(), .000001);
   }
   
   /** Tests getServerCost(). **/
   @Test public void getServerCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals(10.00, c1.getServerCost(), .000001);
   }
   
   /** Tests setServerCost(). **/
   @Test public void setServerCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      c1.setServerCost(20.00);
      Assert.assertEquals(20.00, c1.getServerCost(), .000001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void monthlyCostTest()   {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals(50.00, c1.getBaseStorageCost() 
         + c1.getServerCost(), .000001);
   }
   
   /** Tests toString(). **/
   @Test public void toStringTest()   {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals(true, 
         c1.toString().contains("Cloud One (class DedicatedCloud) "
         + "Monthly Cost: $50.00"));
   }


   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
