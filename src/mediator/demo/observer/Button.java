package mediator.demo.observer;

public class Button extends UIControl{
    private Boolean enabled;
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
        notifyEventHandlers();
    }
}
