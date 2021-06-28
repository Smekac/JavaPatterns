package CompositePattern.CmplexPattern;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponentList.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        menuComponentList.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(print(this));
//        Iterator<MenuComponent> itr = menuComponentList.iterator();
//        while (itr.hasNext()) {
//            MenuComponent menuComponent = itr.next();
//            builder.append(menuComponent.toString());
//        }
        menuComponentList.stream().map(mcop -> builder.append(mcop.toString()));

        return builder.toString();
    }
}
