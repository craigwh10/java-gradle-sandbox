import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class PrimeNumbers {
    private int[] enumerateMultiplesOfValueUpTo (int initValue, int upTo) {

        // int[]'s have fixed length, and the undefined indexes are immutable.
        // arraylists are a better option for unknown lengths.
        ArrayList<Integer> naturalMultiples = new ArrayList<Integer>();


        do {
            int naturalMultiple = initValue * (naturalMultiples.toArray().length + 1);

            if (naturalMultiple > upTo) {
                break;
            }

            naturalMultiples.add(naturalMultiple);
        } while(true);
        // https://stackoverflow.com/questions/7951690/how-do-i-exit-a-while-loop-in-java;

        return naturalMultiples.stream().mapToInt(i -> i).toArray();
    }

    private int[] createListedCountWithinRange (int initialValue, int toValue) {
        int[] valuesToCheck = new int[toValue - 1];

        int startingValue = initialValue;

        for (int index=0; index < toValue - 1; index++) {
            valuesToCheck[index] = startingValue++;
        }

        return valuesToCheck;
    }

    public int[] sieveGenerate(int primesUpTo) {
        int initialCount = 2;

        if (primesUpTo < 0) {
            throw new IllegalArgumentException("Only input natural numbers.");
        };

        if (primesUpTo <= initialCount) {
            return new int[]{};
        };

        int[] valuesToCheck = createListedCountWithinRange(initialCount, primesUpTo);

        for (int value : valuesToCheck) {
            int[] multiplesOfValue = enumerateMultiplesOfValueUpTo(value, primesUpTo);

            valuesToCheck = ArrayUtils.removeElements(valuesToCheck,
                    ArrayUtils.removeElement(multiplesOfValue, value)
            );
        }

        return valuesToCheck;
    }

    public static void main(String[] args) {
        int[] primesUpToTen = new PrimeNumbers().sieveGenerate(100);

        System.out.println("result: " + Arrays.toString(primesUpToTen));
    }
}
