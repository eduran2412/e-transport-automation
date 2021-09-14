package OOPeAraclar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class eAraclarFactoryTest {

    public eAraclarFactoryTest() {
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
    public void testGetBisikletAraclar() {
        System.out.println("getBisikletAraclar");
        String type = "";
        int saat = 0;
        String tur = "";
        int koltukSayisi = 0;
        String sepetDurum = "";
        String pedal = "";
        String amortisor = "";
        int fiyat = 0;
        eAraclar expResult = null;
        eAraclar result = eAraclarFactory.getBisikletAraclar(type, saat, tur, koltukSayisi, sepetDurum, pedal, amortisor, fiyat);
        assertEquals(expResult, result);

        fail("The test case is a prototype.");
    }

    @Test
    public void testGetKaykayAraclar() {
        System.out.println("getKaykayAraclar");
        String type = "";
        int saat = 0;
        String tur = "";
        String malzeme = "";
        int tekerlekSayisi = 0;
        String stil = "";
        int fiyat = 0;
        eAraclar expResult = null;
        eAraclar result = eAraclarFactory.getKaykayAraclar(type, saat, tur, malzeme, tekerlekSayisi, stil, fiyat);
        assertEquals(expResult, result);

        fail("The test case is a prototype.");
    }

    @Test
    public void testGetScooterAraclar() {
        System.out.println("getScooterAraclar");
        String type = "";
        int saat = 0;
        String tur = "";
        String taban = "";
        String size = "";
        String renk = "";
        int fiyat = 0;
        eAraclar expResult = null;
        eAraclar result = eAraclarFactory.getScooterAraclar(type, saat, tur, taban, size, renk, fiyat);
        assertEquals(expResult, result);

        fail("The test case is a prototype.");
    }

}
