package ch.bbw.pr.savecalculator;

import junit.framework.TestCase;
public class SaveCalculatorTest extends TestCase {

    public void testSummeZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, testee.summe(value1, value2));
    }

    public void testSummeZweiNegativeIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -10;
        int value2 = -20;
        assertEquals(-30, testee.summe(value1, value2));
    }

    public void testDifferenzZweiPositivIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 20;
        int value2 = 10;
        assertEquals(-30, testee.summe(value1, value2));
    }
    
}