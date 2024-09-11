package org.example;
/*You have been tasked with designing and developing an inventory management system for a warehouse.
 The warehouse stores a variety of items like electronics, perishable goods, furniture, etc. For each
 category of items, the system should be able to add new items, update existing item details, track stock levels,
  and delete items if they're no longer needed.

If down the line a new category of items needs to be added to the warehouse, the system should be flexible enough
to accommodate it without requiring a significant modification in the existing classes.
 */
public interface Item {
    int getId();
    String getName();
    int getQuantity();
    void setQuantity(int quantity);
}
