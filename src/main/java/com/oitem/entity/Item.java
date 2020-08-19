package com.oitem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "item")
public class Item {

    @Id
    @NotNull(message = "product_code cannot be null")
    private Long product_code;

    @NotNull(message = "product_name cannot be null")
    private String product_name;

    @NotNull(message = "quantity cannot be null")
    private Long quantity;


    public Item() {
    }

    public Item(Long product_code, String product_name, Long quantity) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.quantity = quantity;
    }


    public Long getProduct_code() {
        return product_code;
    }

    public void setProduct_code(long product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
