package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testAddNegative() {
        App app = new App();
        assertEquals(-1, app.add(2, -3), "2 + (-3) should equal -1");
    }
}
