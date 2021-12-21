package mediator.exercise;

public class Button extends UIControl{
    private Boolean isEnabled = false;

    public Boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
