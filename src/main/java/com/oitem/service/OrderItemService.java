package com.oitem.service;

import com.oitem.entity.Item;
import com.oitem.entity.OrderItem;

import java.util.List;


public interface OrderItemService {

    List<Item> getItems(String customerName);

    OrderItem addItems(OrderItem orderItem);

    List<Item> getAllItems();

    List<OrderItem> getOrderItems();
}
