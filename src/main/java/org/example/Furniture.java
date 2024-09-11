package org.example;

public class Furniture implements Item {
    private int id;
    private String name;
    private int quantity;
    private String material;

    public Furniture(int id, String name, int quantity, String material) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.material = material;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }
}

