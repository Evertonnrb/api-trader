package com.nrb.trader.model.repositories;

import com.nrb.trader.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {
}
