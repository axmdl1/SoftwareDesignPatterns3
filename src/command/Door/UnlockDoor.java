package command.Door;

import command.Command;

public class UnlockDoor implements Command {
    private Door door;

    public UnlockDoor(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.unlockDoor();
    }
}
