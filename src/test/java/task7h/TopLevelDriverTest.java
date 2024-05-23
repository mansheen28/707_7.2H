package task7h;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TopLevelDriverTest {
    private TopLevelDriver driver;

    @Before
    public void setUp() {
        driver = new TopLevelDriver();
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
    public void testNavigateToHome() {
        driver.login("username", "password");
        // No exception should be thrown if user is logged in
        driver.navigateToHome();
    }

    @Test(expected = IllegalStateException.class)
    public void testNavigateToHomeWithoutLogin() {
        driver.navigateToHome();
    }
}
