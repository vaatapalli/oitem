package com.oitem.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class OrderItem {

    @Id
    @NotNull(message = "customerName cannot be null")
    private String customerName;

    @NotNull(message = "items cannot be null")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "order_items_id"))
    @Column(name = "orderitems")
    private List<Item> items;

    public OrderItem() {
    }

    public OrderItem(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
