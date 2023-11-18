package mmmsieto.com.br.campaign.infra.repository;

import mmmsieto.com.br.campaign.infra.model.CustomerModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel, ObjectId> {
}
