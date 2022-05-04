import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest {
    @Test
    public void shouldReverseString() {
        assertEquals(new StringOperations().reverseString("hi"), "ih");
    }

    /**
     * Referenced from:
     * https://www.baeldung.com/junit-assert-exception
     */
    @Test
    public void stringCannotBeNull() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new StringOperations().reverseString(null);
                }
        );

        String expectedMessage = "String input can not be null.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
