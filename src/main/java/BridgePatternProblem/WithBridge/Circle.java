package BridgePatternProblem.WithBridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applayColor() {
        color.applyColor();
    }

}
