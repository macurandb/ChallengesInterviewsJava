package cu.duany.challenges;
import java.util.Arrays;



public class LettersCalculator {
    public static String addLetters(String... letters) {
        if (letters == null)
            throw new IllegalArgumentException("The letters cannot be null.");
        if (Arrays.stream(letters).anyMatch(letter -> (letter.length() > 1)))
            throw new IllegalArgumentException("All letters should be a character.");
        String abc = "zabcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (String letter : letters) {
            if (abc.contains(letter)) {
                sum += abc.indexOf(letter);
            } else {
                throw new IllegalArgumentException("All letters should be lowercase or a character.");
            }
        }
        return String.valueOf(abc.charAt(sum % 26));
    }
}
