package com.metasoft.inventorymanager.specifications;

import jakarta.persistence.criteria.Join;
import org.springframework.data.jpa.domain.Specification;

import com.metasoft.inventorymanager.entityclasses.Inventory;
import com.metasoft.inventorymanager.entityclasses.Warehouse;

public class InventorySpecification {
    public static Specification<Inventory> hasInventoryWithWarehouse(Integer warehouseId) { 
        return(root, query, criteriaBuilder) -> {
            Join<Inventory, Warehouse> inventoryWarehouse = root.join("warehouse");
            return criteriaBuilder.equal(inventoryWarehouse.get("warehouseId"), warehouseId);
        };
    }
    
}
