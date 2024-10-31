import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTests {

    @Test
    public void add_int_1_and_int_2_returns_3() {
        int a;
        int b;
        a = 1;
        b = 2;
        Number expectedAnswer = 3.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_int_2_and_int_2_returns_4() {
        int a;
        int b;
        a = 2;
        b = 2;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_operator_results_in_addition() {
        // ARRANGE
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void unknown_operator_results_in_addition() {
        // ARRANGE
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("?");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Disabled
    @Test
    public void subtract_operator_results_in_addition() {
        // ARRANGE
        int a = 10;
        int b = 30;
        Number expectedAnswer = 40.0;
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
