package ModelPrototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Lord of The Rings");
        movie.setPrice(23444.4356);
        movie.setRuntime("2h");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("New LOTR edition");
        book.setPrice(554.32);
        book.setNumberOfPages(335);
        items.put("Book", book);
    }

}
