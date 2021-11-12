package command.demo.composite;

import command.demo.fx.Command;

public class BlackAndWhiteFilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Filter black and white");
    }
}
