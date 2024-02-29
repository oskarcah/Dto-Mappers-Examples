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
public class Document {
  private Long id;
  private DocumentType type;
  private String number;
  private LocalDate issueDate;
  private LocalDate expirationDate;
}
