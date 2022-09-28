package com.example.consumerservice.model;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrderDto {

    private String item;
    private Double amount;
}