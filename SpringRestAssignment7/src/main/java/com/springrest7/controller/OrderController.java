package com.springrest7.controller;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class OrderController {
    private OrderController service;
    public OrderController(Order service) {
        this.service=this.service;
    }
    @GetMapping("/orderdetails")
    public List<Order> retrieveAllUser(){
        return service.finalize();







 }
    @GetMapping("/orderdetails/{id}")
    public Order findOne(@PathVariable int id) {
        return service.findOne(id);
    }
    @PostMapping("/orderdetails")
    public Order createOrder(@RequestBody Order ord2) {
        return service.saves(ord2);








    }
    @DeleteMapping("/orderdetails/{id}")
    public void deleteorderDetails(@PathVariable int id) {
        service.deleteById(id);
    }
}
