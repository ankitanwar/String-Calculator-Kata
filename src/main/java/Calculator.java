import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public int add(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return addTokens(text);
    }

    private int addTokens(String text) {
        String[] tokens = getTokens(text);
        throwErrorIfNegativeNumberIsPresent(tokens);
        return Arrays.stream(tokens).mapToInt(Integer::parseInt).sum();
    }

    private void throwErrorIfNegativeNumberIsPresent(String[] tokens) {
        long negativeNumberCount = Arrays.stream(tokens).mapToInt(Integer::parseInt).filter(isNegativeNumber()).count();
        if (negativeNumberCount > 0) {
            throw new NegativeNumberNotAllowed();
        }
    }

    private IntPredicate isNegativeNumber() {
        return currentNumber -> currentNumber < 0;
    }

    private String[] getTokens(String text) {
        if (isCustomDelimiterText(text)) {
            return findTokenFromCustomDelimiter(text);
        }
        return findTokenFromNewLineAndCommaDelimiter(text);
    }

    private String[] findTokenFromNewLineAndCommaDelimiter(String text) {
        return text.split("[,\n]");
    }

    private boolean isCustomDelimiterText(String text) {
        return text.startsWith("//");
    }

    private String[] findTokenFromCustomDelimiter(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        matcher.matches();
        String customDelimiter = matcher.group(1);
        String numbers = matcher.group(2);
        return numbers.split(Pattern.quote(customDelimiter));
    }
}
