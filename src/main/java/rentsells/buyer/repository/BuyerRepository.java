package rentsells.buyer.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import rentsells.buyer.model.Employee;

@Repository
public interface BuyerRepository extends MongoRepository<Employee, Long>{

}
