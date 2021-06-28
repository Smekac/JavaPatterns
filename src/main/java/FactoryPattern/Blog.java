package FactoryPattern;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        listPages.add(new AboutPage());
        listPages.add(new ContactPage());
        listPages.add(new PostPage());
    }

}
