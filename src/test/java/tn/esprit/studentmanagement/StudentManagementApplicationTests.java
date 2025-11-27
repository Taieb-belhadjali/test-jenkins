package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService calculator = new CalculatorService();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}
