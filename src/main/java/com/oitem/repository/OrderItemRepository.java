package com.oitem.repository;

import com.oitem.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
    OrderItem findByCustomerName(String customerName);

}
