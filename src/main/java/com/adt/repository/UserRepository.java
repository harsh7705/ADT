package com.adt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adt.model.User;

/**
 * Repository interface for User entity that communicates with mongoDB
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
