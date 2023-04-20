package com.example.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@Builder
public class Category {
  
  @Id
  private Long categoryId;
  private String categoryName;
  private String  categoryDescription;
  
  @OneToMany
  @JoinColumn(name = "item_category")
  private List<Item> items;
  
}
}
