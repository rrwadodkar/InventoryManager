package com.metasoft.inventorymanager.entityclasses;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer warehouseId;
    @Column
    private String warehouseName;
    @Column
    private String location;
    @Column
    private Integer capacity;

    @OneToMany(mappedBy = "warehouse")
    private Set<Inventory> inventories;

    // Getters and Setters

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

//    public Set<Inventory> getInventories() {
//        return inventories;
//    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }
}
