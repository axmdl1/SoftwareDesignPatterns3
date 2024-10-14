package mediator;

import command.Command;

public class TaskManager {
    private Mediator mediator;

    public TaskManager(Mediator mediator){
        this.mediator = mediator;
    }

    public void executeTask(Command command){
        mediator.sendNotification(command);
    }
}
