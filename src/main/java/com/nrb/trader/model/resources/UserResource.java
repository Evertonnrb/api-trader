package com.nrb.trader.model.resources;

import com.nrb.trader.model.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trader")
public class UserResource {

    @GetMapping("/users")
    public ResponseEntity<?> findAll(){
        User user = new User("Maria","maria@gmail.com","88993322","12345l");
        return ResponseEntity.ok().body(user);
    }
}
