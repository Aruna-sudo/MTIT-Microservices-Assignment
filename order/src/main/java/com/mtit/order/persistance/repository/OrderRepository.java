package com.mtit.order.persistance.repository;

import com.mtit.order.persistance.model.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, ObjectId> {}
