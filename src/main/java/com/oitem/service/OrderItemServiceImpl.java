package com.oitem.service;

import com.oitem.entity.Item;
import com.oitem.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<Item> getItems() {
        return orderItemRepository.findAll();
    }

    @Override
    public Optional<Item> findItem(Long item) {

        return orderItemRepository.findById(item);
    }

    @Override
    public Item setItem(Item item) {
        return orderItemRepository.save(item);
    }
}
