import java.util.Arrays;

public class Calculator {
    public int add(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return addTokens(text);
    }

    private static int addTokens(String text) {
        String[] tokens = text.split("[,\n]");
        return Arrays.stream(tokens).mapToInt(Integer::parseInt).sum();
    }
}
