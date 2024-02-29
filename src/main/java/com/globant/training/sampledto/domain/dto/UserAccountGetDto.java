package com.globant.training.sampledto.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAccountGetDto {
  private String login;
  private Boolean active;
  private String name;
  private String birthDay;
  private String address;
  private String city;
  private String documentType;
  private String documentNumber;
  private String documentIssueDate;
  private String documentExpirationDate;
}
