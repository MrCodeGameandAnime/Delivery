package com.example.delivery.model;

public class Store {
    private int id;
    private int storeProductCount;
    private String storeName;
    private String storeOwner;
    public String storePhoneNumber;
    private String storeLocation;
    //TODO figure out how to store the image
    private String storeImage;
    private String storeDescription;

    public Store(int id, int storeProductCount, String storePhoneNumber, String storeName, String storeOwner, String storeLocation, String storeDescription) {
        this.id = id;
        this.storeProductCount = storeProductCount;
        this.storeName = storeName;
        this.storeOwner = storeOwner;
        this.storeLocation = storeLocation;
        this.storeDescription = storeDescription;
        this.storePhoneNumber = storePhoneNumber;
    }

    public Store(int storeProductCount, String storePhoneNumber, String storeName, String storeOwner, String storeLocation, String storeDescription) {
        this.storeProductCount = storeProductCount;
        this.storeName = storeName;
        this.storeOwner = storeOwner;
        this.storeLocation = storeLocation;
        this.storeDescription = storeDescription;
        this.storePhoneNumber = storePhoneNumber;
    }

    public Store() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreProductCount() {
        return storeProductCount;
    }

    public void setStoreProductCount(int storeProductCount) {
        this.storeProductCount = storeProductCount;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }
}