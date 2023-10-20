import org.example.NumberManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {

    private static NumberManager num;

    @BeforeAll
    public static void setUp() {
        num = new NumberManager();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void checkPrimes(int number) {
        assertTrue(num.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void checkEven(int number) {
        assertTrue(num.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"23, 23", "46, 23", "115, 23", "184, 23", "207, 23", "230, 23"})
    public void checkMultiples(int number, int divisor) {
        assertTrue(num.isMultiple(number, divisor));
    }
}
