package com.example.evaluacionmomento2.data.model;

public class Product {
    private String id;
    private String NameProduct;
    private float Price;

    public Product() {
    }

    public Product(String nameProduct, float price) {
        NameProduct = nameProduct;
        Price = price;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
