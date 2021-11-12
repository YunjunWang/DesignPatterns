package state.demo;

public class Selection implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Show selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a rectangle");
    }
}
