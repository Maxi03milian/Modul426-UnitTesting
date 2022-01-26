package ch.bbw.pr.savecalculator;

import org.junit.*;
import static org.junit.Assert.assertTrue;

public class SaveCalculatorTest {

    private SaveCalculator testee;

    //Bei Seite 5. Äquivalendklassen

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    @Test
    public void testSummeZweiNegativeIsOk() {
        int value1 = -10;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -30);
    }

    @Test
    public void testDifferenzZweiPositivIsOk() {
        int value1 = 20;
        int value2 = 10;
        assertTrue(testee.subtraktion(value1, value2) == 10);
    }

    //region Exception Tests
    // Ungewollte Exception
    @Test
    public void testSummePositiveAndMaxValueIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 10;
        testee.summe(value1, value2);
    }
    // Gewollte Exception
    @Test(expected=ArithmeticException.class)
    public void testSummePositiveAndMaxValueIsFail() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 10;
        testee.summe(value1, value2);
    }
    //endregion

    //region Access Modifier Tests
    //Private Methode: FUNKTIONIERT NICHT -> Warnung bei aufruf der Private Methode
/*    @Test
    public void testSummePrivate() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summePrivate(value1, value2) == 30);
    }*/

    //Protected Methode: FUNKTIONIERT
    @Test
    public void testSummeProtected() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summeProtected(value1, value2) == 30);
    }

    //Package Protected Methode: FUNKTIONIERT
    @Test
    public void testSummePackageProtected() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summePackageProtected(value1, value2) == 30);
    }
    //endregion

    //region 8 Tests pro Kategorie anhand von Äquivalenzklassen

    /*8 Tests für Summe*/
    /*---------------------------------------------------------------------------------------------------*/

    //Positive und Positive Zahl
    @Test
    public void testSummePositivAndPositivIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    //Positive und Negative Zahl
    @Test
    public void testSummePositivAndNegativIsOk() {
        int value1 = 10;
        int value2 = -5;
        assertTrue(testee.summe(value1, value2) == 5);
    }

    //Null und Positive Zahl
    @Test
    public void testSummeNullAndPositivIsOk() {
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.summe(value1, value2) == 10);
    }

    //Positive und Min Value Zahl
    @Test
    public void testSummePositivAndMinintIsOk() {
        int value1 = 1;
        int value2 = Integer.MIN_VALUE;
        assertTrue(testee.summe(value1, value2) == -2147483647);
    }

    //Positive und Max Value Zahl
    @Test(expected=ArithmeticException.class)
    public void testSummePositivAndMaxintIsOk() {
        int value1 = 10;
        int value2 = Integer.MAX_VALUE;
        testee.summe(value1, value2);
    }

    //Min Value und Max Value Zahl
    @Test
    public void testSummeMinintAndMaxintIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.summe(value1, value2) == -1);
    }

    //Null und Null Zahl
    @Test
    public void testSummeNullAndNullIsOk() {
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.summe(value1, value2) == 0);
    }

    //Negative und Negative Zahl
    @Test
    public void testSummeNegativAndNegativIsOk() {
        int value1 = -10;
        int value2 = -10;
        assertTrue(testee.summe(value1, value2) == -20);
    }


    /*8 Tests für Subtraktion*/
    /*---------------------------------------------------------------------------------------------------*/

    //Positive und Positive Zahl
    @Test
    public void testDifferenzPositivAndPositivIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    //Positive und Negative Zahl
    @Test
    public void testDifferenzPositivAndNegativIsOk() {
        int value1 = 10;
        int value2 = -5;
        assertTrue(testee.subtraktion(value1, value2) == 15);
    }

    //Null und Positive Zahl
    @Test
    public void testDifferenzNullAndPositivIsOk() {
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    //Positive und Min Value Zahl
    @Test
    public void testDifferenzPositivAndMinintIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 10;
        System.out.println(testee.subtraktion(value1, value2));
        assertTrue(testee.subtraktion(value1, value2) == 2147483637);
    }

    //Positive und Max Value Zahl
    @Test
    public void testDifferenzPositivAndMaxintIsOk() {
        int value1 = 10;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.subtraktion(value1, value2) == -2147483637);
    }

    //Min Value und Max Value Zahl
    @Test(expected=ArithmeticException.class)
    public void testDifferenzMinintAndMaxintIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        testee.subtraktion(value1, value2);
    }

    //Null und Null Zahl
    @Test
    public void testDifferenzNullAndNullIsOk() {
        int value1 = 0;
        int value2 = 0;
        assertTrue(testee.subtraktion(value1, value2) == 0);
    }

    //Negative und Negative Zahl
    @Test
    public void testDifferenzNegativAndNegativIsOk() {
        int value1 = -10;
        int value2 = -10;
        assertTrue(testee.subtraktion(value1, value2) == 0);
    }


    /*8 Tests für Division*/
    /*---------------------------------------------------------------------------------------------------*/

    //Positive und Positive Zahl
    @Test
    public void testQuotientPositivAndPositivIsOk() {
        int value1 = 20;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) == 2);
    }

    //Positive und Negative Zahl
    @Test
    public void testQuotientPositivAndNegativIsOk() {
        int value1 = 10;
        int value2 = -5;
        assertTrue(testee.division(value1, value2) == -2);
    }

    //Null und Positive Zahl
    @Test
    public void testQuotientNullAndPositivIsOk() {
        int value1 = 0;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) != 10);
    }

    //Positive und Min Value Zahl
    @Test
    public void testQuotientPositivAndMinintIsOk() {
        int value1 = 1;
        int value2 = Integer.MIN_VALUE;
        assertTrue(testee.division(value1, value2) != 10);
    }

    //Max Value und Positive Zahl
    @Test
    public void testQuotientPositivAndMaxintIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) == 2.14748364E8);
    }

    //Min Value und Max Value Zahl
    @Test
    public void testQuotientMinintAndMaxintIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.division(value1, value2) == -1);
    }

    //Null und Null Zahl
    @Test(expected=ArithmeticException.class)
    public void testQuotientNullAndNullIsOk() {
        int value1 = 0;
        int value2 = 0;
        testee.division(value1, value2);
    }

    //Negative und Negative Zahl
    @Test
    public void testQuotientNegativAndNegativIsOk() {
        int value1 = -10;
        int value2 = -10;
        assertTrue(testee.division(value1, value2) == 1);
    }

    //endregion






}