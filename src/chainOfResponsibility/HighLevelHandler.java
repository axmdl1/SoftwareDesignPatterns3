package chainOfResponsibility;

public class HighLevelHandler extends TaskHandler{
    @Override
    public void handleTask(String task, String priority) {
        if (priority.equals("high")) {
            System.out.println("High Level Task: " + task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task, priority);
        }
    }
}
