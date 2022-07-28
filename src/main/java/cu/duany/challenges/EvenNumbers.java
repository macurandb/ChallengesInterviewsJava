package cu.duany.challenges;
import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        if (numbers == null || numbers.length ==0)
            throw new IllegalArgumentException("The numbers argument cannot be null or empty.");
        if (divider == 0)
            throw new IllegalArgumentException("The divider argument cannot zero.");
        return Arrays.stream(numbers)
                .filter(number -> (number % divider) == 0)
                .toArray() ;
    }
}
