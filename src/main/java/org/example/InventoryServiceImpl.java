package org.example;
import java.util.*;
public class InventoryServiceImpl implements InventoryService {
    protected Map<Integer,Item> items=new HashMap<>();
    public void addOrUpdate(Item item){
        items.put(item.getId(),item);
    }
    public void delete(int itemId){
        items.remove(itemId);
    }
    public List<Item> getItems() {
        return new ArrayList<>(items.values());
    }
}
