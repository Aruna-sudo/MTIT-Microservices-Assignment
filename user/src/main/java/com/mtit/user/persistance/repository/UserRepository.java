package com.mtit.user.persistance.repository;

import com.mtit.user.persistance.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {}
