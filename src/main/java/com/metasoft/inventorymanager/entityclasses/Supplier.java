package com.metasoft.inventorymanager.entityclasses;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer supplierId;
    @Column
    private String supplierName;
    @Column
    private String contactName;
    @Column
    private String contactTitle;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String country;
    @Column
    private String phone;
    @Column
    private String email;

    @OneToMany(mappedBy = "supplier")
    private Set<Product> products;

    // Getters and Setters


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Set<Product> getProducts() {
//        return products;
//    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
