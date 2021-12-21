package mediator.demo.observer;

public class ArticleMediator{
    private TextBox textBox = new TextBox();
    private ListBox listBox = new ListBox();
    private Button button = new Button();

    public ArticleMediator() {
//        create anonymous Observer object
//        listBox.attach(new Observer() {
//            @Override
//            public void update() {
//                listBoxSelected();
//            }
//        });

//        using lambda function
//        listBox.attach(() -> {
//            listBoxSelected();
//        });
//        only one line, omit the curly braces
//        listBox.attach(() -> listBoxSelected());
//        only one line, using method reference to represent the observer
        listBox.addEventHandler(this::listBoxSelected);
        textBox.addEventHandler(this::textBoxChanged);
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
