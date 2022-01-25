import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test file for PersonalCloud.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/1/20
 */
public class PersonalCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests getCostFactor(). **/
   @Test public void getCostFactorTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      
      Assert.assertEquals(3.0, c5.getCostFactor(), .000001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void monthlyCostTest()   {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      
      Assert.assertEquals(12.00, c5.monthlyCost(), .000001);
   }


   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
