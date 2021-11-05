package State.Exercise;

public class Map {
    private Calculator calculator;

    public Object getEta() {
        return calculator.getEta();
    }

    public Object getDirection() {
        return calculator.getDirection();
    }

    public Calculator getCurrentMethod() {
        return calculator;
    }

    public void setCurrentMethod(Calculator currentMethod) {
        this.calculator = currentMethod;
    }
}
