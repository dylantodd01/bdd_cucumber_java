import org.junit.jupiter.api.BeforeAll;
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
}
