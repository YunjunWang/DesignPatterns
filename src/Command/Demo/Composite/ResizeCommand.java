package Command.Demo.Composite;

import Command.Demo.FX.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
