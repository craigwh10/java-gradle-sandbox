import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {
    @Test
    public void shouldGeneratesPrimesUpTo500() {
        assertEquals(new PrimeNumbers().sieveGenerate(500).length, 95);
    }

    //https://jalu.ch/coding/primes/list.php#:~:text=There%20are%201229%20prime%20numbers%20between%201%20and%2010%2C000.
    @Test
    public void shouldGeneratesPrimesUpTo10000() {
        assertEquals(new PrimeNumbers().sieveGenerate(10000).length, 1229);
    }

    // TODO: Negative scenarios for methods.
}
