package com.nrb.trader.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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

    @JsonIgnore
    @Setter(AccessLevel.NONE)
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>();

}
