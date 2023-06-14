import static java.lang.Integer.parseInt;

public class Calculator {
    public int add(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return parseInt(text);
    }
}
