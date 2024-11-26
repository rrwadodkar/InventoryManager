package com.metasoft.inventorymanager.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.metasoft.inventorymanager.entityclasses.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Integer> {

    public ArrayList<Inventory> findAllByWarehouse(String warehouse);
}
