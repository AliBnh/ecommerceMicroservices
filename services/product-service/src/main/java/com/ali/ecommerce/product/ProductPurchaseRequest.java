package com.ali.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest (
        @NotNull(message = "Product id is required")
        Integer productId,
        @NotNull(message = "Quantity is required")
        double quantity
) {
}
