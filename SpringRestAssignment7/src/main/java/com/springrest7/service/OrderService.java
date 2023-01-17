package com.springrest7.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OrderService {


  private static int IdCount=0;
    private static List<Order> order=new ArrayList<>();
    static {
        order.add(new Order(++IdCount,"IPhone",75000.0));
        order.add(new Order(++IdCount,"Laptop",65000.0));
        order.add(new Order(++IdCount,"Car",350000.0));
    }
    public List<Order> findAll(){
        return order;
    }
    public Order saves(Order ord1) {
        ord1.setOrderId(++IdCount);
        order.add(ord1);
        return ord1;







 }
    public Order findOne(int id) {
        Predicate<? super Order> predicate=order -> order.getOrderId().equals(id);
        return order.stream().filter(predicate).findFirst().get();
    }
    public void deleteById(int id) {
        Predicate<? super Order> predicate=e->e.getOrderId().equals(id);
        order.removeIf(predicate);
    }





}