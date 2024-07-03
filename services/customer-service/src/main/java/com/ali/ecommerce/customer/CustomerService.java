package com.ali.ecommerce.customer;


import com.ali.ecommerce.exceptions.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    public String createCustomer(CustomerRequest customerRequest) {
        var customer = customerRepository.save(customerMapper.toCustomer(customerRequest));
        return null;
    }

    public void updateCustomer(CustomerRequest customerRequest) {
        var customer = customerRepository.findById(customerRequest.id())
                .orElseThrow(() -> new CustomerNotFoundException(
                        String.format("Customer with id %s not found", customerRequest.id())
                ));
        mergerCustomer(customer, customerRequest);
        customerRepository.save(customer);
    }

    private void mergerCustomer(Customer customer, CustomerRequest customerRequest) {
        if (StringUtils.isNotBlank(customerRequest.firstname())) {
            customer.setFirstname(customerRequest.firstname());
        }
        if (StringUtils.isNotBlank(customerRequest.lastname())) {
            customer.setLastname(customerRequest.lastname());
        }
        if (StringUtils.isNotBlank(customerRequest.email())) {
            customer.setEmail(customerRequest.email());
        }
        if (customerRequest.address() != null) {
            customer.setAddress(customerRequest.address());
        }
    }

    public List<CustomerResponse> findAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customerMapper::fromCustomer)
                .toList();
    }

    public Boolean existsById(String  id) {
        return customerRepository.findById(id).isPresent();
    }

    public CustomerResponse findById(String id) {
        return customerRepository.findById(id)
                .map(customerMapper::fromCustomer)
                .orElseThrow(() -> new CustomerNotFoundException(
                        String.format("Customer with id %s not found", id)
                ));
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }
}
