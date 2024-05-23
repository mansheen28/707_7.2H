package task7h;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OnTrackDriverTest {
    private OnTrackDriver driver;

    @Before
    public void setUp() {
        driver = new OnTrackDriver();
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
    public void testAddUnit() {
        driver.login("username", "password");
        assertTrue(driver.addUnit("CS101", "Introduction to Computer Science"));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddUnitWithoutLogin() {
        driver.addUnit("CS101", "Introduction to Computer Science");
    }

    @Test
    public void testAddTask() {
        driver.login("username", "password");
        assertTrue(driver.addTask("CS101", 1, "Assignment 1", "2024-06-01"));
    }
}