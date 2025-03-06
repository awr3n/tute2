public class ToDoItem {
    private String description;
    private boolean isDone;

    // constructor with both parameters
    public ToDoItem(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    // constructor with isDone false & single description parameter
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    // GETTERS

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    // SETTERS
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}