package com.nrb.trader.model.entities.enuns;

public enum OrderStatus {
    CANCELED(1),
    DELIVERED(2),
    PAID(3),
    SHIPPED (4),
    WAITING_PAYMENT(5);
    private int code;
    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOfOrderStatus(int code){
        for (OrderStatus value : OrderStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("INVALID CODE ORDER-STATUS");
    }
}
