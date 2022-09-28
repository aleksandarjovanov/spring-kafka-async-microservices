package com.example.producerservice.model;

import lombok.*;

@Data
@Value
@Getter
@Setter
@AllArgsConstructor
public class FoodOrder {

    private String item;
    private Double amount;
}