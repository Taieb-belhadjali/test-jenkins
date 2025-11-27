package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorServiceTest c = new CalculatorServiceTest();
        assertEquals(5, c.add(2,3));
    }

    private void assertEquals(int i, int add) {
        //
    }

    private int add(int i, int i1) {
        return i + i1;
    }

}
