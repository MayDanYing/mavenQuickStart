package geekbrains.homework.lesson4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

public class TriangleAssumptions {

    private final Triangle triangle = new Triangle();
    private static Logger logger = LoggerFactory.getLogger(TriangleAssumptions.class);

    @DisplayName("Triangle Tests")
    @Test
    void trueAssumption() {
        assumeTrue(triangle.calculate(10,10,10)> 40);
        logger.debug("Just debug");

    }

    @Test
    void falseAssumption() {
        assumeFalse(triangle.calculate(10,10,10)< 40);
        logger.info("Just debug");

    }

}
