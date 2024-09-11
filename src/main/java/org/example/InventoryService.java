package org.example;

import java.util.List;

public interface InventoryService {
    void addOrUpdate(Item item);
    void delete(int itemId);
    List<Item> getItems();
}

