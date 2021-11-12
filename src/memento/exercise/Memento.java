package memento.exercise;

public class Memento {
    final private String content;
    final private String fontName;
    final private String fontSize;

    public Memento(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }
}
