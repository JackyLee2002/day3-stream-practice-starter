import java.util.Arrays;
import java.util.List;

public class StreamMap {

    private static final List<String> ALPHABET = Arrays.asList(
        "a", "b", "c", "d", "e", "f", "g",
        "h", "i", "j", "k", "l", "m", "n",
        "o", "p", "q", "r", "s", "t", "u",
        "v", "w", "x", "y", "z");

    public List<Integer> getTriple(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number* 3)
                .toList();
    }

    public List<String> mapLetter(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> String.valueOf((char)(number+ 96)))
                        .toList();
    }

    public List<Integer> mapLength(List<String> words) {
        return words.stream().map(word -> word.length()).toList();
    }
}