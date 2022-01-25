import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class to test Ellipsoid.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 3/18/20
 */
public class EllipsoidTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
           
   /** Tests volume calculation. **/
   @Test public void volumeTest()  {
      Ellipsoid e = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      Assert.assertEquals(" ", 25.132741228718345, e.volume(), 0.0000001);
   }
   
   /** Tests surface area calculation. **/
   @Test public void surfaceAreaTest()   {
      Ellipsoid e = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      Assert.assertEquals(" ", 48.93662538557051, e.surfaceArea(), 0.00000001);
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest()   {
      Ellipsoid e = new Ellipsoid("Ex 1", 1.0, 3.0, 9.0);
      Assert.assertEquals(e.toString(), e.toString());
   }
   
   /** Tests count. **/
   @Test public void countTest() {
      Ellipsoid.resetCount();
      Ellipsoid e1 = new Ellipsoid("Ex 4", 1.0, 2.0, 3.0);
      Ellipsoid e2 = new Ellipsoid("Ex 5", 4.0, 5.0, 6.0);
      Ellipsoid e3 = new Ellipsoid("Ex 6", 7.0, 8.0, 9.0);
      Assert.assertEquals(3, Ellipsoid.getCount());
   }
   
   /** Tests count resetting. **/
   @Test public void resetCountTest() {
      Ellipsoid.resetCount();
      Ellipsoid e1 = new Ellipsoid("Ex 4", 1.0, 2.0, 3.0);
      Ellipsoid e2 = new Ellipsoid("Ex 5", 4.0, 5.0, 6.0);
      Ellipsoid e3 = new Ellipsoid("Ex 6", 7.0, 8.0, 9.0);
      Ellipsoid.resetCount();
      Assert.assertEquals(0, Ellipsoid.getCount());
   }
   
   /** Tests equals method. **/
   @Test public void equalsTest()   {
      Ellipsoid e1 = new Ellipsoid("Ex 1", 1.0, 2.0, 1.0);
      Ellipsoid e2 = new Ellipsoid("Ex 1", 1.0, 2.0, 1.0);
       
      Assert.assertEquals("equals test",
                        true, e1.equals(e2));
   
      e2 = new Ellipsoid("Ex 3", 1.0, 2.0, 3.0);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
   
   
      e2 = new Ellipsoid("Ex 4", 3.0, 2.0, 3.0);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
   
      e2 = new Ellipsoid("Ex 5", 1.0, 2.0, 4.0);
      Assert.assertEquals("equals false test",
                        false, e1.equals(e2));
   
      Assert.assertEquals("equals false test",
                        false, e1.equals("obj"));
   
   /** Tests hashCode. **/
      Assert.assertEquals("equals 0 test",
                        0, e1.hashCode());
   }
}

