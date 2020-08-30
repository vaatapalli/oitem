package com.oitem.service;

import com.oitem.entity.Item;
import com.oitem.entity.OrderItem;
import com.oitem.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<Item> getItems(String customerName) {
        List<Item> orderItems = orderItemRepository.findByCustomerName(customerName).getItems();
        return orderItems;
    }

    @Override
    public OrderItem addItems(OrderItem orderItems) {

        return orderItemRepository.save(orderItems);
    }

    @Override
    public List<Item> getAllItems() {
        List<Item> result = new ArrayList<>();
        orderItemRepository.findAll().stream().distinct().forEach(o -> result.addAll(o.getItems()));
        return result;
    }

    @Override
    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }
}
