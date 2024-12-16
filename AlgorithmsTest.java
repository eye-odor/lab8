import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    Algorithms algorithms = new Algorithms();

    // Тести для методу findMinPositive
    @Test
    void testFindMinPositive_Success() {
        int[] numbers = {5, 2, 8, 3};
        assertEquals(2, algorithms.findMinPositive(numbers));
    }

    @Test
    void testFindMinPositive_EmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMinPositive(numbers));
    }

    @Test
    void testFindMinPositive_NegativeNumber() {
        int[] numbers = {1, -3, 4};
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMinPositive(numbers));
    }

    // Тести для методу sumOfNegativeNumbers
    @Test
    void testSumOfNegativeNumbers_Success() {
        int[] numbers = {-1, -2, -3};
        assertEquals(-6, algorithms.sumOfNegativeNumbers(numbers));
    }

    @Test
    void testSumOfNegativeNumbers_NullArray() {
        assertThrows(IllegalArgumentException.class, () -> algorithms.sumOfNegativeNumbers(null));
    }

    @Test
    void testSumOfNegativeNumbers_PositiveNumber() {
        int[] numbers = {-1, 2, -3};
        assertThrows(IllegalArgumentException.class, () -> algorithms.sumOfNegativeNumbers(numbers));
    }

    // Тести для методу fibonacci
    @Test
    void testFibonacci_Success() {
        assertEquals(5, algorithms.fibonacci(5));
    }

    @Test
    void testFibonacci_NegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> algorithms.fibonacci(-1));
    }

    // Тести для методу calculateCurrent
    @Test
    void testCalculateCurrent_Success() {
        assertEquals(2.0, algorithms.calculateCurrent(10, 5));
    }

    @Test
    void testCalculateCurrent_ZeroResistance() {
        assertThrows(IllegalArgumentException.class, () -> algorithms.calculateCurrent(10, 0));
    }
}

