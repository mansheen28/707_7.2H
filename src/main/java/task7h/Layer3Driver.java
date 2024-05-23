package task7h;

public class Layer3Driver {
    private boolean loggedIn;

    public Layer3Driver() {
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

    public void viewTaskDetails(int taskId) {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulate viewing task details
    }

    public boolean sendMessage(int taskId, String message) {
        if (!loggedIn) {
            throw new IllegalStateException("User not logged in.");
        }
        // Simulate sending a message
        return true;
    }
}