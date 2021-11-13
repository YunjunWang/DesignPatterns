package command.demo.exercise;

public class ContrastCommand implements UndoableAction{
    private ContrastActionHistory history;
    private VideoEditor videoEditor;
    private float prevContrust;

    public ContrastCommand(VideoEditor videoEditor, ContrastActionHistory history) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        prevContrust = videoEditor.getContrast();
        videoEditor.setContrast(0.9f);
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrust);
    }
}
