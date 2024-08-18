package com.alibou.product;

import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Category {

  @Id @GeneratedValue private Integer id;
  private String name;
  private String description;

  @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
  private List<Product> products;
}
