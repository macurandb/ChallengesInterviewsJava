package cu.duany.challenges;
import java.util.stream.IntStream;

public class MexicanWave {
    public static String[] wave(String str) {
        if (str==null)
            throw new IllegalArgumentException("The numbers argument cannot be null.");
        return IntStream
                .range(0, str.length())
                .mapToObj(number -> new StringBuilder(str).replace(
                        number, number+1, String.valueOf(str.charAt(number)).toUpperCase()).toString())
                .filter(word -> !word.equals(str))
                .toArray(String[]::new);
    }
}