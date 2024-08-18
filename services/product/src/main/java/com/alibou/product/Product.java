package com.alibou.product;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {

  @Id @GeneratedValue private Integer id;
  private String name;
  private String description;
  private double availableQuantity;
  private BigDecimal price;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;
}
