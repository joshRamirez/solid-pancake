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

    public static Double getSumOfMultiplesTrick(Double input1, Double input2, Double limit) {
        limit--;

        return getSumForMultiple(input1, limit) + getSumForMultiple(input2, limit) - getSumForMultiple(input1 * input2, limit);
    }

    private static Double getSumForMultiple(Double multiple, Double limit) {
        Double multipleLimit = Math.floor(limit / multiple);

        return multiple * (multipleLimit + 1) * (multipleLimit / 2);
    }
}
