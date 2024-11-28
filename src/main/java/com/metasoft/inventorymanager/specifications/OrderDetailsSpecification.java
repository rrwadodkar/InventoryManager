package com.metasoft.inventorymanager.specifications;

import org.springframework.data.jpa.domain.Specification;
import com.metasoft.inventorymanager.entityclasses.Order;
import com.metasoft.inventorymanager.entityclasses.OrderDetails;


import jakarta.persistence.criteria.Join;

public class OrderDetailsSpecification {
    public static Specification<OrderDetails> hasOrderDetails(Integer orderId) { 
        return(root, query, criteriaBuilder) -> {
            Join<OrderDetails, Order> inventoryWarehouse = root.join("order");
            return criteriaBuilder.equal(inventoryWarehouse.get("orderId"), orderId);
        };
    }
}
