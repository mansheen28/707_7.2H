package task7h;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Layer3DriverTest {
    private Layer3Driver driver;

    @Before
    public void setUp() {
        driver = new Layer3Driver();
    }

    @Test
    public void testLoginSuccess() {
        assertTrue(driver.login("username", "password"));
    }

    @Test
    public void testLoginFailure() {
        assertFalse(driver.login("", ""));
    }

    @Test
    public void testViewTaskDetails() {
        driver.login("username", "password");
        // No exception should be thrown if user is logged in
        driver.viewTaskDetails(1);
    }

    @Test(expected = IllegalStateException.class)
    public void testViewTaskDetailsWithoutLogin() {
        driver.viewTaskDetails(1);
    }

    @Test
    public void testSendMessage() {
        driver.login("username", "password");
        assertTrue(driver.sendMessage(1, "Hello"));
    }
}