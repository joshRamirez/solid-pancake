import java.util.LinkedList;

public class SumOfEvenFibonacci {
    public static Long getSumOfEvenFibonacci(Long limit) {
        if (limit < 7l) {
            return 2l;
        }

        if (limit < 33l) {
            return 10l;
        }

        LinkedList<Long> evenFibonacci = new LinkedList<Long>();
        evenFibonacci.add(2l);
        evenFibonacci.add(8l);
        Long sum = 2l;

        while (evenFibonacci.getLast() < limit) {
            sum += evenFibonacci.getLast();
            evenFibonacci.add(getNextEvenFibonacci(evenFibonacci.get(evenFibonacci.size() - 2), evenFibonacci.getLast()));
        }

        return sum;
    }

    private static Long getNextEvenFibonacci(Long n6, Long n3) {
        return 4 * n3 + n6;
    }
}
