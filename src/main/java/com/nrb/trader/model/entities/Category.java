package com.nrb.trader.model.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;

@Entity(name="tb_category")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Category extends GenericId{

    @NonNull
    private String name;

    @Transient
    @Setter(AccessLevel.NONE)
    private Set<Product> products = new HashSet<>();

}
