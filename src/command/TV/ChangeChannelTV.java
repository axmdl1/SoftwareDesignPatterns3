package command.TV;

import command.Command;

public class ChangeChannelTV implements Command {
    private TV tv;

    public ChangeChannelTV(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.ChangeChannel();
    }
}
