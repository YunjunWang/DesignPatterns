package command.demo.exercise;

public class LabelCommand implements UndoableAction{
//    private String prevLabel;
    private LabelActionHistory history;

    public LabelCommand(VideoEditor videoEditor, LabelActionHistory history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    private VideoEditor videoEditor;
    @Override
    public void execute() {
//        prevLabel = videoEditor.getText();
        videoEditor.setText("new label");
        history.push(this);
    }

    @Override
    public void unexecute() {
//        videoEditor.setText(prevLabel);
        videoEditor.removeText();
    }
}
