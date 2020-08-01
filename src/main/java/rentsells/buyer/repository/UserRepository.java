package rentsells.buyer.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import rentsells.buyer.model.Login;

@Repository
public interface UserRepository extends MongoRepository<Login, String> {
  Optional<Login> findByMobile(String mobile);
  Optional<Login> findByEmail(String email);

  Boolean existsByMobile(String mobile);

  Boolean existsByEmail(String email);
}
