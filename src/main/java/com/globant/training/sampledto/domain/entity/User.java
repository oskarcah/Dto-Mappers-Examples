package com.globant.training.sampledto.domain.entity;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
  private Long id;
  private Document document;
  private Account account;
  private Address address;
  private String name;
  private LocalDate birthDay;
}
