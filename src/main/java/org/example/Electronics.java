package org.example;

public class Electronics implements Item {
    private int id;
    private String name;
    private int quantity;
    private String manufacturer;

    public Electronics(int id, String name, int quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }
}

