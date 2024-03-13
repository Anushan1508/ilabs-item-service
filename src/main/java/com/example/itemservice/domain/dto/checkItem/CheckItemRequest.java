package com.example.itemservice.domain.dto.checkItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckItemRequest {
    private String requestId;
    private String item;
}
