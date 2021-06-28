package CompositePattern;

import java.util.HashMap;
import java.util.Map;

public class CompositeEveryDay {

    public static void main(String[] args) {
        Map<String,String> personAttributes = new HashMap<>();
        personAttributes.put("site_role","person");
        personAttributes.put("access_role","limited");

        var groupAtributes = new HashMap<>();
        groupAtributes.put("group_role","claims");
        var securityAttributes = new HashMap<>();
        securityAttributes.putAll(personAttributes);
        securityAttributes.putAll(groupAtributes);

        System.out.println(securityAttributes);

    }

}
