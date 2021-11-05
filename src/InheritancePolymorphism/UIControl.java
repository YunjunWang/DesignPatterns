package InheritancePolymorphism;

public abstract class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }

    public void focus() {
        System.out.println("Focus");
    }

    public void setPosition() {
        System.out.println("Set position");
    }

    public abstract void draw();
}