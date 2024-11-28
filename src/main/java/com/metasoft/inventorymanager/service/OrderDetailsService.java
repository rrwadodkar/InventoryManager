package com.metasoft.inventorymanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.OrderDetails;
import com.metasoft.inventorymanager.repository.OrderDetailsRepository;
import com.metasoft.inventorymanager.specifications.OrderDetailsSpecification;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository; 

    public ArrayList<OrderDetails> getOrderDetails(Integer orderId ) { 
        ArrayList<OrderDetails> orderDetails = new ArrayList<OrderDetails>(); 
        Specification<OrderDetails> orderSpecification = OrderDetailsSpecification.hasOrderDetails(orderId);
        orderDetailsRepository.findAll(orderSpecification).forEach(orderDetails::add);
        return orderDetails;
    }

}
