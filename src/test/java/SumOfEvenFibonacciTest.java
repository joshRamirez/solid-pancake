import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfEvenFibonacciTest {
    @Test
    public void testGetSumOfEvenFibonacci() {
        Long limit = 100l;
        Long expectedResult = 44l;
        assertEquals("small fibonacci set failed", expectedResult, SumOfEvenFibonacci.getSumOfEvenFibonacci(limit), .0001);
    }

    @Test
    public void testGetSumOfEvenFibonacciLarge() {
        Long limit = 4000000l;
        Long expectedResult = 4613732l;
        assertEquals("large fibonacci set failed", expectedResult, SumOfEvenFibonacci.getSumOfEvenFibonacci(limit), .0001);
    }
}
