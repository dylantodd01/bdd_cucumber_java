import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStepDefinitions {

    private Calculator calc;
    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        // Write code here that turns the phrase above into concrete actions
        calc = new Calculator();
        //throw new io.cucumber.java.PendingException();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        calc.push(int1);
        calc.push(int2);
        calc.push("+");
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        calc.push(int1);
        calc.push(int2);
        calc.push("-");
    }

    @When("I multiply {int} and {int}")
    public void i_multiply_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        calc.push(int1);
        calc.push(int2);
        calc.push("*");
    }

    @When("I divide {int} by {int}")
    public void i_divide_by(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        calc.push(int1);
        calc.push(int2);
        calc.push("/");
    }

    @Then("the result is {double}")
    public void the_result_is(double expected) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Number value = calc.value();
        assertEquals(expected, value);
    }
}
