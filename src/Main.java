import chainOfResponsibility.HighLevelHandler;
import chainOfResponsibility.LowLevelHandler;
import chainOfResponsibility.MediumLevelHandler;
import chainOfResponsibility.TaskHandler;
import command.Command;
import command.Door.Door;
import command.Door.UnlockDoor;
import iterator.TaskList;
import mediator.TaskManager;
import mediator.TaskMediator;

public class Main {
    public static void main(String[] args) {
        TaskHandler lowHandler = new LowLevelHandler();
        TaskHandler mediumHandler = new MediumLevelHandler();
        TaskHandler highHandler = new HighLevelHandler();

        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);

        lowHandler.handleTask("Finish Assignment 3", "High");
        lowHandler.handleTask("Read Lecture 6", "Medium");
        lowHandler.handleTask("Make a command pattern", "Low");

        System.out.println("------------------------------------------------------------");

        Door livingRoom = new Door();
        Command unlockDoor = new UnlockDoor(livingRoom);
        unlockDoor.execute();

        System.out.println("------------------------------------------------------------");

        TaskMediator mediator = new TaskMediator();
        TaskManager manager = new TaskManager(mediator);

        manager.executeTask(unlockDoor);

        System.out.println("------------------------------------------------------------");

        TaskList task = new TaskList();
        task.addTask("T1");
        task.addTask("Assignment 3");

        for (String tasks : task){
            System.out.println("Processing: " + tasks);
        }
    }
}