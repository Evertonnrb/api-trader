package com.nrb.trader.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
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

    @ManyToMany
    @JoinTable(name = "tb_product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @Setter(AccessLevel.NONE)
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "id.product")
    private Set<OrderItem> items = new HashSet<>();

    public Set<Order> getOrders() {
        Set<Order> set = new HashSet<>();
        for (OrderItem x : items) {
            set.add(x.getOrder());
        }
        return set;
    }
}
