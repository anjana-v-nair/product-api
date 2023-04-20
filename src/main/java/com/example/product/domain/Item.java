package com.example.product.domain;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
  
  @Id
  private Long itemId;
  private String itemName;
  private String itemDescription;
  private float itemPrice;
  
}
