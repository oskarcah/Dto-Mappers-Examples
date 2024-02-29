package com.globant.training.sampledto.domain.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
  private Long id;
  private String street;
  private String number;
  private String houseOrDept;
  private String city;
  private String phoneNumber;
}
