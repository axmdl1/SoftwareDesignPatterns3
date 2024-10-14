package command.TV;

import command.Command;

public class TurnOffTV implements Command {
    private TV tv;

    public TurnOffTV(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.TurnOff();
    }
}
