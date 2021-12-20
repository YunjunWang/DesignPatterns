package mediator.demo;

import mediator.problem.Button;
import mediator.problem.ListBox;
import mediator.problem.TextBox;
import mediator.problem.UIControl;

public class ArticleDialogBox extends DialogBox{
    private TextBox textBox = new TextBox(this);
    private ListBox listBox = new ListBox(this);
    private Button button = new Button(this);

    public ArticleDialogBox() {
    }

    public void simulate() {
        listBox.setSelected("ListBox is selected 1.");
        System.out.println("TextBox content is: " + textBox.getContent());
        System.out.println("Button is enabled: " + button.getEnabled());

        textBox.setContent("");
        System.out.println("TextBox content is: " + textBox.getContent());
        System.out.println("Button is enabled: " + button.getEnabled());

        textBox.setContent("Text content 2");
        System.out.println("TextBox content is: " + textBox.getContent());
        System.out.println("Button is enabled: " + button.getEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if (control == listBox)
            listBoxSelected();
        if (control == textBox)
            textBoxChanged();
    }

    private void listBoxSelected() {
        textBox.setContent(listBox.getSelected());
        button.setEnabled(true);
    }

    private void textBoxChanged() {
        String content = textBox.getContent();
        Boolean isEmpty = (content == null) || content.isEmpty();
        button.setEnabled(!isEmpty);
    }
}
