import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    void additionOfEmptyTextIs0() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }
}
