import java.util.*;

import org.example.*;
import org.example.InventoryService;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
public class InventoryTest {
    InventoryService inventory;
    @Before
    public void setUp() {
        inventory = new InventoryServiceImpl();// Proper initialization
    }

    @Test
    public void testAddItem() {
        Electronics laptop = new Electronics(101, "Laptop", 10, "Dell");
        inventory.addOrUpdate(laptop);
        assertEquals(1, inventory.getItems().size());
        assertEquals(laptop, inventory.getItems().get(0));
    }

    @Test
    public void testUpdateItem() {
        Electronics laptop = new Electronics(101, "Laptop", 10, "Dell");
        inventory.addOrUpdate(laptop);
        Electronics updatedLaptop = new Electronics(101, "Laptop", 20, "Dell");
        inventory.addOrUpdate(updatedLaptop);
        assertEquals(20, inventory.getItems().get(0).getQuantity());
    }

    @Test
    public void testDeleteItem() {
        Electronics laptop = new Electronics(101, "Laptop", 10, "Dell");
        inventory.addOrUpdate(laptop);
        inventory.delete(101);
        assertTrue(inventory.getItems().isEmpty());
    }

    @Test
    public void testGetItems() {
        Electronics laptop = new Electronics(101, "Laptop", 10, "Dell");
        PerishableGoods bananas = new PerishableGoods(102, "Bananas", 150, "2023-01-01");
        inventory.addOrUpdate(laptop);
        inventory.addOrUpdate(bananas);
        List<Item> items = inventory.getItems();
        assertEquals(2, items.size());
        assertTrue(items.contains(laptop));
        assertTrue(items.contains(bananas));
    }
}
