package com.ali.ecommerce.payment;

import com.ali.ecommerce.customer.CustomerResponse;
import com.ali.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
