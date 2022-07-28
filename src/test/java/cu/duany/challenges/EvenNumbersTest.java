package cu.duany.challenges;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenNumbersTest {
    @Test
    public void test1() {
        assertTrue(Arrays.equals(new int[]{2, 4, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.equals(new int[]{3, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3)));
    }

    @Test
    public void test3() {
        assertTrue(Arrays.equals(new int[]{0, 4}, EvenNumbers.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4)));
    }

    @Test
    public void whenNumbersArgumentEmpty() {
        assertThrows(IllegalArgumentException.class, () -> EvenNumbers.divisibleBy(new int[]{}, 4));
    }

    @Test
    public void whenNumbersArgumentNull() {
        assertThrows(IllegalArgumentException.class, () -> EvenNumbers.divisibleBy(null, 0));
    }

    @Test
    public void whenDividerArgumentZero() {
        assertThrows(IllegalArgumentException.class, () -> EvenNumbers.divisibleBy(new int[]{1,2,4}, 0));
    }
}
