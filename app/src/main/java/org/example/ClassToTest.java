package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassToTest {
    private static final Logger logger = LoggerFactory.getLogger(ClassToTest.class);

    public int add(int a, int b) {
        logger.info("add method called with arguments: {} and {}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        logger.info("subtract method called with arguments: {} and {}", a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        logger.info("multiply method called with arguments: {} and {}", a, b);
        return a * b;
    }

    public int divide(int a, int b) {
        logger.info("divide method called with arguments: {} and {}", a, b);
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

}