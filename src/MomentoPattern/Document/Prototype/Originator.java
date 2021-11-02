package MomentoPattern.Document.Prototype;

public class Originator {
    private String content;


    public Momento createState() {
        return new Momento(content);
    }

    public void restoreState(Momento state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
