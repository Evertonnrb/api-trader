package com.nrb.trader.model.services;

import com.nrb.trader.model.entities.Product;
import com.nrb.trader.model.repositories.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    private ProductRespository productRespository;

    public List<Product> findAll(){
        return productRespository.findAll();
    }

    public Product findById(Long id){
        return productRespository.findById(id).get();
    }


}
