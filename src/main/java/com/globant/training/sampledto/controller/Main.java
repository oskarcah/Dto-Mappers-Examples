package com.globant.training.sampledto.controller;
public class Main {

  public static void main(String[] args) {
    //Product p = new Product(1L, "Combo Hamburguesa", 25000D, true);

    // builder
    Product p = Product.builder()
        .id(1L)
        .name("Combo Hamburguesa")
        .price(25000D)
        .promo("10%")
        .build();


    System.out.println("Producto p=" + p);


  }
}
