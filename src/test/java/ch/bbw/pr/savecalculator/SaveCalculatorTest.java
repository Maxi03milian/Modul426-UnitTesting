package ch.bbw.pr.savecalculator;

import org.junit.*;
import static org.junit.Assert.assertTrue;

public class SaveCalculatorTest {

    private SaveCalculator testee;


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
        assertTrue(testee.summe(value1, value2) == 10);
    }

}