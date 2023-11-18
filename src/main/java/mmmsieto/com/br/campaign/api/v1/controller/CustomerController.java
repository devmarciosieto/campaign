package mmmsieto.com.br.campaign.api.v1.controller;

import mmmsieto.com.br.campaign.domain.service.CustomerService;


import mmmsieto.com.br.campaign.infra.model.CustomerModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerModel>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

    @PostMapping
    public void create(@RequestBody CustomerModel customer) {
        customerService.create(customer);
    }

}
