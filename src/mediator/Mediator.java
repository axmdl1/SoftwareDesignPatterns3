package mediator;

import command.Command;

public interface Mediator {
    void sendNotification(Command command);
}
