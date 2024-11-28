package com.metasoft.inventorymanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Inventory;
import com.metasoft.inventorymanager.repository.InventoryRepository;
import com.metasoft.inventorymanager.specifications.InventorySpecification;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository  inventoryRepository;  

    public ArrayList<Inventory> getInventory() { 
        ArrayList<Inventory> inventories = new ArrayList<Inventory>();
        inventoryRepository.findAll().forEach(inventories::add);
        return inventories;
    }

    public ArrayList<Inventory> getInventoryByWarehouseId(Integer id ) {
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();  
        Specification<Inventory> specification = InventorySpecification.hasInventoryWithWarehouse(id);  
        inventoryRepository.findAll(specification).forEach(inventory::add);
        return inventory; 
    }

    public Inventory addInventory(Inventory inventory) {
        return  inventoryRepository.save(inventory);  
    }


    
}
