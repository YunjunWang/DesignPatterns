package observer.demo;

public interface Observer <T>{
    public void update();
    public void update(T value);
}
