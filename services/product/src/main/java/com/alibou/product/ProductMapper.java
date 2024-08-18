package com.alibou.product;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class ProductMapper {
  public Product toProduct(@Valid ProductRequest request) {
    return Product.builder()
        .id(request.id())
        .name(request.name())
        .availableQuantity(request.availableQuantity())
        .description(request.description())
        .price(request.price())
        .category(Category.builder().id(request.categoryId()).build())
        .build();
  }

  public ProductResponse fromProduct(Product product) {
    return new ProductResponse(
        product.getId(),
        product.getName(),
        product.getDescription(),
        product.getAvailableQuantity(),
        product.getPrice(),
        product.getCategory().getId(),
        product.getCategory().getName(),
        product.getCategory().getDescription());
  }

  public ProductPurchaseResponse toProductPurchaseResponse(
      Product product, @NotNull(message = "quantity is mandatory") double quantity) {
    return new ProductPurchaseResponse(
        product.getId(), product.getName(), product.getDescription(), product.getPrice(), quantity);
  }
}
