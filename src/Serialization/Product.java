package Serialization;

import java.math.BigDecimal;

public class Product {


    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;



    @Override
    public String toString(){
        return "Product{" +
                "name='"+name+'\'' +
                ",Description='" +description +'\''+
                ",Price=" +price+
                '}';
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
