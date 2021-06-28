package FactoryPattern;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        listPages.add(new ContactPage());
    }
}
