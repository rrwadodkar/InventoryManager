package com.metasoft.inventorymanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.metasoft.inventorymanager.entityclasses.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {

}
