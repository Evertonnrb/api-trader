package com.nrb.trader.model.repositories;

import com.nrb.trader.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,Long> {
}
