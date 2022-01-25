import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * Tests EllipsoidList2.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 3/19.20
 */
public class EllipsoidList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
      
   /** Tests numberOfEllipsoids. **/
   //@Test public void numberOfEllipsoidsTest()  {
      //Ellipsoid[] eArray = new Ellipsoid[100];
      //eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      //eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      //EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 2);
      //Assert.assertEquals(2, EllipsoidList2.numberOfEllipsoids());
   //}
   
   /** Tests totalVolume. **/
   @Test public void totalVolumeTest()   {
   
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 2);
      
      Assert.assertEquals("totalVolume test", 527.7875658,
                           eList.totalVolume(), .000001); 
   }
   
   /** Tests totalSurfaceArea. **/
   @Test public void totalSurfaceAreaTest() {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
    
      Assert.assertEquals("totalSurfaceArea test", 1164.0658367965455,
                         eList.totalSurfaceArea(), .000001);
   }
   
   /** Tests averageVolume if volume exists. **/
   @Test public void averageVolumeTest()   {
   
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 2);
      
      Assert.assertEquals("averageVolume test", 263.8937829,
                           eList.averageVolume(), .000001);
   }
   
   /** Tests averageVolume if volume = 0. **/
   @Test public void averageVolumeTest2()   {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 0", 0, 0, 0);
      eArray[1] = new Ellipsoid("Ex 00", 0, 0, 0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 2);
    
      Assert.assertEquals("avg volume = 0", 0.0, eList.averageVolume(), .00000);
   }
   
   /** Tests averageSurfaceArea. **/
   @Test public void averageSurfaceAreaTest() {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
    
      Assert.assertEquals("averageSurfaceArea test", 388.0219455988485,
                         eList.averageSurfaceArea(), .000001);
   }
   
   /** Tests averageSurfaceArea if SA = 0. **/
   @Test public void averageSurfaceAreaTest2()   {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 0", 0, 0, 0);
      eArray[1] = new Ellipsoid("Ex 00", 0, 0, 0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 2);
    
      Assert.assertEquals("avg SA = 0", 0.0,
         eList.averageSurfaceArea(), .00000);
   }
   
   /** Tests toString. **/
   @Test public void toStringTest()   {
      
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
   
      Assert.assertEquals("toString test", false, eList.toString().
         contains("with axes a = 1.0, b = 2.0, c =3.0 units has:"));
   }
   
   /** Tests summaryInfo. **/
   @Test public void summaryInfoTest()   {
      
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Assert.assertEquals("summaryInfo test", true, eList.summaryInfo().
         contains("Number of Ellipsoid Objects: 3"));
   }
   
   /** Tests readFile.
    * @throws IOException for reading file
    */
   @Test public void readFileTest() throws IOException  {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", null, 0);
      eList = eList.readFile("Ellipsoid_data_0.txt");
      
      Assert.assertEquals("readFile test", "Ellipsoid Empty Test List",
         eList.getName());
   }
   
   /** Tests addEllipsoid. **/
   @Test public void addEllipsoidTest()  {
   
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid e = new Ellipsoid("Ex 4", 10.0, 11.0, 12.0);
      eList.addEllipsoid("Ex 4", 10.0, 11.0, 12.0);
      Ellipsoid[] eArr1 = eList.getEList();
      
      Assert.assertEquals("addEllipsoid test", e, eArr1[3]);
   }
   
   /** Tests findEllipsoid. **/
   @Test public void findEllipsoidTest() {
     
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid eX = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      Ellipsoid[] eArr2 = eList.getEList();
      
      Assert.assertEquals("findEllipsoid test", eX,
         eList.findEllipsoid("Ex 1"));
   }
   
   /** Tests findEllipsoid if null. **/
   @Test public void findEllipsoidTestNull() {
   
      Ellipsoid[] eArray = new Ellipsoid[100];
   
      EllipsoidList2 eList = new EllipsoidList2("Null test list", eArray, 0);
      
      Ellipsoid[] eArr3 = eList.getEList();
   
      Assert.assertEquals("findEllipsoid null test", null, eArr3[0]);
   }
   
   /** Tests deleteEllipsoid. **/
   @Test public void deleteEllipsoidTest()   {
      
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid e1 = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      Ellipsoid[] eArr4 = eList.getEList();
      Assert.assertEquals("prereq test for deleteEllipsoid",
                           e1, eArr4[1]);
                           
      Assert.assertEquals("deleteEllipsoid test", eArray[1],
         eList.deleteEllipsoid("Ex 2"));
   }
   
   /** Tests deleteEllipsoid if null. **/
   @Test public void deleteEllipsoidTestNull() {
      
      Ellipsoid[] eArray = new Ellipsoid[100];
   
      EllipsoidList2 eList = new EllipsoidList2("Null test list", eArray, 0);
      Ellipsoid[] eArr5 = eList.getEList();
      
      Assert.assertEquals("deleteEllipsoid null test", null,
         eList.deleteEllipsoid("Ex 0"));
   }
   
   /** Tests editEllipsoid. **/
   @Test public void editEllipsoidTest() {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid eX = new Ellipsoid("Ex 1", 2.0, 3.0, 4.0);
      eList.editEllipsoid("Ex 1", 2.0, 3.0, 4.0);
      Ellipsoid[] eArr6 = eList.getEList();
      
      Assert.assertEquals("editEllipsoid test", eX, eArray[0]);
   }
   
   /** Tests editEllipsoid if null. **/
   @Test public void editEllipsoidTestNull()   {
    
      Ellipsoid[] eArray = new Ellipsoid[100];
    
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("Null test list", eArray, 3);
      
      Ellipsoid[] eArr7 = eList.getEList();
      
      Assert.assertEquals("editEllipsoid null test", null,
         eList.editEllipsoid("Ex 4", 2.0, 3.0, 4.0));
   }
   
   /** Tests findEllipsoidWithSmallestVolume. **/
   @Test public void findEllipsoidWithSmallestVolumeTest() {
    
      Ellipsoid[] eArray = new Ellipsoid[3];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid eX = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      Ellipsoid[] eArr8 = eList.getEList();
      
      Assert.assertEquals(eX, eList.findEllipsoidWithSmallestVolume());
   }
   
   /** Tests findEllipsoidWithSmallestVolume if null. **/
   @Test public void findEllipsoidWithSmallestVolumeTestNull()   {
     
      EllipsoidList2 eList = new EllipsoidList2("Null test list", null, 0);
     
      Ellipsoid[] eArr9 = eList.getEList();
     
      Assert.assertEquals(null, eList.findEllipsoidWithSmallestVolume());
   }
   
   /** Tests findEllipsoidWithLargestVolume. **/
   @Test public void findEllipsoidWithLargestVolume()   {
    
      Ellipsoid[] eArray = new Ellipsoid[3];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid eX = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
      Ellipsoid[] eArr10 = eList.getEList();
      
      Assert.assertEquals(eX, eList.findEllipsoidWithLargestVolume());
   }
   
   /** Tests findEllipsoidWithLargestVolume if null. **/
   @Test public void findEllipsoidWithLargestVolumeTestNull()   {
     
      EllipsoidList2 eList = new EllipsoidList2("Null test list", null, 0);
     
      Ellipsoid[] eArr11 = eList.getEList();
     
      Assert.assertEquals(null, eList.findEllipsoidWithSmallestVolume());
   }
   
   /** Tests findEllipsoidWithSmallestSurfaceArea. **/
   @Test public void findEllipsoidWithSmallestSurfaceAreaTest() {
    
      Ellipsoid[] eArray = new Ellipsoid[3];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid eX = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      Ellipsoid[] eArr12 = eList.getEList();
      
      Assert.assertEquals(eX, eList.findEllipsoidWithSmallestSurfaceArea());
   }
   
   /** Tests findEllipsoidWithSmallestSurfaceArea if null. **/
   @Test public void findEllipsoidWithSmallestSurfaceAreaTestNull()   {
     
      EllipsoidList2 eList = new EllipsoidList2("Null test list", null, 0);
     
      Ellipsoid[] eArr13 = eList.getEList();
     
      Assert.assertEquals(null, eList.findEllipsoidWithSmallestSurfaceArea());
   }
   
   /** Tests findEllipsoidWithLargestSurfaceArea. **/
   @Test public void findEllipsoidWithLargestSurfaceAreaTest() {
    
      Ellipsoid[] eArray = new Ellipsoid[3];
      eArray[0] = new Ellipsoid("Ex 1", 1.0, 2.0, 3.0);
      eArray[1] = new Ellipsoid("Ex 2", 4.0, 5.0, 6.0);
      eArray[2] = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
    
      EllipsoidList2 eList = new EllipsoidList2("New test list", eArray, 3);
      
      Ellipsoid eX = new Ellipsoid("Ex 3", 7.0, 8.0, 9.0);
      Ellipsoid[] eArr14 = eList.getEList();
      
      Assert.assertEquals(eX, eList.findEllipsoidWithLargestSurfaceArea());
   }
   
   /** Tests findEllipsoidWithLargestSurfaceArea if null. **/
   @Test public void findEllipsoidWithLargestSurfaceAreaTestNull()   {
     
      EllipsoidList2 eList = new EllipsoidList2("Null test list", null, 0);
     
      Ellipsoid[] eArr15 = eList.getEList();
     
      Assert.assertEquals(null, eList.findEllipsoidWithLargestSurfaceArea());
   }
}
