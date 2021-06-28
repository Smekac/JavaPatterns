package DecoraorPattern;

public class TomatoSouce extends ToppingDecorator {

    public TomatoSouce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    public String getDescription() {

        return tempPizza.getDescription() + ", Tomato souce";
    }

    public double getCost() {
        System.out.println("Cost of Sauce: " + .35);

        return tempPizza.getCost() + 0.35;
    }
}
