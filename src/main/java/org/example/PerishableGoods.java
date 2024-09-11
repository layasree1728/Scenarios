package org.example;

public class PerishableGoods implements Item {
    private int id;
    private String name;
    private int quantity;
    private String expirationDate;

    public PerishableGoods(int id, String name, int quantity, String expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
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

    public String getExpirationDate() {
        return expirationDate;
    }
}
