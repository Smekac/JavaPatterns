package BridgePatternProblem.WithBridge;

public  class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applayColor(){
        color.applyColor();
    }
}
