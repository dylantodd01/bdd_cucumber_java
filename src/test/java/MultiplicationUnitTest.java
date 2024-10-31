import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationUnitTest {
    @Test
    public void multiply_operator_results_in_multiplication() {
        // ARRANGE
        int a = 6;
        int b = 9;
        Number expectedAnswer = 54.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("*");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }
}
