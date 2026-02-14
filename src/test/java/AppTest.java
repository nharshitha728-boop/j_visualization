package com.experiment;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
    @Test
    public void testApp() {
        assertEquals("Hello Jenkins!", new App().sayHello());
    }
}
