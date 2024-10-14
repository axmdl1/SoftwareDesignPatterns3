package command.Door;

import command.Command;

public class LockDoor implements Command {
    private Door door;

    public LockDoor(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.lockDoor();
    }
}
