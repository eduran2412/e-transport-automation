
package OOPeAraclar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SepetTest {
    
    public SepetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Bisiklet item = null;
        Sepet instance = new Sepet();
        instance.addItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Bisiklet item = null;
        Sepet instance = new Sepet();
        instance.removeItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        int saat = 0;
        Sepet instance = new Sepet();
        int expResult = 0;
        int result = instance.calculateTotal(saat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testOdeme() {
        System.out.println("odeme");
        OdemeStrateji paymentMethod = null;
        int saat = 0;
        Sepet instance = new Sepet();
        instance.odeme(paymentMethod, saat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
