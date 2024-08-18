package com.alibou.product;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  List<Product> findAllByIdInOrderById(List<Integer> productIds);
}
