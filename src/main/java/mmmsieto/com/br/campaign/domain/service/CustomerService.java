package mmmsieto.com.br.campaign.domain.service;

import mmmsieto.com.br.campaign.infra.model.CustomerModel;

import java.util.List;

public interface CustomerService {

    CustomerModel create(CustomerModel customer);

    CustomerModel update(CustomerModel customer);

    CustomerModel findById(String id);

    List<CustomerModel> findAll();

    void delete(String id);
}
