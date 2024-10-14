package mediator;

import command.Command;

public class TaskMediator implements Mediator{
    @Override
    public void sendNotification(Command command) {
        command.execute();
    }
}
