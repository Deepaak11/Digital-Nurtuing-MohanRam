package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals("Sum should be 5", 5, 2 + 3);

        // Assert true
        assertTrue("Expected condition to be true", 5 > 3);

        // Assert false
        assertFalse("Expected condition to be false", 5 < 3);

        // Assert null
        Object nullObj = null;
        assertNull("Expected object to be null", nullObj);

        // Assert not null
        Object nonNullObj = new Object();
        assertNotNull("Expected object to be not null", nonNullObj);
    }
}
