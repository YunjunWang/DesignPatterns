package Command.Demo.Composite;

import Command.Demo.FX.Command;

public class BlackAndWhiteFilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Filter black and white");
    }
}
