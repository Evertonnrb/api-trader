package com.nrb.trader.model.repositories;

import com.nrb.trader.model.entities.Order;
import com.nrb.trader.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order,Long> {
}
