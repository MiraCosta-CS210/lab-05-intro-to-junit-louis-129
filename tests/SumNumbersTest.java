import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {

    @org.junit.Test
    @Test
    public void testSumNumbers(){
        SumNumbers inst1 =  new SumNumbers();
        int output = inst1.sumIsEven(1,1);
        assertEquals(1,output);
    }

    @org.junit.Test
    @Test
    public void testSumNumbers2(){
        SumNumbers inst1 =  new SumNumbers();
        int output = inst1.sumIsEven(1,2);
        assertEquals(0,output);
    }

}
