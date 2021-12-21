package mediator.exercise;

public class CheckBox extends UIControl{
    private Boolean isChecked = false;

    public Boolean isChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }
}
