package com.springrest7.order;

public class Order {
    private Integer orderId;
       private String name;
       private Double price;
    public Order(Integer orderId, String name, Double price) {
        super();
        this.orderId = orderId;
        this.name = name;
        this.price = price;
    }
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "orderDetails [orderId=" + orderId + ", name=" + name + ", price=" + price + "]";
    }
    }