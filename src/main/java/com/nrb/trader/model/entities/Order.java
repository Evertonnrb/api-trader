package com.nrb.trader.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nrb.trader.model.entities.enuns.OrderStatus;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "tb_order")

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order extends GenericId implements Serializable {

    @NonNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    @NonNull
    private Integer orderStatus;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @Setter(AccessLevel.NONE)
    @NonNull
    @OneToMany(mappedBy = "id.order")
    @Getter
    private Set<OrderItem> items = new HashSet<>();


    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOfOrderStatus(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null)
        this.orderStatus = orderStatus.getCode();
    }
}
