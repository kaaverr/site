package com.example.travelagency.repository;

import com.example.travelagency.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client , Integer> {
}
