package Memento.Exercise;

public class Document {
    private String content;
    private String fontName;
    private String fontSize;

    public Momento createState() {
        return new Momento(content, fontName, fontSize);
    }

    public void restoreContent(String content) {
        this.content = content;
    }

    public void restoreFontName(String fontName) {
        this.fontName = fontName;
    }

    public void restoreFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setState(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return this.content;
    }

    public String getFontName() {
        return this.fontName;
    }

    public String getFontSize() {
        return this.fontSize;
    }
}
