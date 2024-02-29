package com.globant.training.sampledto.controller;

import com.globant.training.sampledto.domain.dto.UserAccountGetDto;
import com.globant.training.sampledto.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

  // I don't use @Autowired
  // I am team "All Arguments Constructor"
  // You will be the advantages of this approach when you make Unit Test
  private final UserService userService;

  public UsersController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users/strategy1")
  ResponseEntity<List<UserAccountGetDto>> getAllUsersMapperByHand() {
    return ResponseEntity.ok(userService.findAllUsersStrategy1());
  }

  @GetMapping("/users/strategy2")
  ResponseEntity<List<UserAccountGetDto>> getAllUsersMapperBySpringConverter() {
    return ResponseEntity.ok(userService.findAllUsersStrategy2());
  }

  @GetMapping("/users/strategy3")
  ResponseEntity<List<UserAccountGetDto>> getAllUsersMapperByMapStruct() {
    return ResponseEntity.ok(userService.findAllUsersStrategy3());
  }
}
