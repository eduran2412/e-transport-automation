package OOPeAraclar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BilgiMakerTest {

    public BilgiMakerTest() {
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
    public void testBilgiBisiklet() {
        System.out.println("bilgiBisiklet");
        BilgiMaker instance = new BilgiMaker();
        instance.bilgiBisiklet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testBilgiScooter() {
        System.out.println("bilgiScooter");
        BilgiMaker instance = new BilgiMaker();
        instance.bilgiScooter();

        fail("The test case is a prototype.");
    }

    @Test
    public void testBilgiKaykay() {
        System.out.println("bilgiKaykay");
        BilgiMaker instance = new BilgiMaker();
        instance.bilgiKaykay();

        fail("The test case is a prototype.");
    }

}
