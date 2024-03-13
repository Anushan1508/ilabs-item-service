package com.example.itemservice.domain.dto.checkItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckItemResponse {
    private String responseId;
    private String resultCode;
    private String resultDesc;
}
