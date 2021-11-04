package State.Demo;

public class Brush implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Show brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
