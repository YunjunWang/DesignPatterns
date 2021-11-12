package memento.demo;

public class Originator {
    private String content;


    public Memento createState() {
        return new Memento(content);
    }

    public void restoreState(Memento state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
