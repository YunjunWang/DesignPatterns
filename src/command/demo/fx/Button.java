package command.demo.fx;

public class Button{
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        // Code here will be dependent on
        // where it is clicked
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
