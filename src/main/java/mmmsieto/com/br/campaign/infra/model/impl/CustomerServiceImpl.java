package mmmsieto.com.br.campaign.infra.model.impl;

import mmmsieto.com.br.campaign.domain.service.CustomerService;
import mmmsieto.com.br.campaign.infra.model.CustomerModel;
import mmmsieto.com.br.campaign.infra.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerModel create(CustomerModel customer) {
        return customerRepository.save(customer);
    }

    @Override
    public CustomerModel update(CustomerModel customer) {
        return null;
    }

    @Override
    public CustomerModel findById(String id) {
        return null;
    }

    @Override
    public List<CustomerModel> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(String id) {

    }
}
