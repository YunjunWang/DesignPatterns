package mediator.exercise;

public class TextBox extends UIControl{
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyEventHandlers();
    }
}
