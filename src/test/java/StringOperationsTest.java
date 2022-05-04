import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringOperationsTest {
    @Test
    public void shouldReverseString() {
        assertEquals(new StringOperations().reverseString("hi"), "ih");
    }
}
