package entity;

public class Product {
    private String name;
    private Euro price;


    public Product(String name, Euro price){
        this.name = name;
        this.price = price;
    }

    public Product() {
        this.name = "Khvanchkara";
        this.price = new Euro(200);
    }

    public String getName() {
        return name;
    }

    public Euro getPrice() {
        return new Euro(this.price);
    }

    public String toString(){
        return "Product name: " + name + "; Price:" + price;
    }


}
