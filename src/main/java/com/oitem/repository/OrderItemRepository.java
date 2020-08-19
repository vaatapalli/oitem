package com.oitem.repository;

import com.oitem.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<Item, Long> {
}
