package com.example.producerservice.service;

import com.example.producerservice.model.FoodOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodOrderService {

    private final FoodProducerService foodProducer;

    @Autowired
    public FoodOrderService(FoodProducerService foodProducer) {
        this.foodProducer = foodProducer;
    }

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return foodProducer.sendMessage(foodOrder);
    }
}