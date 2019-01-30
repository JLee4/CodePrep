import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanEvaluationTest {

    @Test
    public void test0ResultsString() {
        int result = BooleanEvaluation.countEval("1^0", false);
        assertEquals(0, result);
    }

    @Test
    public void test2ResultsString() {
        int result = BooleanEvaluation.countEval("1^0|0|1", false);
        assertEquals(2, result);
    }

    @Test
    public void test10ResultsString() {
        int result = BooleanEvaluation.countEval("0&0&0&1^1|0", true);
        assertEquals(10, result);
    }
}
