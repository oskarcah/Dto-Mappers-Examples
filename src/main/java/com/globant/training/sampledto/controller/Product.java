package com.globant.training.sampledto.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data  // Getters, Setters, Constructurs, toStrings, equals, hashCode
@Builder
public class Product {
  private Long id;
  private String name;
  private Double price;
  private Boolean active;
  private String description;
  private String promo;


}
