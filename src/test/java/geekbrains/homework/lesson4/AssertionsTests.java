package geekbrains.homework.lesson4;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionsTests {

    //непонятно как и что тут к треугольнику привязать и надо ли?

    @Test
    void lambdaExpressions() {
        assertTrue(Stream.of(6, 7, 4)
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be greater than 5");
    }
}
