import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionUnitTest {

    @Test
    public void division_operator_results_in_division() {
        // ARRANGE
        int a = 66;
        int b = 3;
        Number expectedAnswer = 22.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("/");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void positive_division_by_zero_operator_results_in_positive_infinity() {
        // ARRANGE
        int a = 2;
        int b = 0;
        Number expectedAnswer = Double.POSITIVE_INFINITY;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("/");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void negative_division_by_zero_operator_results_in_negative_infinity() {
        // ARRANGE
        int a = -2;
        int b = 0;
        Number expectedAnswer = Double.NEGATIVE_INFINITY;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("/");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void zero_division_by_zero_results_in_positive_infinity() {
        // ARRANGE
        int a = 0;
        int b = 0;
        Number expectedAnswer = NaN;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("/");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }


}
