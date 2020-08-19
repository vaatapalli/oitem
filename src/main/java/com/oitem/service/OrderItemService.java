package com.oitem.service;

import com.oitem.entity.Item;

import java.util.List;
import java.util.Optional;


public interface OrderItemService {

    List<Item> getItems();

    Optional<Item> findItem(Long item);

    Item setItem(Item item);
}
