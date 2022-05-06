package com.nrb.trader.model.services;

import com.nrb.trader.model.entities.User;
import com.nrb.trader.model.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public List<User> findAll() {
        return userRespository.findAll();
    }

    public User findById(Long id) {
        return userRespository.findById(id).get();
    }
}
