package com.ali.ecommerce.kafka;

import com.ali.ecommerce.customer.CustomerResponse;
import com.ali.ecommerce.order.PaymentMethod;
import com.ali.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
