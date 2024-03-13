package com.example.itemservice.domain.service.impl;

import com.example.itemservice.domain.dto.addItem.AddItemRequest;
import com.example.itemservice.domain.dto.addItem.AddItemResponse;
import com.example.itemservice.domain.entities.ItemsEntity;
import com.example.itemservice.domain.service.ItemsService;
import com.example.itemservice.external.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    ItemRepository itemsRepository;
    @Override
    public AddItemResponse addItem(AddItemRequest addItemRequest) {
        AddItemResponse addItemResponse = new AddItemResponse();
        addItemResponse.setResponseId(addItemRequest.getRequestId());
        ItemsEntity itemsEntity = new ItemsEntity();
        itemsEntity.setItem(addItemRequest.getItemName());
        try {
            itemsRepository.save(itemsEntity);
            addItemResponse.setResultCode("200");
            addItemResponse.setResultDesc("Item added successfully");
        } catch (Exception e){
            e.printStackTrace();
        }
        return addItemResponse;
    }
}
