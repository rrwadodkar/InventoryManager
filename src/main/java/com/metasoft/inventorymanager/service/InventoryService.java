package com.metasoft.inventorymanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Inventory;
import com.metasoft.inventorymanager.repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository  inventoryRepository; 

    public ArrayList<Inventory> getInventory() { 
        ArrayList<Inventory> inventories = new ArrayList<Inventory>();
        inventoryRepository.findAll().forEach(inventories::add);
        return inventories;
    }

    public ArrayList<Inventory> getInventoryByWarehouse(String warehouse) { 
        return inventoryRepository.findAllByWarehouse(warehouse);
    }
    
}