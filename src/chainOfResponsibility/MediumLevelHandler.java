package chainOfResponsibility;

public class MediumLevelHandler extends TaskHandler{
    @Override
    public void handleTask(String task, String priority) {
        if (priority.equals("Medium")) {
            System.out.println("Medium level handling: " + task);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task, priority);
        }
    }
}
