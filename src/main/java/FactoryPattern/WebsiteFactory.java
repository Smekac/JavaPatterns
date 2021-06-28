package FactoryPattern;

public class WebsiteFactory {

    public static Website getWbsite(WebisteTyp siteType){
            switch (siteType){
                case BLOG: return new Blog();
                case SHOP: return  new Shop();
                default: return null;
            }
    }

}
