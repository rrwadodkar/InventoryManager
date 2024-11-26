package com.metasoft.inventorymanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.metasoft.inventorymanager.entityclasses.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
