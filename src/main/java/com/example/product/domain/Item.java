package com.example.product.domain;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
@Builder
public class Item {
  
  @Id
  private Long itemId;
  private String itemName;
  private String itemDescription;
  private float itemPrice;
  
  @ManyToOne
  @JoinColumn(name = "item_category")
  private Item itemCategory;
  
}
