package com.metasoft.inventorymanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Order;
import com.metasoft.inventorymanager.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository; 

    public ArrayList<Order> getOrders() { 
        ArrayList<Order> orders = new ArrayList<Order>();
        orderRepository.findAll().forEach(orders::add);
        return orders;  
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order); 
    }
 }
