package oppgave1.handleliste.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class Handleliste {


    private static List<ListeItem> items = new ArrayList<>();
 
    public static void addItem(ListeItem item) {
    	items.add(item);
    }
    public static void removeItem(ListeItem item){
        items.remove(item);
    }
    
    public static List<ListeItem> getItems() {
        return items;
    }


    public String tilStreng() {
        return items.toString();
    }

}
