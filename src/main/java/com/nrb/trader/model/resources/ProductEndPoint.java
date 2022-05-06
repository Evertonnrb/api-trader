package com.nrb.trader.model.resources;

import com.nrb.trader.model.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trader")
public class ProductEndPoint {

    @Autowired
    private ProductService productService;


    @GetMapping("/producties")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(productService.findAll());
    }

    @GetMapping("/producties/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(productService.findById(id));
    }


}
