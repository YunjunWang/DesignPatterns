package state.problem;

public class Canvas {
    private ToolType currentTool;

    public void mouseDown() {
        switch (currentTool){
            case SELECTION -> {
                System.out.println("Show selection icon");
                break;
            }
            case BRUSH -> {
                System.out.println("Show brush icon");
                break;
            }
            case ERASER -> {
                System.out.println("Show eraser icon");
                break;
            }
        }
    }

    public void mouseUp() {
        switch (currentTool){
            case SELECTION -> {
                System.out.println("Draw a rectangle");
                break;
            }
            case BRUSH -> {
                System.out.println("Draw a line");
                break;
            }
            case ERASER -> {
                System.out.println("Delete the line");
                break;
            }
        }
    }
}
