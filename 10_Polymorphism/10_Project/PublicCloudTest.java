import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for PublicCloud.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 4/1/20
 */
public class PublicCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests getCostFactor(). **/
   @Test public void getCostFactorTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(2.0, c4.getCostFactor(), .000001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void monthlyCostTest()   {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(19.00, c4.monthlyCost(), .000001);
   }


   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
}
