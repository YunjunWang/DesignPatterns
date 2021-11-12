package command.demo.undo;

public class BoldCommand implements UndoableCommand {
    private String prevContent;

    public BoldCommand(HTMLDocument document, CommandHistory history) {
        this.document = document;
        this.history = history;
    }

    private HTMLDocument document;
    private CommandHistory history;

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
