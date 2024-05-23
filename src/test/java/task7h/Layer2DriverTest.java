package task7h;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Layer2DriverTest {
    private Layer2Driver driver;

    @Before
    public void setUp() {
        driver = new Layer2Driver();
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
    public void testNavigateToTaskInbox() {
        driver.login("username", "password");
        // No exception should be thrown if user is logged in
        driver.navigateToTaskInbox();
    }

    @Test(expected = IllegalStateException.class)
    public void testNavigateToTaskInboxWithoutLogin() {
        driver.navigateToTaskInbox();
    }

    @Test
    public void testSelectTask() {
        driver.login("username", "password");
        assertTrue(driver.selectTask(1));
    }
}
