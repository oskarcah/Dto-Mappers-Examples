package com.globant.training.sampledto.domain.mapper;

import com.globant.training.sampledto.domain.dto.UserAccountGetDto;
import com.globant.training.sampledto.domain.entity.User;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class UserToGetDtoMapper {

  // one mapping annotation per field
  @Mapping(source="user.account.login", target = "login")
  @Mapping(source="user.account.active", target = "active")
  @Mapping(source = "user.name", target = "name")
  @Mapping(source= "user.address.city", target= "city")
  @Mapping(source= "user.document.type", target= "documentType")
  @Mapping(source= "user.document.number", target= "documentNumber")
  // latter we will see calculated fields
  // address street + number + houseOrAparment
  // dates
  @Mapping(ignore = true, target = "address")
  @Mapping(ignore = true, target = "documentIssueDate")
  @Mapping(ignore = true, target = "documentExpirationDate")
  @Mapping(ignore = true, source = "birthDay", target = "birthDay")
  //@Mapping(ignore = true, target = "birthDay")
  //@Mapping(expression = "java(convertDate(user.getBirthDay()))", target = "birthDay")
  public abstract UserAccountGetDto convert(User user);

  protected String convertDate(LocalDate date) {
    return date == null
      ? null
      :  date.format(DateTimeFormatter.ofPattern("dd-MM-YYY"));
  }

  @AfterMapping
  protected void after(@MappingTarget UserAccountGetDto dto) {
    dto.setAddress("Direccion calculada");
  }
}
