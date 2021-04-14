package com.example.delivery.model;

public class Product{
    private int id;
    private String productName;
    private int productAmount;
    private String productPrice;
    private String productDescription;
    //TODO figure out how to store the image
    private String productImage;


    public Product(int id, String productName, int productAmount, String productPrice, String productDescription) {
        this.id = id;
        this.productName = productName;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public Product(String productName, int productAmount, String productPrice, String productDescription) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public Product() {}

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }
}