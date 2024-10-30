import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    private final Deque<Number> stack = new LinkedList<>();
    private static final List<String> OPERATORS = List.of("+");
    public void push(Object arg) {
        if (OPERATORS.contains(arg)) {
            Number y = stack.removeLast();
            Number x = stack.removeLast();
            Double answer = null;

            answer = x.doubleValue() + y.doubleValue();
            push(answer);
        } else {
            stack.add((Number) arg);
        }
    }

    public Number value() {
        return stack.getLast();
    }
}
