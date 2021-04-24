package kg.megacom.models;

public class Operation_details {
    private int id;
    private Operations operations_id;
    private Products product_id;
    private int amount;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Operations getOperations_id() {
        return operations_id;
    }

    public void setOperations_id(Operations operations_id) {
        this.operations_id = operations_id;
    }

    public Products getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Products product_id) {
        this.product_id = product_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
