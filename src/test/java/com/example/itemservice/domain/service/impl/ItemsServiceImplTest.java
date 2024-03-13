package com.example.itemservice.domain.service.impl;

import com.example.itemservice.domain.dto.addItem.AddItemRequest;
import com.example.itemservice.domain.dto.addItem.AddItemResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

@ExtendWith(MockitoExtension.class)
class ItemsServiceImplTest {
    @InjectMocks
    private ItemsServiceImpl itemsService;

    @BeforeEach
    void setUp() {
        initMocks(this);
    }

    @Test
    public void testAddItem_Exception() {
        AddItemRequest request = new AddItemRequest(
                "12345",
                "New Item"
        );
        AddItemResponse response = itemsService.addItem(request);
        assertEquals("402", response.getResultCode());
        assertEquals("Exception occurred while adding item", response.getResultDesc());
    }
    @Test
    void addItem() {
    }

    @Test
    void checkItem() {
    }
}