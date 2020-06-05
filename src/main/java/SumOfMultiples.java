public class SumOfMultiples {
    public static Double getSumOfMultiples(Double input1, Double input2, Double limit) {
        Double sum = 0d;
        Double maxMultiples1 = limit / input1;
        Double maxMultiples2 = limit / input2;

        for (int i = 1; i < maxMultiples1; i++) {
            sum += i * input1;
        }

        for (int i = 1; i < maxMultiples2; i++) {
            if (i % input1 != 0) {
                sum += i * input2;
            }
        }

        return sum;
    }
}
