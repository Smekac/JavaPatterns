package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> listPages = new ArrayList<>();

    public List<Page> getListPages() {
        return listPages;
    }


    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();


}
