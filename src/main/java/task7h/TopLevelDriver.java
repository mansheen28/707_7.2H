package task7h;

public class TopLevelDriver {
    private boolean loggedIn;

    public TopLevelDriver() {
        this.loggedIn = false;
    }

    public boolean login(String username, String password) {
        // Simulate login process
        // For simplicity, consider login successful if username and password are not empty
        if (!username.isEmpty() && !password.isEmpty()) {
            loggedIn = true;
            return true;
        } else {
            loggedIn = false;
            return false;
        }
    }

    public void navigateToHome() {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulation to navigation to home screen
    }
}
