import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {

    @org.junit.Test
    @Test
    public void testTips() {
        TipCalculator inst1 = new TipCalculator();
        double output = inst1.calculateTip(100, 20);
        assertEquals(20, output);
    }

    @org.junit.Test
    @Test
    public void testTips2() {
        TipCalculator inst2 = new TipCalculator();
        double output = inst2.calculateTip(15.36, 10);
        assertEquals(1.54, output);


    }
}
