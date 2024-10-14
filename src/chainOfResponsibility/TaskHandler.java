package chainOfResponsibility;

public abstract class TaskHandler {
    protected TaskHandler nextHandler;

    public abstract void handleTask(String task, String priority);

    public void setNextHandler(TaskHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
