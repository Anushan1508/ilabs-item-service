package com.example.itemservice.application.controller;

import com.example.itemservice.domain.dto.addItem.AddItemRequest;
import com.example.itemservice.domain.dto.addItem.AddItemResponse;
import com.example.itemservice.domain.dto.checkItem.CheckItemRequest;
import com.example.itemservice.domain.dto.checkItem.CheckItemResponse;
import com.example.itemservice.domain.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${base-url-context}")
public class ItemController {
    @Autowired
    ItemsService itemsService;

    @PostMapping("/additem")
    public ResponseEntity<AddItemResponse> addItem(@RequestBody AddItemRequest addItemRequest){
        return ResponseEntity.ok(itemsService.addItem(addItemRequest));
    }

    @PostMapping("/checkitem")
    public ResponseEntity<CheckItemResponse> checkItem(@RequestBody CheckItemRequest checkItemRequest){
        return ResponseEntity.ok(itemsService.checkItem(checkItemRequest));
    }
}
