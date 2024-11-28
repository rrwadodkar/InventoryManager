package com.metasoft.inventorymanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Warehouse;
import com.metasoft.inventorymanager.repository.WarehouseRepository;

@Service
public class WarehouseService {
    @Autowired
    public WarehouseRepository warehouseRepository; 

    public ArrayList<Warehouse> getWarehouse() { 
        
        ArrayList<Warehouse> warehouse = new ArrayList<Warehouse>(); 
        warehouseRepository.findAll().forEach(warehouse::add);
        return warehouse;  
    }

    public Warehouse addWarehouse(Warehouse warehouse) { 
        return warehouseRepository.save(warehouse); 
    }
    
}
