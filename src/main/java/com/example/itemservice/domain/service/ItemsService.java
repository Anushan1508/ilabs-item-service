package com.example.itemservice.domain.service;

import com.example.itemservice.domain.dto.addItem.AddItemRequest;
import com.example.itemservice.domain.dto.addItem.AddItemResponse;

public interface ItemsService {
    AddItemResponse addItem(AddItemRequest addItemRequest);
}
