import org.example.NumberManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberManagerTest {

    private static NumberManager numberManager;

    @BeforeAll
    public static void setUp() {
        numberManager = new NumberManager();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void isPrimeTest(int number) {
        assertTrue(numberManager.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void isEvenTest(int number) {
        assertTrue(numberManager.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"23, 23", "46, 23", "115, 23", "184, 23", "207, 23", "230, 23"})
    public void isMultipleTest(int number, int divisor) {
        assertTrue(numberManager.isMultiple(number, divisor));
    }
}
