package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
@Data
@NoArgsConstructor
@Builder
public class Stores {
  
  @Id
  private Long storesId;
  
  private String storesLocation;
}
