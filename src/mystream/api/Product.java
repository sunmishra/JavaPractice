package mystream.api;

public class Product {
    private int id;
    private String name;
    private Integer price;
    Product(int id, String name, int price){
        this.id = id;
        this.price = price;
        this.name =name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
