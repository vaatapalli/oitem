package com.oitem.controller;

import com.oitem.entity.Item;
import com.oitem.entity.OrderItem;
import com.oitem.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OrderItemController {

    @Autowired
    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/items/{customerName}")
    public ResponseEntity<List<Item>> getItems(@PathVariable("customerName") String customerName) {
        List<Item> list = orderItemService.getItems(customerName);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/itemList")
    public ResponseEntity<List<Item>> getItem() {
        List<Item> items = orderItemService.getAllItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping(value = "/items")
    public ResponseEntity<List<OrderItem>> getOrderItems() {
        List<OrderItem> orderItems = orderItemService.getOrderItems();
        return ResponseEntity.ok(orderItems);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public ResponseEntity<List<Item>> addItems(@Valid @RequestBody OrderItem orderItem) {

        List<Item> items = orderItemService.addItems(orderItem).getItems();
        if (items == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(items);
    }

}
