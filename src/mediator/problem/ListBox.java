package mediator.problem;

import mediator.demo.DialogBox;

public class ListBox extends UIControl{
    private String selected;

    public ListBox(DialogBox owner) {
        super(owner);
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
        owner.changed(this);
    }
}
