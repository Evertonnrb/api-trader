package com.nrb.trader.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class User extends GenericId implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String password;
}
