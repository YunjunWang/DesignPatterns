package mediator.exercise;

public class SignUp {
    private TextBox userName = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox checkBox = new CheckBox();
    private Button button = new Button();

    public SignUp() {
        userName.addEventHandler(this::toggleSignUpBtn);
        password.addEventHandler(this::toggleSignUpBtn);
        checkBox.addEventHandler(this::toggleSignUpBtn);
    }

    public void simulate() {
        userName.setText("username1");
        checkBox.setChecked(true);
        checkResults();
        System.out.println("---------");
        password.setText("password1");
        checkResults();
        System.out.println("---------");
        checkBox.setChecked(false);
        checkResults();
        System.out.println("---------");
        userName.setText("");
        checkResults();
    }

    private void checkResults() {
        System.out.println("username is: " + userName.getText());
        System.out.println("password is: " + password.getText());
        System.out.println("checkbox is checked: " + checkBox.isChecked());
        System.out.println("Button is enabled: " + button.isEnabled());
    }

    private boolean userNameEmpty() {
        String content = userName.getText();
        boolean isEmpty = content == null || content.isEmpty();
        return isEmpty;
    }

    private boolean passwordEmpty() {
        String content = password.getText();
        boolean isEmpty = content == null || content.isEmpty();
        return isEmpty;
    }

    private boolean checkBoxSelected() {
        boolean isChecked = checkBox.isChecked();
        return isChecked;
    }

    private void toggleSignUpBtn() {
        button.setEnabled(false);
        if (!userNameEmpty() && !passwordEmpty() && checkBoxSelected())
            button.setEnabled(true);
    }
}
