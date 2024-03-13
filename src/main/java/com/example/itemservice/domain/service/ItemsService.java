package com.example.itemservice.domain.service;

import com.example.itemservice.domain.dto.addItem.AddItemRequest;
import com.example.itemservice.domain.dto.addItem.AddItemResponse;
import com.example.itemservice.domain.dto.checkItem.CheckItemRequest;
import com.example.itemservice.domain.dto.checkItem.CheckItemResponse;

public interface ItemsService {
    AddItemResponse addItem(AddItemRequest addItemRequest);

    CheckItemResponse checkItem(CheckItemRequest checkItemRequest);
}
