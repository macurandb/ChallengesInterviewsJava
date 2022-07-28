package cu.duany.challenges;



import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MexicanWaveTest {
    @Test
    public void test1() {
        String[] result = new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"};


        assertArrayEquals(result, MexicanWave.wave("hello"));
    }

    @Test
    public void test2() {
        String[] result = new String[]{"Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS"};
        assertArrayEquals(result, MexicanWave.wave("codewars"));
    }

    @Test
    public void test3() {
        String[] result = new String[]{};
        assertArrayEquals(result, MexicanWave.wave(""));
    }

    @Test
    public void test4() {
        String[] result = new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"};
        assertArrayEquals(result, MexicanWave.wave("two words"));
    }

    @Test
    public void test5() {
        String[] result = new String[]{" Gap ", " gAp ", " gaP "};
        assertArrayEquals(result, MexicanWave.wave(" gap "));
    }

    @Test
    public void whenStrParameterNull() {
        assertThrows(IllegalArgumentException.class, () -> MexicanWave.wave(null));
    }

}
