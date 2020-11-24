package geekbrains.homework.lesson4;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedTriangletests {
    private final Triangle triangle = new Triangle();

    @RepeatedTest(10)
        void canCalc() {
            assertTrue(triangle.calculate(6, 7, 4) == 11);
            assertEquals(11, triangle.calculate(6, 7, 4));
        }
    @RepeatedTest(value = 5, name = " Showed {currentRepetition} of {totalRepetitions}")
    void canCalc1() {
        assertTrue(triangle.calculate(10, 10, 10) == 43);
        assertEquals(43, triangle.calculate(10, 10, 10));
    }
}
