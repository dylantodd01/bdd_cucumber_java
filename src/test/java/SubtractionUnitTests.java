import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionUnitTests {
    @Test
    public void subtract_operator_results_in_subtraction() {
        // ARRANGE
        int a = 6;
        int b = 10;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("-");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }
}
