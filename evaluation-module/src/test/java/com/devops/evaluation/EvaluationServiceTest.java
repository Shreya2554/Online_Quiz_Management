package com.devops.evaluation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluationServiceTest {

    @Test
    void testEvaluation() {
        EvaluationService service = new EvaluationService();

        Result result = service.evaluate(4, 5);

        assertEquals(80, result.getScore());
    }

    @Test
    void testZeroCorrect() {
        EvaluationService service = new EvaluationService();

        Result result = service.evaluate(0, 5);

        assertEquals(0, result.getScore());
    }
}