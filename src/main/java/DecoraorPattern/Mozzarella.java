package DecoraorPattern;

//Concrete Decorator
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    public String getDescription() {

        return tempPizza.getDescription() + ", mozzarella";
    }

    public double getCost() {
        System.out.println("Cost of Moz: " + .50);

        return tempPizza.getCost() + 0.50;
    }

}
