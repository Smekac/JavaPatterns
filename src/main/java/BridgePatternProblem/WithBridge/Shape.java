package BridgePatternProblem.WithBridge;

public abstract class Shape {

    //composition
    protected Color color;

    public Shape( Color color) {
        this.color = color;
    }

    abstract  public void applayColor();
}
