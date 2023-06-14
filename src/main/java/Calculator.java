import static java.lang.Integer.parseInt;

public class Calculator {
    public int add(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        if (text.contains(",")) {
            String[] tokens = text.split(",");
            return parseInt(tokens[0]) + parseInt(tokens[1]);
        }
        return parseInt(text);
    }
}
