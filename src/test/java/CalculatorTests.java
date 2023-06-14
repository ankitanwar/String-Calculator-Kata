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

    @Test
    void additionOf_2_4_and_7_withNewLineDelimiterIs13() {
        assertEquals(13, calculator.add("2,4\n7"));
    }

    @Test
    @DisplayName("addition of 2,3 is 5")
    void additionOf_2_and_3_withCustomDelimiterIs5() {
        assertEquals(5, calculator.add("//;\n2;3"));
    }

    @Test
    @DisplayName("addition of 4,5 is 9")
    void additionOf_4_and_5_withCustomDelimiterIs9() {
        assertEquals(9, calculator.add("//;\n4;5"));
    }

    @Test
    @DisplayName("addition of 2,3 is 5")
    void additionOf_2_and_3_withRegexCharAsCustomDelimiterIs5() {
        assertEquals(5, calculator.add("//.\n2.3"));
    }

    @Test
    @DisplayName("addition of 4,6 is 5")
    void additionOf_4_and_6_withRegexCharAsCustomDelimiterIs10() {
        assertEquals(10, calculator.add("//.\n4.6"));
    }
}
