package mediator.problem;

import mediator.demo.DialogBox;

public class Button extends UIControl{
    private Boolean enabled;

    public Button(DialogBox owner) {
        super(owner);
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
        owner.changed(this);
    }
}
