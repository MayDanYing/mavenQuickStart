package geekbrains.homework.lesson4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterTests {
    private final Triangle triangle = new Triangle();

    @ParameterizedTest(name = "triangle with sides {0} {1} {2} with square = {3}")
    @MethodSource("info")
    void canAddAndAssertExactResult(int a, int b, int c, int result) {
        assertEquals(result, triangle.calculate(a, b, c));
    }
    static Stream<Arguments> info() {
        return Stream.of(
                Arguments.of(6, 7, 4, 11),
                Arguments.of(5, 4, 3, 6),
                Arguments.of(6, 9, 4, 9),
                Arguments.of(7, 10, 11, 34)
        );
    }

}

