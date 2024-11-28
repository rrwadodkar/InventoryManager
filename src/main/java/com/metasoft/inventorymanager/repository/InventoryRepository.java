package com.metasoft.inventorymanager.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.metasoft.inventorymanager.entityclasses.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Integer>,JpaSpecificationExecutor<Inventory> {

    
}
