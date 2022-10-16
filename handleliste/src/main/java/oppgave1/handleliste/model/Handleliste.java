package oppgave1.handleliste.model;

import java.util.ArrayList;
import java.util.List;

public class Handleliste {
    private List<ListeItem> items = new ArrayList<>();
    
    public void addItem(ListeItem item) {
    	
    	if (items.contains(item)) {
    		int foundAtIndex = items.indexOf(item);
    		items.get(foundAtIndex).changeQuantity(item.getQuantity());
    		
    	} else {
    		items.add(item);
    	}
    }
    
    public List<ListeItem> getItems() {
        return items;
    }

}
