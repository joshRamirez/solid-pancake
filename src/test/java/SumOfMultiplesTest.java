import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfMultiplesTest {

    @Test
    public void testGetSumOfMultiples() {
        Double input1 = 3.0;
        Double input2 = 5.0;
        Double limit = 10.0;
        Double expectedResult = 23.0;

        assertEquals("Sum for limit of 10 was incorrect", expectedResult, SumOfMultiples.getSumOfMultiples(input1, input2, limit), .0001);
    }

    @Test
    public void testGetSumOfMultiples1000() {
        Double input1 = 3.0;
        Double input2 = 5.0;
        Double limit = 1000.0;
        Double expectedResult = 233168.0;

        assertEquals("Sum for limit of 10 was incorrect", expectedResult, SumOfMultiples.getSumOfMultiples(input1, input2, limit), .0001);
    }
}
