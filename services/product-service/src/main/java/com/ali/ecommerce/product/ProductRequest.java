package com.ali.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest (
         Integer id,
         @NotNull(message = "Name is required")
         String name,
         @NotNull(message = "Description is required")
         String description,
         @Positive(message = "Available quantity must be positive")
         double availableQuantity,
         @Positive(message = "Price must be positive")
         BigDecimal price,
         @NotNull(message = "Category id is required")
         Integer categoryId
){
}
