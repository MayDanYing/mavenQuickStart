package geekbrains.homework.lesson4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedTriangleTests {
    private final Triangle triangle = new Triangle();

    @Nested
    @DisplayName("Triangle Tests")
    class CanCalculate {

        @Test
        @Tag("justSomeTest")
        void canCalc1() {
            assertTrue(triangle.calculate(6, 7, 4) == 11);
            assertEquals(11, triangle.calculate(6, 7, 4));
        }

        @Test
        @Tag("AnotherTest")
        void canCalc2() {
            assertEquals(6, triangle.calculate(5, 7, 3));
        }
        @Test
        void canCalc3(){
            assertFalse(triangle.calculate(10,10,10)==78); // правильный ответ - 43
        }

        @Test
        void canCalc4(){
            assertNotNull(triangle.calculate(1,2,3)); // правильный ответ - 0
        }

    }
}

