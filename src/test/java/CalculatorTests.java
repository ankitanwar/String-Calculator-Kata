import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    private final Calculator calculator = new Calculator();

    @Test
    void additionOfEmptyTextIs0() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void additionOfSingleText3Is3() {
        assertEquals(3, calculator.add("3"));
    }

    @Test
    void additionOfSingleText7Is7() {
        assertEquals(7, calculator.add("7"));
    }

    @Test
    void additionOf3And2Is5() {
        assertEquals(5, calculator.add("3,2"));
    }

    @Test
    void additionOf5And8Is13() {
        assertEquals(13, calculator.add("5,8"));
    }


    @Test
    @DisplayName("addition of 3,4,7 is equals to 14")
    void additionOf_3_4_and_7_is_14() {
        assertEquals(14, calculator.add("3,4,7"));
    }

    @Test
    @DisplayName("addition of 6,4,7,2 is equals to 19")
    void additionOf_6_4_7_and2_is19() {
        assertEquals(19, calculator.add("6,4,7,2"));
    }
}
