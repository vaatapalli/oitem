package com.oitem.controller;

import com.oitem.entity.Item;
import com.oitem.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderItemController {

    @Autowired
    OrderItemService orderItemService;

    @RequestMapping(value = "/get")
    public ResponseEntity<List<Item>> getItems() {

        List<Item> list = orderItemService.getItems();
        if (list == null || list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(orderItemService.getItems());

    }

    @RequestMapping(value = "/get/{product_code}")
    public ResponseEntity<Item> findItem(@PathVariable Long product_code) {

        Optional<Item> item = orderItemService.findItem(product_code);
        if (item.isPresent()) {
            return ResponseEntity.ok(item.get());
        }

        return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);

    }


    @RequestMapping(value = "/createitem", method = RequestMethod.POST)
    public ResponseEntity<Item> setItem(@Valid @RequestBody Item item) {
        Item item1 = orderItemService.setItem(item);

        if (item1 == null) {
            return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(item1);
    }

}
