package com.nrb.trader.model.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "tb_products")
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product extends GenericId implements Serializable {
    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private BigDecimal price;

    @NonNull
    private String imgUlr;

    @Transient
    @Setter(AccessLevel.NONE)
    private Set<Category> categories = new HashSet<>();

}
