package com.nrb.trader.model.resources;

import com.nrb.trader.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trader")
public class UserEndPoint {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

    /**
     * TODO findByEmail, findByName, {ADMIN}/register, {ADMIN},/remove-user
     */
}
