package task7h;

public class OnTrackDriver {
    private boolean loggedIn;

    public OnTrackDriver() {
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

    public boolean addUnit(String unitCode, String unitName) {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulate adding a new unit
        return true; // Placeholder return value
    }

    public boolean addTask(String unitCode, int taskId, String taskName, String dueDate) {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulate adding a new task
        return true;
    }
}