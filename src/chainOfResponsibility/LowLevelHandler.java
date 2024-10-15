package chainOfResponsibility;

public class LowLevelHandler extends TaskHandler {
    @Override
    public void handleTask(String task, String priority) {
        if (priority.equals("Low")) {
            System.out.println("Low level handling: " + task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task, priority);
        }
    }
}
