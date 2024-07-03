package com.ali.ecommerce.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toCustomer(CustomerRequest customerRequest) {
        if (customerRequest == null) return null;
        return Customer.builder()
                .id(customerRequest.id())
                .firstname(customerRequest.firstname())
                .lastname(customerRequest.lastname())
                .email(customerRequest.email())
                .address(customerRequest.address())
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
