package com.alibou.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record ProductRequest(
    Integer id,
    @NotNull(message = "name is required") String name,
    @NotNull(message = "description is required") String description,
    @Positive(message = "quantity should be positive") double availableQuantity,
    @Positive(message = "price should be positive") BigDecimal price,
    @NotNull(message = "product category is required") Integer categoryId) {}
