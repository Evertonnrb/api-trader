package com.nrb.trader.model.services;

import com.nrb.trader.model.entities.Order;
import com.nrb.trader.model.repositories.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    private OrderRespository orderRespository;

    public List<Order> findAll(){
        return orderRespository.findAll();
    }

    public Order findById(Long id){
        return orderRespository.findById(id).get();
    }

}
