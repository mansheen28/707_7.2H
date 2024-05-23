package task7h;

public class Layer2Driver {
    private boolean loggedIn;

    public Layer2Driver() {
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

    public void navigateToTaskInbox() {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulate navigation to task inbox
    }

    public boolean selectTask(int taskId) {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulate selecting a task
        return true;
    }
}
